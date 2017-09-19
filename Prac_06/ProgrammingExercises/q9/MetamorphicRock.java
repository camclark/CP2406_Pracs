public class MetamorphicRock extends Rock
{
    public MetamorphicRock(int num, double weightGrams)
    {
        super(num, weightGrams);
        setDescription("Any rock can become a metamorphic rock " +
                "\nif the rock is moved into an environment in which the " +
                "\nminerals which make up the rock become unstable and " +
                "\nout of equilibrium with the new environmental conditions.");
    }
}