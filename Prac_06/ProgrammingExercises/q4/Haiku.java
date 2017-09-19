public class Haiku extends Poem{
    public String name;
    public int lines;

    public Haiku (String name) {
        super(name, 3);
        this.name = name;
        this.lines = 3;
    }
}


