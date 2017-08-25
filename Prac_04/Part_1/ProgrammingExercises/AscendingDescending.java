// The user will enter 3 numbers, order these numbers in ascending and descending order

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;


public class AscendingDescending {
    public static void main(String[] args) {
        int one;
        int two;
        int three;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        one = input.nextInt();

        System.out.println("Please enter the second number");
        two = input.nextInt();

        System.out.println("Please enter the third number");
        three = input.nextInt();

        Integer threeNumbers[] = {one, two, three};


        Arrays.sort(threeNumbers, Collections.reverseOrder());
        System.out.println("Ascending order");
        for (int i = threeNumbers.length - 1; i >= 0; i--){
            System.out.print(threeNumbers[i] + " ");}

        System.out.println("");
        System.out.println("Descending order");
        java.util.Arrays.sort(threeNumbers);
        for (int i = threeNumbers.length - 1; i >= 0; i--){
            System.out.print(threeNumbers[i] + " ");}
    }
}
