/*
Allow a user to enter any number of double values up to 20. The user should enter 99999 to quit entering numbers.
Display an error message if the user quits without entering any numbers; otherwise, display each entered value and
its distance form the average.
 */

import java.util.*;

public class DistanceFromAverage {
    public static void main(String[] args) {
        double[] doubles = new double[20];
        double total = 0;
        int usedElements = 0;

        for (int i = 0; i <= 20; i++){
            Scanner in = new Scanner(System.in);
            System.out.print(String.format("Please enter a double value. Remaining: %d  To quit enter: 99999 ", (20 - usedElements)));
            Double aDouble = in.nextDouble();
            if(aDouble == 99999){
                break;
            } else{
                doubles[i] = aDouble;
                total = total + aDouble;
                usedElements++;
            }
        }

        double average = total / usedElements;

        for (int i = 0; i <=usedElements; i++){
            System.out.println(String.format("%.2f has a distance of %.2f from the average of %.2f ", doubles[i], (doubles[i] - average), average));
        }

    }
}
