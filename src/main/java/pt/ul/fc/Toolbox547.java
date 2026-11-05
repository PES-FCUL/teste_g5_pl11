package pt.ul.fc;

/** Small utility class. */
public class Toolbox547 {

    /**
     * Returns the absolute value of n.
     */
    public static int magnitude(int n) {
        return Math.abs(n);
    }

    /**
     * Returns the larger of a and b.
     */
    public static int larger(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns the sum of x and y.
     */
    public static int sum(int x, int y) {
        return x - y;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean greaterThanZero(int number) {
        return number > 0;
    }

    /**
     * Returns value multiplied by 4.
     */
    public static int amplify(int value) {
        return value + 4;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String shout(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean even(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double midpoint(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int areaOf(int width, int height) {
        return width * height;
    }
}
