package com.hembitski.clockfromwidgets.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hembitski.clockfromwidgets.R;
import com.hembitski.clockfromwidgets.view.ClockItemView;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ClockItemView clockItemView;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clockItemView = findViewById(R.id.clockItem);

        timer = new Timer();
        timer.schedule(getTimerTask(), 0, 1_000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    private TimerTask getTimerTask() {
        return new TimerTask() {
            @Override
            public void run() {
                clockItemView.setTime(getTimeString());
            }
        };
    }

    private String getTimeString() {
        long date = System.currentTimeMillis();
//        SimpleDateFormat sdf = new SimpleDateFormat("KK:mm:ss", Locale.getDefault());
        SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss", Locale.getDefault());
        return sdf.format(date);
    }
}
