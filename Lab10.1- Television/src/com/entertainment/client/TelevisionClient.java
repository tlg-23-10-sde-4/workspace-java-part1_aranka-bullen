package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

/*
 * This will be the application main class. That is the class definition with
 * the main method.
 *
 * Purpose: creates a few instance of the object and give them a test-drive.
 */
class TelevisionClient {

    // the application starting point - at runtime, the app starts her
    public static void main(String[] args) throws InvalidBrandException {
        System.out.println(Television.getInstanceCount() + " instances have been created! \n");

        //create an instance of com.entertainment.Television and set its properties
        Television tv1 = new Television("Samsung", Television.MAX_VOLUME);
        //tv1.setBrand("Samsung");
        //tv1.setVolume(32);

        // create an instance of com.entertainment.Television and set it properties via the 2-arg ctor
        Television tv2 = new Television("Sony", Television.MIN_VOLUME);

        // Create an instance of com.entertainment.Television and set it properties via 1-arg ctor
        Television tv3 = new Television("LG");

       // create an instance of com.entertainment.Television and set its properties
        Television tv4 = new Television("Toshiba", -5, DisplayType.OLED );

        //Calling the methods
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        System.out.println();

        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        tv4.mute();

        //show the toString() method of each instance in action
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3 + "'\n");

        System.out.println(tv4);

        System.out.println(Television.getInstanceCount() + " instances have been created.");

    }

}
