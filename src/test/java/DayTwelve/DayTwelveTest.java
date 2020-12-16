package DayTwelve;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayTwelveTest {

    private DayTwelve daTwelve;

    @Before
    public void setup() {
        this.daTwelve = new DayTwelve();
    }

    @Test
    public void givenInput_return_25() {
        assertEquals(25, daTwelve.partOne(input));
    }

    @Test
    public void givenInput_286() {
        assertEquals(286, daTwelve.partOne(input));
    }

    private static final String input = "F10\n" +
                                        "N3\n" +
                                        "F7\n" +
                                        "R90\n" +
                                        "F11";
}