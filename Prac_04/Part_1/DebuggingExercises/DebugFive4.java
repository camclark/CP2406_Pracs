// DebugFive4.java
// Outputs highest of four numbers
import javax.swing.*;
import java.util.Scanner;

public class DebugFive4
{
   public static void main (String args[]) 
   {
      int one, two, three, four;
      String str, output;
      Scanner input = new Scanner(System.in);

      JOptionPane.showInputDialog(null,"Enter the first integer");
      one = input.nextInt();
      JOptionPane.showInputDialog(null,"Enter the second integer");
      two = input.nextInt();
      JOptionPane.showInputDialog(null,"Enter the third integer");
      three = input.nextInt();
      JOptionPane.showInputDialog(null,"Enter the fourth and final integer");
      four = input.nextInt();

      if(one >= two && one >= three && one >= four){
         output = "Highest is " + one;}
      else if (two >= one && two >= three && two >= four){
          output = "Highest is " + two;}
      else if(three >= one && three >= two && three >= four){
          output = "Highest is " + three;}
      else{
          output = "Highest is " + four;}
      JOptionPane.showMessageDialog(null, output);
   }
}


