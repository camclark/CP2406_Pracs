/*
Create a class for the Tip Top Baker named Bread with data fields for bread type (such as “rye”) and calories per slice.
 Include a constructor that takes parameters for each field, and include get methods that return the values of the
 fields. Also include a public final static String named MOTTO and initialise it to “The staff of life”. Write and
 application named TestBread to instantiate three Bread objects with different values, and then display all the data,
 including the motto, for each object. Save both the Bread.java and TestBread.java files
 */

public class TestBread {
    public static void main(String[] args) {
        Bread wholemeal = new Bread("Wholemeal", 25);
        System.out.println(wholemeal.getBreadType());
        System.out.println(wholemeal.getCaloriesPerslice());
        System.out.println(wholemeal.MOTTO);

        Bread white = new Bread("White", 35);
        System.out.println(white.getBreadType());
        System.out.println(white.getCaloriesPerslice());
        System.out.println(white.MOTTO);

        Bread rye = new Bread();
        System.out.println(rye.getBreadType());
        System.out.println(rye.getCaloriesPerslice());
        System.out.println(rye.MOTTO);

    }
}
