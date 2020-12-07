package DayFive;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class DayFiveTest {

    private DayFive dayFive;

    @Before
    public void setup() {
        dayFive = new DayFive();
    }

    @Test
    public void given_FBFBBFFRLR_returns_357() {
        assertEquals(357, dayFive.partOne("FBFBBFFRLR"));
    }

    @Test
    public void given_FFFBBBFRRR_return_119() {
        assertEquals(119, dayFive.partOne("FFFBBBFRRR"));
    }

    @Test
    public void given_BBFFBBFRLL_return_820() {
        assertEquals(820, dayFive.partOne("BBFFBBFRLL"));
    }
}