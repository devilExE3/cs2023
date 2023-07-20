package JavaBasics.LongestWords;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Read all the words from a text file and print the longest 10 words
 * from that file and the line in the file where they occur.
 * Words are separated in the text file by white characters like
 * (' ', '\t', '\r', '\n') or punctuation characters like
 * ('.', ',', '!', '?', ';').
 */
public class Program {
    
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        File f = new File(".");
        System.out.printf("Current folder: %s\n", f.getCanonicalFile());
        System.out.printf("File name? > ");
        String fileName = console.nextLine();
        
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            // TODO: Determine the longest 10 words and their line number
            
            reader.close();
        } catch (Exception e) {
            System.out.printf("##Err: File unreadable!\n");
        }

        console.close();
    }
}
