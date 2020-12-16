package DayFifteen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DayFifteen {

    public int partOne(String input, int turns) {
        List<Integer> numbers = Stream.of(input.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for(int x = numbers.size() - 1, currentTurn = 0; x < turns - 1; x++, currentTurn++) {
            int previousInt = numbers.get(x);
            int occurances = countOccurances(numbers, previousInt);

            if(occurances == 0) {
                numbers.add(occurances);
            } else {
                int nextNumber = getNextNumber(numbers, previousInt);
                numbers.add(nextNumber);
            }
        }

        return numbers.get(numbers.size() - 1);
    }

    public static void main(String[] args) {
        DayFifteen dayFifteen = new DayFifteen();
        System.out.printf("Day Fifteen part one: %d", dayFifteen.partOne(input, 2020));
    }

    private int getNextNumber(List<Integer> numbers, int previousInt) {
        int positionLast = -1;
        int positionSecondToLast = -1;

        for(int x = numbers.size() - 1; x > -1 && (positionLast == -1 || positionSecondToLast == -1); x--) {
            if(numbers.get(x) == previousInt) {
                if(positionLast == -1) {
                    positionLast = x + 1;
                } else {
                    positionSecondToLast = x + 1;
                    break;
                }
            }
        }
        return positionLast - positionSecondToLast;
    }

    private int countOccurances(List<Integer> listToCountAgainst, int numberToCount) {
        int matchCount = 0;
        for (int i : listToCountAgainst) {
            if(i == numberToCount) {
                matchCount++;
            }
        }
        return matchCount - 1;
    }

    private static final String input = "10,16,6,0,1,17";

}
