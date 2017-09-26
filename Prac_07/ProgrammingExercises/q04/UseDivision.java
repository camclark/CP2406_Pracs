/*
Create an abstract Division class with fields for a company’s division name and account number, and an abstract
display() method. Use a constructor in the superclass that requires values for both fields. Create two subclasses named
InternationalDivision and DomesticDivision. The InternationalDivision includes a field for the country in which the
division is located and a field for the language spoken; it’s constructor requires both. The DomesticDivision includes
a field for the state in which the division is location; a value for this field is required by the constructor

Write an application named UseDivision that creates InternationalDivision and DomesticDivision objects for two different
companies and displays information about them. Save the files as Division.java, InternationalDivision.java,
DomesticDivision.java, and UseDivision.java.
 */

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision d1 = new InternationalDivision("The Packers", 1, "New Zealand", "English");
        InternationalDivision d2 = new InternationalDivision("John boys", 2, "New Zealand", "English");
        InternationalDivision d3 = new InternationalDivision("The brokers", 3, "New Zealand", "English");

        DomesticDivision d4 = new DomesticDivision("Central Queensland", 4, "Queensland");
        DomesticDivision d5 = new DomesticDivision("North Queensland", 5, "Queensland");
        DomesticDivision d6 = new DomesticDivision("South Queensland", 6, "Queensland");

        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();
        d6.display();
    }

}
