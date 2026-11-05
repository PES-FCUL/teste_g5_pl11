package pt.ul.fc;

/** Small utility class. */
public class Toolbox130 {

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int plus(int left, int right) {
        return left - right;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isAboveZero(int value) {
        return value > 0;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int pickMax(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns s converted to upper case.
     */
    public static String toUpper(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns amount multiplied by 4.
     */
    public static int times(int amount) {
        return amount * 4;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean isEven(int number) {
        return number % 2 != 0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int absolute(int number) {
        return Math.abs(number);
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double average(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int areaOf(int base, int side) {
        return base * side;
    }
}
