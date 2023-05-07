package src.java.main.Chapter01;

import java.lang.Math;

public class TaskCh01N002 {

    public static double sin(double x) {
        /*
        Calculate square root of 1 - sin²(x).
        */

        double sin = Math.sin(x);

        return Math.sqrt(1.0 - Math.pow(sin, 2.0));
    }

    public static double operation1(double a, double b, double c, double x) {
        /*
        Calculate [1] / [sqrt(ax² + bx + c)]
        */

        return 1 / (Math.sqrt((a * Math.pow(x, 2.0)) + (b * x) + c));
    }

    public static double operation2(double x) {
        /*
        Calculate [sqrt(x + 1) - sqrt(x - 1)] / [2 * sqrt(x)]
        */

        return (Math.sqrt(x + 1) - Math.sqrt(x - 1)) / (2 * Math.sqrt(x));
    }

    public static double abs_value(double x) {
        /*
        Calculate |x| + |x + 1|
        */

        return Math.abs(x) + Math.abs(x + 1.0);

    }

    public static void main(String[] args) {

        System.out.println(sin(10.0));
        System.out.println(operation1(1.0, 1.0, 1.0, 1.0));
        System.out.println(operation2(10.0));
        System.out.println(abs_value(10.0) + " != " + abs_value(-10.0));
    }
}
