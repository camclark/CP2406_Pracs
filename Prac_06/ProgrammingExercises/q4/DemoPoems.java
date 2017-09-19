/*
Create a class named Poem that contains fields for the name of the poem and the number of lines in it. Include a
constructor that requires values for both fields. Also include get methods to retrieve field values. Create three
subclasses: Couplet, Limerick, and Haiku. The constructor for each subclass requires only a title; the lines field is
set using a constant value. A couplet has two ints, a limerick has five lines and a haiku has three lines. Create an
application that demonstrates usage of an object of each type. Save Files as Poem.java, Couplet.java,
Limerick.java, Haiku.java and DemoPoems.java.
 */

public class DemoPoems {
    public static void main(String[] args) {
        Couplet coupletTest = new Couplet("The wave");
        Haiku haikuTest = new Haiku("Slow dance");
        Limerick limerickTest = new Limerick("Young lad");

        display(coupletTest);
        display(haikuTest);
        display(limerickTest);
    }
    public static void display(Poem p)
    {
        System.out.println("Poem: " + p.getName() + " Lines: " + p.getLines());
    }
}
