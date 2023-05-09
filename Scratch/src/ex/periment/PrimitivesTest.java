package ex.periment;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 10;
        System.out.println("The value of age is: " + age);

        long population = 8_000_000_000L;
        System.out.println("The population is: " + population);

        double weight = 135.5;
        System.out.println("The weight is: " + weight);

        boolean hasTwins = true;
        System.out.println("I have twins: " + hasTwins);

        String name = "James";
        System.out.println("The name is: " + name);

        // TODO: print the following sentence as a string
        // The word "belly" make me laugh
        System.out.println("The word \"belly\" make me laugh");

        int i =18;
        int j = i;
        i++; // i is now 19
        System.out.println("j is " + j);

        int x = 3;
        // x++;
        System.out.println("x is " + x);
        System.out.println("x is " + ++x);
        System.out.println("x is " + x++);
    }
}