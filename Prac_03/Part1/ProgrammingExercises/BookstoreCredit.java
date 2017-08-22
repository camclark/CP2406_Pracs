/*
To encourage good grades, Hermosa High School has decided to award each student to a bookstore credit that is 10 times
the student’s grade point average. IN other words, a student with 3.2 grade point average receives a $32 credit. Create
a class that prompts a student for a name and a grade point average, and then passes the values to a method that
displays a descriptive message. The message uses the student’s name, echoes the grade point average, and computes and
displays the credit.
 */

import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        String studentName = getName();
        Double studentGPA = getGPA(studentName);
        Double storeCredit = calculateStoreCredit(studentGPA);
        displayStoreCredit(studentName, studentGPA, storeCredit);
    }

    private static String getName()
    {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = input.next();
        return name;
    }
    private static Double getGPA(String name)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print(String.format("Enter %s's GPA: ", name));
        return Double.parseDouble((inputDevice.nextLine()));
    }

    private static Double calculateStoreCredit(double GPA)
    {
        return GPA * 10;
    }

    private static void displayStoreCredit(String name, Double GPA, Double credit)
    {
        System.out.println(String.format("%s's GPA of %.2f earns %.2f in store credit", name, GPA, credit));
    }
}
