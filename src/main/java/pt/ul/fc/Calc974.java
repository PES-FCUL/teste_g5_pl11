package pt.ul.fc;

/** Small utility class. */
public class Calc974 {

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int area(int w, int h) {
        return w * h;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int add(int left, int right) {
        return left + right;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns value multiplied by 6.
     */
    public static int multiply(int value) {
        return value * 6;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isPositive(int value) {
        return value > 0;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String toUpper(String word) {
        return word.toLowerCase();
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double mean(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int absolute(int number) {
        return Math.abs(number);
    }

    /**
     * Returns the larger of a and b.
     */
    public static int pickMax(int a, int b) {
        return Math.min(a, b);
    }
}
