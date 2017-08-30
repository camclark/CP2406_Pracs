// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them
//import java.util.*;
//public class DebugSeven2
//{
//   public static void main(String[] args)
//   {
//      String str;
//      int length;
//      int num;
//      int lastSpace = 0;
//      int sum = 0;
//      String partStr;
//      Scanner in = new Scanner(System.in);
//      System.out.print("Enter a series of integers separated by spaces >> ");
//      str = in.nextLine();
//      length = str.length();
//      for(int i = 0; i <= length; ++i)
//      {
//
//         if(str.charAt(i) == ' ')
//         {
//             partStr = str.substring(lastSpace, i);
//             num = Integer.parseInt(partStr);
//             System.out.println("                " + num);
//             sum = sum + num;
//             lastSpace = i;
//          }
//      }
//      partStr = str.substring(lastSpace + 1, length);
//      num = Integer.parseInt(partStr);
//      System.out.println("                " + num);
//      sum = num;
//      System.out.println("         -------------------" +
//         "\nThe sum of the integers is " + sum);
//   }
//}