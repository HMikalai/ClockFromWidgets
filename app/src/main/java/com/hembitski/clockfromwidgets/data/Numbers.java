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
    private Angles[][] number2;
    private Angles[][] number3;
    private Angles[][] number4;
    private Angles[][] number5;
    private Angles[][] number6;
    private Angles[][] number7;
    private Angles[][] number8;
    private Angles[][] number9;
    private Angles[][] separator;

    public Numbers() {
        number0 = create0();
        number1 = create1();
        number2 = create2();
        number3 = create3();
        number4 = create4();
        number5 = create5();
        number6 = create6();
        number7 = create77();
        number8 = create8();
        number9 = create9();
        separator = createSeparator();
    }

    public Angles[][] getAngles(int number) {
        switch (number) {
            case 0:
                return number0;
            case 1:
                return number1;
            case 2:
                return number2;
            case 3:
                return number3;
            case 4:
                return number4;
            case 5:
                return number5;
            case 6:
                return number6;
            case 7:
                return number7;
            case 8:
                return number8;
            case 9:
                return number9;
            case -1:
                return separator;
        }
        throw new IllegalArgumentException("out of bounds [-1 .. 9]");
    }

    private Angles[][] create0() {
        Angles[][] a = getNubberAngles();
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
        Angles[][] a = getNubberAngles();
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

    private Angles[][] create2() {
        Angles[][] a = getNubberAngles();
        //столбик 1
        a[0][0].angle1 = RIGHT;
        a[0][0].angle2 = BOTTOM;

        a[0][1].angle1 = TOP;
        a[0][1].angle2 = RIGHT;

        a[0][2].angle1 = RIGHT;
        a[0][2].angle2 = BOTTOM;

        a[0][3].angle1 = TOP;
        a[0][3].angle2 = BOTTOM;

        a[0][4].angle1 = TOP;
        a[0][4].angle2 = BOTTOM;

        a[0][5].angle1 = TOP;
        a[0][5].angle2 = RIGHT;
        //столбик 2
        a[1][0].angle1 = LEFT;
        a[1][0].angle2 = RIGHT;

        a[1][1].angle1 = LEFT;
        a[1][1].angle2 = RIGHT;

        a[1][2].angle1 = LEFT;
        a[1][2].angle2 = RIGHT;

        a[1][3].angle1 = RIGHT;
        a[1][3].angle2 = BOTTOM;

        a[1][4].angle1 = TOP;
        a[1][4].angle2 = RIGHT;

        a[1][5].angle1 = LEFT;
        a[1][5].angle2 = RIGHT;
        //столбик 3
        a[2][0].angle1 = LEFT;
        a[2][0].angle2 = RIGHT;

        a[2][1].angle1 = LEFT;
        a[2][1].angle2 = BOTTOM;

        a[2][2].angle1 = TOP;
        a[2][2].angle2 = LEFT;

        a[2][3].angle1 = LEFT;
        a[2][3].angle2 = RIGHT;

        a[2][4].angle1 = LEFT;
        a[2][4].angle2 = RIGHT;

        a[2][5].angle1 = LEFT;
        a[2][5].angle2 = RIGHT;
        //столбик 4
        a[3][0].angle1 = LEFT;
        a[3][0].angle2 = BOTTOM;

        a[3][1].angle1 = TOP;
        a[3][1].angle2 = BOTTOM;

        a[3][2].angle1 = TOP;
        a[3][2].angle2 = BOTTOM;

        a[3][3].angle1 = TOP;
        a[3][3].angle2 = LEFT;

        a[3][4].angle1 = LEFT;
        a[3][4].angle2 = BOTTOM;

        a[3][5].angle1 = TOP;
        a[3][5].angle2 = LEFT;

        return a;
    }

    private Angles[][] create3() {
        Angles[][] a = getNubberAngles();
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
        a[1][0].angle1 = LEFT;
        a[1][0].angle2 = RIGHT;

        a[1][1].angle1 = LEFT;
        a[1][1].angle2 = RIGHT;

        a[1][2].angle1 = RIGHT;
        a[1][2].angle2 = BOTTOM;

        a[1][3].angle1 = TOP;
        a[1][3].angle2 = RIGHT;

        a[1][4].angle1 = LEFT;
        a[1][4].angle2 = RIGHT;

        a[1][5].angle1 = LEFT;
        a[1][5].angle2 = RIGHT;
        //столбик 3
        a[2][0].angle1 = LEFT;
        a[2][0].angle2 = RIGHT;

        a[2][1].angle1 = LEFT;
        a[2][1].angle2 = BOTTOM;

        a[2][2].angle1 = TOP;
        a[2][2].angle2 = LEFT;

        a[2][3].angle1 = LEFT;
        a[2][3].angle2 = BOTTOM;

        a[2][4].angle1 = TOP;
        a[2][4].angle2 = LEFT;

        a[2][5].angle1 = LEFT;
        a[2][5].angle2 = RIGHT;
        //столбик 4
        a[3][0].angle1 = LEFT;
        a[3][0].angle2 = BOTTOM;

        a[3][1].angle1 = TOP;
        a[3][1].angle2 = BOTTOM;

        a[3][2].angle1 = TOP;
        a[3][2].angle2 = DIAGONAL_BOTTOM_LEFT;

        a[3][3].angle1 = DIAGONAL_TOP_LEFT;
        a[3][3].angle2 = BOTTOM;

        a[3][4].angle1 = TOP;
        a[3][4].angle2 = BOTTOM;

        a[3][5].angle1 = TOP;
        a[3][5].angle2 = LEFT;

        return a;
    }

    private Angles[][] create4() {
        Angles[][] a = getNubberAngles();
        //столбик 1
        a[0][0].angle1 = RIGHT;
        a[0][0].angle2 = BOTTOM;

        a[0][1].angle1 = TOP;
        a[0][1].angle2 = BOTTOM;

        a[0][2].angle1 = TOP;
        a[0][2].angle2 = BOTTOM;

        a[0][3].angle1 = TOP;
        a[0][3].angle2 = RIGHT;

        a[0][4].angle1 = DIAGONAL;
        a[0][4].angle2 = DIAGONAL;

        a[0][5].angle1 = DIAGONAL;
        a[0][5].angle2 = DIAGONAL;
        //столбик 2
        a[1][0].angle1 = LEFT;
        a[1][0].angle2 = BOTTOM;

        a[1][1].angle1 = TOP;
        a[1][1].angle2 = BOTTOM;

        a[1][2].angle1 = TOP;
        a[1][2].angle2 = RIGHT;

        a[1][3].angle1 = LEFT;
        a[1][3].angle2 = RIGHT;

        a[1][4].angle1 = DIAGONAL;
        a[1][4].angle2 = DIAGONAL;

        a[1][5].angle1 = DIAGONAL;
        a[1][5].angle2 = DIAGONAL;
        //столбик 3
        a[2][0].angle1 = RIGHT;
        a[2][0].angle2 = BOTTOM;

        a[2][1].angle1 = TOP;
        a[2][1].angle2 = BOTTOM;

        a[2][2].angle1 = TOP;
        a[2][2].angle2 = LEFT;

        a[2][3].angle1 = LEFT;
        a[2][3].angle2 = BOTTOM;

        a[2][4].angle1 = TOP;
        a[2][4].angle2 = BOTTOM;

        a[2][5].angle1 = TOP;
        a[2][5].angle2 = RIGHT;
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

    private Angles[][] create5() {
        Angles[][] a = getNubberAngles();
        //столбик 1
        a[0][0].angle1 = RIGHT;
        a[0][0].angle2 = BOTTOM;

        a[0][1].angle1 = TOP;
        a[0][1].angle2 = BOTTOM;

        a[0][2].angle1 = TOP;
        a[0][2].angle2 = BOTTOM;

        a[0][3].angle1 = TOP;
        a[0][3].angle2 = RIGHT;

        a[0][4].angle1 = RIGHT;
        a[0][4].angle2 = BOTTOM;

        a[0][5].angle1 = TOP;
        a[0][5].angle2 = RIGHT;
        //столбик 2
        a[1][0].angle1 = LEFT;
        a[1][0].angle2 = RIGHT;

        a[1][1].angle1 = RIGHT;
        a[1][1].angle2 = BOTTOM;

        a[1][2].angle1 = TOP;
        a[1][2].angle2 = RIGHT;

        a[1][3].angle1 = LEFT;
        a[1][3].angle2 = RIGHT;

        a[1][4].angle1 = LEFT;
        a[1][4].angle2 = RIGHT;

        a[1][5].angle1 = LEFT;
        a[1][5].angle2 = RIGHT;
        //столбик 3
        a[2][0].angle1 = LEFT;
        a[2][0].angle2 = RIGHT;

        a[2][1].angle1 = LEFT;
        a[2][1].angle2 = RIGHT;

        a[2][2].angle1 = LEFT;
        a[2][2].angle2 = RIGHT;

        a[2][3].angle1 = LEFT;
        a[2][3].angle2 = BOTTOM;

        a[2][4].angle1 = TOP;
        a[2][4].angle2 = LEFT;

        a[2][5].angle1 = LEFT;
        a[2][5].angle2 = RIGHT;
        //столбик 4
        a[3][0].angle1 = LEFT;
        a[3][0].angle2 = BOTTOM;

        a[3][1].angle1 = TOP;
        a[3][1].angle2 = LEFT;

        a[3][2].angle1 = LEFT;
        a[3][2].angle2 = BOTTOM;

        a[3][3].angle1 = TOP;
        a[3][3].angle2 = BOTTOM;

        a[3][4].angle1 = TOP;
        a[3][4].angle2 = BOTTOM;

        a[3][5].angle1 = TOP;
        a[3][5].angle2 = LEFT;

        return a;
    }

    private Angles[][] create6() {
        Angles[][] a = getNubberAngles();
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
        a[1][0].angle1 = LEFT;
        a[1][0].angle2 = RIGHT;

        a[1][1].angle1 = RIGHT;
        a[1][1].angle2 = BOTTOM;

        a[1][2].angle1 = TOP;
        a[1][2].angle2 = RIGHT;

        a[1][3].angle1 = RIGHT;
        a[1][3].angle2 = BOTTOM;

        a[1][4].angle1 = TOP;
        a[1][4].angle2 = RIGHT;

        a[1][5].angle1 = LEFT;
        a[1][5].angle2 = RIGHT;
        //столбик 3
        a[2][0].angle1 = LEFT;
        a[2][0].angle2 = RIGHT;

        a[2][1].angle1 = LEFT;
        a[2][1].angle2 = RIGHT;

        a[2][2].angle1 = LEFT;
        a[2][2].angle2 = RIGHT;

        a[2][3].angle1 = LEFT;
        a[2][3].angle2 = BOTTOM;

        a[2][4].angle1 = TOP;
        a[2][4].angle2 = LEFT;

        a[2][5].angle1 = LEFT;
        a[2][5].angle2 = RIGHT;
        //столбик 4
        a[3][0].angle1 = LEFT;
        a[3][0].angle2 = BOTTOM;

        a[3][1].angle1 = TOP;
        a[3][1].angle2 = LEFT;

        a[3][2].angle1 = LEFT;
        a[3][2].angle2 = BOTTOM;

        a[3][3].angle1 = TOP;
        a[3][3].angle2 = BOTTOM;

        a[3][4].angle1 = TOP;
        a[3][4].angle2 = BOTTOM;

        a[3][5].angle1 = TOP;
        a[3][5].angle2 = LEFT;

        return a;
    }

    private Angles[][] create7() {
        Angles[][] a = getNubberAngles();
        //столбик 1
        a[0][0].angle1 = RIGHT;
        a[0][0].angle2 = BOTTOM;

        a[0][1].angle1 = TOP;
        a[0][1].angle2 = RIGHT;

        a[0][2].angle1 = DIAGONAL;
        a[0][2].angle2 = DIAGONAL;

        a[0][3].angle1 = DIAGONAL;
        a[0][3].angle2 = DIAGONAL;

        a[0][4].angle1 = DIAGONAL;
        a[0][4].angle2 = DIAGONAL;

        a[0][5].angle1 = DIAGONAL;
        a[0][5].angle2 = DIAGONAL;
        //столбик 2
        a[1][0].angle1 = LEFT;
        a[1][0].angle2 = RIGHT;

        a[1][1].angle1 = LEFT;
        a[1][1].angle2 = RIGHT;

        a[1][2].angle1 = DIAGONAL;
        a[1][2].angle2 = DIAGONAL;

        a[1][3].angle1 = DIAGONAL;
        a[1][3].angle2 = DIAGONAL;

        a[1][4].angle1 = DIAGONAL;
        a[1][4].angle2 = DIAGONAL;

        a[1][5].angle1 = DIAGONAL;
        a[1][5].angle2 = DIAGONAL;
        //столбик 3
        a[2][0].angle1 = LEFT;
        a[2][0].angle2 = RIGHT;

        a[2][1].angle1 = LEFT;
        a[2][1].angle2 = BOTTOM;

        a[2][2].angle1 = TOP;
        a[2][2].angle2 = BOTTOM;

        a[2][3].angle1 = TOP;
        a[2][3].angle2 = BOTTOM;

        a[2][4].angle1 = TOP;
        a[2][4].angle2 = BOTTOM;

        a[2][5].angle1 = TOP;
        a[2][5].angle2 = RIGHT;
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

    private Angles[][] create77() {
        Angles[][] a = getNubberAngles();
        //столбик 1
        a[0][0].angle1 = RIGHT;
        a[0][0].angle2 = BOTTOM;

        a[0][1].angle1 = TOP;
        a[0][1].angle2 = RIGHT;

        a[0][2].angle1 = DIAGONAL;
        a[0][2].angle2 = DIAGONAL;

        a[0][3].angle1 = DIAGONAL;
        a[0][3].angle2 = DIAGONAL;

        a[0][4].angle1 = DIAGONAL;
        a[0][4].angle2 = DIAGONAL;

        a[0][5].angle1 = DIAGONAL;
        a[0][5].angle2 = DIAGONAL;
        //столбик 2
        a[1][0].angle1 = LEFT;
        a[1][0].angle2 = RIGHT;

        a[1][1].angle1 = LEFT;
        a[1][1].angle2 = RIGHT;

        a[1][2].angle1 = DIAGONAL;
        a[1][2].angle2 = DIAGONAL;

        a[1][3].angle1 = DIAGONAL_TOP_RIGHT;
        a[1][3].angle2 = BOTTOM;

        a[1][4].angle1 = TOP;
        a[1][4].angle2 = BOTTOM;

        a[1][5].angle1 = TOP;
        a[1][5].angle2 = RIGHT;
        //столбик 3
        a[2][0].angle1 = LEFT;
        a[2][0].angle2 = RIGHT;

        a[2][1].angle1 = LEFT;
        a[2][1].angle2 = BOTTOM;

        a[2][2].angle1 = TOP;
        a[2][2].angle2 = DIAGONAL_BOTTOM_LEFT;

        a[2][3].angle1 = DIAGONAL_TOP_RIGHT;
        a[2][3].angle2 = BOTTOM;

        a[2][4].angle1 = TOP;
        a[2][4].angle2 = BOTTOM;

        a[2][5].angle1 = TOP;
        a[2][5].angle2 = LEFT;
        //столбик 4
        a[3][0].angle1 = LEFT;
        a[3][0].angle2 = BOTTOM;

        a[3][1].angle1 = TOP;
        a[3][1].angle2 = BOTTOM;

        a[3][2].angle1 = TOP;
        a[3][2].angle2 = DIAGONAL_BOTTOM_LEFT;

        a[3][3].angle1 = DIAGONAL;
        a[3][3].angle2 = DIAGONAL;

        a[3][4].angle1 = DIAGONAL;
        a[3][4].angle2 = DIAGONAL;

        a[3][5].angle1 = DIAGONAL;
        a[3][5].angle2 = DIAGONAL;

        return a;
    }

    private Angles[][] create8() {
        Angles[][] a = getNubberAngles();
        //столбик 1
        a[0][0].angle1 = RIGHT;
        a[0][0].angle2 = BOTTOM;

        a[0][1].angle1 = TOP;
        a[0][1].angle2 = BOTTOM;

        a[0][2].angle1 = TOP;
        a[0][2].angle2 = DIAGONAL_BOTTOM_RIGHT;

        a[0][3].angle1 = DIAGONAL_TOP_RIGHT;
        a[0][3].angle2 = BOTTOM;

        a[0][4].angle1 = TOP;
        a[0][4].angle2 = BOTTOM;

        a[0][5].angle1 = TOP;
        a[0][5].angle2 = RIGHT;
        //столбик 2
        a[1][0].angle1 = LEFT;
        a[1][0].angle2 = RIGHT;

        a[1][1].angle1 = RIGHT;
        a[1][1].angle2 = BOTTOM;

        a[1][2].angle1 = TOP;
        a[1][2].angle2 = RIGHT;

        a[1][3].angle1 = RIGHT;
        a[1][3].angle2 = BOTTOM;

        a[1][4].angle1 = TOP;
        a[1][4].angle2 = RIGHT;

        a[1][5].angle1 = LEFT;
        a[1][5].angle2 = RIGHT;
        //столбик 3
        a[2][0].angle1 = LEFT;
        a[2][0].angle2 = RIGHT;

        a[2][1].angle1 = LEFT;
        a[2][1].angle2 = BOTTOM;

        a[2][2].angle1 = TOP;
        a[2][2].angle2 = LEFT;

        a[2][3].angle1 = LEFT;
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
        a[3][2].angle2 = DIAGONAL_BOTTOM_LEFT;

        a[3][3].angle1 = DIAGONAL_TOP_LEFT;
        a[3][3].angle2 = BOTTOM;

        a[3][4].angle1 = TOP;
        a[3][4].angle2 = BOTTOM;

        a[3][5].angle1 = TOP;
        a[3][5].angle2 = LEFT;

        return a;
    }

    private Angles[][] create9() {
        Angles[][] a = getNubberAngles();
        //столбик 1
        a[0][0].angle1 = RIGHT;
        a[0][0].angle2 = BOTTOM;

        a[0][1].angle1 = TOP;
        a[0][1].angle2 = BOTTOM;

        a[0][2].angle1 = TOP;
        a[0][2].angle2 = BOTTOM;

        a[0][3].angle1 = TOP;
        a[0][3].angle2 = RIGHT;

        a[0][4].angle1 = RIGHT;
        a[0][4].angle2 = BOTTOM;

        a[0][5].angle1 = TOP;
        a[0][5].angle2 = RIGHT;
        //столбик 2
        a[1][0].angle1 = LEFT;
        a[1][0].angle2 = RIGHT;

        a[1][1].angle1 = RIGHT;
        a[1][1].angle2 = BOTTOM;

        a[1][2].angle1 = TOP;
        a[1][2].angle2 = RIGHT;

        a[1][3].angle1 = LEFT;
        a[1][3].angle2 = RIGHT;

        a[1][4].angle1 = LEFT;
        a[1][4].angle2 = RIGHT;

        a[1][5].angle1 = LEFT;
        a[1][5].angle2 = RIGHT;
        //столбик 3
        a[2][0].angle1 = LEFT;
        a[2][0].angle2 = RIGHT;

        a[2][1].angle1 = LEFT;
        a[2][1].angle2 = BOTTOM;

        a[2][2].angle1 = TOP;
        a[2][2].angle2 = LEFT;

        a[2][3].angle1 = LEFT;
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

    private Angles[][] createSeparator() {
        Angles[][] a = getSeparatorAngles();
        //столбик 1
        a[0][0].angle1 = DIAGONAL;
        a[0][0].angle2 = DIAGONAL;

        a[0][1].angle1 = RIGHT;
        a[0][1].angle2 = BOTTOM;

        a[0][2].angle1 = TOP;
        a[0][2].angle2 = RIGHT;

        a[0][3].angle1 = RIGHT;
        a[0][3].angle2 = BOTTOM;

        a[0][4].angle1 = TOP;
        a[0][4].angle2 = RIGHT;

        a[0][5].angle1 = DIAGONAL;
        a[0][5].angle2 = DIAGONAL;
        //столбик 2
        a[1][0].angle1 = DIAGONAL;
        a[1][0].angle2 = DIAGONAL;

        a[1][1].angle1 = LEFT;
        a[1][1].angle2 = BOTTOM;

        a[1][2].angle1 = TOP;
        a[1][2].angle2 = LEFT;

        a[1][3].angle1 = LEFT;
        a[1][3].angle2 = BOTTOM;

        a[1][4].angle1 = TOP;
        a[1][4].angle2 = LEFT;

        a[1][5].angle1 = DIAGONAL;
        a[1][5].angle2 = DIAGONAL;

        return a;
    }

    private Angles[][] getNubberAngles() {
        Angles[][] a = new Angles[4][6];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = new Angles();
            }
        }
        return a;
    }

    private Angles[][] getSeparatorAngles() {
        Angles[][] a = new Angles[2][6];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = new Angles();
            }
        }
        return a;
    }
}
