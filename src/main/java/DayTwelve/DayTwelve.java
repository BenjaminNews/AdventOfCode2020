package DayTwelve;

public class DayTwelve {

    private int xCor;
    private int yCor;

    int shipXCorPartTwo = 0;
    int shipYCorPartTwo = 0;

    private boolean north = false, south = false, east = true, west = false;

    public int partOne(String input) {
        xCor = 0;
        yCor = 0;
        String[] movements = input.split("\n");
        for(String move : movements) {
            if(move.startsWith("N")) {
                xCor += Integer.parseInt(move.substring(1));
            } else if(move.startsWith("E")) {
                yCor += Integer.parseInt(move.substring(1));
            } else if(move.startsWith("S")) {
                xCor -= Integer.parseInt(move.substring(1));
            } else if(move.startsWith("W")) {
                yCor -= Integer.parseInt(move.substring(1));
            } else if(move.startsWith("R")) {
                turnRight(move);
            } else if(move.startsWith("L")) {
                turnLeft(move);
            } else if(move.startsWith("F")) {
                moveForward(move);
            }
        }
        return Math.abs(xCor) + Math.abs(yCor);
    }

    private void turnRight(String move) {
        int turnDegrees = Integer.parseInt(move.substring(1));
        if(north) {
            north = false;
            if(turnDegrees == 90) {
                east = true;
            } else if(turnDegrees == 180) {
                south = true;
            } else if(turnDegrees == 270) {
                west = true;
            }
        } else if(east) {
            east = false;
            if(turnDegrees == 90) {
                south = true;
            } else if(turnDegrees == 180) {
                west = true;
            } else if(turnDegrees == 270) {
                north = true;
            }
        } else if(south) {
            south = false;
            if(turnDegrees == 90) {
                west = true;
            } else if(turnDegrees == 180) {
                north = true;
            } else if(turnDegrees == 270) {
                east = true;
            }
        } else if(west) {
            west = false;
            if(turnDegrees == 90) {
                north = true;
            } else if(turnDegrees == 180) {
                east = true;
            } else if(turnDegrees == 270) {
                south = true;
            }
        }
    }

    private void moveForward(String move) {
        if(north) {
            xCor += Integer.parseInt(move.substring(1));
        } else if(east) {
            yCor += Integer.parseInt(move.substring(1));
        } else if(south) {
            xCor -= Integer.parseInt(move.substring(1));
        } else if(west) {
            yCor -= Integer.parseInt(move.substring(1));
        }
    }

    private void turnLeft(String move) {
        int turnDegrees = Integer.parseInt(move.substring(1));
        if(north) {
            north = false;
            if(turnDegrees == 90) {
                west = true;
            } else if(turnDegrees == 180) {
                south = true;
            } else if(turnDegrees == 270) {
                east = true;
            }
        } else if(east) {
            east = false;
            if(turnDegrees == 90) {
                north = true;
            } else if(turnDegrees == 180) {
                west = true;
            } else if(turnDegrees == 270) {
                south = true;
            }
        } else if(south) {
            south = false;
            if(turnDegrees == 90) {
                east = true;
            } else if(turnDegrees == 180) {
                north = true;
            } else if(turnDegrees == 270) {
                west = true;
            }
        } else if(west) {
            west = false;
            if(turnDegrees == 90) {
                south = true;
            } else if(turnDegrees == 180) {
                east = true;
            } else if(turnDegrees == 270) {
                north = true;
            }
        }
    }

    public static void main(String[] args) {
        DayTwelve dayTwelve = new DayTwelve();
        System.out.printf("Part one: %d\n", dayTwelve.partOne(input));
    }

