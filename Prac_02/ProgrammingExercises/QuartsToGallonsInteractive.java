import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        int QUARTS_IN_GALLON = 4;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter quarts of paint required: ");
        int quartsNeeded = Integer.parseInt(inputDevice.nextLine());
        int remainderQuarts = quartsNeeded % QUARTS_IN_GALLON;
        int gallons = quartsNeeded / QUARTS_IN_GALLON;
        System.out.println("The paint job will require:  Gallons " + gallons + " Quarts " + remainderQuarts);

    }
}
