package com.hembitski.clockfromwidgets.data;

public class Numbers {
    private static final int TOP = 0;
    private static final int RIGHT = 90;
    private static final int BOTTOM = 180;
    private static final int LEFT = 270;

    private static final int DIAGONAL_TOP_RIGHT = 45;
    private static final int DIAGONAL_BOTTOM_RIGHT = 135;
    private static final int DIAGONAL_BOTTOM_LEFT = 225;
    private static final int DIAGONAL_TOP_LEFT = 315;

    private static final int DIAGONAL = DIAGONAL_BOTTOM_LEFT;

    private Angles[][] number0;
    private Angles[][] number1;

    public Numbers() {
        number0 = create0();
        number1 = create1();
    }

    public Angles[][] getNumber0() {
        return number0;
    }

    public Angles[][] getNumber1() {
        return number1;
    }

    private Angles[][] create0() {
        Angles[][] a = getAngles();
        //столбик 1
        a[0][0].angle1 = RIGHT;
        a[0][0].angle2 = BOTTOM;

        a[0][1].angle1 = TOP;
        a[0][1].angle2 = BOTTOM;

        a[0][2].angle1 = TOP;
        a[0][2].angle2 = BOTTOM;

        a[0][3].angle1 = TOP;
        a[0][3].angle2 = BOTTOM;

        a[0][4].angle1 = TOP;
        a[0][4].angle2 = BOTTOM;

        a[0][5].angle1 = TOP;
        a[0][5].angle2 = RIGHT;
        //столбик 2
        a[1][0].angle1 = RIGHT;
        a[1][0].angle2 = LEFT;

        a[1][1].angle1 = RIGHT;
        a[1][1].angle2 = BOTTOM;

        a[1][2].angle1 = TOP;
        a[1][2].angle2 = BOTTOM;

        a[1][3].angle1 = TOP;
        a[1][3].angle2 = BOTTOM;

        a[1][4].angle1 = TOP;
        a[1][4].angle2 = RIGHT;

        a[1][5].angle1 = RIGHT;
        a[1][5].angle2 = LEFT;
        //столбик 3
        a[2][0].angle1 = RIGHT;
        a[2][0].angle2 = LEFT;

        a[2][1].angle1 = LEFT;
        a[2][1].angle2 = BOTTOM;

        a[2][2].angle1 = TOP;
        a[2][2].angle2 = BOTTOM;

        a[2][3].angle1 = TOP;
        a[2][3].angle2 = BOTTOM;

        a[2][4].angle1 = TOP;
        a[2][4].angle2 = LEFT;

        a[2][5].angle1 = RIGHT;
        a[2][5].angle2 = LEFT;
        //столбик 4
        a[3][0].angle1 = LEFT;
        a[3][0].angle2 = BOTTOM;

        a[3][1].angle1 = TOP;
        a[3][1].angle2 = BOTTOM;

        a[3][2].angle1 = TOP;
        a[3][2].angle2 = BOTTOM;

        a[3][3].angle1 = TOP;
        a[3][3].angle2 = BOTTOM;

        a[3][4].angle1 = TOP;
        a[3][4].angle2 = BOTTOM;

        a[3][5].angle1 = TOP;
        a[3][5].angle2 = LEFT;

        return a;
    }

    private Angles[][] create1() {
        Angles[][] a = getAngles();
        //столбик 1
        a[0][0].angle1 = RIGHT;
        a[0][0].angle2 = BOTTOM;

        a[0][1].angle1 = TOP;
        a[0][1].angle2 = RIGHT;

        a[0][2].angle1 = DIAGONAL;
        a[0][2].angle2 = DIAGONAL;

        a[0][3].angle1 = DIAGONAL;
        a[0][3].angle2 = DIAGONAL;

        a[0][4].angle1 = RIGHT;
        a[0][4].angle2 = BOTTOM;

        a[0][5].angle1 = TOP;
        a[0][5].angle2 = RIGHT;
        //столбик 2
        a[1][0].angle1 = RIGHT;
        a[1][0].angle2 = LEFT;

        a[1][1].angle1 = LEFT;
        a[1][1].angle2 = BOTTOM;

        a[1][2].angle1 = TOP;
        a[1][2].angle2 = BOTTOM;

        a[1][3].angle1 = TOP;
        a[1][3].angle2 = BOTTOM;

        a[1][4].angle1 = TOP;
        a[1][4].angle2 = LEFT;

        a[1][5].angle1 = RIGHT;
        a[1][5].angle2 = LEFT;
        //столбик 3
        a[2][0].angle1 = LEFT;
        a[2][0].angle2 = BOTTOM;

        a[2][1].angle1 = TOP;
        a[2][1].angle2 = BOTTOM;

        a[2][2].angle1 = TOP;
        a[2][2].angle2 = BOTTOM;

        a[2][3].angle1 = TOP;
        a[2][3].angle2 = BOTTOM;

        a[2][4].angle1 = TOP;
        a[2][4].angle2 = RIGHT;

        a[2][5].angle1 = RIGHT;
        a[2][5].angle2 = LEFT;
        //столбик 4
        a[3][0].angle1 = DIAGONAL;
        a[3][0].angle2 = DIAGONAL;

        a[3][1].angle1 = DIAGONAL;
        a[3][1].angle2 = DIAGONAL;

        a[3][2].angle1 = DIAGONAL;
        a[3][2].angle2 = DIAGONAL;

        a[3][3].angle1 = DIAGONAL;
        a[3][3].angle2 = DIAGONAL;

        a[3][4].angle1 = LEFT;
        a[3][4].angle2 = BOTTOM;

        a[3][5].angle1 = TOP;
        a[3][5].angle2 = LEFT;

        return a;
    }

    private Angles[][] getAngles() {
        Angles[][] a = new Angles[4][6];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = new Angles();
            }
        }
        return a;
    }
}
