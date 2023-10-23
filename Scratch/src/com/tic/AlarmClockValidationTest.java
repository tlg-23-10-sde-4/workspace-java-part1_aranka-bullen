package com.tic;/*
 * This is a client-code main class that is focus on validation testing.
 *
 * This class will be conducting BVT- Boundary Value Testing. This type of test will test
 * on the boundary and just outside the boundary values. For example 0,1 and 20,21.
 */

class AlarmClockValidationTest {
    public static void main(String[] args) {

        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(0);  // system should reject and show error message
        System.out.println(clock);   // 0 is outside the boundary value. System values will remain.
                                     // the default values

        clock.setSnoozeInterval(1); //system should accept the value and run the code without error
        System.out.println(clock);  // 1 is within the boundary value.  System value should print 1

        clock.setSnoozeInterval(20); // system should accept and run this value without error
        System.out.println(clock);   // 20 is within the boundary value

        clock.setSnoozeInterval(21); //system should reject the value and print an error message.
        System.out.println(clock);   // 21 is outside the boundary value. System value will remain 20
                                    // which is the last valid value set. Values should not change.

    }

}