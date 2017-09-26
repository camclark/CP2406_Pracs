/*
Create an abstract Division class with fields for a company’s division name and account number, and an abstract
display() method. Use a constructor in the superclass that requires values for both fields. Create two subclasses named
InternationalDivision and DomesticDivision. The InternationalDivision includes a field for the country in which the
division is located and a field for the language spoken; it’s constructor requires both. The DomesticDivision includes
a field for the state in which the division is location; a value for this field is required by the constructor
 */

public abstract class Division {
    String name;
    int number;

    public Division(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public abstract void display();
}
