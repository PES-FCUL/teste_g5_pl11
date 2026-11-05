package pt.ul.fc;

/** Small utility class. */
public class MathKit623 {

    /**
     * Returns the larger of x and y.
     */
    public static int biggest(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns the absolute value of n.
     */
    public static int magnitude(int n) {
        return Math.abs(n);
    }

    /**
     * Returns value multiplied by 4.
     */
    public static int scale(int value) {
        return value * 4;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double mean(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String loud(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isAboveZero(int number) {
        return number > 0;
    }

    /**
     * Returns the sum of a and b.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int area(int w, int h) {
        return w * h;
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }
}
