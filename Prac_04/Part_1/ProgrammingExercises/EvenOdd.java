/*
Ask the user for an integer, display that the number entered is even or odd
 */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        number = input.nextInt();

        if ((number % 2) == 0){
            System.out.println("one is even");}
        else{
            System.out.println("one is odd");
        }
    }
}
