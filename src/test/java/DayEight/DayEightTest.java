package DayEight;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayEightTest {

    private DayEight dayEight;

    @Before
    public void setup() {
        dayEight = new DayEight();
    }

    @Test
    public void givenInput_return_5() {
        assertEquals(5, dayEight.partOne(input));
    }

    @Test
    public void givenInput_return_8() {
        assertEquals(8, dayEight.partTwo(input));
    }

    private final String input = "nop +0\n" +
                                    "acc +1\n" +
                                    "jmp +4\n" +
                                    "acc +3\n" +
                                    "jmp -3\n" +
                                    "acc -99\n" +
                                    "acc +1\n" +
                                    "jmp -4\n" +
                                    "acc +6";
}