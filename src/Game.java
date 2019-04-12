import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Driver class.
 *
 * Class implements methods in Frame class and handles the the playing of the bowling game (sort of)
 * @author Tim Ortin, Tyler Kelly
 *
 * @version 1
 *
 *
 */
public class Game {
    public static void main(String[] args) {

        List<Frame> frames = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int roll1;
        int roll2;
        int strike = 10;
        int frameTotal = 0;
        int totalScore;

        int totalFrames = 0;

        while (totalFrames < 10){
            totalScore = 0;
            System.out.println("Enter first roll");
            roll1 = in.nextInt();
            Frame frame = new Frame();
            frame.setRoll1(roll1);

            if (frame.isStrike()){
                System.out.println("Strike");
                frame.setScore(strike);
                if (frameTotal > 1){
                   // frames.get(frameTotal - 2)
                }

            }else{
                System.out.println("Enter second roll");
                roll2 = in.nextInt();
                frame.setRoll2(roll2);
                frameTotal = roll1 + roll2;
                frame.setScore(frameTotal);
            }

            frames.add(frame);

            try{
                for (Frame f : frames){
                    totalScore += f.getScore();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }





            System.out.println(totalScore);
        }

    }
}
