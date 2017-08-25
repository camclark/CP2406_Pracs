/*
Write an application that asks a user to type an even number or sentinel value 999 to stop. When the user types an
even number, display the message “Good job!” and then ask for another input. When the user type an odd number,
display an error message and then ask for another input. When the user types the sentinel value 999, end the program.
 */

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an even number, 999 to exit");
        number = input.nextInt();
        while (number != 999) {
            if ((number % 2) == 0) {
                System.out.println("number is even");
            } else {
                System.out.println("number is odd");
            }

            System.out.println("Please enter an even number, 999 to exit");
            number = input.nextInt();

        }
    }
}
