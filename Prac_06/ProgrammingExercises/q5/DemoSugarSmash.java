/*
The developers of a free online game named Sugar Smash have asked you to develop a class named SugarSmashPlay that
holds data about a single player. The class contains the following fields: the player’s integer ID number, A string
screen name, and an array of integers that stores the highest score achieved in each of 10 game levels. Include get
and set methods for each field. The get and set methods for the scores should each require two parameters - one that
represents the score achieved and one that represents the game level to be retrieved or assigned. Display an error
message if the user attempts to assign or retrieve a score from a level that is out of range for the array of scores.
Additionally, no level except the first one should be set unless the user has earned at least 100 points at each
previous level. If a user tries to set a score for a level that is not yet available, issue an error message.

Create a class named PremiumSugarSmashPlayer that descends from SugarSmashPlayer.
This class is instantiated when a user pays $2.99 to have access to 40 additional levels of play. As in the free version
of the game, a user cannot set a score for a level unless the user has earnt at least 100 points at all previous
levels. Create a program that instantiates several objects of each type and demonstrates the methods.

 */

public class DemoSugarSmash {
    public static void main(String[] args)
    {
        SugarSmashPlayer ssPlayer = new SugarSmashPlayer();
        ssPlayer.setIDNumber(1111);
        ssPlayer.setName("Alex");
        System.out.println("\nAt start");
        display(ssPlayer);
        ssPlayer.setScore(200, 0);
        System.out.println("\nAfter setting first score");
        display(ssPlayer);
        System.out.println("Trying to set fifth score too soon");
        ssPlayer.setScore(30, 4);
        System.out.println("\nAfter setting second score");
        ssPlayer.setScore(30, 1);
        display(ssPlayer);
        System.out.println("\nTrying to set third score when second is too low");
        ssPlayer.setScore(100, 2);
        display(ssPlayer);
        System.out.println("\nAfter setting second, third, fourth, and fifth scores");
        ssPlayer.setScore(100, 1);
        ssPlayer.setScore(300, 2);
        ssPlayer.setScore(400, 3);
        ssPlayer.setScore(10, 4);
        display(ssPlayer);
        System.out.println("\nTrying to set eleventh score");
        ssPlayer.setScore(100, 10);


        PremiumSugarSmashPlayer pssPlayer = new PremiumSugarSmashPlayer();
        pssPlayer.setIDNumber(2222);
        pssPlayer.setName("Cory");
        System.out.println("\nAt start");
        display(pssPlayer);
        pssPlayer.setScore(200, 0);
        System.out.println("\nAfter setting first score");
        display(pssPlayer);
        System.out.println("Trying to set fifth score too soon");
        pssPlayer.setScore(30, 4);
        System.out.println("\nAfter setting second score");
        pssPlayer.setScore(30, 1);
        display(pssPlayer);
        System.out.println("\nTrying to set third score when second is too low");
        pssPlayer.setScore(100, 2);
        display(pssPlayer);
        System.out.println("\nAfter setting second through tenth scores");
        for(int x = 1; x < 10; ++x)
            pssPlayer.setScore(130, x);
        display(pssPlayer);
        System.out.println("\nTrying to set eleventh score");
        pssPlayer.setScore(100, 10);
        display(pssPlayer);
        System.out.println("\nTrying to set 51st score");
        pssPlayer.setScore(100, 50);
        display(pssPlayer);
    }
    public static void display(SugarSmashPlayer p)
    {
        System.out.println("   ID #" + p.getIDNumber() + "  Name: " +
                p.getName());
        for(int x = 0; x < p.getLevel(); ++x)
            System.out.print("   " + p.getScore(x));
        System.out.println();
    }
}
