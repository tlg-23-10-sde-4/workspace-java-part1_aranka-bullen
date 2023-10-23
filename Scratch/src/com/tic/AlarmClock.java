package com.tic;/*
 * Class definition to model the workings of an alarm clock.
 * This called a "business class" or "system class" as it contains b
 * business things (attributes and methods).
 * This class definition does NOT have a main() method - most don't.
 *
 * Personal Note: This tab is where you would define all the properties of an object and the format
 * they are to be executed out.
 */

class AlarmClock {

    /* properties or attributes - in Java, we call these "instance variables" or "fields".
     *
     * "static" = "shared" variables- only one copy of theses, live in the class-wide common storage area
     * Static methods cannot use instance variables or regular instance methods b/c those instance apply only
     * to a specified scenario. Static methods are called ClassName.methodName()
     *
     * "final" = "fixed" variables - once fixed they cannot be changed.
     *
     */
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    private int snoozeInterval = 5; // defaults value when the client does not specify,
                                    // NOT the system default of 0.

    //CONSTRUCTORS - These get called when the clients says new. Every class MUST HAVE at least one ctor
    public AlarmClock(){   //This is the default ctor when no ctor stated.
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);
    }

    //functions or operations - in Java, we call these "methods".
    void snooze() {
        System.out.println("Snoozing for " + snoozeInterval + " minutes....");
    }

    //accessor methods- provide "controlled" access to the object's fields
    //this allows us to fo things like data validation, i.e., enforcing contraints
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    //To Do: enforce the data constraints -> must between 1 and 20 (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {
        if (MIN_INTERVAL <= snoozeInterval && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println(" Invalid SnoozeInterval: " + snoozeInterval + ". Input value between "
                    + MIN_INTERVAL + "and " + MAX_INTERVAL + ".");
        }
    }
    public String toString() {
        return "com.tic.AlarmClock: snoozeInterval = " + getSnoozeInterval();
    }
}