// This class discounts prices by 10%
public class DebugFour4
{
   public static void main(String args[])
   {
      final double DISCOUNT_RATE = 0.90;
      double price = 100;
      double price2 = 100.00;
      tenPercentOff(price, DISCOUNT_RATE);
      tenPercentOff(price2, DISCOUNT_RATE);
   }
   private static void tenPercentOff(double p, final double DISCOUNT_RATE)
   {
      double newPrice = p * DISCOUNT_RATE;
      System.out.format("Ten percent off %.2f", p);
      System.out.format("New price is %.2f", newPrice);
   }
}
