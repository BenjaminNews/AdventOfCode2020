package DayEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayEight {

    public int partOne(String input) {
        String[] commands = input.split("\n");
        List<Integer> performedInstractions = new ArrayList<Integer>();
        int accumulator = 0;
        for(int i = 0; i < commands.length; ) {
            if(!performedInstractions.contains(i)) {
                performedInstractions.add(i);
            } else {
                break;
            }
            String command = commands[i].split(" ")[0];
            int value = Integer.parseInt(commands[i].split(" ")[1]);
            if(command.equals("nop")) {
                i++;
            } else if(command.equals("jmp")) {
                i += value;
            } else if(command.equals("acc")) {
                accumulator += value;
                i++;
            }
        }

        return accumulator;
    }

    public int partTwo(String input) {
        String[] commands = input.split("\n");

        int accumulator = 0;

        for(int x = 0; x < commands.length; x++) {
            commands = input.split("\n");
            accumulator = 0;
            String start = Arrays.toString(commands);
            List<Integer> performedInstractions = new ArrayList<Integer>();
            if(commands[x].contains("jmp")) {
                commands[x] = commands[x].replace("jmp", "nop");
            } else if(commands[x].contains("nop")) {
                commands[x] = commands[x].replace("nop", "jmp");
            } else {
                continue;
            }
            for (int i = 0; i < commands.length; ) {
                if (!performedInstractions.contains(i)) {
                    performedInstractions.add(i);
                } else {
                    break;
                }
                String command = commands[i].split(" ")[0];
                int value = Integer.parseInt(commands[i].split(" ")[1]);
                if (command.equals("nop")) {
                    i++;
                } else if (command.equals("jmp")) {
                    i += value;
                } else if (command.equals("acc")) {
                    accumulator += value;
                    i++;
                }
                int commandLengths = commands.length;
                if(i == commandLengths) {
                    return accumulator;
                }
            }
        }
        return accumulator;
    }

    public static void main(String[] args) {
        DayEight dayEight = new DayEight();
        System.out.printf("Part one: %d\n", dayEight.partOne(input));
        dayEight = new DayEight();
        System.out.printf("Part two: %d", dayEight.partTwo(input));
    }

    private static String input =   "nop +355\n" +
                                    "acc +46\n" +
                                    "jmp +42\n" +
                                    "jmp +585\n" +
                                    "acc +11\n" +
                                    "acc +0\n" +
                                    "acc +40\n" +
                                    "jmp +284\n" +
                                    "acc -2\n" +
                                    "nop +276\n" +
                                    "jmp +613\n" +
                                    "acc +23\n" +
                                    "acc +2\n" +
                                    "acc +14\n" +
                                    "acc +25\n" +
                                    "jmp +310\n" +
                                    "acc +43\n" +
                                    "acc +43\n" +
                                    "jmp +510\n" +
                                    "jmp +116\n" +
                                    "jmp +204\n" +
                                    "nop +213\n" +
                                    "acc +47\n" +
                                    "jmp +1\n" +
                                    "acc +8\n" +
                                    "jmp +461\n" +
                                    "jmp -22\n" +
                                    "acc +36\n" +
                                    "acc +33\n" +
                                    "acc +45\n" +
                                    "jmp +175\n" +
                                    "acc +21\n" +
                                    "jmp +472\n" +
                                    "acc +50\n" +
                                    "acc +40\n" +
                                    "jmp +525\n" +
                                    "acc +26\n" +
                                    "nop +208\n" +
                                    "jmp +496\n" +
                                    "jmp +153\n" +
                                    "acc +50\n" +
                                    "acc +24\n" +
                                    "nop +512\n" +
                                    "jmp +242\n" +
                                    "acc +7\n" +
                                    "nop +317\n" +
                                    "acc +50\n" +
                                    "acc +7\n" +
                                    "jmp +268\n" +
                                    "acc +8\n" +
                                    "acc -19\n" +
                                    "acc -11\n" +
                                    "jmp +1\n" +
                                    "jmp +383\n" +
                                    "acc +1\n" +
                                    "jmp +230\n" +
                                    "acc +5\n" +
                                    "jmp +128\n" +
                                    "nop +227\n" +
                                    "acc -7\n" +
                                    "jmp -16\n" +
                                    "acc +11\n" +
                                    "acc -6\n" +
                                    "jmp -42\n" +
                                    "acc +11\n" +
                                    "acc +23\n" +
                                    "jmp +7\n" +
                                    "jmp -23\n" +
                                    "jmp +11\n" +
                                    "acc +0\n" +
                                    "nop +246\n" +
                                    "acc +24\n" +
                                    "jmp +213\n" +
                                    "jmp +550\n" +
                                    "acc +24\n" +
                                    "acc +14\n" +
                                    "acc +34\n" +
                                    "acc -6\n" +
                                    "jmp +525\n" +
                                    "acc +4\n" +
                                    "nop +220\n" +
                                    "jmp +399\n" +
                                    "acc +41\n" +
                                    "jmp +34\n" +
                                    "acc -2\n" +
                                    "acc +38\n" +
                                    "acc +48\n" +
                                    "acc -7\n" +
                                    "jmp +136\n" +
                                    "acc -2\n" +
                                    "acc +40\n" +
                                    "acc +12\n" +
                                    "acc -4\n" +
                                    "jmp +467\n" +
                                    "acc +36\n" +
                                    "acc +19\n" +
                                    "nop +518\n" +
                                    "jmp +328\n" +
                                    "acc +7\n" +
                                    "nop +263\n" +
                                    "acc +19\n" +
                                    "acc -17\n" +
                                    "jmp +282\n" +
                                    "jmp +206\n" +
                                    "acc +28\n" +
                                    "acc +7\n" +
                                    "jmp +417\n" +
                                    "acc -10\n" +
                                    "jmp -75\n" +
                                    "nop +475\n" +
                                    "nop +68\n" +
                                    "nop -38\n" +
                                    "acc +33\n" +
                                    "jmp +367\n" +
                                    "acc +0\n" +
                                    "jmp +459\n" +
                                    "jmp +1\n" +
                                    "acc +50\n" +
                                    "jmp +1\n" +
                                    "nop -25\n" +
                                    "jmp +464\n" +
                                    "acc +35\n" +
                                    "jmp -5\n" +
                                    "acc -14\n" +
                                    "jmp -113\n" +
                                    "nop +25\n" +
                                    "acc +33\n" +
                                    "acc +28\n" +
                                    "acc +3\n" +
                                    "jmp -71\n" +
                                    "nop +75\n" +
                                    "acc +19\n" +
                                    "acc +27\n" +
                                    "jmp +332\n" +
                                    "jmp +361\n" +
                                    "acc -2\n" +
                                    "acc +45\n" +
                                    "acc +47\n" +
                                    "jmp +461\n" +
                                    "jmp -120\n" +
                                    "acc +18\n" +
                                    "acc +25\n" +
                                    "acc +11\n" +
                                    "jmp +24\n" +
                                    "jmp +372\n" +
                                    "acc +32\n" +
                                    "acc +2\n" +
                                    "jmp +87\n" +
                                    "acc +23\n" +
                                    "jmp +96\n" +
                                    "acc +32\n" +
                                    "nop +233\n" +
                                    "acc -7\n" +
                                    "jmp +435\n" +
                                    "jmp +51\n" +
                                    "acc -7\n" +
                                    "jmp +392\n" +
                                    "acc +22\n" +
                                    "acc -17\n" +
                                    "acc +8\n" +
                                    "acc +34\n" +
                                    "jmp -140\n" +
                                    "acc +10\n" +
                                    "nop +276\n" +
                                    "jmp -57\n" +
                                    "acc -6\n" +
                                    "jmp +388\n" +
                                    "acc +4\n" +
                                    "jmp +386\n" +
                                    "jmp +267\n" +
                                    "jmp +1\n" +
                                    "acc +15\n" +
                                    "acc -11\n" +
                                    "nop -169\n" +
                                    "jmp +71\n" +
                                    "acc +10\n" +
                                    "acc +19\n" +
                                    "jmp +377\n" +
                                    "acc -1\n" +
                                    "jmp +316\n" +
                                    "acc +13\n" +
                                    "acc -5\n" +
                                    "acc +7\n" +
                                    "acc +28\n" +
                                    "jmp -49\n" +
                                    "acc +20\n" +
                                    "acc +4\n" +
                                    "acc -19\n" +
                                    "jmp +196\n" +
                                    "acc -1\n" +
                                    "acc -8\n" +
                                    "jmp +266\n" +
                                    "acc +43\n" +
                                    "acc +10\n" +
                                    "nop +122\n" +
                                    "jmp +222\n" +
                                    "acc +0\n" +
                                    "jmp +275\n" +
                                    "nop +282\n" +
                                    "jmp +199\n" +
                                    "acc +24\n" +
                                    "acc +37\n" +
                                    "acc -18\n" +
                                    "nop -33\n" +
                                    "jmp -110\n" +
                                    "acc -7\n" +
                                    "acc -9\n" +
                                    "acc +18\n" +
                                    "jmp -189\n" +
                                    "acc -10\n" +
                                    "acc +46\n" +
                                    "jmp +214\n" +
                                    "acc +22\n" +
                                    "acc +45\n" +
                                    "jmp +48\n" +
                                    "nop +217\n" +
                                    "acc -6\n" +
                                    "acc +5\n" +
                                    "jmp -40\n" +
                                    "jmp +220\n" +
                                    "acc +26\n" +
                                    "nop +393\n" +
                                    "jmp +1\n" +
                                    "jmp +358\n" +
                                    "jmp +138\n" +
                                    "nop -181\n" +
                                    "acc +48\n" +
                                    "jmp +190\n" +
                                    "acc +49\n" +
                                    "jmp +105\n" +
                                    "jmp -176\n" +
                                    "jmp +37\n" +
                                    "acc +49\n" +
                                    "jmp -130\n" +
                                    "acc +20\n" +
                                    "acc +48\n" +
                                    "jmp +236\n" +
                                    "acc +41\n" +
                                    "acc +19\n" +
                                    "nop +321\n" +
                                    "jmp -12\n" +
                                    "acc +3\n" +
                                    "acc +38\n" +
                                    "jmp +338\n" +
                                    "jmp -160\n" +
                                    "nop +250\n" +
                                    "acc +21\n" +
                                    "jmp +29\n" +
                                    "acc +44\n" +
                                    "acc +11\n" +
                                    "acc -17\n" +
                                    "acc +7\n" +
                                    "jmp +110\n" +
                                    "nop +242\n" +
                                    "acc +48\n" +
                                    "acc +46\n" +
                                    "jmp -15\n" +
                                    "acc -18\n" +
                                    "nop -190\n" +
                                    "acc +39\n" +
                                    "acc -12\n" +
                                    "jmp +255\n" +
                                    "acc -16\n" +
                                    "acc -13\n" +
                                    "acc +12\n" +
                                    "acc +29\n" +
                                    "jmp +243\n" +
                                    "jmp -14\n" +
                                    "acc +33\n" +
                                    "nop +40\n" +
                                    "acc -11\n" +
                                    "jmp +252\n" +
                                    "nop +248\n" +
                                    "acc -17\n" +
                                    "acc +14\n" +
                                    "jmp +29\n" +
                                    "acc -6\n" +
                                    "acc +21\n" +
                                    "acc +27\n" +
                                    "nop +287\n" +
                                    "jmp +329\n" +
                                    "acc -3\n" +
                                    "acc +7\n" +
                                    "acc +0\n" +
                                    "jmp +297\n" +
                                    "acc +9\n" +
                                    "jmp -10\n" +
                                    "acc +11\n" +
                                    "nop +293\n" +
                                    "acc -14\n" +
                                    "jmp +214\n" +
                                    "acc -11\n" +
                                    "acc +43\n" +
                                    "acc +43\n" +
                                    "acc +35\n" +
                                    "jmp +239\n" +
                                    "acc +10\n" +
                                    "acc -18\n" +
                                    "acc +39\n" +
                                    "jmp -129\n" +
                                    "acc +8\n" +
                                    "jmp +313\n" +
                                    "acc +49\n" +
                                    "jmp +300\n" +
                                    "nop +219\n" +
                                    "nop +215\n" +
                                    "jmp -203\n" +
                                    "acc -8\n" +
                                    "jmp +137\n" +
                                    "nop +211\n" +
                                    "acc -19\n" +
                                    "acc -18\n" +
                                    "nop -8\n" +
                                    "jmp +132\n" +
                                    "acc -17\n" +
                                    "jmp -84\n" +
                                    "acc +8\n" +
                                    "acc +2\n" +
                                    "acc -1\n" +
                                    "jmp -91\n" +
                                    "acc -4\n" +
                                    "acc +37\n" +
                                    "jmp +1\n" +
                                    "acc +14\n" +
                                    "jmp -297\n" +
                                    "acc -10\n" +
                                    "nop -186\n" +
                                    "acc -18\n" +
                                    "jmp -150\n" +
                                    "acc +46\n" +
                                    "acc +25\n" +
                                    "acc +45\n" +
                                    "acc -5\n" +
                                    "jmp +187\n" +
                                    "acc +21\n" +
                                    "jmp +101\n" +
                                    "acc +15\n" +
                                    "acc -15\n" +
                                    "jmp +30\n" +
                                    "acc +42\n" +
                                    "acc +35\n" +
                                    "jmp +276\n" +
                                    "jmp -323\n" +
                                    "jmp -124\n" +
                                    "acc +34\n" +
                                    "acc -16\n" +
                                    "acc -19\n" +
                                    "jmp -314\n" +
                                    "acc +45\n" +
                                    "jmp -219\n" +
                                    "acc +6\n" +
                                    "acc -12\n" +
                                    "acc +45\n" +
                                    "acc +38\n" +
                                    "jmp +30\n" +
                                    "acc +32\n" +
                                    "acc +47\n" +
                                    "acc +40\n" +
                                    "acc +11\n" +
                                    "jmp -236\n" +
                                    "acc +46\n" +
                                    "jmp -328\n" +
                                    "acc -18\n" +
                                    "acc +34\n" +
                                    "acc -11\n" +
                                    "jmp +201\n" +
                                    "acc +8\n" +
                                    "jmp +161\n" +
                                    "nop +44\n" +
                                    "acc +8\n" +
                                    "jmp +158\n" +
                                    "acc +26\n" +
                                    "jmp +137\n" +
                                    "acc +2\n" +
                                    "acc -4\n" +
                                    "nop -59\n" +
                                    "jmp +14\n" +
                                    "acc +18\n" +
                                    "jmp -211\n" +
                                    "acc +28\n" +
                                    "jmp -152\n" +
                                    "acc -3\n" +
                                    "acc +0\n" +
                                    "jmp -21\n" +
                                    "acc -2\n" +
                                    "jmp -331\n" +
                                    "acc +1\n" +
                                    "acc +24\n" +
                                    "nop -274\n" +
                                    "jmp -350\n" +
                                    "jmp +1\n" +
                                    "acc +28\n" +
                                    "acc -14\n" +
                                    "acc +49\n" +
                                    "jmp -39\n" +
                                    "nop +114\n" +
                                    "acc +33\n" +
                                    "jmp +217\n" +
                                    "acc +0\n" +
                                    "acc +25\n" +
                                    "jmp +1\n" +
                                    "acc +33\n" +
                                    "jmp +50\n" +
                                    "acc +23\n" +
                                    "acc +0\n" +
                                    "acc -14\n" +
                                    "jmp +66\n" +
                                    "jmp -68\n" +
                                    "jmp +1\n" +
                                    "acc +0\n" +
                                    "acc +10\n" +
                                    "jmp -244\n" +
                                    "jmp -200\n" +
                                    "jmp +1\n" +
                                    "acc -2\n" +
                                    "acc +34\n" +
                                    "jmp -48\n" +
                                    "nop +192\n" +
                                    "acc +34\n" +
                                    "acc -1\n" +
                                    "acc +6\n" +
                                    "jmp -48\n" +
                                    "acc +4\n" +
                                    "acc +13\n" +
                                    "jmp -405\n" +
                                    "acc +36\n" +
                                    "nop -372\n" +
                                    "acc +20\n" +
                                    "acc +32\n" +
                                    "jmp -231\n" +
                                    "acc +14\n" +
                                    "jmp -83\n" +
                                    "acc +22\n" +
                                    "jmp -375\n" +
                                    "acc +21\n" +
                                    "jmp -356\n" +
                                    "acc -1\n" +
                                    "jmp -398\n" +
                                    "jmp -104\n" +
                                    "acc +48\n" +
                                    "nop -382\n" +
                                    "jmp -296\n" +
                                    "acc -15\n" +
                                    "acc +29\n" +
                                    "jmp +159\n" +
                                    "acc +41\n" +
                                    "jmp -215\n" +
                                    "acc -6\n" +
                                    "acc -1\n" +
                                    "acc +44\n" +
                                    "acc -14\n" +
                                    "jmp +72\n" +
                                    "acc +2\n" +
                                    "acc +6\n" +
                                    "jmp -106\n" +
                                    "acc +39\n" +
                                    "jmp -301\n" +
                                    "acc -12\n" +
                                    "acc +43\n" +
                                    "acc +24\n" +
                                    "jmp -53\n" +
                                    "nop +19\n" +
                                    "acc +17\n" +
                                    "acc -12\n" +
                                    "jmp -211\n" +
                                    "jmp +1\n" +
                                    "jmp -98\n" +
                                    "acc +18\n" +
                                    "acc -6\n" +
                                    "nop -153\n" +
                                    "nop -376\n" +
                                    "jmp -377\n" +
                                    "nop +109\n" +
                                    "acc -10\n" +
                                    "acc +6\n" +
                                    "acc -13\n" +
                                    "jmp -359\n" +
                                    "acc +35\n" +
                                    "nop +125\n" +
                                    "jmp -312\n" +
                                    "jmp -23\n" +
                                    "acc +8\n" +
                                    "acc +27\n" +
                                    "nop +105\n" +
                                    "acc -16\n" +
                                    "jmp -112\n" +
                                    "acc -9\n" +
                                    "acc +13\n" +
                                    "acc +1\n" +
                                    "jmp -421\n" +
                                    "nop -471\n" +
                                    "acc +41\n" +
                                    "acc +10\n" +
                                    "acc +26\n" +
                                    "jmp -110\n" +
                                    "acc -8\n" +
                                    "acc -17\n" +
                                    "acc +32\n" +
                                    "acc -3\n" +
                                    "jmp -329\n" +
                                    "acc +0\n" +
                                    "acc +2\n" +
                                    "acc +2\n" +
                                    "jmp +114\n" +
                                    "acc +44\n" +
                                    "acc +7\n" +
                                    "acc -8\n" +
                                    "jmp +33\n" +
                                    "jmp -310\n" +
                                    "nop -14\n" +
                                    "acc +32\n" +
                                    "acc +21\n" +
                                    "acc +42\n" +
                                    "jmp -509\n" +
                                    "acc +4\n" +
                                    "jmp -29\n" +
                                    "nop +12\n" +
                                    "nop +74\n" +
                                    "jmp -491\n" +
                                    "jmp -307\n" +
                                    "acc +12\n" +
                                    "jmp -217\n" +
                                    "jmp -254\n" +
                                    "nop -3\n" +
                                    "acc +33\n" +
                                    "jmp +101\n" +
                                    "acc +17\n" +
                                    "jmp -4\n" +
                                    "nop -361\n" +
                                    "acc +20\n" +
                                    "acc +0\n" +
                                    "acc +37\n" +
                                    "jmp -120\n" +
                                    "jmp -178\n" +
                                    "jmp -306\n" +
                                    "acc +31\n" +
                                    "acc +16\n" +
                                    "acc +12\n" +
                                    "nop +61\n" +
                                    "jmp -466\n" +
                                    "acc +38\n" +
                                    "acc +40\n" +
                                    "jmp -323\n" +
                                    "acc -1\n" +
                                    "nop -112\n" +
                                    "nop +46\n" +
                                    "nop -221\n" +
                                    "jmp -111\n" +
                                    "jmp -248\n" +
                                    "acc -2\n" +
                                    "nop +53\n" +
                                    "acc -12\n" +
                                    "nop -382\n" +
                                    "jmp -514\n" +
                                    "jmp +1\n" +
                                    "acc +30\n" +
                                    "jmp -177\n" +
                                    "acc -18\n" +
                                    "acc +34\n" +
                                    "jmp -297\n" +
                                    "jmp -446\n" +
                                    "nop -33\n" +
                                    "acc +8\n" +
                                    "acc +19\n" +
                                    "acc +22\n" +
                                    "jmp +16\n" +
                                    "acc -17\n" +
                                    "nop -194\n" +
                                    "jmp -541\n" +
                                    "acc +50\n" +
                                    "acc +15\n" +
                                    "nop -347\n" +
                                    "acc -9\n" +
                                    "jmp -433\n" +
                                    "acc +32\n" +
                                    "nop -571\n" +
                                    "jmp -482\n" +
                                    "acc +42\n" +
                                    "nop -287\n" +
                                    "nop -263\n" +
                                    "jmp -368\n" +
                                    "jmp +10\n" +
                                    "acc +39\n" +
                                    "jmp -204\n" +
                                    "acc +28\n" +
                                    "acc +35\n" +
                                    "jmp -565\n" +
                                    "jmp -464\n" +
                                    "jmp -84\n" +
                                    "acc +25\n" +
                                    "jmp -532\n" +
                                    "acc +42\n" +
                                    "jmp +1\n" +
                                    "jmp -154\n" +
                                    "acc +4\n" +
                                    "acc +8\n" +
                                    "acc +4\n" +
                                    "acc +48\n" +
                                    "jmp -82\n" +
                                    "jmp -256\n" +
                                    "acc +33\n" +
                                    "acc +49\n" +
                                    "jmp +1\n" +
                                    "jmp -539\n" +
                                    "acc -1\n" +
                                    "acc +46\n" +
                                    "acc +49\n" +
                                    "acc +13\n" +
                                    "jmp -20\n" +
                                    "acc -11\n" +
                                    "acc -15\n" +
                                    "acc +1\n" +
                                    "jmp -96\n" +
                                    "jmp -483\n" +
                                    "jmp -444\n" +
                                    "jmp +1\n" +
                                    "jmp -382\n" +
                                    "acc -5\n" +
                                    "acc +5\n" +
                                    "acc +26\n" +
                                    "jmp -458\n" +
                                    "acc +24\n" +
                                    "jmp -515\n" +
                                    "nop -211\n" +
                                    "jmp -64\n" +
                                    "jmp -246\n" +
                                    "acc -17\n" +
                                    "acc -7\n" +
                                    "acc +0\n" +
                                    "acc +21\n" +
                                    "jmp +1";
}