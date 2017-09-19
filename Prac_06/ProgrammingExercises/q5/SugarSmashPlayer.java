/*
The developers of a free online game named Sugar Smash have asked you to develop a class named SugarSmashPlay that
holds data about a single player. The class contains the following fields: the player’s integer ID number, A string
screen name, and an array of integers that stores the highest score achieved in each of 10 game levels. Include get
and set methods for each field. The get and set methods for the scores should each require two parameters - one that
represents the score achieved and one that represents the game level to be retrieved or assigned.

Display an error message if the user attempts to assign or retrieve a score from a level that is out of range for the
array of scores. Additionally, no level except the first one should be set unless the user has earned at least 100
points at each previous level. If a user tries to set a score for a level that is not yet available,
issue an error message.
 */

public class SugarSmashPlayer {
    private int IDNumber;
    private String name;
    private int LEVELS = 10;
    public int[] highscores;
    private int MINSCORE = 100;

    SugarSmashPlayer() {
        highscores = new int[LEVELS];
    }

    public String getName() {
        return name;
    }

    int getIDNumber() {
        return IDNumber;
    }

    void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    void setName(String name) {
        this.name = name;
    }

    void setScore(int score, int level) {
        boolean isBadLevel = false;

        if (level < 0 || level > highscores.length - 1) {
            System.out.print(level + "is an invalid level");
        } else {
            for (int i = 0; i < level; i++) {
                if (highscores[i] < MINSCORE) {
                    isBadLevel = true;
                    break;
                }
            }

            if (isBadLevel) {
                System.out.print("A score cannot be set yet for level " + level);
            } else {
//                if(score > highscores[level])
                highscores[level] = score;
//                else {
//                    System.out.print("The score of " + score + " doesn't beat the highscore of " + highscores[level] +
//                            " for level " + level );
            }
        }
    }

    int getScore(int level){
        return highscores[level];
    }

    int getLevel(){
        return LEVELS;
    }
}
