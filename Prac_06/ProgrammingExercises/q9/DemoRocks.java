/*
Create a class named Rock that acts as a superclass for rock samples collected and catalogued by a  natural history
museum. The Rock class contains fields for a number of samples, a description	 of the type of rock, and the weight of
the rock in grams. Include a constructor that accepts parameters for the sample number and weight. The Rock constructor
 sets the description value to Unclassified.  Include get methods for each fields.

 Create three child classes named IgneousRock, SedimentaryRock, and MetamorphicRock. The constructors for these classes
 require parameters for the sample number and weight. Search the Web for a brief description of each rock type and
 assign it to the description field. Create an application that instantiates an object of each type and demonstrate that
 the methods work appropriately.

 Save the fields as Rock.java, IgneousRock.java, SedimentaryRock.java, MetamorphicRock.java, DemoRocks.java.

 */

public class DemoRocks {
    public static void main(String[] args) {
        Rock r1 = new Rock(123, 4.5);
        IgneousRock r2 = new IgneousRock(234, 14.9);
        SedimentaryRock r3 = new SedimentaryRock(345, 18.3);
        MetamorphicRock r4 = new MetamorphicRock(456, 7.0);
        display(r1);
        display(r2);
        display(r3);
        display(r4);
    }

    public static void display(Rock r) {
        System.out.println("\nSample number: " + r.getSampleNumber() + "\tWeight: " + r.getWeightGrams() + "g");
        System.out.println("Description:   " + r.getDescription());
    }
}
