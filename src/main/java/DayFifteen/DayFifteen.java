package DayFifteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DayFifteen {

    public int partOne(String input, int turns) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < turns; i++) {
            numbers.add(-1);
        }
        for(int i = 0; i < input.split(",").length; i++) {
            numbers.set(i, Integer.parseInt(input.split(",")[i]));
        }
        int temp = input.split(",").length;
        int insertPosition = temp;
        for(; insertPosition < turns; insertPosition++) {
            int previousInt = numbers.get(insertPosition - 1);
            int lastIndexOf = numbers.subList(0, insertPosition - 1).lastIndexOf(previousInt);
            if(lastIndexOf == -1) {
                numbers.set(insertPosition, 0);
            } else {
                int nextNumber = getNextNumber(numbers.subList(0, insertPosition), previousInt);
                numbers.set(insertPosition, nextNumber);
            }
        }

        int result = numbers.get(numbers.size() - 1);
        return result;
    }

    public static void main(String[] args) {
        DayFifteen dayFifteen = new DayFifteen();
        System.out.printf("Day Fifteen part one: %d", dayFifteen.partOne(input, 2020));
        dayFifteen = new DayFifteen();
        System.out.printf("Day Fifteen part one: %d", dayFifteen.partOne(input, 30_000_000));
    }

    private int getNextNumber(List<Integer> numbers, int previousInt) {
        int positionLast = numbers.lastIndexOf(previousInt);
        numbers = numbers.subList(0, positionLast);
        int positionSecondToLast = numbers.lastIndexOf(previousInt);
        return positionLast - positionSecondToLast;
    }

    private static final String input = "10,16,6,0,1,17";
}
