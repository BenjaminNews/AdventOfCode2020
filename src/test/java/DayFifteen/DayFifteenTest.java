package DayFifteen;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayFifteenTest {

    private DayFifteen dayFifteen;

    @Before
    public void setup() {
        this.dayFifteen = new DayFifteen();
    }

    @Test
    public void givenInput_returns_0() {
        assertEquals(0, dayFifteen.partOne("0,3,6", 10));
    }

    @Test
    public void givenInput_returns_1() {
        assertEquals(1, dayFifteen.partOne("1,3,2", 2020));
    }

    @Test
    public void givenInput_returns_10() {
        assertEquals(10, dayFifteen.partOne("2,1,3", 2020));
    }

    @Test
    public void givenInput_returns_27() {
        assertEquals(27, dayFifteen.partOne("1,2,3", 2020));
    }

    @Test
    public void givenInput_returns_78() {
        assertEquals(78, dayFifteen.partOne("2,3,1", 2020));
    }

    @Test
    public void givenInput_returns_438() {
        assertEquals(438, dayFifteen.partOne("3,2,1", 2020));
    }

    @Test
    public void givenInput_returns_1836() {
        assertEquals(1836, dayFifteen.partOne("3,1,2", 2020));
    }
}