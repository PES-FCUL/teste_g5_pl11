package pt.ul.fc;

/** Small utility class. */
public class Basics344 {

    /**
     * Returns n multiplied by 7.
     */
    public static int multiply(int n) {
        return n * 7;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int abs(int number) {
        return Math.abs(number);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int pickMax(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns word converted to upper case.
     */
    public static String toUpper(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int areaOf(int base, int side) {
        return base * side;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left + right;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean positive(int n) {
        return n > 0;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double avg(double a, double b) {
        return (a + b) / 2.0;
    }
}
