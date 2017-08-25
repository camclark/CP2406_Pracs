// DebugFive3.java
// Determines whether item one on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
import java.util.Scanner;
public class DebugFive3
{
   public static void main (String args[])
   {
      int item;
      String output;
      final int LOW = 111;
      final int HIGH = 999;
      final int CUTOFF = 500;
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter item one");
      item = input.nextInt();


       if (item < LOW) {
           output = "Item one too low";
       } else if (item > HIGH) {
           output = "Item one too high";
       } else if (item <= CUTOFF ) {
           output = "Valid - Item in Automotive Department";
       } else {
           output = "Valid - Item in Housewares Department";
       }

       System.out.println(output);
   }
}


