/*
The Rock class contains fields for a number of samples, a description	 of the type of rock, and the weight of
the rock in grams. Include a constructor that accepts parameters for the sample number and weight. The Rock constructor
 sets the description value to Unclassified.  Include get methods for each fields.
 */

public class Rock {
    String description;
    String typeOf;

    double weightGrams;
    int sampleNumber;

    public Rock(int sampleNumber, double weightGrams){
        this.sampleNumber = sampleNumber;
        this.weightGrams = weightGrams;
        description = "Unclassified";
    }

    public double getWeightGrams() {
        return weightGrams;
    }

    public String getDescription() {
        return description;
    }

    public String getTypeOf() {
        return typeOf;
    }

    public int getSampleNumber() {
        return sampleNumber;
    }

    protected void setDescription(String d)
    {
        description = d;
    }
}
