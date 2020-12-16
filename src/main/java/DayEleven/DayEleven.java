import java.util.Arrays;
import java.util.stream.Stream;

public class DayEleven {

    private char[][] allSeats;
    private char[][] copy;

    public int partOne(String input) {
        allSeats = Stream.of(input.split("\n")).sequential().map(String::toCharArray).toArray(char[][]::new);

//        for(char[] c : allSeats) {
//            for(int i = 0; i < c.length; i++) {
//                if(c[i] == 'L') {
//                    c[i] = '#';
//                }
//            }
//        }
        System.out.println(Arrays.deepToString(allSeats).replace("], ", "]\n"));

        copy = Arrays.copyOf(allSeats, allSeats.length);

        for(int row = 0; row < allSeats.length; row++) {
            for(int seat = 0; seat < allSeats[row].length; seat++) {
                if(seat == 0 && row == 0) {
                    performTopLeftCorner(row, seat);
                } else if(row == 0 && seat == allSeats[row].length - 1) {
                    performTopRightCorner(row, seat);
                } else if(row == allSeats.length && seat == 0) {
                    performBottomRightCorner(row, seat);
                } else if(row == allSeats.length && seat == 0) {
                    performBottomLeftCorner(row, seat);
                }
                if((seat > 0 && row > 0) && (row < allSeats.length - 1 && seat < copy[row].length - 1)) {
                    performCenter(row, seat);
                }
            }

        }
        allSeats = copy;
        System.out.println(Arrays.deepToString(copy).replace("], ", "]\n"));

        System.out.println(Arrays.deepToString(allSeats).replace("], ", "]\n"));
        return -1;
    }

    private void performBottomRightCorner(int row, int seat) {
        //System.out.println("row: " + row + " seat: " + seat + " value: " + copy[row][seat]);
        int neighbourCount = getSeatsAbove(row, seat);
        neighbourCount += getSeatsToRight(seat, allSeats[row]);
        neighbourCount += getSeatsUpAndRight(row, seat);
        if(allSeats[row][seat] == 'L') {
            if(neighbourCount == 0) {
                copy[row][seat] = '#';
            }
        } else if(allSeats[row][seat] == '#') {
            if(neighbourCount >= 4) {
                copy[row][seat] = 'L';
            } else {
                copy[row][seat] = '#';
            }
        } else {
            copy[row][seat] = allSeats[row][seat];
        }
    }

    private void performBottomLeftCorner(int row, int seat) {
        //System.out.println("row: " + row + " seat: " + seat + " value: " + copy[row][seat]);
        int neighbourCount = getSeatsAbove(row, seat);
        neighbourCount += getSeatsToLeft(seat, allSeats[row]);
        neighbourCount += getSeatsUpAndLeft(row, seat);
        if(allSeats[row][seat] == 'L') {
            if(neighbourCount == 0) {
                copy[row][seat] = '#';
            }
        } else if(allSeats[row][seat] == '#') {
            if(neighbourCount >= 4) {
                copy[row][seat] = 'L';
            } else {
                copy[row][seat] = '#';
            }
        } else {
            copy[row][seat] = allSeats[row][seat];
        }
    }

    private void performCenter(int row, int seat) {
        //System.out.println("row: " + row + " seat: " + seat + " value: " + copy[row][seat]);
        int neighbourCount = getSurroundingSeatCount(row, seat);
        if(allSeats[row][seat] == 'L') {
            if(neighbourCount == 0) {
                copy[row][seat] = '#';
            }
        } else if(allSeats[row][seat] == '#') {
            if(neighbourCount >= 4) {
                copy[row][seat] = 'L';
            } else {
                copy[row][seat] = '#';
            }
        } else {
            copy[row][seat] = allSeats[row][seat];
        }
    }

    private void performTopRightCorner(int row, int seat) {
        int neighbourCount = getSeatsBelow(row, seat);
        neighbourCount += getSeatsToLeft(seat, copy[row]);
        neighbourCount += getSeatsDownAndLeft(row, seat);
        if(allSeats[row][seat] == 'L') {
            if(neighbourCount == 0) {
                copy[row][seat] = '#';
            }
        } else if(allSeats[row][seat] == '#') {
            if(neighbourCount >= 4) {
                copy[row][seat] = 'L';
            } else {
                copy[row][seat] = '#';
            }
        } else {
            copy[row][seat] = allSeats[row][seat];
        }
    }

