/*
Create a class named SandwichFilling. Include a field for the filling type (such as “egg salad”) and another for
calories in a  serving. Include a constructor that takes parameters for each field, and include get methods that return
the values of the fields. Write an application named TestSandwichFilling to instantiate three SandwichFilling objects
with different values and then display all the data for each object. Save both the SandwichFilling.java
and TestSandwichFilling.java files
 */

public class TestSandwichFilling {
    public static void main(String[] args) {
        SandwichFilling tuna = new SandwichFilling("tuna", 180);
        System.out.println(String.format("%s only %d calories", tuna.getFillingType(), tuna.getServingCalories()));

        SandwichFilling cheese = new SandwichFilling("cheese", 230);
        System.out.println(String.format("%s only %d calories", cheese.getFillingType(), cheese.getServingCalories()));

        SandwichFilling egg = new SandwichFilling("egg", 230);
        System.out.println(String.format("%s only %d calories", egg.getFillingType(), egg.getServingCalories()));
    }
}
