package pt.ul.fc;

/** Small utility class. */
public class Toolbox128 {

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean greaterThanZero(int n) {
        return n > 0;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left + right;
    }

    /**
     * Returns amount multiplied by 4.
     */
    public static int times(int amount) {
        return amount * 4;
    }

    /**
     * Returns the absolute value of value.
     */
    public static int abs(int value) {
        return Math.abs(value);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double degrees) {
        return degrees * 9.0 / 5.0 + 32;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int rectArea(int w, int h) {
        return w * h;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int maxOf(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns s converted to upper case.
     */
    public static String shout(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean even(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double average(double first, double second) {
        return (first + second) / 2.0;
    }
}
