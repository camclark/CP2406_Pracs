public class TestSandwich {
    public static void main(String[] args) {
        Sandwich favouriteSandwich = new Sandwich("wholemeal", 250, "Egg and cheese", 350);
        System.out.println("The bread type is " + favouriteSandwich.getBreadData().getBreadType());

        Sandwich whiteAndHam = new Sandwich("white", 270, "ham", 250);
        System.out.println("The bread type is " + whiteAndHam.getBreadData().getBreadType());
        System.out.println("The calories of the sandwich is " + ((whiteAndHam.getBreadData().getCaloriesPerslice() * 2) + whiteAndHam.getSandwichFillingdata().getServingCalories()));

    }

}
