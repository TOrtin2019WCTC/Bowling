/**
 *
 * This class handles the turns and scoring of bowling game.
 * @author Tim Ortin, Tyler Kelly
 *
 * @version 1
 */

public class Frame {



    int roll1;
    int roll2;
    int score;

    /**
     * Frame constructor. Creates new instance of Frame.
     */
    public Frame(){
        this.roll1 = 0;
        this.roll2 = 0;
    }

    /**
     * returns value of roll 1
     *
     * @return value of roll1
     */
    public int getRoll1() {
        return roll1;
    }

    /**
     * Sets value of roll 1
     * @param roll1
     */
    public void setRoll1(int roll1) {
        this.roll1 = roll1;
    }

    /**
     * returns value of roll 2
     * @return value of roll2
     */
    public int getRoll2() {
        return roll2;
    }

    /**
     * sets the value of roll 2
     * @param roll2
     */

    public void setRoll2(int roll2) {
        this.roll2 = roll2;
    }


    /**
     * Checks if roll 1 was strike
     * @return True or false
     */
    public boolean isStrike(){
        boolean isStrike;
        if (roll1 == 10){
            isStrike = true;
        }else{
            isStrike = false;
        }

        return isStrike;
    }

    /**
     * sets score of current frame
     * @param score the score of current frame
     */
    public void setScore(int score){
        this.score = score;
    }

    /**
     * returns score of the current frame
     * @return value of current frame score
     */
    public int getScore(){
        int score = 0;
        if (!isStrike() || !isSpare()){
            score =  roll1 + roll2;
        }

        return score;
    }

    /**
     * checks if current frame was a spare
     * @return true or false
     */

    public boolean isSpare(){
        boolean isSpare;
        if (roll1 + roll2 == 10){
            isSpare = true;
        }else{
            isSpare = false;
        }

        return isSpare;
    }



}
