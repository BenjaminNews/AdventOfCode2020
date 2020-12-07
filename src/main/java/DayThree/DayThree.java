package DayThree;

import java.util.Arrays;
import java.util.Collections;

public class DayThree {


    public long partOne(String input, int stepSize, int dropSize) {
        int repeats = Math.abs(input.split("\n")[0].length() + 1000 / stepSize) ;
        int slopeLength = input.split("\n")[0].length() * repeats;
        int slopeHeight = input.split("\n").length;

        char[][] slope = new char[slopeHeight][slopeLength];

        for(int i = 0; i < input.split("\n").length; i++) {
            String insertData = "";
            for(int x = 0; x < repeats; x++) {
                insertData += input.split("\n")[i];
            }
            slope[i] = insertData.toCharArray();
        }

//        for(char[] c: slope) {
//            System.out.println(Arrays.toString(c).replace(", ", ""));
//        }

        int collisions = 0;

        for(int currentLevel = 0, currentRow = 0; currentLevel < slope.length; currentLevel += dropSize, currentRow += stepSize) {

            if(slope[currentLevel][currentRow] == '#') {
                collisions++;
            }
        }

        return collisions;
    }

    public static void main(String[] args) {
        DayThree dayThree = new DayThree();
        System.out.printf("Part One: %d", dayThree.partOne(input, 3, 1));

        long testOne =  dayThree.partOne(input, 1, 1);
        long testTwo =  dayThree.partOne(input, 3, 1);
        long testThree =  dayThree.partOne(input, 5, 1);
        long testFour =  dayThree.partOne(input, 7, 1);
        long testFive =  dayThree.partOne(input, 1, 2);

        System.out.printf("\nPart Two: %d", (testOne * testTwo * testThree * testFour * testFive));
    }

