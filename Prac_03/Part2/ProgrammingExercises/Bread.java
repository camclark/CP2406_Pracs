/*
Create a class for the Tip Top Baker named Bread with data fields for bread type (such as “rye”) and calories per slice.
 Include a constructor that takes parameters for each field, and include get methods that return the values of the
 fields. Also include a public final static String named MOTTO and initialise it to “The staff of life”. Write and
 application named TestBread to instantiate three Bread objects with different values, and then display all the data,
 including the motto, for each object. Save both the Bread.java and TestBread.java files
 */

public class Bread {
    private String breadType;
    private int caloriesPerSlice;
    final String MOTTO = "The staff of life";


    public Bread()

    {
        breadType = "rye";
        caloriesPerSlice = 25;

    }

    public Bread(String breadType, int caloriesPerSlice) {
        this.breadType = breadType;
        this.caloriesPerSlice = caloriesPerSlice;
    }

    public String getBreadType() {
        return breadType;
    }

    public int getCaloriesPerslice() {
        return caloriesPerSlice;
    }
}
