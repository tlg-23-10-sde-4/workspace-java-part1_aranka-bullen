package gov.test;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 56;
        ages[1] = 50;
        ages[2] = 9;
        ages[3] = 9;

        for (int age: ages) {
            System.out.printf("The age is %s.\n", age);
        }
        System.out.printf("The total nummber is %s.\n", ages.length);
        System.out.println(Arrays.toString(ages));

        double[] temps = {63.3, 88.0, 73.0, 66.2, 70.0};
        for (double temp : temps){
            System.out.printf("The current temperature is %s.\n", temp);
        }
        System.out.println(Arrays.toString(ages));

        String[] names = {"Lilly", "john"};
        for (String name : names) {
            System.out.printf("My name is %s.\n", name);
            System.out.println(name.length());
        }
        System.out.println(Arrays.toString(names));
    }
}