    private static final String input = "....#...............#.#..###.##\n" +
                                        ".#..#....###..............##...\n" +
                                        "....###......#....#.#...#.##..#\n" +
                                        ".......#........#..###...##....\n" +
                                        ".....#..#......#..#..##..#...#.\n" +
                                        "....#..........#....#...#......\n" +
                                        "............###...#............\n" +
                                        "##......#.....#......#.....##..\n" +
                                        "........#.........##..#.#...##.\n" +
                                        "....#.#..#.#...#........#..#...\n" +
                                        ".#.....#.#......#....#..#..#..#\n" +
                                        "#.##..##......#.....##...#..#..\n" +
                                        "#........#..##...###....##.....\n" +
                                        "......#.#..##...#.#.....#......\n" +
                                        "##.......#..#.........#...#....\n" +
                                        ".....##.........#....#.#.###.#.\n" +
                                        "..##...........#.#.#.#.....#.#.\n" +
                                        "....#...............#......#.#.\n" +
                                        "#.#..#....#.....#.....##...#..#\n" +
                                        "#......#..............#.#.##...\n" +
                                        "......###.....#...#........###.\n" +
                                        "####...#.....#...#....#........\n" +
                                        ".......#...#....##...#.........\n" +
                                        ".####..##............#.........\n" +
                                        "#.#...#...#....#...#.#......#..\n" +
                                        "..#..#.....#.......#...#.#...##\n" +
                                        ".#.........#...#......##.#...#.\n" +
                                        ".#.#...#...#.....#.#........#.#\n" +
                                        ".#.....###....###..##.#..##.#..\n" +
                                        ".....##....#......#..#...#...#.\n" +
                                        "#...##....#.......#.....##.##..\n" +
                                        "#...#.....#.#...........#..###.\n" +
                                        "##.#........###...........###.#\n" +
                                        "#...#.#........#.#.....#.......\n" +
                                        "..................#..#.........\n" +
                                        ".....#.#..#.#......#..#.....##.\n" +
                                        ".#.#.......#..##........#..##.#\n" +
                                        ".#.#..#.#...#.......#.#.#..#...\n" +
                                        "...#......#....#....##.#..#....\n" +
                                        "......#.......##....##..#.....#\n" +
                                        "...#.##...##...............#..#\n" +
                                        ".###....#.#.....##..#.......#.#\n" +
                                        "#....#..........#...........#.#\n" +
                                        "...#...............#.#..#....#.\n" +
                                        ".....#..##..........#..###.....\n" +
                                        ".....####.....#.#.......#...#..\n" +
                                        "#.............#...#.......##...\n" +
                                        ".#....##.......#.#......#.#.##.\n" +
                                        ".#..#.......#..##...#...#......\n" +
                                        "#.......#..#..#..#.....#.......\n" +
                                        "##...#.#.#...........#....#....\n" +
                                        ".......#..#.#..............#.#.\n" +
                                        ".....#.......#.......#.#.#.....\n" +
                                        "....##.##.....#......#.......#.\n" +
                                        "#...#..#.#....###....##...#.#.#\n" +
                                        "#..#......#........#.#.#.....#.\n" +
                                        "###..##..#......#.....#.......#\n" +
                                        "..##....#.#.#......#..##...#...\n" +
                                        ".....#..#....#...#.#...#...#...\n" +
                                        ".....#.#..###.#..#...##......#.\n" +
                                        "#.#..#....#..#.....#.#...#.#...\n" +
                                        ".#..#....#.......#..#.......#..\n" +
                                        "#.........#..#..#.........##..#\n" +
                                        "..##.##..#..#...##.............\n" +
                                        ".....###...#..#...##.#..#......\n" +
                                        "#.##.....##..............#.....\n" +
                                        ".......#.##.#.##...#.#.......##\n" +
                                        "...#.#.##...#......#...........\n" +
                                        "##.#........#.....##.....#.....\n" +
                                        ".#.....#.............#......#..\n" +
                                        "....#..##..#..#....#..#.#......\n" +
                                        ".#.....#....##..##..#...##.....\n" +
                                        ".##........#.#.#.#..........#.#\n" +
                                        "...#.#.#..#....#...#..###.##...\n" +
                                        ".#....#....#.#.#.#....#..#.....\n" +
                                        "#.#.......#..#..#...........#.#\n" +
                                        ".....#.....##..#....##.........\n" +
                                        "....#.##..............#........\n" +
                                        ".................#....#.......#\n" +
                                        "...................###...#...#.\n" +
                                        "...#.#..#..##..##....#.....#...\n" +
                                        "#...#..........................\n" +
                                        ".......#..#..#.#..#.....#......\n" +
                                        "..##.#..#......#...#.##..##..#.\n" +
                                        ".##.........#.#...........#....\n" +
                                        "...#...#..##.#......#..#..#....\n" +
                                        ".....#.#....#...#............#.\n" +
                                        ".##..#.....##....#...#.........\n" +
                                        "#......##...#...#............#.\n" +
                                        ".....#.##...#.#....##..........\n" +
                                        ".............#.......#.#.......\n" +
                                        "##....#.#........#....#..##....\n" +
                                        "....#...##.#....##..#.....#.#..\n" +
                                        "...##..#....##......#...#......\n" +
                                        ".####.#..#..#.#...#.#.#....#...\n" +
                                        ".#........#.##....#.#....#.....\n" +
                                        ".........#....##..#..#.........\n" +
                                        "....##...#....##.............#.\n" +
                                        "....#..##.#....#.#..#...##.....\n" +
                                        ".....##...#..#....#......#.#...\n" +
                                        "..........#.......#.##..#.##..#\n" +
                                        ".......#.........#...#.##......\n" +
                                        "....##.#.......#...............\n" +
                                        "....#.......#..##.......##.#.##\n" +
                                        "#.#..#.#....#.#.........###...#\n" +
                                        ".#.##.....##..##...........#.#.\n" +
                                        "...#....##........##...#...#...\n" +
                                        ".#.##....#.#...#.#..#..#...#...\n" +
                                        "#....#.##...#.#..#....#.....#..\n" +
                                        "#..#...#........#...........#..\n" +
                                        "...........#.......#......#..#.\n" +
                                        "....##...#......##.....#......#\n" +
                                        ".#.##.#.#.............#....##..\n" +
                                        ".#...#...##.#.#........#..##.#.\n" +
                                        ".#.#........#.#...#..#........#\n" +
                                        ".###.#.#...#..#..#.#....#..#...\n" +
                                        "..##..##....#.#............#...\n" +
                                        "#..........#........#..#.#.#...\n" +
                                        ".#...#..#..#.#.....#.....#....#\n" +
                                        "#.....#.#.#.....####.......#...\n" +
                                        "...#.#........#.#.###...#.....#\n" +
                                        ".....#.....##....#....#..##...#\n" +
                                        "..#....###.##.#..#..#....#...#.\n" +
                                        ".....#.....#...........#.#.###.\n" +
                                        ".....#......###...#.#...##.....\n" +
                                        "...........###..#...#....#.#..#\n" +
                                        "...#..###.....#....#.#...#.....\n" +
                                        ".......#...#..#..##....#.#.#...\n" +
                                        "...#..####.###........#.....#..\n" +
                                        "..#......###..#..#.##..........\n" +
                                        "....#....##..##..##.......###..\n" +
                                        "...#.......#..#.#....##........\n" +
                                        ".#.#.....#.#.#..........#..#..#\n" +
                                        ".##....##....##...........##.##\n" +
                                        "........#......#.##....##...#.#\n" +
                                        "..#.#.....#..#....#..........#.\n" +
                                        "...........#...............#...\n" +
                                        ".....####.....#.....###.#..#...\n" +
                                        "..........####..##.##.#....#...\n" +
                                        "...#.#.#......#....#..#.#......\n" +
                                        ".#.#......###.....#....#.......\n" +
                                        "..#..#..#.......#..#...#.....#.\n" +
                                        "...#............#......##...###\n" +
                                        "......#.............#..#..###..\n" +
                                        ".#.#......#..##.#..#..#.#...#.#\n" +
                                        ".#.....#.......#..#...........#\n" +
                                        "..#.###.#..#...#.##..#.##......\n" +
                                        "....#.#........#..#.#...#.#.##.\n" +
                                        ".#..##.#..#.#.#...##..#.#......\n" +
                                        ".......#..#..#..#.....#.#.#..#.\n" +
                                        ".##.###..##.....#.##..#........\n" +
                                        "...##..............#.#.##....#.\n" +
                                        "##....#...#...........#........\n" +
                                        "..#........#.#.##..#.#...#..#..\n" +
                                        ".......#.......##.#..#....#.#..\n" +
                                        ".......#....##..#.#.#..#....#..\n" +
                                        "..........#....#..#..#....#....\n" +
                                        "........#.....#.#.....##.......\n" +
                                        "........##.###.........#.#.#...\n" +
                                        "###......####...#.#........#...\n" +
                                        "......#........#......#.....#..\n" +
                                        "##..#.##..##.###..#........##..\n" +
                                        ".#..#...#............##.##..#..\n" +
                                        "...........#..#.#..............\n" +
                                        ".##.#.#....#...............#..#\n" +
                                        ".........##.................#..\n" +
                                        "#............##..##.........##.\n" +
                                        "##........#.........#..##.#...#\n" +
                                        "........#.....#..#.........#.##\n" +
                                        "....#......#.....##.##.........\n" +
                                        ".#.#.....#.#..#..##....#....#..\n" +
                                        ".###...#..##....##.....#.#..##.\n" +
                                        ".#....#.#.......#..#..#...###..\n" +
                                        "..#.#......#.#..#.....###.....#\n" +
                                        "#....#..#...#.....#.......#.##.\n" +
                                        ".#.......##.#.#...#......#.....\n" +
                                        "###....#.#......#....#.#...##..\n" +
                                        "...#....####.......##.....#..#.\n" +
                                        ".#.................#.......##.#\n" +
                                        "...#.###..........#..##......#.\n" +
                                        ".....##.#..............##..#...\n" +
                                        "#.....#..#..........#..#.......\n" +
                                        "..#...#.#.#.......##.#.....#...\n" +
                                        "#........#.#........#.#.....#..\n" +
                                        "#.....#...##....##..##........#\n" +
                                        ".#.##..#...#....#........#..#..\n" +
                                        "#..#.....#....#...##......#....\n" +
                                        "...#...#...#.#.#....##....#.#.#\n" +
                                        "......#...............#.....#..\n" +
                                        ".......#.#..#..##.#.....#......\n" +
                                        "...........##......#...#.......\n" +
                                        "....##..##.....#.#...#.........\n" +
                                        "......##..###.......#....#.##..\n" +
                                        "......#..#.##....#..###..#.....\n" +
                                        ".....#.........#........##.....\n" +
                                        ".....####..................#...\n" +
                                        ".#.#...##................#.....\n" +
                                        ".#..#...#...#.....#.##..#..#...\n" +
                                        ".#................#...###....#.\n" +
                                        "...#....#...........#...#....#.\n" +
                                        ".......#....##...............#.\n" +
                                        ".#.#.##..##.......#....#....###\n" +
                                        "......#.#....#...#..#..........\n" +
                                        "....#.##.#.#...##.#.#......#...\n" +
                                        "##....#...##.....#..#.###.#....\n" +
                                        ".......#......#.........#.#...#\n" +
                                        ".##.#...........##.........#.#.\n" +
                                        "##..##.....#...#..#.#...#....#.\n" +
                                        "#..##......###........#...#....\n" +
                                        ".....#.#.......#...#..##....##.\n" +
                                        ".....#.#..#.....#.......#..##..\n" +
                                        "...#..#..............#.#.......\n" +
                                        ".#.#...###......###............\n" +
                                        ".....#.....#...#.###...........\n" +
                                        ".......#..................#...#\n" +
                                        "#....#...#...#....#....#.#....#\n" +
                                        "....#..#............#.#........\n" +
                                        "#....#..........#.#.#..#..#....\n" +
                                        ".......#....#......#....#......\n" +
                                        ".##.#.#...#...#...##...........\n" +
                                        ".........###.#..#..............\n" +
                                        "...#........##....#....#....###\n" +
                                        "....##..#.......#.#...#.#..#.#.\n" +
                                        ".....##....#..##.........#.....\n" +
                                        "........##..#........#.........\n" +
                                        "...........#..#.##..##...#.....\n" +
                                        ".........#.#..####..#...#.##.##\n" +
                                        "##..#.#.....##.....#.........#.\n" +
                                        "..#...#...#....#.#....#.....#.#\n" +
                                        ".###.#....#.#......#....#......\n" +
                                        ".##.....#....#.......#.#..#.##.\n" +
                                        "#..#..##.....#....#...##.....#.\n" +
                                        "...#.........####.........##..#\n" +
                                        "..#.....#....###.#.#...#..#....\n" +
                                        ".........#....#..#.#.........#.\n" +
                                        ".....###.##..#...#.....#..#..#.\n" +
                                        "....#......#..#.#...#.....#....\n" +
                                        ".......#...#..#....#.......#.#.\n" +
                                        ".#....#............#....####...\n" +
                                        "#..##..##....#.....#...#.....#.\n" +
                                        "...#...##...#.#....#...........\n" +
                                        ".......#####.....#..###.#..#...\n" +
                                        ".....#.....#.#....#.........#..\n" +
                                        ".###.#..#...##.##.#.#..#..#....\n" +
                                        ".#..#.##..#......#..........##.\n" +
                                        "##....#....#.........###..#....\n" +
                                        "..#.............#.......#.#....\n" +
                                        "..#.....#..##...#...###..#.##..\n" +
                                        "##...##...#.#....#..#..........\n" +
                                        "...............#.....#.......#.\n" +
                                        "....#.#......##.#......#...#.#.\n" +
                                        ".........#.............#.#.....\n" +
                                        "...#.#.........................\n" +
                                        "..#..#....##..#...###.##.......\n" +
                                        "...##.#...##..#.#.##.#...#.##..\n" +
                                        ".##....#....#.......#.....##..#\n" +
                                        ".#...............#..#...#......\n" +
                                        "...##.....##.###....#.....#...#\n" +
                                        "...#.....#...####....##....#..#\n" +
                                        "..#.#.###..##.....#........#...\n" +
                                        ".....##.##..#..#.........##....\n" +
                                        "........##.....#..........#.##.\n" +
                                        "..##.#....####..#...........#..\n" +
                                        "##....#..#..#.#.##.....#...##..\n" +
                                        "...#...#......#..#.#....#......\n" +
                                        "##.....##.......##.##....#.....\n" +
                                        ".........#...##...........#....\n" +
                                        ".###.#..#....##...#.....#.....#\n" +
                                        "...#..........#.###..##...#.##.\n" +
                                        "...#..#....#.#.#.......###.....\n" +
                                        "....#..#.#.....##...#.#.#.#....\n" +
                                        ".......##..#...##..##.#....#...\n" +
                                        ".##..........#.#.#.....#.....#.\n" +
                                        "#....#......##...#..##.#..#..#.\n" +
                                        ".#...#.....###..#......#.....#.\n" +
                                        ".#..#.###.......#.##....###....\n" +
                                        "#....#....#....#....#..#.##....\n" +
                                        "..#..#.....#.....#....###.....#\n" +
                                        "##.###..#...##.......#.#.......\n" +
                                        "#...##......##....#.#...#....#.\n" +
                                        "..##.#.#....#...#.....##.......\n" +
                                        ".#....#..#...#...##..##........\n" +
                                        "###......#.##....#.#..##.......\n" +
                                        "...#.....##.#.........#..#.....\n" +
                                        ".......#.#....#.....##......#..\n" +
                                        "#..#..............##.#........#\n" +
                                        "....#.#....#..#.#...##.........\n" +
                                        "..........#..........#.........\n" +
                                        ".#.....#.....#.##....#.##..#..#\n" +
                                        ".......#.......#.#.#.##....#...\n" +
                                        "..#...........#....#.......##..\n" +
                                        "..#.#.#.#...##..#.#.#..#...#.#.\n" +
                                        "..#..#..........#...##....#....\n" +
                                        "....##.#....#.............#....\n" +
                                        ".##...##..........#.#..#...#...\n" +
                                        "#..#..#.##..........##.........\n" +
                                        "............#.......#..#.....##\n" +
                                        "....#......#........#..#.##....\n" +
                                        "#.#......#.#...#.....#.........\n" +
                                        "..#.....#..#..........#.....#..\n" +
                                        ".#..#.#.#.##...#..#.#.........#\n" +
                                        "#...##....#..##..#...#.#.##....\n" +
                                        "#..##.##.#.##.......#.......#..\n" +
                                        "#.#.......#........#.##....#.#.\n" +
                                        "....#..##....##..##......#..##.\n" +
                                        "#.....#....#.#........####.....\n" +
                                        "......#...#...###..#...........\n" +
                                        ".##.#.##...##................##\n" +
                                        "..##.#.....#.#..#......#.#.....\n" +
                                        "......#...#........#.....#.##..\n" +
                                        "#..#.#..#.....#.#..#..##..#.#..\n" +
                                        "...#.........#.#.#.##...#......\n" +
                                        "...#..##....#..#.#....#.###.#..\n" +
                                        "........###................##.#\n" +
                                        "##...........#......##.##.....#\n" +
                                        ".#.#.#....#....#....#..........\n" +
                                        "#.....#........................\n" +
                                        "....#.....#...#......#.........\n" +
                                        "....#.#..#..............#......\n" +
                                        "##.........#..#....#.......#...\n" +
                                        ".###....#..#.#.####.........#..\n" +
                                        "..#.#....#.....###..#..........\n" +
                                        "..........#................#.##";
}
