package come.mathhelp;

class Calculator {

    // add, subtract, isEven
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    /*
     * Returns a random integer between 1 and 14
     * See a class called Math （in package called java.lang).
     */

    public static int getRandomInt() {
        int result = 0;

        double rand = Math.random(); // 0.000000 to 0.999999
        double scaled = rand * 14 + 1;
        double scaledFloor = Math.floor(scaled);

        result = (int) scaledFloor;
        return result;
    }

    public static int getRandomInt(int min, int max) {
        int result;

        double rand = Math.random(); // 0.000000 to 0.999999
        double scaled = rand * (max - min + 1) + min; // 5.0000 to 10.999999
        double scaledFloor = Math.floor(scaled); // 5 to 10

        result = (int) scaledFloor;
        return result;
    }

    /*
     * Returns the average (arithmetic mean) of supplied integers
     */
    public static double getAverage(int first, int... rest) {
        double result = 0.0;

        double sum = first;
        for (int value : rest) {
            sum += value;
        }
        result = sum / (rest.length + 1); // At runtime, values is an array.

        return result;
    }
}