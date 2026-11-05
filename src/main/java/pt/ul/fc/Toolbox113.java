package pt.ul.fc;

/** Small utility class. */
public class Toolbox113 {

    /**
     * Returns value multiplied by 6.
     */
    public static int multiply(int value) {
        return value * 6;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String toUpper(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left + right;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int larger(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int rectArea(int w, int h) {
        return w * h;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double avg(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int magnitude(int number) {
        return Math.abs(number);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean positive(int n) {
        return n > 0;
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean even(int value) {
        return value % 2 != 0;
    }
}
