import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * test class for methods in Frame class
 *
 * @version 1
 *
 */

public class FrameTest {

    private Frame frame;


    @Before
    public void setUp() {
         frame = new Frame();
    }

    @Test
    public void isStrike() {


        frame.setRoll1(10);

        boolean isStrike;
        if (frame.getRoll1() == 10) {
            isStrike = true;
        }else{
            isStrike = false;
        }

            assertEquals("isStrike was false", true, isStrike);



    }

    @Test
    public void isSpare() {
        boolean isSpare;
        frame.setRoll1(8);
        frame.setRoll2(2);

        if (frame.getRoll1() + frame.getRoll2() == 10){
            isSpare = true;
        }else{
            isSpare = false;
        }
        assertEquals("isFrame returned false", true, isSpare);
    }

}