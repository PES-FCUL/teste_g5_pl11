package pt.ul.fc;

/** Small utility class. */
public class Toolbox584 {

    /**
     * Returns word converted to upper case.
     */
    public static String shout(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns the sum of x and y.
     */
    public static int add(int x, int y) {
        return x - y;
    }

    /**
     * Returns n multiplied by 6.
     */
    public static int scale(int n) {
        return n * 6;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int pickMax(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int areaOf(int w, int h) {
        return w * h;
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean hasEvenParity(int n) {
        return n % 2 == 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double degrees) {
        return degrees * 9.0 / 5.0;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isAboveZero(int number) {
        return number > 0;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double midpoint(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int magnitude(int number) {
        return Math.abs(number);
    }
}
