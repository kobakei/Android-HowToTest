package io.github.kobakei.androidhowtotest.util;

/**
 * Simple class to add two values.
 * This class is independent from Android framework.
 * Created by keisuke on 16/03/03.
 */
public class Calculator {
    public static int add(int v1, int v2) {
        return v1 + v2;
    }

    public static int subtract(int v1, int v2) {
        return v1 - v2;
    }

    public static int multiply(int v1, int v2) {
        return v1 * v2;
    }

    public static int divide(int v1, int v2) {
        return v1 / v2;
    }
}
