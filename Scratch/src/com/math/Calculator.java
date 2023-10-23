package com.math;


/*
 * Exercise to practice creating methods using primitives.
 *
 * An "all -static" class. i.e., one with all static methods.
 *
 * This means that it is not necessary to initialize an instance of the class
 * [i.e., com.math.Calculator calc = new Calcultor() ] This is because (EX: com.math.Calculator)
 * the class does not have any fields or attributes. It only has methods.
 *
 * Therefore, static methods are called in this form ClassName.methodName()
 *
 */
class Calculator {
    //prevent instantiation from outside, this is an 'all-static" class
    Calculator() {
    }

    public double add(double a, double b) {
        return a+b;
    }

    public double sub(double a, double b) {
        return a-b;
    }

    // The % symbol is used to determine remainders.
    public boolean isEven(int value) {
        return value % 2 == 0;
    }

        /*
         *EXERCISE: Returns a random integer between 1 and 19 (inclusive)
         *
         * HINT: see a class called Math (package java.lang), look for a helpful here.
         * NOTE: the methods in the MAth class are all "static," which means you call them as:*
         *
         * Math.methodName()
         */


        public int randomInt() {
             // delegate to min-max version, passing 1 for the min, and 19 for the max.
             return randomInt(1, 19); //this is used to call the other method below.
         }
             // int result = 0;
             //
             // double rand = Math.random();   // random() has a range of 0.0000 to 0.9999
             // double scaled = (rand * 19) + 1;  // results in values between 1.0000 to 19.999
             // result = (int) scaled;  //(int) is asking for an explicit downcast from double to int
             //
             // return result;


        /*
         * SIDE NOTE: There are two methods both named randomInt(),
         * however the parameter on each method is different.
         * This is an example of method overloading.
         *
         * EXERCISE Returns a random integer between min and max (inclusive), e.g., 5 to 20.
         */
        public static int randomInt(int min, int max) {
            double rand = Math.random();
            double scaled = rand * (max - min + 1);
            double raised = scaled + min;
        return (int) raised;
        }

        /*
         *Returns the average (arithmetic mean) of the supplied integers.
         * getAverage()
         */

        public static double average(int first, int... rest) {
            double result = 0.0;
            double sum = first;
            for(int value : rest) {
                sum += value;
            }
            return sum/ (rest.length + 1);
        }
}
