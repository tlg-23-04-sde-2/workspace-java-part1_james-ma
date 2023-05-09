package come.mathhelp;

class CalculatorClient {

    public static void main(String[] args) {

        double sum = Calculator.add(3, 5);
        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: " + Calculator.subtract(3.1, 5.1));

        int input = 10;
        System.out.println(input + " is even: " + Calculator.isEven(input));

        System.out.println(Calculator.getRandomInt());

        System.out.println(Calculator.getRandomInt(5, 10));

        System.out.println(Calculator.getAverage(3, 5, 9, 9));
        System.out.println(Calculator.getAverage(56));
    }
}