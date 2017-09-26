public class DomesticDivision extends Division {
    protected String state;

    public DomesticDivision(String name, int number, String state) {
        super(name, number);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + name + " #" + number + " located in: " + state);
    }
}
