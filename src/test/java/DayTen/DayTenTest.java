package DayTen;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayTenTest {

    private DayTen dayTen;

    @Before
    public void setup() {
        this.dayTen = new DayTen();
    }

    @Test
    public void givenInputOne_returns_35() {
        assertEquals(35, dayTen.partOne(inputOne, 1, 3));
    }

    @Test
    public void givenInputTwo_returns_35() {
        assertEquals(220, dayTen.partOne(inputTwo, 1, 3));
    }

    private static final String inputOne = "16\n" +
                                        "10\n" +
                                        "15\n" +
                                        "5\n" +
                                        "1\n" +
                                        "11\n" +
                                        "7\n" +
                                        "19\n" +
                                        "6\n" +
                                        "12\n" +
                                        "4";

    private static final String inputTwo = "28\n" +
                                            "33\n" +
                                            "18\n" +
                                            "42\n" +
                                            "31\n" +
                                            "14\n" +
                                            "46\n" +
                                            "20\n" +
                                            "48\n" +
                                            "47\n" +
                                            "24\n" +
                                            "23\n" +
                                            "49\n" +
                                            "45\n" +
                                            "19\n" +
                                            "38\n" +
                                            "39\n" +
                                            "11\n" +
                                            "1\n" +
                                            "32\n" +
                                            "25\n" +
                                            "35\n" +
                                            "8\n" +
                                            "17\n" +
                                            "7\n" +
                                            "9\n" +
                                            "4\n" +
                                            "2\n" +
                                            "34\n" +
                                            "10\n" +
                                            "3";
}