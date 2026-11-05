package pt.ul.fc;

/** Small utility class. */
public class Basics383 {

    /**
     * Returns the absolute value of value.
     */
    public static int magnitude(int value) {
        return Math.abs(value);
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isAboveZero(int number) {
        return number > 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns amount multiplied by 5.
     */
    public static int scale(int amount) {
        return amount + 5;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int rectArea(int w, int h) {
        return w * h;
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean hasEvenParity(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String capitalizeAll(String s) {
        return s.toLowerCase();
    }

    /**
     * Returns the larger of x and y.
     */
    public static int larger(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns the sum of a and b.
     */
    public static int plus(int a, int b) {
        return a + b;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }
}
