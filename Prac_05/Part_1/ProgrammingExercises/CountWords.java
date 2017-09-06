/*
Write an application that counts the words in a String entered by a user. Words are separated by any combination of
spaces, periods, commas, semicolons, question marks, exclamation points or dashes
 */

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        String str;
        int x;
        int length;
        int wordCount = 0;
        Boolean wordSwitch = Boolean.FALSE;
        Character[] separators = {'!', ' ', ',', '.', '?', ';', ':'};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence ");
        str = in.nextLine();
        length = str.length();

        for (x = 0; x < length; ++x) {
            if (
                    str.charAt(x) == separators[0] || str.charAt(x) == separators[1] || str.charAt(x) == separators[2] || str.charAt(x) == separators[3] || str.charAt(x) == separators[4] || str.charAt(x) == separators[5] || str.charAt(x) == separators[6]) {
                wordSwitch = Boolean.FALSE;

            }else{
                if (wordSwitch != Boolean.TRUE){
                    wordSwitch = Boolean.TRUE;
                    wordCount++;}

            }
        }

        System.out.println("         -------------------" +
                "\nThe number of words are " + wordCount);
    }
}


