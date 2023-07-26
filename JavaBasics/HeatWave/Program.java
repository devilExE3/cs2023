package JavaBasics.HeatWave;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A log file containes a log of daily temperatures, in the form
 * of integer values, one number per line. The first number in the file
 * gives the total count of temperatures that follow in the file.
 * A Heat Wave is defined as a sequence of increasing temperatures, followed
 * by a sequence of decreasing temperatures. For instance, in the following
 * temperature log of 13 temperatures:
 * -4 -5 -3 0 0 4 10 11 9 6 7 5 3
 * The sequence starting at index 1 and ending at index 9 is a Heat Wave.
 * Write a program to determine the starting, ending and maximum
 * temperature in a given log file.
 */
public class Program {

        public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);

        System.out.printf("Welcome to Heat Wave...\n");
        System.out.printf("Current directory: %s\n", (new File(".")).getAbsolutePath());
        System.out.printf("Log filename? > ");
        String logFilename = console.nextLine();

        // TODO: Read the temperatures from the log file
        // TODO: Determine the starting and ending indexes
        // TODO: of the longest heat wave fron this file.

        System.out.printf("Goodbye!\n");
        console.close();
    }
}
