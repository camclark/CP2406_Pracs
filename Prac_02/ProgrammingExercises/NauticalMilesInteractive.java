import java.util.Scanner;

public class NauticalMilesInteractive {
    public static void main(String[] args) {
        double KILOMETRES_IN_NAUTIC_MILE = 1.852;
        double MILES_IN_NAUTIC_MILE = 1.150779;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter nautic miles to convert: ");
        double nautic_miles = Double.parseDouble(inputDevice.nextLine());

        System.out.println(nautic_miles + " nautic mile(s) converts to " + (nautic_miles * KILOMETRES_IN_NAUTIC_MILE) + " kilometres" );
        System.out.println(nautic_miles + " nautic mile(s) converts to " + (nautic_miles * MILES_IN_NAUTIC_MILE) + " miles" );
    }
}
