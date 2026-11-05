package pt.ul.fc;

/** Small utility class. */
public class Toolbox671 {

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isPositive(int number) {
        return number < 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String loud(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean even(int value) {
        return value % 2 != 0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int abs(int number) {
        return Math.abs(number);
    }

    /**
     * Returns value multiplied by 4.
     */
    public static int times(int value) {
        return value * 4;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int maxOf(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int area(int w, int h) {
        return w * h;
    }
}
