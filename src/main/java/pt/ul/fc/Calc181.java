package pt.ul.fc;

/** Small utility class. */
public class Calc181 {

    /**
     * Returns value multiplied by 5.
     */
    public static int multiply(int value) {
        return value + 5;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int absolute(int n) {
        return Math.abs(n);
    }

    /**
     * Returns text converted to upper case.
     */
    public static String toUpper(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean greaterThanZero(int value) {
        return value > 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int rectArea(int width, int height) {
        return 2 * (width + height);
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean even(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double mean(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int sum(int left, int right) {
        return left + right;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int maxOf(int a, int b) {
        return Math.max(a, b);
    }
}
