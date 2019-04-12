import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Frame test class
 *
 * @version 1
 *
 */

public class FrameTest {

    private Frame frame;

    /**
     * Generates new instance of Frame
     */
    @Before
    public void setUp() {
         frame = new Frame();
    }

    /**
     * Test for strike
     * returns TRUE
     */
    @Test
    public void isStrikeTrue() {

        frame.setRoll1(10);

        boolean isStrike;
        if (frame.getRoll1() == 10) {
            isStrike = true;
        }else{
            isStrike = false;
        }

            assertEquals("isStrike was false", true, isStrike);



    }

    /**
     * Test for spare
     * Should return TRUE
     */
    @Test
    public void isSpareTrue() {
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

    /**
     * Test for spare
     * Should return FALSE
     */
    @Test
    public void isSpareFalse(){

        boolean isSpare;
        frame.setRoll1(8);
        frame.setRoll2(0);

        if (frame.getRoll1() + frame.getRoll2() == 10){
            isSpare = true;
        }else{
            isSpare = false;
        }
        assertEquals("isFrame returned True", false, isSpare);
    }

    /**
     * Test for strike
     * Should return FALSE
     */
    @Test
    public void isStrikeFalse(){

        frame.setRoll1(9);

        boolean isStrike;
        if (frame.getRoll1() == 10) {
            isStrike = true;
        }else{
            isStrike = false;
        }

        assertEquals("isStrike was True", false, isStrike);

    }
}