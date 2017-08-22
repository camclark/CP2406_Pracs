/*
Caitlyn’s Crafty Creations computes a retail price for each product as the cost of materials plus $12 multiplied by the
number of hours of work required to create the product, plus $7 shipping and handling. Create a class that contains a
main() method that prompts the user for the name of a product (for example, “woven purse”), the cost of materials, and
the number of hours of work required. Pass the numeric data to a method that computes the retail price of the product
and returns the computed value to the main() method where the product name and price are displayed,
 */

import java.util.Scanner;

public class CraftPricing {
    public static void main(String[] args) {
        String productName = getName();
        Double costOfMaterals = getMaterialCost(productName);
        Double hoursWork = getHoursWork(productName);
        Double retailPrice = calculateRetailCost(costOfMaterals, hoursWork);
        displayPrice(productName, retailPrice);
        }

    private static String getName()
    {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product name: ");
        name = input.next();
        return name;
    }
    private static Double getMaterialCost(String name)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print(String.format("Enter the material cost of %s: $", name));
        return Double.parseDouble((inputDevice.nextLine()));
    }

    private static Double getHoursWork(String name)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print(String.format("Enter the hours required to create %s: ", name));
        return Double.parseDouble((inputDevice.nextLine()));
    }

    private static Double calculateRetailCost(double cost, double hours)
    {
        return cost +  (12 * hours);
    }

    private static void displayPrice(String name, Double credit)
    {
        System.out.println(String.format("%s costs $%.2f", name, credit));
    }
}

