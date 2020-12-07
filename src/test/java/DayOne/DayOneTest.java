package DayOne;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayOneTest {

    private DayOne dayOne;

    private String testData =   "1721\n" +
            "979\n" +
            "366\n" +
            "299\n" +
            "675\n" +
            "1456";
    @Before
    public void setup() {
        dayOne = new DayOne(testData);
    }


    @Test
    public void partOne_givenInput_return_514579() {
        assertEquals(514579, dayOne.partOne());
    }

    @Test
    public void partTwo_givenInput_return_241861950() {
        assertEquals(241861950, dayOne.partTwo());
    }
}
