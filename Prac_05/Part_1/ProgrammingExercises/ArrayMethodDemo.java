/*
Create an application containing an array that sores 10 integers. The application should call five methods that in turn
 (1) display all the integers, (2) display all the integers in reverse order, (3) display the sum of the integers,
 (4) display all values less then an arguments and (5) display all values that are higher than the calculated
 average value
 */

public class ArrayMethodDemo {
    public static void main(String[] args) {
        int MAX = 20;
        int MIN = 0;

        int[] ints = new int[10];

        for (int i = 0; i < 10; i++){
            ints[i] = randomWithRange(MIN, MAX);
        }

        displayInts(ints);
        displayReverseInts(ints);
        displaySum(ints);
        displayHigherThenAverage(ints);
        int ceiling = randomWithRange(MIN, MAX);
        displayLowerThan(ceiling, ints);
        displayHigherThenAverage(ints);

    }

    private static void displayInts(int[] ints){
        System.out.println("Numbers are: ");
        for (int i = 0; i < 10; i++){
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }

    private static void displayReverseInts(int[] ints){
        System.out.println("Numbers in reverse are: ");
        for (int i = 9; i > 0; i--){
            System.out.print(ints[i] + " ");
        }
        System.out.println("");

    }

    private static void displaySum(int[] ints){
        System.out.println("Numbers total is: ");
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total = total + ints[i];
        }
        System.out.print(total);
        System.out.println("");

    }

    private static void displayLowerThan(int ceiling, int[] ints) {
        System.out.println(String.format("Numbers lower then %d are:", ceiling));

        for (int i = 0; i < 10; i++) {
            if (ints[i] < ceiling) {
                System.out.print(ints[i] + " ");
            }
        }
        System.out.println("");

    }

    private static void displayHigherThenAverage(int[] ints){

        int total = 0;
        for (int i = 0; i < 10; i++) {
            total = total + ints[i];
        }
        float average = total / 10;

        System.out.println(String.format("Numbers higher then the average of %.2f are: ", average));

        for (int i = 0; i < 10; i++) {
            if(ints[i] > average){
                System.out.print(ints[i] + " ");
            }
        }
        System.out.println("");

    }

    private static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

}
