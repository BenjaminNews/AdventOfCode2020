package DayTen;

import java.util.*;
import java.util.stream.Collectors;

import org.paukov.combinatorics3.Generator;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;


public class DayTen {
    public int partOne(String input, int valueOne, int valueTwo) {
        int[] joltValues = Arrays.stream(input.split("\n"))
            .mapToInt(Integer::parseInt).sorted().toArray();

        int firstConenctionCount = getConenctionCount(joltValues, 1);
        int secondConenctionCount = getConenctionCount(joltValues, 3);
        return firstConenctionCount * secondConenctionCount;
    }

    private int getConenctionCount(int[] joltValues, int indexCheck) {
        int conenctionCount = 1;
        for (int i = 0; i + 1 < joltValues.length; i++) {
            if (joltValues[i] + indexCheck == joltValues[i + 1]) {
                conenctionCount++;
            }
        }
        return conenctionCount;
    }


    List<Integer> lines;
    Map<Integer, Long> counter = new HashMap<>();

    public long partTwo(String input) {
        List<String> items = Arrays.asList(input.split("\n"));
        lines = items.stream().map(Integer::parseInt).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        lines.add(0, 0);
        return checkBranch(0);
    }

    private long checkBranch(int i) {
        if (i == (lines.size() - 1)) return 1;
        if (counter.containsKey(i)) return counter.get(i);
        long ans = 0;
        for (int j = i + 1; j < lines.size(); j++) {
            if (lines.get(j) - lines.get(i) > 3) break;
            ans += checkBranch(j);
        }
        counter.put(i, ans);
        return ans;
    }

    public static void main(String[] args) {
        DayTen dayTen = new DayTen();
        System.out.printf("Part one: %d\n", dayTen.partOne(input, 1, 3));
        System.out.printf("Part two: %d\n", dayTen.partTwo(input));
    }

    private static final String input = "26\n" +
                                        "97\n" +
                                        "31\n" +
                                        "7\n" +
                                        "2\n" +
                                        "10\n" +
                                        "46\n" +
                                        "38\n" +
                                        "112\n" +
                                        "54\n" +
                                        "30\n" +
                                        "93\n" +
                                        "18\n" +
                                        "111\n" +
                                        "29\n" +
                                        "75\n" +
                                        "139\n" +
                                        "23\n" +
                                        "132\n" +
                                        "85\n" +
                                        "78\n" +
                                        "99\n" +
                                        "8\n" +
                                        "113\n" +
                                        "87\n" +
                                        "57\n" +
                                        "133\n" +
                                        "41\n" +
                                        "104\n" +
                                        "98\n" +
                                        "58\n" +
                                        "90\n" +
                                        "13\n" +
                                        "91\n" +
                                        "20\n" +
                                        "68\n" +
                                        "103\n" +
                                        "127\n" +
                                        "105\n" +
                                        "114\n" +
                                        "138\n" +
                                        "126\n" +
                                        "67\n" +
                                        "32\n" +
                                        "145\n" +
                                        "115\n" +
                                        "16\n" +
                                        "141\n" +
                                        "1\n" +
                                        "73\n" +
                                        "45\n" +
                                        "119\n" +
                                        "51\n" +
                                        "40\n" +
                                        "35\n" +
                                        "150\n" +
                                        "118\n" +
                                        "53\n" +
                                        "80\n" +
                                        "79\n" +
                                        "65\n" +
                                        "135\n" +
                                        "74\n" +
                                        "47\n" +
                                        "128\n" +
                                        "64\n" +
                                        "17\n" +
                                        "4\n" +
                                        "84\n" +
                                        "83\n" +
                                        "147\n" +
                                        "142\n" +
                                        "146\n" +
                                        "9\n" +
                                        "125\n" +
                                        "94\n" +
                                        "140\n" +
                                        "131\n" +
                                        "134\n" +
                                        "92\n" +
                                        "66\n" +
                                        "122\n" +
                                        "19\n" +
                                        "86\n" +
                                        "50\n" +
                                        "52\n" +
                                        "108\n" +
                                        "100\n" +
                                        "71\n" +
                                        "61\n" +
                                        "44\n" +
                                        "39\n" +
                                        "3\n" +
                                        "72";
}
