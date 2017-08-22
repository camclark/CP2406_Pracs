public class DeclareTwoEmployees
{
   public static void main(String[] args)
   {
      Employee_p1 clerk = new Employee_p1();
      Employee_p1 driver = new Employee_p1();
      clerk.setEmpNum(345);
      driver.setEmpNum(567);
      System.out.println("The clerk's number is " +
        clerk.getEmpNum() + " and the driver's number is " +
        driver.getEmpNum());
   }
}