    private void performTopLeftCorner(int row, int seat) {
        int neighbourCount = getSeatsBelow(row, seat);
        neighbourCount += getSeatsToRight(seat, allSeats[row]);
        neighbourCount += getSeatsDownAndRight(row, seat);
        char seatValue = allSeats[row][seat];
        if(seatValue == 'L') {
            if(neighbourCount == 0) {
                copy[row][seat] = '#';
            }
        } else if(seatValue == '#') {
            if(neighbourCount >= 4) {
                copy[row][seat] = 'L';
            } else {
                copy[row][seat] = '#';
            }
        } else {
            copy[row][seat] = allSeats[row][seat];
        }
    }

    private int getSurroundingSeatCount(int row, int seat) {
        int countOfNeighbouringSeats = 0;
        char[] currentRow = allSeats[row];

        //get seats to right
        countOfNeighbouringSeats = getSeatsToRight(seat, currentRow);

        //get seats to left
        countOfNeighbouringSeats += getSeatsToLeft(seat, currentRow);

        //get direct above seats
        countOfNeighbouringSeats += getSeatsAbove(row, seat);

        //get direct below seats
        countOfNeighbouringSeats += getSeatsBelow(row, seat);

        //get down and right
        countOfNeighbouringSeats += getSeatsDownAndRight(row, seat);

        //get down and left
        countOfNeighbouringSeats += getSeatsDownAndLeft(row, seat);

        //get up and right
        countOfNeighbouringSeats += getSeatsUpAndRight(row, seat);

        //get up and left
        countOfNeighbouringSeats += getSeatsUpAndLeft(row, seat);

        return countOfNeighbouringSeats;
    }

    private int getSeatsUpAndLeft(int row, int seat) {
        for(int upRow = row - 1, leftSeat = seat - 1; upRow > -1 && leftSeat > -1; upRow--, leftSeat--) {
            if(allSeats[upRow][leftSeat] == '#') {
                return 1;
            }
        }
        return 0;
    }

    private int getSeatsUpAndRight(int row, int seat) {
        for(int upRow = row - 1, rightSeat = seat + 1; upRow > -1 && rightSeat < allSeats[upRow].length; upRow--, rightSeat++) {
            if(allSeats[upRow][rightSeat] == '#') {
                return 1;
            }
        }
        return 0;
    }

    private int getSeatsDownAndLeft(int row, int seat) {
        for(int downRow = row + 1, leftSeat = seat - 1; downRow < allSeats.length && leftSeat > -1; downRow++, leftSeat--) {
            if(allSeats[downRow][leftSeat] == '#') {
                return 1;
            }
        }
        return 0;
    }

    private int getSeatsDownAndRight(int row, int seat) {
        for(int downRow = row + 1, rightSeat = seat + 1; downRow < allSeats.length && rightSeat < allSeats[downRow].length; downRow++, rightSeat++) {
            if(allSeats[downRow][rightSeat] == '#') {
                return 1;
            }
        }
        return 0;
    }

    private int getSeatsBelow(int row, int seat) {
        for(int checkRow = row + 1; checkRow < allSeats.length; checkRow++) {
            if(allSeats[checkRow][seat] == '#') {
                return 1;
            }
        }
        return 0;
    }

    private int getSeatsAbove(int row, int seat) {
        for(int checkRow = row - 1; checkRow > - 1; checkRow--) {
            if(allSeats[checkRow][seat] == '#') {
                return 1;
            }
        }
        return 0;
    }

    private int getSeatsToLeft(int seat, char[] currentRow) {
        char[] currentRowLeftSeats = Arrays.copyOfRange(currentRow, 0, seat);
        for(char c : currentRowLeftSeats) {
            if (c == '#') {
                return 1;
            }
        }
        return 0;
    }

    private int getSeatsToRight(int seat, char[] currentRow) {
        char[] currentRowRightSeats = Arrays.copyOfRange(currentRow, seat + 1, currentRow.length);
        for(char c : currentRowRightSeats) {
            if (c == '#') {
                return 1;
            }
        }
        return 0;
    }
}
