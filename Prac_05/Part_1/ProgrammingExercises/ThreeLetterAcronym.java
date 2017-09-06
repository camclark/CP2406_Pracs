/*
Three-letter acronyms are common in the business world. For example, in Java you use the IDE (Integrated Development
Environment) in the JDK (Java Development Kit) to write programs used by the JVM (Java Virtual Machine) that you might
send over a LAN (local area network). Programmers even use the acronym TLA to stand for three-letter acronym. Write a
program that allows a user to enter three words and display the appropriate three-letter acronym in all uppercase letters.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        String str;
        int x;
        int length;
        int lastSpace = -1;
        int count = 0;
        String[] threeLetterAcronym = new String[3];

        String partStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a three word thing to receive  >> ");
        str = in.nextLine();
        length = str.length();
        for(x = 0; x < length; ++x)
        {
            if(str.charAt(x) == ' ')
            {
                partStr = str.substring(lastSpace + 1, lastSpace + 2);
                partStr = partStr.toUpperCase();
                threeLetterAcronym[count] = partStr;
                lastSpace = x;
                count++;
            }
        }
        partStr = str.substring(lastSpace + 1, lastSpace + 2);
        partStr = partStr.toUpperCase();
        threeLetterAcronym[count] = partStr;

        System.out.print(Arrays.toString(threeLetterAcronym));
    }
}
