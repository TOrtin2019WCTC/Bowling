public class Frame {



    int roll1;
    int roll2;
    int score;


    public Frame(){
        this.roll1 = 0;
        this.roll2 = 0;
    }

    public int getRoll1() {
        return roll1;
    }

    public void setRoll1(int roll1) {
        this.roll1 = roll1;
    }

    public int getRoll2() {
        return roll2;
    }

    public void setRoll2(int roll2) {
        this.roll2 = roll2;
    }


    public boolean isStrike(){
        boolean isStrike;
        if (roll1 == 10){
            isStrike = true;
        }else{
            isStrike = false;
        }

        return isStrike;
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getScore(){
        int score = 0;
        if (!isStrike() || !isSpare()){
            score =  roll1 + roll2;
        }

        return score;
    }

    public boolean isSpare(){
        boolean isSpare;
        if (roll1 + roll2 == 10){
            isSpare = true;
        }else{
            isSpare = false;
        }

        return isSpare;
    }

    public void addFrames(){

    }


}
