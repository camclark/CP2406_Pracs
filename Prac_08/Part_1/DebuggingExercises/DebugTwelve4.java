// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a FixDebugEmployeeIDException
import javax.swing.*;
public class DebugTwelve4
{
   public static void main(String[] args)
   {
      String inStr;StringBuilder outString = new StringBuilder();
       final int MAX = 999;
      int[] emp = new int[4];
      for(int x = 0; x < emp.length; ++x)
      {
         inStr = JOptionPane.showInputDialog(null, "Enter employee ID number");  
         try
         {
            emp[x] = Integer.parseInt(inStr);
            if(emp[x] > MAX)
            {
               // here get rid of number too hight?
               throw(new DebugEmployeeIDException("Number too high " + emp[x]));
            }
         }
         catch(NumberFormatException error)
         {	
            --x;
            JOptionPane.showMessageDialog(null, inStr + "\nNonnumeric ID");
         }
         catch(DebugEmployeeIDException error)
         {	
	    --x;
            JOptionPane.showMessageDialog(null, inStr+ "\n ID is higher then " + MAX);
         }
      }
       for (int anEmp : emp) {
           outString.append(anEmp).append(" ");
       }
      JOptionPane.showMessageDialog(null, "Four valid IDS are: " + outString);    
   }
}