    private static final String input = "N1\n" +
                                        "R90\n" +
                                        "S5\n" +
                                        "R180\n" +
                                        "N3\n" +
                                        "W1\n" +
                                        "L180\n" +
                                        "F92\n" +
                                        "R270\n" +
                                        "E4\n" +
                                        "F4\n" +
                                        "W4\n" +
                                        "W4\n" +
                                        "L180\n" +
                                        "S2\n" +
                                        "W2\n" +
                                        "F90\n" +
                                        "E1\n" +
                                        "S5\n" +
                                        "W3\n" +
                                        "F78\n" +
                                        "S5\n" +
                                        "R180\n" +
                                        "F100\n" +
                                        "N1\n" +
                                        "W3\n" +
                                        "L90\n" +
                                        "L90\n" +
                                        "N1\n" +
                                        "F94\n" +
                                        "W2\n" +
                                        "R90\n" +
                                        "F49\n" +
                                        "W2\n" +
                                        "F26\n" +
                                        "R180\n" +
                                        "W1\n" +
                                        "S5\n" +
                                        "R180\n" +
                                        "W4\n" +
                                        "S3\n" +
                                        "R90\n" +
                                        "W3\n" +
                                        "S4\n" +
                                        "E5\n" +
                                        "S1\n" +
                                        "F13\n" +
                                        "N5\n" +
                                        "R270\n" +
                                        "E2\n" +
                                        "R270\n" +
                                        "S5\n" +
                                        "F3\n" +
                                        "E3\n" +
                                        "F4\n" +
                                        "S3\n" +
                                        "R270\n" +
                                        "S1\n" +
                                        "W4\n" +
                                        "R90\n" +
                                        "S4\n" +
                                        "L180\n" +
                                        "N4\n" +
                                        "F81\n" +
                                        "W2\n" +
                                        "R90\n" +
                                        "F61\n" +
                                        "R90\n" +
                                        "F13\n" +
                                        "N3\n" +
                                        "R180\n" +
                                        "W1\n" +
                                        "F98\n" +
                                        "S5\n" +
                                        "F50\n" +
                                        "W5\n" +
                                        "S3\n" +
                                        "W5\n" +
                                        "R90\n" +
                                        "F17\n" +
                                        "S5\n" +
                                        "F70\n" +
                                        "F7\n" +
                                        "E2\n" +
                                        "F87\n" +
                                        "E1\n" +
                                        "L270\n" +
                                        "F59\n" +
                                        "E2\n" +
                                        "R180\n" +
                                        "N5\n" +
                                        "F59\n" +
                                        "L90\n" +
                                        "N5\n" +
                                        "W5\n" +
                                        "F10\n" +
                                        "N3\n" +
                                        "E1\n" +
                                        "R90\n" +
                                        "W1\n" +
                                        "S2\n" +
                                        "R90\n" +
                                        "N5\n" +
                                        "F25\n" +
                                        "R90\n" +
                                        "E2\n" +
                                        "F57\n" +
                                        "R180\n" +
                                        "E1\n" +
                                        "N3\n" +
                                        "W2\n" +
                                        "F85\n" +
                                        "L90\n" +
                                        "F50\n" +
                                        "W2\n" +
                                        "R90\n" +
                                        "S3\n" +
                                        "R90\n" +
                                        "F27\n" +
                                        "E1\n" +
                                        "S1\n" +
                                        "L90\n" +
                                        "F32\n" +
                                        "L90\n" +
                                        "W3\n" +
                                        "R90\n" +
                                        "E1\n" +
                                        "F39\n" +
                                        "S5\n" +
                                        "E4\n" +
                                        "F50\n" +
                                        "W4\n" +
                                        "L90\n" +
                                        "F63\n" +
                                        "N2\n" +
                                        "F67\n" +
                                        "W3\n" +
                                        "R90\n" +
                                        "F4\n" +
                                        "N2\n" +
                                        "R90\n" +
                                        "F90\n" +
                                        "N5\n" +
                                        "L180\n" +
                                        "F24\n" +
                                        "E5\n" +
                                        "N3\n" +
                                        "L180\n" +
                                        "F67\n" +
                                        "E3\n" +
                                        "L90\n" +
                                        "S3\n" +
                                        "F49\n" +
                                        "R90\n" +
                                        "E5\n" +
                                        "F89\n" +
                                        "W5\n" +
                                        "F62\n" +
                                        "F39\n" +
                                        "F33\n" +
                                        "W1\n" +
                                        "R90\n" +
                                        "F18\n" +
                                        "S3\n" +
                                        "R90\n" +
                                        "N4\n" +
                                        "F47\n" +
                                        "N5\n" +
                                        "N3\n" +
                                        "W2\n" +
                                        "S5\n" +
                                        "L90\n" +
                                        "E4\n" +
                                        "L90\n" +
                                        "W2\n" +
                                        "R90\n" +
                                        "W5\n" +
                                        "L90\n" +
                                        "W5\n" +
                                        "N4\n" +
                                        "F64\n" +
                                        "R90\n" +
                                        "S2\n" +
                                        "W4\n" +
                                        "R90\n" +
                                        "N3\n" +
                                        "F18\n" +
                                        "L90\n" +
                                        "S4\n" +
                                        "L90\n" +
                                        "F31\n" +
                                        "S4\n" +
                                        "L90\n" +
                                        "F79\n" +
                                        "R90\n" +
                                        "F69\n" +
                                        "N3\n" +
                                        "E4\n" +
                                        "F64\n" +
                                        "N2\n" +
                                        "E4\n" +
                                        "R90\n" +
                                        "F20\n" +
                                        "R180\n" +
                                        "E1\n" +
                                        "F85\n" +
                                        "W1\n" +
                                        "S5\n" +
                                        "S2\n" +
                                        "F21\n" +
                                        "R90\n" +
                                        "F43\n" +
                                        "N1\n" +
                                        "F18\n" +
                                        "S5\n" +
                                        "R180\n" +
                                        "F52\n" +
                                        "L180\n" +
                                        "W4\n" +
                                        "F5\n" +
                                        "L90\n" +
                                        "F70\n" +
                                        "S4\n" +
                                        "N3\n" +
                                        "R180\n" +
                                        "F64\n" +
                                        "R90\n" +
                                        "F17\n" +
                                        "R90\n" +
                                        "E5\n" +
                                        "F85\n" +
                                        "N1\n" +
                                        "F74\n" +
                                        "E5\n" +
                                        "F21\n" +
                                        "N1\n" +
                                        "F35\n" +
                                        "N1\n" +
                                        "F65\n" +
                                        "W2\n" +
                                        "F67\n" +
                                        "N1\n" +
                                        "E5\n" +
                                        "F79\n" +
                                        "S4\n" +
                                        "R90\n" +
                                        "F20\n" +
                                        "R180\n" +
                                        "W5\n" +
                                        "L180\n" +
                                        "S4\n" +
                                        "F56\n" +
                                        "S4\n" +
                                        "L90\n" +
                                        "E5\n" +
                                        "F13\n" +
                                        "S5\n" +
                                        "F38\n" +
                                        "W1\n" +
                                        "S2\n" +
                                        "L90\n" +
                                        "N4\n" +
                                        "E3\n" +
                                        "R180\n" +
                                        "W3\n" +
                                        "N1\n" +
                                        "R90\n" +
                                        "F52\n" +
                                        "N5\n" +
                                        "F23\n" +
                                        "E5\n" +
                                        "F82\n" +
                                        "E5\n" +
                                        "S2\n" +
                                        "E3\n" +
                                        "N3\n" +
                                        "S2\n" +
                                        "L90\n" +
                                        "N1\n" +
                                        "R90\n" +
                                        "S5\n" +
                                        "F60\n" +
                                        "W1\n" +
                                        "N2\n" +
                                        "W1\n" +
                                        "N3\n" +
                                        "E4\n" +
                                        "F2\n" +
                                        "E2\n" +
                                        "L90\n" +
                                        "S1\n" +
                                        "L90\n" +
                                        "E4\n" +
                                        "N1\n" +
                                        "R180\n" +
                                        "E2\n" +
                                        "R180\n" +
                                        "F93\n" +
                                        "F94\n" +
                                        "L90\n" +
                                        "S4\n" +
                                        "E5\n" +
                                        "R90\n" +
                                        "F5\n" +
                                        "S2\n" +
                                        "E2\n" +
                                        "S3\n" +
                                        "E4\n" +
                                        "R180\n" +
                                        "F56\n" +
                                        "E2\n" +
                                        "N2\n" +
                                        "F3\n" +
                                        "R90\n" +
                                        "W2\n" +
                                        "F94\n" +
                                        "W5\n" +
                                        "F47\n" +
                                        "L180\n" +
                                        "F68\n" +
                                        "E5\n" +
                                        "F63\n" +
                                        "S3\n" +
                                        "E4\n" +
                                        "F93\n" +
                                        "L90\n" +
                                        "S5\n" +
                                        "L180\n" +
                                        "W5\n" +
                                        "S5\n" +
                                        "W3\n" +
                                        "L180\n" +
                                        "F34\n" +
                                        "R90\n" +
                                        "F87\n" +
                                        "W4\n" +
                                        "S1\n" +
                                        "W3\n" +
                                        "R270\n" +
                                        "S1\n" +
                                        "E1\n" +
                                        "F78\n" +
                                        "E4\n" +
                                        "R90\n" +
                                        "F91\n" +
                                        "W4\n" +
                                        "S3\n" +
                                        "W1\n" +
                                        "F41\n" +
                                        "N4\n" +
                                        "E1\n" +
                                        "F66\n" +
                                        "S1\n" +
                                        "W5\n" +
                                        "F62\n" +
                                        "N2\n" +
                                        "W2\n" +
                                        "L90\n" +
                                        "W1\n" +
                                        "F23\n" +
                                        "L270\n" +
                                        "N2\n" +
                                        "W2\n" +
                                        "S3\n" +
                                        "F9\n" +
                                        "R90\n" +
                                        "F2\n" +
                                        "E4\n" +
                                        "F61\n" +
                                        "L90\n" +
                                        "W5\n" +
                                        "N4\n" +
                                        "F97\n" +
                                        "L90\n" +
                                        "F93\n" +
                                        "N5\n" +
                                        "L270\n" +
                                        "R90\n" +
                                        "W1\n" +
                                        "R90\n" +
                                        "R90\n" +
                                        "N4\n" +
                                        "E1\n" +
                                        "F72\n" +
                                        "N4\n" +
                                        "R270\n" +
                                        "F24\n" +
                                        "W1\n" +
                                        "F79\n" +
                                        "S1\n" +
                                        "E3\n" +
                                        "N4\n" +
                                        "E3\n" +
                                        "L90\n" +
                                        "W2\n" +
                                        "S1\n" +
                                        "R270\n" +
                                        "W5\n" +
                                        "F24\n" +
                                        "E5\n" +
                                        "S4\n" +
                                        "F22\n" +
                                        "L180\n" +
                                        "F57\n" +
                                        "S5\n" +
                                        "R90\n" +
                                        "N4\n" +
                                        "W3\n" +
                                        "F18\n" +
                                        "N2\n" +
                                        "R90\n" +
                                        "E3\n" +
                                        "F55\n" +
                                        "N2\n" +
                                        "R90\n" +
                                        "S5\n" +
                                        "F4\n" +
                                        "W3\n" +
                                        "L90\n" +
                                        "N2\n" +
                                        "W3\n" +
                                        "L270\n" +
                                        "E4\n" +
                                        "R90\n" +
                                        "F46\n" +
                                        "S5\n" +
                                        "N1\n" +
                                        "F16\n" +
                                        "N1\n" +
                                        "R90\n" +
                                        "F8\n" +
                                        "L180\n" +
                                        "N2\n" +
                                        "W3\n" +
                                        "N4\n" +
                                        "E1\n" +
                                        "S3\n" +
                                        "L90\n" +
                                        "F4\n" +
                                        "E5\n" +
                                        "N5\n" +
                                        "E3\n" +
                                        "R90\n" +
                                        "F35\n" +
                                        "N2\n" +
                                        "F68\n" +
                                        "F33\n" +
                                        "E5\n" +
                                        "F38\n" +
                                        "E4\n" +
                                        "F27\n" +
                                        "R180\n" +
                                        "S5\n" +
                                        "F47\n" +
                                        "R90\n" +
                                        "F43\n" +
                                        "R90\n" +
                                        "S1\n" +
                                        "F84\n" +
                                        "L180\n" +
                                        "F47\n" +
                                        "R90\n" +
                                        "N4\n" +
                                        "E4\n" +
                                        "F77\n" +
                                        "R180\n" +
                                        "N1\n" +
                                        "E2\n" +
                                        "S4\n" +
                                        "F45\n" +
                                        "S1\n" +
                                        "L90\n" +
                                        "E5\n" +
                                        "F40\n" +
                                        "L90\n" +
                                        "W5\n" +
                                        "F25\n" +
                                        "W4\n" +
                                        "R90\n" +
                                        "F80\n" +
                                        "N5\n" +
                                        "E2\n" +
                                        "F74\n" +
                                        "W3\n" +
                                        "N3\n" +
                                        "E4\n" +
                                        "F48\n" +
                                        "N3\n" +
                                        "R90\n" +
                                        "N2\n" +
                                        "W1\n" +
                                        "L90\n" +
                                        "S2\n" +
                                        "F35\n" +
                                        "L90\n" +
                                        "E5\n" +
                                        "R180\n" +
                                        "W5\n" +
                                        "N2\n" +
                                        "E1\n" +
                                        "L90\n" +
                                        "N2\n" +
                                        "F78\n" +
                                        "S5\n" +
                                        "R270\n" +
                                        "S5\n" +
                                        "R90\n" +
                                        "N5\n" +
                                        "E3\n" +
                                        "L90\n" +
                                        "S5\n" +
                                        "F13\n" +
                                        "S5\n" +
                                        "F52\n" +
                                        "L90\n" +
                                        "N2\n" +
                                        "R180\n" +
                                        "E1\n" +
                                        "F41\n" +
                                        "S1\n" +
                                        "F20\n" +
                                        "N4\n" +
                                        "F34\n" +
                                        "N2\n" +
                                        "F45\n" +
                                        "E5\n" +
                                        "L90\n" +
                                        "W3\n" +
                                        "L270\n" +
                                        "N5\n" +
                                        "F52\n" +
                                        "R90\n" +
                                        "N5\n" +
                                        "E5\n" +
                                        "N2\n" +
                                        "W2\n" +
                                        "W5\n" +
                                        "R270\n" +
                                        "W5\n" +
                                        "F10\n" +
                                        "N3\n" +
                                        "F63\n" +
                                        "N4\n" +
                                        "F53\n" +
                                        "L90\n" +
                                        "E5\n" +
                                        "L270\n" +
                                        "F17\n" +
                                        "N1\n" +
                                        "L90\n" +
                                        "F26\n" +
                                        "F93\n" +
                                        "R90\n" +
                                        "S5\n" +
                                        "R270\n" +
                                        "S5\n" +
                                        "R180\n" +
                                        "N4\n" +
                                        "F58\n" +
                                        "L180\n" +
                                        "F40\n" +
                                        "S2\n" +
                                        "F54\n" +
                                        "N5\n" +
                                        "F70\n" +
                                        "W1\n" +
                                        "N4\n" +
                                        "W1\n" +
                                        "L90\n" +
                                        "W5\n" +
                                        "R90\n" +
                                        "N2\n" +
                                        "R90\n" +
                                        "S5\n" +
                                        "F95\n" +
                                        "W4\n" +
                                        "L180\n" +
                                        "E3\n" +
                                        "F68\n" +
                                        "S1\n" +
                                        "F56\n" +
                                        "R90\n" +
                                        "W1\n" +
                                        "L180\n" +
                                        "F66\n" +
                                        "R90\n" +
                                        "S2\n" +
                                        "F57\n" +
                                        "L90\n" +
                                        "E1\n" +
                                        "F42\n" +
                                        "S4\n" +
                                        "F44\n" +
                                        "L90\n" +
                                        "F42\n" +
                                        "E4\n" +
                                        "R90\n" +
                                        "S4\n" +
                                        "W5\n" +
                                        "R90\n" +
                                        "E4\n" +
                                        "S4\n" +
                                        "E5\n" +
                                        "F27\n" +
                                        "R90\n" +
                                        "N1\n" +
                                        "R90\n" +
                                        "E5\n" +
                                        "R90\n" +
                                        "W4\n" +
                                        "S1\n" +
                                        "F81\n" +
                                        "N5\n" +
                                        "R180\n" +
                                        "S4\n" +
                                        "E4\n" +
                                        "F68\n" +
                                        "S3\n" +
                                        "L90\n" +
                                        "E4\n" +
                                        "E4\n" +
                                        "L180\n" +
                                        "E3\n" +
                                        "F8\n" +
                                        "W2\n" +
                                        "L90\n" +
                                        "S4\n" +
                                        "L180\n" +
                                        "N2\n" +
                                        "L180\n" +
                                        "E1\n" +
                                        "R90\n" +
                                        "W5\n" +
                                        "N4\n" +
                                        "W4\n" +
                                        "R90\n" +
                                        "F1\n" +
                                        "S5\n" +
                                        "E2\n" +
                                        "L90\n" +
                                        "F49\n" +
                                        "N4\n" +
                                        "W3\n" +
                                        "R90\n" +
                                        "E5\n" +
                                        "F33\n" +
                                        "R180\n" +
                                        "S4\n" +
                                        "E5\n" +
                                        "S2\n" +
                                        "F79\n" +
                                        "W4\n" +
                                        "F38\n" +
                                        "R90\n" +
                                        "F1\n" +
                                        "L90\n" +
                                        "F56\n" +
                                        "L270\n" +
                                        "N2\n" +
                                        "L90\n" +
                                        "E2\n" +
                                        "L90\n" +
                                        "F25\n" +
                                        "W1\n" +
                                        "S4\n" +
                                        "L270\n" +
                                        "W3\n" +
                                        "R90\n" +
                                        "N2\n" +
                                        "F68\n" +
                                        "E1\n" +
                                        "R180\n" +
                                        "W3\n" +
                                        "R90\n" +
                                        "W3\n" +
                                        "R90\n" +
                                        "S3\n" +
                                        "F4\n" +
                                        "W3\n" +
                                        "N3\n" +
                                        "R90\n" +
                                        "W3\n" +
                                        "N1\n" +
                                        "F54\n" +
                                        "W2\n" +
                                        "S5\n" +
                                        "E4\n" +
                                        "F76\n" +
                                        "F47\n" +
                                        "N1\n" +
                                        "F32\n" +
                                        "L180\n" +
                                        "L90\n" +
                                        "F19\n" +
                                        "N2\n" +
                                        "E5\n" +
                                        "L90\n" +
                                        "E1\n" +
                                        "L90\n" +
                                        "E3\n" +
                                        "R90\n" +
                                        "F48\n" +
                                        "R270\n" +
                                        "S3\n" +
                                        "R180\n" +
                                        "S4\n" +
                                        "F53\n" +
                                        "R90\n" +
                                        "F90\n" +
                                        "E4\n" +
                                        "F100\n" +
                                        "L90\n" +
                                        "F49\n" +
                                        "N1\n" +
                                        "W1\n" +
                                        "F56\n" +
                                        "E2\n" +
                                        "N5\n" +
                                        "L90\n" +
                                        "F39\n" +
                                        "R90\n" +
                                        "W2\n" +
                                        "F26\n" +
                                        "E4\n" +
                                        "N4\n" +
                                        "L90\n" +
                                        "F9\n" +
                                        "L90\n" +
                                        "F41\n" +
                                        "W5\n" +
                                        "N4\n" +
                                        "S1\n" +
                                        "W4\n" +
                                        "N3\n" +
                                        "R90\n" +
                                        "N5\n" +
                                        "L270\n" +
                                        "F82\n" +
                                        "L90\n" +
                                        "F75\n" +
                                        "S5\n" +
                                        "F25\n" +
                                        "S4\n" +
                                        "F67\n" +
                                        "N4\n" +
                                        "F57\n" +
                                        "E4\n" +
                                        "N4\n" +
                                        "F73\n" +
                                        "W5\n" +
                                        "L90\n" +
                                        "E2\n" +
                                        "R180\n" +
                                        "N5\n" +
                                        "L270\n" +
                                        "W3\n" +
                                        "F95\n" +
                                        "W2\n" +
                                        "S4\n" +
                                        "E1\n" +
                                        "R180\n" +
                                        "N3\n" +
                                        "W2\n" +
                                        "N1\n" +
                                        "F28\n" +
                                        "N2\n" +
                                        "R90\n" +
                                        "E3\n" +
                                        "S1\n" +
                                        "F41\n" +
                                        "E4\n" +
                                        "N1\n" +
                                        "R90\n" +
                                        "F12\n" +
                                        "L90\n" +
                                        "N2\n" +
                                        "S2\n" +
                                        "E3\n" +
                                        "F31\n" +
                                        "W1\n" +
                                        "L90\n" +
                                        "E5\n" +
                                        "S1\n" +
                                        "F12\n" +
                                        "R180\n" +
                                        "W5\n" +
                                        "R90\n" +
                                        "F26";
}
