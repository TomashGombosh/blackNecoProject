package com.blackNecoProject.testng.commons;

import org.apache.commons.lang3.RandomStringUtils;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

/**
 * Holds all the functions that aren't necessarily project related.
 */
public class Utils {


    /**
     * Waits for a moment.
     *
     * @param millis how many milliseconds to sleep.
     */
    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (Exception ignored) {
            // i dunno why this would fail
        }
    }

    /**
     * Removes all newlines from a string, replacing them with spaces, ensures there are only single spaces,
     * and trims the string.
     *
     * @param inStr the string to normalize.
     * @return the string with all new lines replaced with spaces, all "s removed, trimmed, and ensured single-spaces.
     */
    public static String normalizeString(String inStr){
        String outStr = inStr.replace('\n', ' ');
        outStr = outStr.replace("\"", "");
        outStr = outStr.replace("“", "");
        outStr = outStr.replace("”", "");
        outStr = outStr.replace("–", "-");
        outStr = outStr.replace("—", "-");
        outStr = outStr.replace("•", "");
        while (outStr.contains("  ")) {
            outStr = outStr.replace("  ", " ");
        }

        return outStr.trim();
    }

    /**
     * Grabs the current timestamp to append to logs.
     *
     * @return the current timestamp, as a string looking like "[YYYY-MM-DD HH:MM:SS.SSS]".
     */
    public static String getTimeStamp(){
        Date date = new Date();
        Timestamp time = new Timestamp(date.getTime());
        String stamp = time.toString();
        while (stamp.length() < 23) {
            stamp += "0";
        }
        return "[" + stamp + "] ";
    }


    /**
     * Generates a random string.
     *
     * @param length how many characters the string should be.
     * @return a randomly generated string `length` characters long.
     */
    public static String getRandomString(int length){
        return RandomStringUtils.randomAlphabetic(length).toLowerCase();
    }

    /**
     * Gets a random integer.
     */
    public static int getRandomInteger(int max){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(max);
    }
}