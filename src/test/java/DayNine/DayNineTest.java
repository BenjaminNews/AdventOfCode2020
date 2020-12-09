package DayNine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayNineTest {

    private DayNine dayNine;

    @Before
    public void setup() {
        dayNine = new DayNine(input);
    }

    @Test
    public void givenInput_returns_127() {
        assertEquals(127, dayNine.partOne(5));
    }

    @Test
    public void givenInput_returns_62() {
        assertEquals(62, dayNine.partTwo(127));
    }

    private static final String input = "35\n" +
                                        "20\n" +
                                        "15\n" +
                                        "25\n" +
                                        "47\n" +
                                        "40\n" +
                                        "62\n" +
                                        "55\n" +
                                        "65\n" +
                                        "95\n" +
                                        "102\n" +
                                        "117\n" +
                                        "150\n" +
                                        "182\n" +
                                        "127\n" +
                                        "219\n" +
                                        "299\n" +
                                        "277\n" +
                                        "309\n" +
                                        "576";
}