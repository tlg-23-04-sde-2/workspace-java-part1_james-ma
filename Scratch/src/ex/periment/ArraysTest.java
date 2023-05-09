package ex.periment;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 1;
        ages[1] = 2;
        ages[3] = 3;
        System.out.println(ages);
        System.out.println(ages.length);
        System.out.println(Arrays.toString(ages));

        double[] temps = {64.0, 34.1, 32.3};
        for (double temp : temps) {
            System.out.println("The temperature is: " + temp);
        }
        System.out.println();
        for (int i = 0; i <temps.length; i++) {
            System.out.println("" + temps[i]);
        }
    }
}