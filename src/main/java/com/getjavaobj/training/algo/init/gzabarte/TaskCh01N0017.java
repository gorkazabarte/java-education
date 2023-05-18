package com.getjavaobj.training.algo.init.gzabarte;

import java.lang.Math;

public class TaskCh01N0017 {
    /**
     * Calculate square root of 1 - sin²(x)
     *
     * @param x double number
     * @return result of the operation
     */
    public static double operation1(double x) {
        return Math.sqrt(1.0 - (Math.pow(Math.sin(x), 2)));
    }

    /**
     * Calculate [1] / [sqrt(ax² + bx + c)]
     *
     * @param a double parameter
     * @param b double parameter
     * @param c double parameter
     * @param x double number
     * @return result of the operation
     */
    public static double operation2(double a, double b, double c, double x) {
        return 1 / Math.sqrt(a * Math.pow(x, 2.0) + b * x + c);
    }

    /**
     * Calculate [sqrt(x + 1) + sqrt(x - 1)] / [2 * sqrt(x)]
     *
     * @param x double number
     * @return result of the operation
     */
    public static double operation3(double x) {
        return (Math.sqrt(x + 1) + Math.sqrt(x - 1)) / 2 * Math.sqrt(x);
    }

    /**
     * Calculate |x| + |x + 1|
     *
     * @param x double number
     * @return result of the operation
     */
    public static double operation4(double x) {
        return Math.abs(x) + Math.abs(x + 1.0);
    }

    public static void main(String[] args) {
        System.out.println(operation1(10.0));
        System.out.println(operation2(1.0, 1.0, 1.0, 1.0));
        System.out.println(operation3(10.0));
        System.out.println(operation4(10.0) + " != " + operation4(-10.0));
    }
}
