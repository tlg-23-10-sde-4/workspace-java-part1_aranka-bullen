package com.math;

import static com.math.Calculator.*;  // Ok to use * for static methods, but lazy for non-static methods.
                                    // This allow you to use Calculator method without using class name.
/*
 *
 */

class CalculatorClient {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        /*
       BELOW: 'sum' is a reference point initialized to
        the created instance of com.math.Calculator 'calc' is calling on the add method to
        return the added value of the numbers in the ().
         */
        double sum = calc.add(3.1,5.3);
        System.out.println("The sum is "+ sum);

        /*
        BELOW: This is an example of method inlaying. This is because the method is called inside the call.
        It is okay to pass into where doubles are expected as shown in the sub() method. This is called
        implicit upcast. That is because int is smaller than a double.

         */
        System.out.println("The difference is " + calc.sub(3,5));

        System.out.println("10 is even? " + calc.isEven(10));
        System.out.println(" The average is " + Calculator.average(3,4,5,9,15)); //first: 3, rest: 4,5,15

        int winner = Calculator.randomInt(5,20);
        System.out.println("The winner is " + winner);
        
        // iterates 1_000_000_000 times, calling this meethod and checking  the results
        //  against the min and max.
        int min = 5;
        int max = 20;
        boolean itWorks = true;
        int result = 0;
        
        for (int i = 0; i < 1_000_000_000; i++)  {
            result = Calculator.randomInt(5,20);
        
            if (result < min || result > max) {
                itWorks = false;
                break;
                }
            }

            if (itWorks) {
                System.out.println("It works");
            }
            
            else {
                System.out.println("YOU HAVE A BUG");
                System.out.println("THE VALUE RETURN IS: " + result);
            }
    }
}