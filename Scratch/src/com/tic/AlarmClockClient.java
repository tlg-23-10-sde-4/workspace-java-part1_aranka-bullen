package com.tic;/*
 * This is the application main class, i.e., the class definition with the main() method.
 *
 * Its purpose is to create a few instances of com.tic.AlarmClock and give them
 */

// This is the application "entry point" or starting point - the app starts from here.
class AlarmClockClient {
    public static void main(String[] args) {

        // create an instance of com.tic.AlarmClock and set its properties.
        AlarmClock clock1 = new AlarmClock(7);
        //clock1.snoozeInterval = 7; Should not be possible to set properties directly b/c snoozeInterval
                                    // is private so clock1 cannot directly call, initialize, or declare it
                                    // It must be called through the constructor parameters

        // create a  2nd instance of com.tic.AlarmClock using the ctor and set its properties also.
        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL);  //MAX_INTERVAL is public, so it can be
                                                                      // called through the class name, but
                                                                      //client-code cannot declare/initialize it.

        // create a 3rd instance of com.tic.AlarmClock but DO NOT set its properties.
        AlarmClock clock3 = new AlarmClock();

        // call methods on the created instances.
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        //Call toString method
        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);

    }
}
