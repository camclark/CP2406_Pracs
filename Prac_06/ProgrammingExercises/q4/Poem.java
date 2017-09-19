/*
Create a class named Poem that contains fields for the name of the poem and the number of lines in it. Include a
constructor that requires values for both fields. Also include get methods to retrieve field values.
 */

public class Poem {
    String name;
    int lines;

    public Poem(String name, int lines){
        this.name = name;
        this.lines = lines;
    }

    public String getName(){
        return name;
    }

    public int getLines(){
        return lines;
    }
}
