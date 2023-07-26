package JavaBasics.Regex;

import java.util.Scanner;

/**
 * A simple regular expression (regex) is a special string used to determine if
 * other strings match a specific pattern. In a regex '?', '.' and '*' carry a
 * special meaning, as follows:
 *   '?': matches exaclty one (any) character
 *   '.': matches 0 or one (any) character
 *   '*': matches 0 or more (any) characters
 * All other characters in a regex need to be matched exactly.
 * Write a program which is reading a regex from the console, then in a loop
 * is verifying if another string also read from the console is matching
 * or does not match the regex, like in the example below:
 *  Regular Expression? > a?b*c
 *  Text? > axbyc
 *  'axbyc' matches regex 'a?b*c'
 *  Text? > aUbc
 *  'aUbc' matches regex 'a?b*c'
 *  Text? > aVbwwwwc
 *  'aVbwwwwc' matches regex 'a?b*c'
 *  Text? > abc
 *  'abc' does NOT match regex 'a?b*c'
 *  Text? > quit
 *  Goodbye!
 */
public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.printf("Regular Expression? > ");
        String regex = console.nextLine();

        do {
            System.out.printf("Text? > ");
            String text = console.nextLine();
            if (text.isEmpty() || text.equalsIgnoreCase("quit")) {
                break;
            }
            
            // TODO: verify if text is matching regex
            
        } while(true);

        System.out.println("Goodbye!");
        console.close();
    }
}
