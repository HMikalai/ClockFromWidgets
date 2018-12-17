package com.hembitski.clockfromwidgets.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.hembitski.clockfromwidgets.data.Angles;
import com.hembitski.clockfromwidgets.data.Numbers;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class ClockItemView extends View {
    private static final int DEGREE_MAX = 360;
    private static final int DEGREE_MIN = 0;
    private static final float THICKNESS_FACTOR = 0.05f;
    private static final float RADIUS_LENGTH_RATIO = 0.8f;
    private static final int WIDTH_IN_WIDGETS = 28;
    private static final int HEIGHT_IN_WIDGETS = 6;

    private float cx;
    private float cy;
    private float line1X;
    private float line1Y;
    private float line2X;
    private float line2Y;
    private float radius;
    private float size;//one mini-widget is a square with a side of size

    private Paint paint = new Paint();
    private Paint paintCircle = new Paint();

    private Item[][] items;
    private Angles[][] angles;
    private Angles[][] templateAngles;

    private boolean isMoving;
    private Timer timer;
    private Runnable invalidateRunnable = this::invalidate;

    public ClockItemView(Context context) {
        super(context);
    }

    public ClockItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ClockItemView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setTime(String time) {
        if (time.length() <= 8) {
            char separator = ':';
            int[] numbersForShow = new int[8];
            for (int i = 0; i < time.length(); i++) {
                char c = time.charAt(i);
                if (c == separator) {
                    numbersForShow[i] = -1;
                } else {
                    numbersForShow[i] = Integer.valueOf(String.valueOf(c));
                }
            }
            templateAngles = createTimeArray(numbersForShow);
            isMoving = true;
            startMoving();
//            setArrayNumber(createTimeArray(numbersForShow));
        }
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        init(w, h);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < WIDTH_IN_WIDGETS; i++) {
            for (int j = 0; j < HEIGHT_IN_WIDGETS; j++) {
                Item item = items[i][j];
                canvas.drawLine(item.cx, item.cy, item.line1X, item.line1Y, paint);
                canvas.drawLine(item.cx, item.cy, item.line2X, item.line2Y, paint);
                canvas.drawCircle(item.cx, item.cy, radius + 5, paintCircle);
            }
        }
    }

    private void setArrayNumber(Angles[][] angles) {
        for (int i = 0; i < angles.length; i++) {
            for (int j = 0; j < angles[0].length; j++) {
                this.angles[i][j].angle1 = angles[i][j].angle1;
                this.angles[i][j].angle2 = angles[i][j].angle2;
            }
        }
        updateData();
        invalidate();
    }

    private void startMoving() {
        timer = new Timer();
        timer.schedule(getTimerTask(), 0, 10);
    }

    private void stopMoving() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    private TimerTask getTimerTask() {
        return new TimerTask() {
            @Override
            public void run() {
                updateData();
                post(invalidateRunnable);
            }
        };
    }

    private void init(int width, int height) {
        initItemsArray();

        size = Math.min(width / WIDTH_IN_WIDGETS, height / HEIGHT_IN_WIDGETS);
        cx = size / 2;
        cy = size / 2;
        radius = size / 2 * RADIUS_LENGTH_RATIO;

        paint.setStrokeWidth(size * THICKNESS_FACTOR);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);

        paintCircle.setStrokeWidth(1f);
        paintCircle.setColor(Color.GRAY);
        paintCircle.setAntiAlias(true);
        paintCircle.setStyle(Paint.Style.STROKE);

        updateData();
    }

    private void updateData() {
        if (isMoving) {
            isMoving = false;
            for (int i = 0; i < WIDTH_IN_WIDGETS; i++) {
                for (int j = 0; j < HEIGHT_IN_WIDGETS; j++) {
                    boolean needRecalculate = false;
                    validateAngles(angles[i][j]);
                    if (angles[i][j].angle1 != templateAngles[i][j].angle1) {
                        angles[i][j].angle1 += 1;
                        needRecalculate = true;
                    }
                    if (angles[i][j].angle2 != templateAngles[i][j].angle2) {
                        angles[i][j].angle2 -= 1;
                        needRecalculate = true;
                    }
                    if (needRecalculate) {
                        calculateArrowsCoordinates(angles[i][j].angle1, angles[i][j].angle2);
                        setDataToItem(items[i][j], i, j, cx, cy, line1X, line1Y, line2X, line2Y);
                        isMoving = true;
                    }
                }
            }
        } else {
            stopMoving();
        }
    }

    private void calculateArrowsCoordinates(int angle1, int angle2) {
        int rx = 0;
        int ry = (int) (-radius);

        double c1 = Math.cos(Math.toRadians(angle1));
        double s1 = Math.sin(Math.toRadians(angle1));
        line1X = (int) (size / 2 + rx * c1 - ry * s1);
        line1Y = (int) (size / 2 + rx * s1 + ry * c1);

        double c2 = Math.cos(Math.toRadians(angle2));
        double s2 = Math.sin(Math.toRadians(angle2));
        line2X = (int) (size / 2 + rx * c2 - ry * s2);
        line2Y = (int) (size / 2 + rx * s2 + ry * c2);
    }

    private void initItemsArray() {
        Random rnd = new Random();

        items = new Item[WIDTH_IN_WIDGETS][HEIGHT_IN_WIDGETS];
        angles = new Angles[WIDTH_IN_WIDGETS][HEIGHT_IN_WIDGETS];

        for (int i = 0; i < WIDTH_IN_WIDGETS; i++) {
            for (int j = 0; j < HEIGHT_IN_WIDGETS; j++) {
                items[i][j] = new Item();

                angles[i][j] = new Angles();
                angles[i][j].angle1 = rnd.nextInt(360);
                angles[i][j].angle2 = rnd.nextInt(360);
            }
        }
    }

    private Angles[][] createTimeArray(int[] numbersForShow) {
        int[] shift = {0, 4, 8, 10, 14, 18, 20, 24};
        Angles[][] angles = new Angles[WIDTH_IN_WIDGETS][HEIGHT_IN_WIDGETS];
        for (int i = 0; i < angles.length; i++) {
            for (int j = 0; j < angles[0].length; j++) {
                angles[i][j] = new Angles();
            }
        }
        Numbers numbers = new Numbers();
        for (int i = 0; i < numbersForShow.length; i++) {
            Angles[][] part = numbers.getAngles(numbersForShow[i]);
            fillPartOfArray(angles, part, shift[i]);
        }
        return angles;
    }

    private void fillPartOfArray(Angles[][] array, Angles[][] part, int shift) {
        for (int i = 0; i < part.length; i++) {
            for (int j = 0; j < part[0].length; j++) {
                array[i + shift][j].angle1 = part[i][j].angle1;
                array[i + shift][j].angle2 = part[i][j].angle2;
            }
        }
    }

    private void validateAngles(Angles angles) {
        if(angles.angle1 > DEGREE_MAX) {
            angles.angle1 = DEGREE_MIN;
        }
        if(angles.angle1 < DEGREE_MIN) {
            angles.angle1 = DEGREE_MAX;
        }
        if(angles.angle2 > DEGREE_MAX) {
            angles.angle2 = DEGREE_MIN;
        }
        if(angles.angle2 < DEGREE_MIN) {
            angles.angle2 = DEGREE_MAX;
        }
    }

    private void setDataToItem(Item item, int indexX, int indexY, float cx, float cy, float line1X,
                               float line1Y, float line2X, float line2Y) {
        item.cx = cx + indexX * size;
        item.cy = cy + indexY * size;
        item.line1X = line1X + indexX * size;
        item.line1Y = line1Y + indexY * size;
        item.line2X = line2X + indexX * size;
        item.line2Y = line2Y + indexY * size;
    }

    private class Item {
        float cx;
        float cy;
        float line1X;
        float line1Y;
        float line2X;
        float line2Y;
    }
}
