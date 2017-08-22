/*
Create a class named SandwichFilling. Include a field for the filling type (such as “egg salad”) and another for
calories in a  serving. Include a constructor that takes parameters for each field, and include get methods that return
the values of the fields. Write an application named TestSandwichFilling to instantiate three SandwichFilling objects
with different values and then display all the data for each object. Save both the SandwichFilling.java
and TestSandwichFilling.java files
 */

public class SandwichFilling {
    private String fillingType;
    private int servingCalories;

    public SandwichFilling(){
        fillingType = "egg";
        servingCalories = 200;
    }

    public SandwichFilling(String fillingType, int servingCalories){
        this.fillingType = fillingType;
        this.servingCalories = servingCalories;
    }

    public String getFillingType(){
        return fillingType;
    }

    public int getServingCalories(){
        return servingCalories;
    }
}
