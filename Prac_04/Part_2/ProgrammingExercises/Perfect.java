/*
Display every perfect number from 1  through 1,000. A perfect number is one that equals the sum of all the numbers that
 divide evenly into it. For example, 6 perfect because 1,2 and 3 divide evenly into it, and their sum is 6; however 12
 is not a perfect number because  1, 2 3, 4, and 6 divide evenly into it and their sum is greater than 12.
 */

public class Perfect {
    public static void main(String[] args) {
        int perfectDivisibleSum = 0;
        int LOW = 0;
        int HIGH = 1000;
        System.out.print("Perfect numbers between ");
        for (int i=LOW; i <= HIGH; i++){

            for (int divisable_i=0; divisable_i <= (i - 1); divisable_i++){
                if ((i % divisable_i) == 0){
                    perfectDivisibleSum = perfectDivisibleSum + divisable_i;
                }
            }
            if (i == perfectDivisibleSum) {
                System.out.print(i);
            }
        }
    }
}
