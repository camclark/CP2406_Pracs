/*
Create two subclasses named
InternationalDivision and DomesticDivision. The InternationalDivision includes a field for the country in which the
division is located and a field for the language spoken; it’s constructor requires both. The DomesticDivision includes
a field for the state in which the division is location; a value for this field is required by the constructor
 */

public class InternationalDivision extends Division{
    protected String country;
    protected String language;

    public InternationalDivision(String name, int number, String country, String language) {
        super(name, number);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + name + " #" + number + " located in: " + country +
                " Language spoken is: " + language);
    }
}
