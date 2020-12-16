import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayElevenTest {

    private DayEleven dayEleven;

    @Before
    public void setup() {
        dayEleven = new DayEleven();
    }

    @Test
    public void givenInput_returns_37() {
        assertEquals(37, dayEleven.partOne(input));
    }

    private static final String input = "L.LL.LL.LL\n" +
                                        "LLLLLLL.LL\n" +
                                        "L.L.L..L..\n" +
                                        "LLLL.LL.LL\n" +
                                        "L.LL.LL.LL\n" +
                                        "L.LLLLL.LL\n" +
                                        "..L.L.....\n" +
                                        "LLLLLLLLLL\n" +
                                        "L.LLLLLL.L\n" +
                                        "L.LLLLL.LL";
}