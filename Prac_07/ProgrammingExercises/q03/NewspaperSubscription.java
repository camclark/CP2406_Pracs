public abstract class NewspaperSubscription {
    protected String name;
    protected String address;
    protected double rate;


    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void setAddress(String s);
}