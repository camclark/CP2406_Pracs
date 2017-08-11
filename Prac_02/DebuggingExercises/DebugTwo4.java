import javax.swing.JOptionPane;
public class DebugTwo4
{
   public static void main(String[] args)
   {
      String costString;
      final double TAX = 0.06;
      costString = JOptionPane.showInputDialog(null, "Enter price of item you are buying",
         JOptionPane.INFORMATION_MESSAGE);
       double cost = Double.parseDouble(costString);
      JOptionPane.showMessageDialog(null,"With " + TAX * 100 +
         "% tax,  purchase  is $" + (cost - cost * TAX));

   }
}
