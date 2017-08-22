/*
Create a class named Sandwich. Include a bread field and a SandwichFilling field.
Include a constructor that take parameters for each field needed in the two objects and assigns them to each objects
constructor. Write and application named TestSandwich to instantiate three Sandwich objects with different values, and
 then display all thee data for each object, including the total calories in a Sandwich, assuming that each Sandwich is
  made using two slices of Bread. Save both the Sandwich.java and TestSandwich.java files
 */

public class Sandwich {
    private Bread breadData;
    private SandwichFilling sandwichFillingData;

    public Sandwich(String enterBreadType, int enterBreadCaloriesPerSlice, String enterFillingType, int enterFillingCalories){
        breadData = new Bread(enterBreadType, enterBreadCaloriesPerSlice);
        sandwichFillingData = new SandwichFilling(enterFillingType, enterFillingCalories);
    }

    Bread getBreadData(){
        return breadData;
    }

    SandwichFilling getSandwichFillingdata(){
        return sandwichFillingData;
    }
}
