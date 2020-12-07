package DayTwo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayTwoTest {

    private DayTwo dayTwo;

    private final String input =    "1-3 a: abcde\n" +
                                    "1-3 b: cdefg\n" +
                                    "2-9 c: ccccccccc";
    @Before
    public void setup() {
        dayTwo = new DayTwo(input);
    }

    @Test
    public void givenInput_returnsTwoValidPasswords() {
        int result = dayTwo.partOne();
        assertEquals(2, result);
    }

    @Test
    public void givenInput_returnsOneValidPassword() {
        int result = dayTwo.partTwo();
        assertEquals(1, result);
    }

}