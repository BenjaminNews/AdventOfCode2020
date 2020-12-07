package DayThree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayThreeTest {

    private DayThree dayThree;

    @Before
    public void setup() {
        dayThree = new DayThree();
    }

    @Test
    public void givenInput_withAStepSizeOf_3_andADropSizeOf_1_returns_7() {
        assertEquals(7, dayThree.partOne(input, 3, 1));
    }

    @Test
    public void givenInputs_returns_336() {
        long testOne =  dayThree.partOne(input, 1, 1);
        long testTwo =  dayThree.partOne(input, 3, 1);
        long testThree =  dayThree.partOne(input, 5, 1);
        long testFour =  dayThree.partOne(input, 7, 1);
        long testFive =  dayThree.partOne(input, 1, 2);

        long result = testOne * testTwo * testThree * testFour * testFive;
        assertEquals(336, result);
    }

    private static final String input = "..##.......\n" +
                                        "#...#...#..\n" +
                                        ".#....#..#.\n" +
                                        "..#.#...#.#\n" +
                                        ".#...##..#.\n" +
                                        "..#.##.....\n" +
                                        ".#.#.#....#\n" +
                                        ".#........#\n" +
                                        "#.##...#...\n" +
                                        "#...##....#\n" +
                                        ".#..#...#.#";
}


