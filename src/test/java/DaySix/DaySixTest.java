package DaySix;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DaySixTest {

    private DaySix daySix;

    @Before
    public void setup() {
        daySix = new DaySix();
    }

    @Test
    public void givenInputOne_return_Three() {
        assertEquals(3, daySix.partOne("abc"));
    }

    @Test
    public void givenInputTwo_return_Three() {
        assertEquals(3, daySix.partOne("a\n" +
                                                        "b\n" +
                                                        "c"));
    }

    @Test
    public void givenInputThree_return_Three() {
        assertEquals(3, daySix.partOne("ab\n" +
                                                        "ac"));
    }

    @Test
    public void givenInputFour_return_One() {
        assertEquals(1, daySix.partOne("a\n" +
                                                        "a\n" +
                                                        "a\n" +
                                                        "a"));
    }

    @Test
    public void givenInputFive_return_One() {
        assertEquals(1, daySix.partOne("b"));
    }

    @Test
    public void givenAllInputs_return_Eleven() {
        assertEquals(11, daySix.partOne("abc\n" +
                                                        "\n" +
                                                        "a\n" +
                                                        "b\n" +
                                                        "c\n" +
                                                        "\n" +
                                                        "ab\n" +
                                                        "ac\n" +
                                                        "\n" +
                                                        "a\n" +
                                                        "a\n" +
                                                        "a\n" +
                                                        "a\n" +
                                                        "\n" +
                                                        "b"));
    }

    @Test
    public void givenInput_return_three() {
        assertEquals(3, daySix.partTwo("abc"));
    }

    @Test
    public void givenInput_return_Zero() {
        assertEquals(0, daySix.partTwo("a\n" +
                                                        "b\n" +
                                                        "c"));
    }

    @Test
    public void givenInput_return_One() {
        assertEquals(1, daySix.partTwo("ab\n" +
                                                        "ac"));
    }

    @Test
    public void givenInput_return_One_second_example() {
        assertEquals(1, daySix.partTwo("a\n" +
                                                        "a\n" +
                                                        "a\n" +
                                                        "a"));
    }

    @Test
    public void givenInput_return_One_third_example() {
        assertEquals(1, daySix.partTwo("b"));
    }

    @Test
    public void givenAllInputs_return_Six() {
        assertEquals(6, daySix.partTwo("abc\n" +
                                                        "\n" +
                                                        "a\n" +
                                                        "b\n" +
                                                        "c\n" +
                                                        "\n" +
                                                        "ab\n" +
                                                        "ac\n" +
                                                        "\n" +
                                                        "a\n" +
                                                        "a\n" +
                                                        "a\n" +
                                                        "a\n" +
                                                        "\n" +
                                                        "b"));
    }
}