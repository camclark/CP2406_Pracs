/*
Create a class named PremiumSugarSmashPlayer that descends from SugarSmashPlayer.
This class is instantiated when a user pays $2.99 to have access to 40 additional levels of play. As in the free version
of the game, a user cannot set a score for a level unless the user has earnt at least 100 points at all previous
levels. Create a program that instantiates several objects of each type and demonstrates the methods.
 */

public class PremiumSugarSmashPlayer extends SugarSmashPlayer {

    private final int MINSCORE = 100;
    private int LEVELS = 50;
    public PremiumSugarSmashPlayer()
    {
        highscores = new int[LEVELS];
    }

    public int getLevels()
    {
        return LEVELS;
    }
}
