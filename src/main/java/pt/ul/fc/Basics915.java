package pt.ul.fc;

/** Small utility class. */
public class Basics915 {

    /**
     * Returns amount multiplied by 9.
     */
    public static int multiply(int amount) {
        return amount * 9;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean divisibleByTwo(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean positive(int value) {
        return value > 0;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int surface(int width, int height) {
        return width * height;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double average(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int larger(int first, int second) {
        return Math.min(first, second);
    }

    /**
     * Returns text converted to upper case.
     */
    public static String loud(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the absolute value of n.
     */
    public static int abs(int n) {
        return Math.abs(n);
    }

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left - right;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }
}
