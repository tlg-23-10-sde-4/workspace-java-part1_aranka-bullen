package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.Television;

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java com.entertainment.client.TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of com.entertainment.Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java com.entertainment.client.TelevisionClientArgs Samsung 32 PLASMA";
            String note3 = String.format("valis brands are %s.\n",  Arrays.toString(Television.VALID_BRANDS));
            String note2 = String.format("vOLUME MUST BE BETWEEEN %s and %s.\n",
                    Television.MIN_VOLUME,Television.MAX_VOLUME);
            String note = "Note: supported displays are " + Arrays.toString(DisplayType.values()) ;
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        //Step 1: convert the strings as necessary:
        // brand needs to be string, and it already is
        //volume needs to be int, so it needs to be converted
        //display needs to be com.entertainment.DisplayType, it needs to convert

        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        //step 2: create a com.entertainment.Television object from 3 ingredients
        Television tv = new Television(brand, volume, display);

        //Step 3: Congratulate them on their order and show the television
        System.out.println(tv);

    }
}