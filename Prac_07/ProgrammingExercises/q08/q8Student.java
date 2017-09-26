/*
Create an abstract Student class for Parker University.  The class contains fields for student ID number, last name, and
annual tradition. Include a constructor that requires parameters for the ID number and name. Include get and set methods
for each field; the setTuition() method is abstract.
 */

public abstract class q8Student {
    protected int IDNumber;
    protected String lastName;
    protected int annualTuition;

    public q8Student(int IDNumber, String lastName) {
        this.IDNumber = IDNumber;
        this.lastName = lastName;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAnnualTuition() {
        return annualTuition;
    }

    public abstract void setAnnualTuition();
}
