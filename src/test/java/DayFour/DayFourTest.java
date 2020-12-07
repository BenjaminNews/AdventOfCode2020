package DayFour;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayFourTest {

    private DayFour dayFour;

    @Before
    public void setup() {
        this.dayFour = new DayFour();
    }

    @Test
    public void givenInputOne_returnValid() {
        String input = "ecl:gry pid:860033327 eyr:2020 hcl:#fffffd\n" +
                        "byr:1937 iyr:2017 cid:147 hgt:183cm";
        assertEquals(1, dayFour.getValidPassportCount(input));
    }

    @Test
    public void givenInpuTwo_returnInvalid() {
        String input = "iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884\n" +
                        "hcl:#cfa07d byr:1929";
        assertEquals(0, dayFour.getValidPassportCount(input));
    }

    @Test
    public void givenInputThree_returnValid() {
        String input = "hcl:#ae17e1 iyr:2013\n" +
                        "eyr:2024\n" +
                        "ecl:brn pid:760753108 byr:1931\n" +
                        "hgt:179cm";
        assertEquals(1, dayFour.getValidPassportCount(input));
    }

    @Test
    public void givenInputFour_returnInvalid() {
        String input = "hcl:#cfa07d eyr:2025 pid:166559648\n" +
                        "iyr:2011 ecl:brn hgt:59in";
        assertEquals(0, dayFour.getValidPassportCount(input));
    }

    @Test
    public void givenAllInputs_return_2_validPassports() {
        String input = "ecl:gry pid:860033327 eyr:2020 hcl:#fffffd\n" +
                "byr:1937 iyr:2017 cid:147 hgt:183cm\n" +
                "\n" +
                "iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884\n" +
                "hcl:#cfa07d byr:1929\n" +
                "\n" +
                "hcl:#ae17e1 iyr:2013\n" +
                "eyr:2024\n" +
                "ecl:brn pid:760753108 byr:1931\n" +
                "hgt:179cm\n" +
                "\n" +
                "hcl:#cfa07d eyr:2025 pid:166559648\n" +
                "iyr:2011 ecl:brn hgt:59in";
        assertEquals(2, dayFour.getValidPassportCount(input));
    }

    @Test
    public void validateBYR() {
        assertTrue(dayFour.validateBYR("2002"));
        assertFalse(dayFour.validateBYR("2003"));
    }

    @Test
    public void validateIYR() {
        assertTrue(dayFour.validateIYR("2010"));
        assertFalse(dayFour.validateIYR("2021"));
        assertFalse(dayFour.validateIYR("2009"));
        assertTrue(dayFour.validateIYR("2020"));
    }

    @Test
    public void validateEYR() {
        assertTrue(dayFour.validateEYR("2020"));
        assertTrue(dayFour.validateEYR("2021"));
        assertFalse(dayFour.validateEYR("2019"));
        assertTrue(dayFour.validateEYR("2030"));
        assertFalse(dayFour.validateEYR("2031"));
    }

    @Test
    public void validateHGT() {
        assertTrue(dayFour.validateHGT("60in"));
        assertTrue(dayFour.validateHGT("190cm"));
        assertFalse(dayFour.validateHGT("190in"));
        assertFalse(dayFour.validateHGT("190"));
    }

    @Test
    public void validateHCL() {
        assertTrue(dayFour.validateHCL("#123abc"));
        assertFalse(dayFour.validateHCL("#123abz"));
        assertFalse(dayFour.validateHCL("123abc"));
    }

    @Test
    public void validateEyeColour() {
        assertTrue(dayFour.validateECL("brn"));
        assertFalse(dayFour.validateECL(""));
    }

    @Test
    public void validatePID() {
        assertTrue(dayFour.validatePID("000000001"));
        assertFalse(dayFour.validatePID("0123456789"));
    }

    @Test
    public void givenInput_returnZero() {
        assertEquals(0, dayFour.getValidPassportCountPartTwo("eyr:1972 cid:100\n" +
                                                                            "hcl:#18171d ecl:amb hgt:170 pid:186cm iyr:2018 byr:1926\n" +
                                                                            "\n" +
                                                                            "iyr:2019\n" +
                                                                            "hcl:#602927 eyr:1967 hgt:170cm\n" +
                                                                            "ecl:grn pid:012533040 byr:1946\n" +
                                                                            "\n" +
                                                                            "hcl:dab227 iyr:2012\n" +
                                                                            "ecl:brn hgt:182cm pid:021572410 eyr:2020 byr:1992 cid:277\n" +
                                                                            "\n" +
                                                                            "hgt:59cm ecl:zzz\n" +
                                                                            "eyr:2038 hcl:74454a iyr:2023\n" +
                                                                            "pid:3556412378 byr:2007"));
    }

    @Test
    public void givenInput_returnFour() {
        assertEquals(4, dayFour.getValidPassportCountPartTwo("pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980\n" +
                                                                            "hcl:#623a2f\n" +
                                                                            "\n" +
                                                                            "eyr:2029 ecl:blu cid:129 byr:1989\n" +
                                                                            "iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm\n" +
                                                                            "\n" +
                                                                            "hcl:#888785\n" +
                                                                            "hgt:164cm byr:2001 iyr:2015 cid:88\n" +
                                                                            "pid:545766238 ecl:hzl\n" +
                                                                            "eyr:2022\n" +
                                                                            "\n" +
                                                                            "iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719"));
    }


}