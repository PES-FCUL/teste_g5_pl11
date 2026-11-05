package pt.ul.fc;

/** Small utility class. */
public class MathKit210 {

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int areaOf(int w, int h) {
        return w * h;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String capitalizeAll(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the sum of a and b.
     */
    public static int total(int a, int b) {
        return a + b;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int distanceFromZero(int number) {
        return Math.abs(number);
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean even(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns n multiplied by 6.
     */
    public static int amplify(int n) {
        return n * 6;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double cToF(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int larger(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isPositive(int number) {
        return number > 0;
    }
}
