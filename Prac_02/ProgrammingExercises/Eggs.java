/*
Meadowdale Dairy Farm sells organic brown eggs to local customers.
They charge $3.45 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen.
Write a class that prompts a user for the number of eggs in the order and then display the amount owed with a
full explanation. For example, typical output might be, “You ordered 27 eggs. That’2 dozen at $3.25 per dozen and 3
loose eggs at 45 cents each for a total of $7.85.”
 */

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        int DOZEN = 12;
        float DOZEN_COST = 3.25F;
        float SINGLE_EGG_COST = 0.45F;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println(" --- Meadowdale Dairy Farm Organic brown eggs --- ");
        System.out.println("$3.25 per dozen and loose eggs at $0.45 each");
        System.out.println("How many eggs would you like to purchase: ");
        int requested_eggs = Integer.parseInt(inputDevice.nextLine());

        int remainder_eggs = requested_eggs % DOZEN;
        int dozens = requested_eggs / DOZEN;
        if (remainder_eggs == 0) {
            System.out.println("You ordered " + requested_eggs + " eggs. That’s " + dozens + " dozen(s) at $3.25 per dozen for a total of " + ((dozens * DOZEN_COST)));
        } else {
            System.out.println("You ordered " + requested_eggs + " eggs. That’s " + dozens + " dozen(s) at $3.25 per dozen and " + remainder_eggs + " loose egg(s) at 45 cents each for a total of $" + ((dozens * DOZEN_COST) + (remainder_eggs * SINGLE_EGG_COST)));

        }

    }
}
