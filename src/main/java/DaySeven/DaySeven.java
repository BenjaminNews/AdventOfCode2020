package DaySeven;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DaySeven {

    private List<Bag> allBags = new ArrayList<>();

    public int partOne(String input) {
        allBags.clear();
        for (String line : input.split("\n")) {
            String[] lineData = line.split(" bags contain ");

            if (lineData[1].equals("no other bags.")) continue;

            Bag bag = getBag(lineData[0]);

            String[] bagNames = lineData[1].replaceAll("(( ?)[0-9] | bag(s?)|\\.)", "").split(",");
            for (String bagName : bagNames) {
                bag.addNewBag(getBag(bagName));
            }
        }
        int count = allBags.stream().filter(this::allowesGoldBag).toArray().length;
        return count;
    }

    public long partTwo(String input) {
        allBags.clear();
        for (String line : input.split("\n")) {
            String[] lineData = line.split(" bags contain ");

            if (lineData[1].equals("no other bags.")) continue;

            Bag bag = getBag(lineData[0]);

            String[] bagNames = lineData[1].replaceAll("( bag(s?)|\\.)", "").split(", ");
            for (String bagName : bagNames) {

                int bagAmount = Integer.parseInt(bagName.substring(0, 1));
                Bag bag1 = getBag(bagName.substring(2));

                for (int i = 0; i < bagAmount; i++) {
                    bag.addNewBag(bag1);
                }
            }
        }

        return bagsInside(getBag("shiny gold"), 0);
    }

    private long bagsInside(Bag bag, long amount) {
        amount += bag.getCanContain().size();
        for (Bag bag1 : bag.getCanContain()) amount = bagsInside(bag1, amount);
        return amount;
    }

    private Bag getBag(String name) {
        Optional<Bag> optionalBag = allBags.stream().filter(bag -> bag.getName().equals(name)).findFirst();
        if (!optionalBag.isPresent()) return new Bag(name);
        return optionalBag.get();
    }

    public static void main(String[] args) {
        DaySeven daySeven = new DaySeven();
        System.out.printf("Part one: %d\n", daySeven.partOne(input));
        System.out.printf("Part two: %d\n", daySeven.partTwo(input));
    }

    private boolean allowesGoldBag(Bag bag) {
        return bag.getCanContain().stream().anyMatch(bag1 -> bag1.getName().equals("shiny gold") || allowesGoldBag(bag1));
    }

    private class Bag {
        String name;
        List<Bag> canContain = new ArrayList<>();

        public Bag(String name) {
            this.name = name;
            allBags.add(this);
        }

        public String getName() {
            return name;
        }

        public List<Bag> getCanContain() {
            return canContain;
        }

        public void addNewBag(Bag bag) {
            this.canContain.add(bag);
        }
    }

    private static final String input = "light beige bags contain 5 dark green bags, 5 light gray bags, 3 faded indigo bags, 2 vibrant aqua bags.\n" +
                                        "faded purple bags contain 4 shiny green bags, 2 mirrored olive bags.\n" +
                                        "drab tomato bags contain 4 shiny coral bags.\n" +
                                        "mirrored crimson bags contain 4 bright maroon bags.\n" +
                                        "faded magenta bags contain 2 clear bronze bags, 5 dim brown bags, 3 striped cyan bags.\n" +
                                        "vibrant beige bags contain 1 pale silver bag.\n" +
                                        "plaid lavender bags contain 5 striped teal bags, 2 vibrant tan bags, 3 clear bronze bags, 3 light black bags.\n" +
                                        "posh maroon bags contain no other bags.\n" +
                                        "dotted yellow bags contain 4 plaid turquoise bags, 2 plaid lavender bags, 1 dotted violet bag.\n" +
                                        "posh fuchsia bags contain 5 mirrored gold bags, 2 faded bronze bags, 2 faded coral bags, 1 vibrant maroon bag.\n" +
                                        "dotted chartreuse bags contain 1 pale magenta bag.\n" +
                                        "muted beige bags contain 2 drab cyan bags.\n" +
                                        "dark olive bags contain 4 dull gold bags.\n" +
                                        "posh yellow bags contain no other bags.\n" +
                                        "dotted turquoise bags contain 5 striped indigo bags, 2 pale cyan bags, 5 light violet bags, 2 plaid silver bags.\n" +
                                        "wavy black bags contain 1 light cyan bag, 3 pale tomato bags.\n" +
                                        "striped plum bags contain 5 wavy maroon bags, 2 dim violet bags, 5 shiny tan bags.\n" +
                                        "shiny olive bags contain 5 vibrant aqua bags.\n" +
                                        "dim indigo bags contain 3 dull indigo bags, 2 light crimson bags, 2 dark magenta bags, 2 vibrant tomato bags.\n" +
                                        "drab tan bags contain 4 vibrant lime bags, 1 faded turquoise bag.\n" +
                                        "muted black bags contain 4 dull crimson bags, 2 posh tan bags, 4 shiny blue bags.\n" +
                                        "plaid red bags contain 5 clear blue bags, 3 plaid white bags, 4 dark magenta bags, 1 dark purple bag.\n" +
                                        "pale black bags contain 2 faded beige bags, 1 striped black bag.\n" +
                                        "striped red bags contain 3 vibrant green bags, 4 plaid blue bags, 2 drab brown bags.\n" +
                                        "dotted fuchsia bags contain 1 striped orange bag, 5 dotted maroon bags, 4 posh turquoise bags, 2 drab white bags.\n" +
                                        "plaid green bags contain 3 posh magenta bags, 4 dark black bags, 3 clear chartreuse bags.\n" +
                                        "dark violet bags contain 2 clear teal bags, 5 muted cyan bags, 2 shiny coral bags, 5 faded teal bags.\n" +
                                        "striped gray bags contain 3 bright salmon bags, 5 mirrored brown bags.\n" +
                                        "dull aqua bags contain 5 mirrored cyan bags, 1 mirrored olive bag.\n" +
                                        "light indigo bags contain 4 dotted salmon bags, 5 faded lavender bags, 1 dark teal bag, 2 dull purple bags.\n" +
                                        "dark aqua bags contain 1 clear tan bag, 5 muted turquoise bags, 3 drab orange bags.\n" +
                                        "drab orange bags contain 5 mirrored gray bags, 5 muted red bags, 3 muted gray bags.\n" +
                                        "wavy beige bags contain 1 light beige bag, 5 wavy coral bags.\n" +
                                        "dark gray bags contain 4 shiny violet bags, 3 dull tomato bags.\n" +
                                        "dull indigo bags contain 4 wavy coral bags, 3 dim plum bags, 2 shiny cyan bags, 2 vibrant bronze bags.\n" +
                                        "drab gray bags contain 4 drab silver bags, 1 vibrant bronze bag, 3 faded red bags.\n" +
                                        "dotted gold bags contain 2 faded silver bags.\n" +
                                        "muted chartreuse bags contain 3 clear turquoise bags, 5 muted turquoise bags, 4 dark crimson bags.\n" +
                                        "dark orange bags contain 4 shiny coral bags, 5 mirrored fuchsia bags, 5 mirrored teal bags.\n" +
                                        "light olive bags contain 4 shiny coral bags, 1 pale purple bag, 2 posh yellow bags, 5 shiny gray bags.\n" +
                                        "dotted silver bags contain 3 dotted purple bags.\n" +
                                        "muted bronze bags contain 4 striped silver bags, 1 posh plum bag, 1 muted blue bag, 5 shiny violet bags.\n" +
                                        "striped magenta bags contain 4 dark purple bags, 2 dull tomato bags, 4 mirrored lavender bags.\n" +
                                        "vibrant violet bags contain 1 plaid purple bag, 2 mirrored olive bags, 3 dotted bronze bags, 2 posh turquoise bags.\n" +
                                        "muted cyan bags contain 2 dotted crimson bags, 1 muted red bag, 1 plaid lavender bag.\n" +
                                        "striped black bags contain 1 plaid white bag, 5 pale cyan bags, 4 posh plum bags.\n" +
                                        "wavy blue bags contain 3 plaid plum bags, 1 shiny bronze bag, 1 shiny magenta bag, 2 vibrant cyan bags.\n" +
                                        "bright gold bags contain 2 mirrored indigo bags, 3 faded cyan bags, 3 posh beige bags, 1 faded indigo bag.\n" +
                                        "dim magenta bags contain 1 dark black bag.\n" +
                                        "dotted magenta bags contain 1 posh tomato bag, 4 striped white bags, 2 posh fuchsia bags, 1 mirrored tan bag.\n" +
                                        "light lime bags contain 1 mirrored fuchsia bag, 1 dull cyan bag, 1 mirrored chartreuse bag, 2 dotted beige bags.\n" +
                                        "faded crimson bags contain 1 muted blue bag.\n" +
                                        "dim tomato bags contain 2 plaid black bags, 3 striped black bags.\n" +
                                        "wavy tan bags contain 3 wavy gray bags, 2 striped indigo bags.\n" +
                                        "plaid beige bags contain 2 bright yellow bags, 1 dark gray bag, 5 dotted gray bags.\n" +
                                        "bright coral bags contain 2 drab white bags, 3 bright maroon bags, 2 dotted tan bags, 4 shiny salmon bags.\n" +
                                        "plaid tomato bags contain 3 clear white bags, 2 clear coral bags, 1 mirrored blue bag.\n" +
                                        "striped chartreuse bags contain 4 pale green bags, 2 muted crimson bags.\n" +
                                        "dim salmon bags contain 5 posh magenta bags, 5 dark red bags, 4 dull teal bags, 4 plaid gray bags.\n" +
                                        "plaid aqua bags contain 5 dark black bags, 1 light chartreuse bag, 1 dotted maroon bag.\n" +
                                        "faded silver bags contain 2 plaid silver bags, 1 shiny teal bag, 3 clear purple bags.\n" +
                                        "drab red bags contain 2 mirrored brown bags.\n" +
                                        "faded brown bags contain 5 shiny plum bags.\n" +
                                        "vibrant indigo bags contain 2 vibrant bronze bags, 2 wavy orange bags.\n" +
                                        "pale salmon bags contain 5 dull cyan bags, 2 wavy orange bags.\n" +
                                        "drab olive bags contain 1 striped beige bag.\n" +
                                        "vibrant white bags contain 4 shiny gold bags.\n" +
                                        "striped teal bags contain 4 faded green bags, 3 mirrored brown bags.\n" +
                                        "posh beige bags contain 3 posh yellow bags, 1 dull yellow bag, 2 posh maroon bags.\n" +
                                        "pale violet bags contain 3 shiny teal bags, 5 drab purple bags, 5 light turquoise bags, 4 pale tan bags.\n" +
                                        "light turquoise bags contain 4 dim lavender bags.\n" +
                                        "muted yellow bags contain 4 dim crimson bags, 2 wavy gray bags.\n" +
                                        "mirrored maroon bags contain 5 wavy silver bags, 5 dull aqua bags, 1 faded black bag, 1 faded cyan bag.\n" +
                                        "drab lavender bags contain 4 drab tan bags, 4 pale violet bags, 2 wavy indigo bags.\n" +
                                        "light salmon bags contain 2 dim magenta bags, 5 dull orange bags.\n" +
                                        "drab turquoise bags contain 5 shiny gold bags.\n" +
                                        "vibrant magenta bags contain 5 wavy maroon bags, 4 dotted gray bags.\n" +
                                        "clear violet bags contain 1 bright red bag, 2 faded plum bags.\n" +
                                        "clear beige bags contain 5 faded purple bags.\n" +
                                        "light silver bags contain 4 vibrant gray bags, 2 wavy gray bags, 4 drab salmon bags.\n" +
                                        "dark coral bags contain 5 bright plum bags.\n" +
                                        "pale white bags contain 3 posh tomato bags, 1 clear purple bag, 2 posh crimson bags.\n" +
                                        "vibrant yellow bags contain 5 posh gold bags, 2 plaid turquoise bags, 5 muted blue bags.\n" +
                                        "drab yellow bags contain 3 bright salmon bags, 3 clear blue bags, 1 faded indigo bag.\n" +
                                        "pale red bags contain 5 drab olive bags.\n" +
                                        "muted lime bags contain 1 vibrant fuchsia bag, 1 shiny coral bag, 2 mirrored violet bags, 5 wavy gray bags.\n" +
                                        "faded chartreuse bags contain 2 muted tomato bags, 5 dotted gray bags, 1 faded cyan bag, 1 dotted plum bag.\n" +
                                        "dark beige bags contain 3 dotted violet bags, 5 bright silver bags, 4 posh magenta bags, 4 faded fuchsia bags.\n" +
                                        "pale olive bags contain 3 plaid red bags, 5 posh maroon bags.\n" +
                                        "vibrant brown bags contain 1 plaid white bag, 3 dotted gold bags, 2 faded chartreuse bags.\n" +
                                        "bright orange bags contain 2 shiny magenta bags.\n" +
                                        "light coral bags contain 3 faded black bags, 4 faded coral bags, 4 plaid teal bags, 1 dull aqua bag.\n" +
                                        "dull silver bags contain 2 drab salmon bags, 2 shiny violet bags, 1 dull aqua bag, 5 faded black bags.\n" +
                                        "striped cyan bags contain 1 faded purple bag.\n" +
                                        "dim beige bags contain 5 wavy violet bags.\n" +
                                        "dotted coral bags contain 4 dim salmon bags, 5 clear beige bags, 2 shiny bronze bags, 2 light tan bags.\n" +
                                        "faded aqua bags contain 3 bright magenta bags, 3 posh olive bags.\n" +
                                        "mirrored tan bags contain 5 plaid silver bags, 5 striped gray bags.\n" +
                                        "striped beige bags contain 4 dull yellow bags.\n" +
                                        "wavy coral bags contain no other bags.\n" +
                                        "dark indigo bags contain 1 drab olive bag, 2 faded cyan bags, 5 dim yellow bags.\n" +
                                        "dark white bags contain 1 vibrant gray bag, 3 mirrored plum bags, 5 clear lavender bags, 1 shiny purple bag.\n" +
                                        "muted maroon bags contain 1 dim blue bag, 1 pale silver bag.\n" +
                                        "dotted gray bags contain 1 mirrored teal bag, 2 shiny gold bags, 5 drab gold bags.\n" +
                                        "dull tan bags contain 4 bright silver bags, 4 pale lavender bags, 3 wavy gray bags.\n" +
                                        "dark chartreuse bags contain 2 wavy tan bags, 1 striped orange bag, 1 posh salmon bag.\n" +
                                        "wavy gray bags contain no other bags.\n" +
                                        "drab brown bags contain no other bags.\n" +
                                        "dotted red bags contain 2 shiny yellow bags, 1 muted yellow bag, 2 pale lime bags.\n" +
                                        "bright black bags contain 4 striped gray bags, 2 dull yellow bags.\n" +
                                        "clear tan bags contain 3 shiny gold bags, 1 dark magenta bag, 5 bright aqua bags, 1 clear maroon bag.\n" +
                                        "dim silver bags contain 2 pale green bags, 3 clear orange bags, 2 pale white bags, 1 posh yellow bag.\n" +
                                        "mirrored chartreuse bags contain 1 wavy gray bag, 5 shiny magenta bags, 2 plaid purple bags, 2 dotted beige bags.\n" +
                                        "striped indigo bags contain 5 pale bronze bags, 1 muted blue bag.\n" +
                                        "dull plum bags contain 2 plaid red bags, 5 bright plum bags.\n" +
                                        "striped tan bags contain 3 vibrant aqua bags, 2 muted blue bags.\n" +
                                        "dotted teal bags contain 3 vibrant tan bags, 3 bright plum bags.\n" +
                                        "wavy white bags contain 2 muted black bags, 2 muted tomato bags, 4 bright gold bags.\n" +
                                        "muted lavender bags contain 3 clear beige bags.\n" +
                                        "striped salmon bags contain 1 faded coral bag, 1 clear green bag.\n" +
                                        "vibrant tomato bags contain 3 shiny violet bags.\n" +
                                        "dim olive bags contain 2 faded tan bags, 3 mirrored maroon bags, 3 dark crimson bags, 5 muted cyan bags.\n" +
                                        "dotted lime bags contain 5 muted violet bags, 3 light beige bags, 2 drab brown bags.\n" +
                                        "striped purple bags contain 2 dull gray bags.\n" +
                                        "wavy tomato bags contain 1 posh crimson bag, 5 vibrant tan bags, 3 bright maroon bags.\n" +
                                        "bright lavender bags contain 2 mirrored lavender bags, 4 shiny cyan bags.\n" +
                                        "faded turquoise bags contain 3 dull gray bags, 5 dull yellow bags, 5 dotted bronze bags, 4 vibrant aqua bags.\n" +
                                        "vibrant olive bags contain 4 dull violet bags, 5 dark coral bags.\n" +
                                        "bright cyan bags contain 3 bright turquoise bags.\n" +
                                        "pale aqua bags contain 5 shiny green bags, 3 clear silver bags, 4 muted tan bags.\n" +
                                        "vibrant cyan bags contain 2 vibrant maroon bags, 5 plaid magenta bags, 1 light black bag, 5 bright maroon bags.\n" +
                                        "striped lime bags contain 4 faded red bags, 3 mirrored brown bags, 4 dim plum bags, 4 wavy silver bags.\n" +
                                        "pale gold bags contain 5 posh plum bags, 1 dull tomato bag, 3 dark teal bags, 4 shiny black bags.\n" +
                                        "drab black bags contain 5 pale brown bags.\n" +
                                        "wavy maroon bags contain 1 dull yellow bag, 4 dim crimson bags, 1 dim lavender bag, 2 drab brown bags.\n" +
                                        "plaid gold bags contain 2 dotted gray bags, 2 pale orange bags, 5 mirrored brown bags.\n" +
                                        "shiny gray bags contain 3 faded lavender bags, 3 drab yellow bags, 3 wavy green bags.\n" +
                                        "bright beige bags contain 2 drab turquoise bags.\n" +
                                        "muted red bags contain 4 wavy gray bags, 5 mirrored lime bags.\n" +
                                        "bright violet bags contain 5 striped cyan bags, 2 pale blue bags, 1 clear plum bag.\n" +
                                        "plaid bronze bags contain 5 muted green bags, 5 posh gray bags, 1 dull silver bag, 4 faded black bags.\n" +
                                        "shiny gold bags contain 4 wavy green bags, 2 mirrored teal bags, 4 dark tomato bags, 2 faded beige bags.\n" +
                                        "plaid cyan bags contain 5 bright green bags.\n" +
                                        "posh green bags contain 5 mirrored beige bags.\n" +
                                        "dull purple bags contain 5 dull blue bags.\n" +
                                        "pale fuchsia bags contain 4 mirrored cyan bags, 1 faded red bag, 5 wavy green bags.\n" +
                                        "wavy olive bags contain 5 dotted olive bags, 3 shiny tan bags, 4 dotted magenta bags, 2 clear violet bags.\n" +
                                        "faded tan bags contain 3 plaid teal bags, 5 muted tomato bags.\n" +
                                        "pale blue bags contain 4 faded plum bags, 5 wavy green bags, 3 shiny violet bags, 2 faded black bags.\n" +
                                        "vibrant blue bags contain 1 shiny yellow bag, 2 clear tan bags, 5 posh crimson bags.\n" +
                                        "mirrored beige bags contain 5 shiny magenta bags, 3 pale blue bags.\n" +
                                        "dark maroon bags contain 4 bright green bags, 5 faded bronze bags, 1 faded indigo bag, 3 dotted teal bags.\n" +
                                        "plaid violet bags contain 4 posh yellow bags, 3 faded cyan bags, 1 mirrored lime bag, 2 striped black bags.\n" +
                                        "wavy indigo bags contain 5 dotted aqua bags, 1 drab salmon bag, 5 bright cyan bags, 4 dotted purple bags.\n" +
                                        "dull violet bags contain 1 vibrant tomato bag, 4 plaid blue bags, 5 shiny plum bags, 2 dotted aqua bags.\n" +
                                        "dotted salmon bags contain 5 plaid gray bags.\n" +
                                        "drab salmon bags contain 4 faded yellow bags.\n" +
                                        "light maroon bags contain 5 bright cyan bags.\n" +
                                        "drab cyan bags contain 2 dark beige bags, 1 dotted purple bag, 5 dark coral bags.\n" +
                                        "faded salmon bags contain 4 clear bronze bags, 4 muted green bags, 1 faded plum bag, 4 bright silver bags.\n" +
                                        "clear turquoise bags contain 5 shiny silver bags, 5 striped maroon bags, 5 posh chartreuse bags.\n" +
                                        "clear silver bags contain 5 vibrant fuchsia bags, 5 vibrant lime bags, 5 faded red bags.\n" +
                                        "muted magenta bags contain 3 dotted teal bags, 3 wavy orange bags.\n" +
                                        "striped aqua bags contain 4 bright green bags, 2 mirrored maroon bags, 5 muted gold bags, 2 pale brown bags.\n" +
                                        "drab magenta bags contain 5 vibrant tomato bags, 1 wavy violet bag.\n" +
                                        "clear yellow bags contain 4 drab salmon bags.\n" +
                                        "striped gold bags contain 3 dull salmon bags.\n" +
                                        "posh black bags contain 2 dim black bags, 4 plaid crimson bags.\n" +
                                        "drab fuchsia bags contain 1 drab turquoise bag.\n" +
                                        "mirrored fuchsia bags contain 5 shiny cyan bags, 4 dim crimson bags, 2 drab brown bags.\n" +
                                        "pale lavender bags contain 1 shiny lavender bag, 4 mirrored fuchsia bags, 1 wavy silver bag, 1 bright black bag.\n" +
                                        "light teal bags contain 2 vibrant fuchsia bags, 4 mirrored indigo bags.\n" +
                                        "light cyan bags contain 5 mirrored cyan bags, 1 faded fuchsia bag.\n" +
                                        "wavy lavender bags contain 1 faded gray bag.\n" +
                                        "clear purple bags contain 4 light red bags, 3 shiny teal bags.\n" +
                                        "mirrored coral bags contain 2 bright tomato bags, 4 drab fuchsia bags, 4 pale salmon bags, 1 wavy teal bag.\n" +
                                        "muted crimson bags contain 2 faded lime bags, 2 wavy plum bags, 5 bright gold bags.\n" +
                                        "plaid silver bags contain 4 wavy coral bags, 3 shiny violet bags, 5 faded beige bags.\n" +
                                        "posh orange bags contain 4 dim blue bags, 4 mirrored lime bags, 1 muted chartreuse bag.\n" +
                                        "dotted olive bags contain 4 dim plum bags, 5 bright aqua bags.\n" +
                                        "vibrant black bags contain 3 dark purple bags.\n" +
                                        "dim turquoise bags contain 3 shiny coral bags, 4 dotted indigo bags, 4 muted yellow bags, 4 dull bronze bags.\n" +
                                        "light gray bags contain 1 plaid silver bag, 4 faded purple bags, 3 faded green bags.\n" +
                                        "muted white bags contain 2 faded yellow bags, 4 dark white bags, 3 drab green bags, 4 dim yellow bags.\n" +
                                        "pale gray bags contain 4 pale brown bags, 3 dotted indigo bags, 1 mirrored indigo bag, 1 bright silver bag.\n" +
                                        "dull brown bags contain 1 plaid silver bag, 2 pale bronze bags, 3 dark magenta bags, 5 posh yellow bags.\n" +
                                        "bright indigo bags contain 4 dull red bags, 5 dark yellow bags.\n" +
                                        "dotted purple bags contain 2 muted yellow bags.\n" +
                                        "bright salmon bags contain 2 vibrant orange bags, 4 vibrant bronze bags, 4 shiny coral bags, 3 drab brown bags.\n" +
                                        "shiny chartreuse bags contain 1 dotted red bag, 4 wavy lavender bags, 2 muted aqua bags.\n" +
                                        "light brown bags contain 3 dark teal bags, 3 faded lime bags, 5 bright coral bags, 5 plaid red bags.\n" +
                                        "dim orange bags contain 4 clear lime bags, 2 plaid teal bags, 4 plaid lavender bags.\n" +
                                        "wavy teal bags contain 3 drab chartreuse bags.\n" +
                                        "posh purple bags contain 4 striped salmon bags, 2 mirrored black bags.\n" +
                                        "dim cyan bags contain 5 mirrored fuchsia bags, 5 dotted bronze bags, 1 light violet bag.\n" +
                                        "clear fuchsia bags contain 3 dim yellow bags, 1 pale yellow bag.\n" +
                                        "muted fuchsia bags contain 2 mirrored beige bags, 4 dull black bags, 5 mirrored red bags.\n" +
                                        "striped bronze bags contain 3 muted violet bags, 4 dull brown bags, 4 drab silver bags, 5 dotted maroon bags.\n" +
                                        "bright silver bags contain 2 drab gray bags, 3 wavy coral bags, 4 posh yellow bags.\n" +
                                        "light tomato bags contain 1 muted green bag, 3 bright indigo bags, 1 wavy blue bag.\n" +
                                        "dark red bags contain 1 dim brown bag.\n" +
                                        "vibrant fuchsia bags contain 1 shiny gold bag.\n" +
                                        "vibrant crimson bags contain 4 dull olive bags, 1 striped orange bag.\n" +
                                        "clear lime bags contain 5 dull crimson bags.\n" +
                                        "clear lavender bags contain 2 dotted gold bags, 3 light crimson bags, 3 mirrored red bags, 2 dark purple bags.\n" +
                                        "dark silver bags contain 4 muted silver bags.\n" +
                                        "posh white bags contain 3 light maroon bags, 5 dotted brown bags, 5 light yellow bags.\n" +
                                        "dark gold bags contain 4 muted plum bags, 4 posh silver bags.\n" +
                                        "dotted cyan bags contain 4 shiny magenta bags, 3 drab red bags.\n" +
                                        "plaid chartreuse bags contain 3 posh fuchsia bags, 4 light white bags.\n" +
                                        "dim lime bags contain 2 dull green bags, 5 posh magenta bags.\n" +
                                        "shiny indigo bags contain 5 light violet bags, 3 plaid orange bags, 2 drab turquoise bags, 5 striped beige bags.\n" +
                                        "bright tan bags contain 3 dotted fuchsia bags, 1 dim yellow bag, 2 mirrored violet bags, 2 plaid silver bags.\n" +
                                        "mirrored green bags contain 2 plaid turquoise bags, 5 bright turquoise bags, 5 light lime bags, 5 plaid white bags.\n" +
                                        "light purple bags contain 2 striped silver bags.\n" +
                                        "shiny violet bags contain 4 dull yellow bags, 1 faded red bag, 3 pale lime bags, 4 drab brown bags.\n" +
                                        "pale coral bags contain 5 drab indigo bags.\n" +
                                        "faded olive bags contain 4 posh tan bags, 3 striped orange bags, 3 wavy gold bags.\n" +
                                        "wavy cyan bags contain 3 mirrored teal bags.\n" +
                                        "wavy magenta bags contain 5 bright coral bags, 2 dark black bags, 1 muted beige bag.\n" +
                                        "wavy green bags contain 2 light violet bags.\n" +
                                        "shiny purple bags contain 5 wavy orange bags, 3 striped turquoise bags.\n" +
                                        "wavy orange bags contain 2 bright turquoise bags, 3 mirrored lime bags, 5 light violet bags.\n" +
                                        "shiny crimson bags contain 5 plaid olive bags, 2 mirrored turquoise bags, 3 posh lavender bags, 4 muted bronze bags.\n" +
                                        "dark tomato bags contain 3 posh maroon bags, 5 dotted purple bags, 1 shiny violet bag, 2 drab silver bags.\n" +
                                        "clear green bags contain 1 light black bag.\n" +
                                        "clear indigo bags contain 5 vibrant crimson bags.\n" +
                                        "muted coral bags contain 2 mirrored black bags, 4 dull silver bags.\n" +
                                        "clear teal bags contain 1 posh tan bag, 3 faded plum bags, 3 wavy maroon bags, 1 mirrored lavender bag.\n" +
                                        "shiny tomato bags contain 1 clear tomato bag, 5 bright gray bags, 1 striped cyan bag, 5 vibrant lavender bags.\n" +
                                        "shiny silver bags contain 2 dim violet bags, 2 striped teal bags, 2 mirrored beige bags, 3 drab turquoise bags.\n" +
                                        "posh indigo bags contain 5 drab fuchsia bags.\n" +
                                        "dull lime bags contain 5 vibrant cyan bags, 5 vibrant chartreuse bags.\n" +
                                        "mirrored lavender bags contain 2 drab gold bags, 5 vibrant aqua bags, 1 plaid teal bag.\n" +
                                        "faded coral bags contain 2 clear tan bags, 4 faded green bags, 2 faded fuchsia bags, 3 drab brown bags.\n" +
                                        "mirrored purple bags contain 1 plaid black bag, 5 dim teal bags, 4 muted bronze bags.\n" +
                                        "bright lime bags contain 1 light lavender bag.\n" +
                                        "pale turquoise bags contain 2 striped silver bags, 2 muted tan bags, 4 vibrant lime bags, 4 faded lime bags.\n" +
                                        "posh cyan bags contain 4 bright salmon bags.\n" +
                                        "wavy bronze bags contain 1 drab olive bag, 5 plaid orange bags, 1 wavy silver bag, 2 faded bronze bags.\n" +
                                        "light tan bags contain 3 faded violet bags.\n" +
                                        "mirrored brown bags contain 2 pale lime bags, 2 dull gray bags, 5 dotted bronze bags.\n" +
                                        "posh lime bags contain 4 dotted beige bags.\n" +
                                        "drab maroon bags contain 5 wavy gray bags, 4 posh magenta bags, 2 dull gray bags.\n" +
                                        "light yellow bags contain 4 striped lime bags, 3 faded purple bags, 1 plaid silver bag, 2 muted violet bags.\n" +
                                        "vibrant silver bags contain 3 posh purple bags.\n" +
                                        "mirrored plum bags contain 1 muted salmon bag, 4 light salmon bags, 2 faded brown bags.\n" +
                                        "mirrored gray bags contain 1 wavy silver bag, 1 dotted maroon bag, 4 posh maroon bags, 3 muted blue bags.\n" +
                                        "light blue bags contain 5 striped magenta bags, 2 dim plum bags, 4 muted tomato bags.\n" +
                                        "dim violet bags contain 4 dotted maroon bags, 1 pale lime bag, 2 mirrored brown bags, 2 bright salmon bags.\n" +
                                        "dotted violet bags contain 2 dim maroon bags, 3 faded beige bags.\n" +
                                        "shiny red bags contain 1 wavy gray bag, 3 clear bronze bags.\n" +
                                        "dotted black bags contain 4 pale fuchsia bags.\n" +
                                        "mirrored gold bags contain 3 pale cyan bags, 1 dark green bag, 5 plaid white bags, 1 drab black bag.\n" +
                                        "shiny plum bags contain 1 posh crimson bag, 5 bright yellow bags, 1 dull indigo bag.\n" +
                                        "dotted brown bags contain 5 dotted black bags, 2 clear yellow bags, 1 mirrored violet bag, 4 shiny gold bags.\n" +
                                        "faded orange bags contain 3 posh indigo bags, 3 bright magenta bags, 2 light teal bags, 2 bright turquoise bags.\n" +
                                        "mirrored tomato bags contain 1 dim bronze bag, 1 bright salmon bag, 4 dark purple bags, 4 light olive bags.\n" +
                                        "dotted orange bags contain 3 faded brown bags.\n" +
                                        "dull red bags contain 1 plaid black bag.\n" +
                                        "dim purple bags contain 3 vibrant purple bags, 2 dim cyan bags, 3 clear tan bags, 5 wavy beige bags.\n" +
                                        "dull coral bags contain 5 drab chartreuse bags.\n" +
                                        "dull black bags contain 1 vibrant bronze bag.\n" +
                                        "pale crimson bags contain 4 striped brown bags.\n" +
                                        "faded green bags contain 2 shiny gold bags, 5 dim maroon bags.\n" +
                                        "shiny bronze bags contain 4 dull turquoise bags.\n" +
                                        "dotted tomato bags contain 3 clear teal bags, 2 wavy crimson bags, 4 clear tan bags.\n" +
                                        "pale purple bags contain 2 shiny aqua bags.\n" +
                                        "bright teal bags contain 2 drab salmon bags, 4 dim yellow bags, 1 drab maroon bag.\n" +
                                        "pale tomato bags contain 3 striped black bags, 2 mirrored fuchsia bags.\n" +
                                        "striped silver bags contain 1 wavy turquoise bag.\n" +
                                        "dim gold bags contain 5 dim crimson bags, 4 dim violet bags, 2 striped bronze bags.\n" +
                                        "light orange bags contain 2 mirrored turquoise bags, 5 bright crimson bags, 4 pale tan bags, 1 drab teal bag.\n" +
                                        "wavy salmon bags contain 3 plaid orange bags, 2 faded cyan bags, 3 clear purple bags, 5 dotted orange bags.\n" +
                                        "vibrant chartreuse bags contain 2 plaid red bags, 3 dull aqua bags, 1 mirrored brown bag.\n" +
                                        "striped orange bags contain 4 dim crimson bags, 2 wavy coral bags, 1 dim plum bag.\n" +
                                        "light black bags contain 2 clear bronze bags, 2 posh cyan bags, 1 vibrant fuchsia bag.\n" +
                                        "dark salmon bags contain 2 vibrant tan bags, 1 shiny chartreuse bag.\n" +
                                        "drab gold bags contain 4 dim crimson bags, 2 light violet bags, 1 vibrant orange bag.\n" +
                                        "bright bronze bags contain 3 clear green bags.\n" +
                                        "dim coral bags contain 3 dark red bags, 5 dim lavender bags.\n" +
                                        "dull orange bags contain 5 drab black bags, 1 dotted violet bag, 3 dim blue bags.\n" +
                                        "clear brown bags contain 2 dark red bags, 1 dull turquoise bag, 1 mirrored red bag, 5 wavy beige bags.\n" +
                                        "muted tan bags contain 3 dotted teal bags, 3 mirrored cyan bags, 5 faded fuchsia bags, 2 drab white bags.\n" +
                                        "faded lavender bags contain 1 muted silver bag, 1 mirrored brown bag, 3 dark tomato bags, 3 pale lime bags.\n" +
                                        "dim bronze bags contain 1 bright yellow bag.\n" +
                                        "wavy lime bags contain 4 bright aqua bags, 5 wavy silver bags.\n" +
                                        "dark black bags contain 4 dark green bags.\n" +
                                        "faded lime bags contain 1 faded lavender bag, 5 plaid gray bags, 3 posh turquoise bags, 5 faded bronze bags.\n" +
                                        "drab lime bags contain 1 light cyan bag, 4 dotted red bags.\n" +
                                        "dull olive bags contain 3 dim plum bags, 3 pale lime bags, 4 posh yellow bags, 5 shiny violet bags.\n" +
                                        "clear black bags contain 1 faded fuchsia bag, 3 posh aqua bags.\n" +
                                        "dark crimson bags contain 2 dotted beige bags.\n" +
                                        "faded cyan bags contain 5 clear blue bags.\n" +
                                        "pale tan bags contain 4 posh aqua bags, 5 dim yellow bags, 2 light chartreuse bags.\n" +
                                        "light red bags contain 3 faded fuchsia bags, 5 dotted purple bags, 2 mirrored indigo bags, 3 shiny violet bags.\n" +
                                        "muted olive bags contain 5 posh tan bags, 4 faded tan bags.\n" +
                                        "plaid yellow bags contain 4 faded coral bags.\n" +
                                        "clear tomato bags contain 3 plaid salmon bags, 2 faded lavender bags.\n" +
                                        "vibrant maroon bags contain 3 muted lime bags, 4 vibrant fuchsia bags, 4 drab yellow bags.\n" +
                                        "posh red bags contain 5 posh cyan bags, 2 faded black bags, 1 bright crimson bag, 5 wavy plum bags.\n" +
                                        "mirrored silver bags contain 5 dull aqua bags.\n" +
                                        "wavy yellow bags contain 3 faded white bags, 1 dotted fuchsia bag.\n" +
                                        "light plum bags contain 1 vibrant bronze bag, 4 vibrant green bags, 1 plaid turquoise bag, 4 posh cyan bags.\n" +
                                        "shiny lime bags contain 1 posh tomato bag, 4 mirrored cyan bags, 2 plaid white bags, 3 shiny aqua bags.\n" +
                                        "light gold bags contain 1 drab silver bag, 3 clear brown bags, 2 wavy fuchsia bags.\n" +
                                        "dotted indigo bags contain 2 plaid teal bags, 1 dull yellow bag.\n" +
                                        "bright fuchsia bags contain 3 faded teal bags, 2 faded silver bags, 3 dim red bags, 1 muted lime bag.\n" +
                                        "mirrored black bags contain 5 muted violet bags.\n" +
                                        "dark magenta bags contain 5 dim crimson bags.\n" +
                                        "shiny yellow bags contain 3 clear tan bags.\n" +
                                        "muted orange bags contain 3 striped bronze bags.\n" +
                                        "dull bronze bags contain 1 dotted gray bag, 2 clear bronze bags, 5 light turquoise bags.\n" +
                                        "mirrored blue bags contain 3 shiny coral bags.\n" +
                                        "vibrant turquoise bags contain 2 pale blue bags, 4 shiny beige bags.\n" +
                                        "pale green bags contain 1 posh crimson bag, 2 drab gold bags, 3 drab brown bags.\n" +
                                        "striped yellow bags contain 5 mirrored red bags, 4 plaid salmon bags, 4 muted salmon bags, 5 faded tan bags.\n" +
                                        "faded tomato bags contain 5 clear blue bags.\n" +
                                        "faded teal bags contain 2 posh teal bags, 3 light violet bags, 5 dotted olive bags, 3 shiny teal bags.\n" +
                                        "clear blue bags contain 3 dull yellow bags, 3 light violet bags, 2 wavy coral bags, 4 shiny cyan bags.\n" +
                                        "dotted blue bags contain 5 muted coral bags, 4 muted salmon bags.\n" +
                                        "shiny lavender bags contain 2 dotted crimson bags, 4 light lime bags, 1 posh cyan bag.\n" +
                                        "mirrored magenta bags contain 3 mirrored fuchsia bags, 3 clear teal bags, 4 muted fuchsia bags.\n" +
                                        "faded yellow bags contain 1 dim crimson bag, 3 dull cyan bags.\n" +
                                        "muted teal bags contain 3 dull red bags.\n" +
                                        "light lavender bags contain 4 striped orange bags, 2 mirrored beige bags.\n" +
                                        "posh chartreuse bags contain 2 dark purple bags.\n" +
                                        "pale beige bags contain 4 pale silver bags, 2 striped crimson bags.\n" +
                                        "pale lime bags contain no other bags.\n" +
                                        "faded blue bags contain 1 mirrored red bag, 3 drab cyan bags, 3 dull yellow bags, 5 plaid plum bags.\n" +
                                        "dull maroon bags contain 5 light blue bags, 3 dull crimson bags, 3 clear yellow bags.\n" +
                                        "dim plum bags contain no other bags.\n" +
                                        "drab beige bags contain 5 light black bags, 1 striped teal bag, 4 mirrored violet bags.\n" +
                                        "pale orange bags contain 4 clear chartreuse bags.\n" +
                                        "dotted beige bags contain 4 dark yellow bags, 3 light black bags, 5 bright aqua bags.\n" +
                                        "plaid salmon bags contain 3 posh silver bags, 2 wavy violet bags, 3 striped tan bags.\n" +
                                        "clear gray bags contain 4 wavy purple bags.\n" +
                                        "drab coral bags contain 2 faded silver bags, 3 light fuchsia bags, 2 dull indigo bags, 3 drab cyan bags.\n" +
                                        "dark yellow bags contain 2 mirrored fuchsia bags.\n" +
                                        "posh turquoise bags contain 2 dim lavender bags, 1 muted yellow bag, 4 bright plum bags.\n" +
                                        "bright tomato bags contain 5 striped orange bags, 3 bright turquoise bags, 3 dull yellow bags.\n" +
                                        "drab silver bags contain 2 light turquoise bags, 3 mirrored indigo bags, 4 vibrant orange bags.\n" +
                                        "clear cyan bags contain 4 muted cyan bags, 2 faded silver bags, 3 faded yellow bags, 4 faded crimson bags.\n" +
                                        "mirrored orange bags contain 3 dark green bags, 5 drab salmon bags, 4 posh gray bags.\n" +
                                        "muted gray bags contain 2 mirrored lime bags.\n" +
                                        "pale brown bags contain 4 dull gray bags.\n" +
                                        "wavy silver bags contain 5 faded red bags, 5 muted silver bags.\n" +
                                        "dull blue bags contain 1 dotted olive bag, 4 muted violet bags.\n" +
                                        "dull magenta bags contain 4 muted silver bags, 4 posh salmon bags, 4 plaid tomato bags.\n" +
                                        "dark cyan bags contain 5 shiny purple bags, 3 vibrant coral bags, 1 posh green bag, 2 dull cyan bags.\n" +
                                        "shiny turquoise bags contain 3 pale white bags, 5 dotted black bags.\n" +
                                        "dark green bags contain 4 dim maroon bags.\n" +
                                        "posh magenta bags contain 2 pale brown bags.\n" +
                                        "dull salmon bags contain 5 posh magenta bags, 5 dotted indigo bags, 4 drab orange bags, 5 mirrored gray bags.\n" +
                                        "dull gray bags contain 5 wavy coral bags, 5 vibrant tan bags, 5 mirrored olive bags.\n" +
                                        "dull turquoise bags contain 3 clear black bags, 5 striped indigo bags, 3 shiny white bags, 2 faded fuchsia bags.\n" +
                                        "striped violet bags contain 2 faded white bags.\n" +
                                        "muted brown bags contain 2 dim cyan bags, 4 drab black bags, 5 clear bronze bags, 1 shiny green bag.\n" +
                                        "drab plum bags contain 2 dark teal bags, 5 plaid lavender bags, 4 mirrored blue bags.\n" +
                                        "striped green bags contain 1 mirrored olive bag, 3 clear green bags, 3 dim yellow bags, 3 muted red bags.\n" +
                                        "bright white bags contain 5 shiny coral bags, 5 faded fuchsia bags.\n" +
                                        "vibrant tan bags contain no other bags.\n" +
                                        "faded white bags contain 4 pale crimson bags, 1 plaid green bag, 5 faded bronze bags.\n" +
                                        "clear orange bags contain 3 bright cyan bags, 4 dotted green bags, 3 faded purple bags, 3 faded black bags.\n" +
                                        "drab chartreuse bags contain 5 wavy gray bags, 4 muted turquoise bags.\n" +
                                        "mirrored aqua bags contain 2 bright crimson bags, 4 mirrored magenta bags, 3 clear teal bags.\n" +
                                        "wavy crimson bags contain 5 posh yellow bags, 3 clear blue bags, 1 striped lime bag, 2 faded cyan bags.\n" +
                                        "shiny black bags contain 4 dim cyan bags, 3 striped beige bags, 3 posh beige bags, 4 bright gold bags.\n" +
                                        "wavy brown bags contain 2 wavy coral bags, 3 shiny yellow bags.\n" +
                                        "pale plum bags contain 3 drab olive bags, 1 light turquoise bag.\n" +
                                        "drab green bags contain 1 mirrored orange bag, 5 dark turquoise bags, 5 posh chartreuse bags, 2 pale magenta bags.\n" +
                                        "drab teal bags contain 5 faded silver bags, 4 striped brown bags, 4 drab purple bags.\n" +
                                        "dull gold bags contain 1 dark orange bag, 4 faded lime bags.\n" +
                                        "posh gray bags contain 1 posh cyan bag, 2 plaid crimson bags, 1 plaid olive bag, 2 bright yellow bags.\n" +
                                        "dim red bags contain 3 posh chartreuse bags, 4 drab white bags, 2 bright green bags, 4 drab yellow bags.\n" +
                                        "dull chartreuse bags contain 1 drab fuchsia bag, 2 dull crimson bags, 4 light coral bags.\n" +
                                        "plaid magenta bags contain 1 mirrored silver bag.\n" +
                                        "drab crimson bags contain 3 faded tan bags.\n" +
                                        "faded bronze bags contain 4 dim plum bags, 4 faded fuchsia bags, 4 bright aqua bags, 2 vibrant orange bags.\n" +
                                        "plaid gray bags contain 3 light fuchsia bags, 1 dotted turquoise bag.\n" +
                                        "vibrant bronze bags contain 1 wavy green bag, 2 muted yellow bags.\n" +
                                        "clear maroon bags contain 3 dim plum bags, 4 light red bags, 5 wavy silver bags.\n" +
                                        "drab blue bags contain 1 plaid gray bag, 5 mirrored gray bags, 5 shiny magenta bags.\n" +
                                        "posh bronze bags contain 3 muted crimson bags, 5 wavy gray bags.\n" +
                                        "dim black bags contain 1 bright green bag, 3 dim maroon bags, 4 mirrored cyan bags, 4 faded black bags.\n" +
                                        "vibrant green bags contain 4 vibrant blue bags, 4 wavy gold bags, 5 vibrant fuchsia bags, 3 muted yellow bags.\n" +
                                        "dim teal bags contain 5 faded fuchsia bags, 3 striped lavender bags, 2 pale lime bags, 4 clear maroon bags.\n" +
                                        "posh silver bags contain 2 shiny magenta bags.\n" +
                                        "plaid blue bags contain 2 pale brown bags, 4 drab brown bags, 2 drab plum bags, 1 wavy maroon bag.\n" +
                                        "dim fuchsia bags contain 3 dark purple bags, 4 shiny red bags, 1 clear chartreuse bag, 2 pale gold bags.\n" +
                                        "muted turquoise bags contain 4 striped maroon bags, 1 dim lavender bag, 2 clear beige bags, 3 wavy maroon bags.\n" +
                                        "shiny beige bags contain 4 shiny red bags, 1 vibrant bronze bag, 5 plaid chartreuse bags, 3 mirrored teal bags.\n" +
                                        "muted blue bags contain 3 pale lime bags, 4 dim crimson bags.\n" +
                                        "faded black bags contain 4 striped beige bags, 4 muted blue bags.\n" +
                                        "muted plum bags contain 5 drab white bags, 2 dull cyan bags, 1 light gray bag.\n" +
                                        "dark tan bags contain 2 light aqua bags.\n" +
                                        "clear white bags contain 5 dotted plum bags.\n" +
                                        "dotted aqua bags contain 4 posh turquoise bags, 5 bright aqua bags.\n" +
                                        "posh gold bags contain 5 pale crimson bags, 4 light fuchsia bags, 4 plaid turquoise bags.\n" +
                                        "bright turquoise bags contain 3 mirrored brown bags, 2 dotted black bags, 3 dull indigo bags, 4 plaid white bags.\n" +
                                        "light white bags contain 5 mirrored brown bags, 2 dim magenta bags.\n" +
                                        "posh crimson bags contain 1 bright green bag, 3 posh yellow bags, 4 posh turquoise bags, 4 vibrant aqua bags.\n" +
                                        "muted silver bags contain 1 dotted purple bag, 2 posh yellow bags, 5 mirrored indigo bags, 4 shiny violet bags.\n" +
                                        "pale indigo bags contain 2 mirrored aqua bags, 1 vibrant tomato bag, 5 striped violet bags, 2 shiny white bags.\n" +
                                        "vibrant aqua bags contain 5 pale bronze bags, 5 posh yellow bags, 2 dull cyan bags, 2 bright silver bags.\n" +
                                        "posh brown bags contain 2 bright green bags, 4 mirrored fuchsia bags, 4 dotted salmon bags.\n" +
                                        "shiny orange bags contain 2 faded lavender bags, 3 dull yellow bags.\n" +
                                        "shiny fuchsia bags contain 2 striped teal bags.\n" +
                                        "dark lavender bags contain 4 mirrored teal bags, 5 plaid gray bags.\n" +
                                        "vibrant teal bags contain 3 drab orange bags, 1 plaid red bag, 4 clear cyan bags.\n" +
                                        "dotted lavender bags contain 5 pale gray bags.\n" +
                                        "plaid lime bags contain 5 bright maroon bags, 2 dim tomato bags, 2 mirrored teal bags.\n" +
                                        "dim white bags contain 3 plaid turquoise bags, 2 faded red bags, 5 striped orange bags.\n" +
                                        "shiny coral bags contain 2 posh turquoise bags.\n" +
                                        "posh coral bags contain 4 bright salmon bags, 4 dim coral bags, 1 pale fuchsia bag.\n" +
                                        "drab aqua bags contain 1 vibrant maroon bag, 4 muted green bags, 5 muted red bags.\n" +
                                        "dim crimson bags contain no other bags.\n" +
                                        "vibrant purple bags contain 5 dark teal bags, 3 muted crimson bags.\n" +
                                        "dull fuchsia bags contain 5 dull aqua bags, 3 clear silver bags.\n" +
                                        "dotted green bags contain 3 dull tomato bags, 3 drab black bags, 5 dim red bags.\n" +
                                        "muted green bags contain 4 light cyan bags, 2 light red bags, 3 posh turquoise bags, 3 dark orange bags.\n" +
                                        "wavy aqua bags contain 4 faded white bags, 5 dim brown bags, 2 plaid salmon bags.\n" +
                                        "light magenta bags contain 4 dotted black bags, 3 posh blue bags, 2 bright coral bags.\n" +
                                        "light aqua bags contain 1 light yellow bag, 1 plaid gray bag, 1 vibrant cyan bag, 4 dotted aqua bags.\n" +
                                        "dark purple bags contain 2 plaid silver bags, 2 muted gray bags, 1 clear maroon bag.\n" +
                                        "wavy violet bags contain 4 plaid white bags, 5 dull red bags.\n" +
                                        "faded plum bags contain 5 posh beige bags, 2 light turquoise bags, 5 vibrant orange bags.\n" +
                                        "dull beige bags contain 2 dark blue bags, 2 shiny green bags.\n" +
                                        "clear crimson bags contain 1 vibrant salmon bag.\n" +
                                        "drab violet bags contain 4 faded purple bags, 4 plaid turquoise bags.\n" +
                                        "dull white bags contain 4 striped brown bags, 5 wavy black bags.\n" +
                                        "dark teal bags contain 3 faded fuchsia bags, 2 dotted maroon bags, 4 plaid orange bags.\n" +
                                        "dark blue bags contain 3 shiny bronze bags, 4 bright yellow bags, 1 vibrant bronze bag, 5 dull blue bags.\n" +
                                        "vibrant salmon bags contain 4 drab aqua bags.\n" +
                                        "plaid coral bags contain 2 drab salmon bags.\n" +
                                        "vibrant gray bags contain 3 dark purple bags, 3 vibrant green bags, 2 clear teal bags.\n" +
                                        "clear gold bags contain 3 mirrored green bags, 4 plaid gray bags, 1 bright gray bag.\n" +
                                        "posh salmon bags contain 2 shiny bronze bags, 3 faded coral bags, 3 mirrored chartreuse bags, 3 vibrant green bags.\n" +
                                        "wavy red bags contain 1 posh brown bag.\n" +
                                        "faded red bags contain 5 dim lavender bags, 4 bright plum bags, 4 striped orange bags.\n" +
                                        "striped lavender bags contain 4 dull black bags, 4 dark crimson bags, 1 posh turquoise bag, 4 light beige bags.\n" +
                                        "dull tomato bags contain 2 wavy silver bags, 3 muted yellow bags, 3 wavy maroon bags, 2 dotted black bags.\n" +
                                        "shiny salmon bags contain 1 wavy turquoise bag, 4 dull green bags, 5 dull aqua bags.\n" +
                                        "pale yellow bags contain 1 dull gray bag.\n" +
                                        "clear olive bags contain 1 posh crimson bag, 4 pale crimson bags.\n" +
                                        "clear coral bags contain 4 dark orange bags, 4 dim crimson bags.\n" +
                                        "dark bronze bags contain 4 mirrored silver bags, 3 light plum bags.\n" +
                                        "bright aqua bags contain 1 vibrant tan bag, 3 clear blue bags, 2 shiny violet bags.\n" +
                                        "striped blue bags contain 5 muted tomato bags, 5 muted magenta bags, 5 drab white bags, 3 pale crimson bags.\n" +
                                        "dim lavender bags contain 2 posh yellow bags.\n" +
                                        "dim green bags contain 2 mirrored chartreuse bags, 5 plaid orange bags.\n" +
                                        "plaid maroon bags contain 1 dark magenta bag, 1 posh beige bag, 5 drab plum bags, 5 bright aqua bags.\n" +
                                        "pale maroon bags contain 1 clear bronze bag, 1 plaid blue bag.\n" +
                                        "clear salmon bags contain 1 dark coral bag.\n" +
                                        "shiny magenta bags contain 3 vibrant aqua bags, 3 dim maroon bags.\n" +
                                        "mirrored yellow bags contain 4 wavy black bags, 4 pale gray bags, 4 mirrored magenta bags.\n" +
                                        "shiny green bags contain 3 striped lime bags, 2 posh yellow bags.\n" +
                                        "dim aqua bags contain 4 dotted aqua bags.\n" +
                                        "mirrored olive bags contain 1 muted blue bag, 5 vibrant tan bags, 5 posh yellow bags.\n" +
                                        "mirrored violet bags contain 1 plaid orange bag, 4 drab salmon bags.\n" +
                                        "pale chartreuse bags contain 2 muted tomato bags, 3 faded indigo bags.\n" +
                                        "striped maroon bags contain 4 shiny lime bags.\n" +
                                        "muted indigo bags contain 4 dim magenta bags, 3 muted orange bags, 2 dim beige bags, 4 vibrant purple bags.\n" +
                                        "dim maroon bags contain 2 pale bronze bags, 4 bright aqua bags.\n" +
                                        "pale teal bags contain 5 dark gray bags, 2 dark tomato bags, 1 dull red bag.\n" +
                                        "posh aqua bags contain 3 mirrored lavender bags.\n" +
                                        "vibrant lime bags contain 2 wavy silver bags.\n" +
                                        "dark turquoise bags contain 2 wavy black bags.\n" +
                                        "vibrant gold bags contain 2 striped brown bags, 2 faded indigo bags.\n" +
                                        "faded maroon bags contain 4 mirrored tan bags, 3 posh beige bags, 5 posh orange bags.\n" +
                                        "faded fuchsia bags contain 1 bright salmon bag.\n" +
                                        "light fuchsia bags contain 2 dull black bags.\n" +
                                        "striped coral bags contain 1 dull green bag, 2 muted beige bags, 2 bright coral bags, 5 wavy orange bags.\n" +
                                        "bright brown bags contain 4 plaid gold bags.\n" +
                                        "plaid olive bags contain 2 dim coral bags.\n" +
                                        "dull yellow bags contain 3 drab brown bags.\n" +
                                        "posh tomato bags contain 3 dotted purple bags.\n" +
                                        "clear magenta bags contain 1 mirrored brown bag, 5 dotted plum bags, 1 light coral bag, 2 drab maroon bags.\n" +
                                        "faded indigo bags contain 1 drab gold bag.\n" +
                                        "plaid white bags contain 5 mirrored fuchsia bags.\n" +
                                        "bright green bags contain 1 posh beige bag, 5 dark green bags, 4 dull aqua bags.\n" +
                                        "bright gray bags contain 3 light lavender bags.\n" +
                                        "posh violet bags contain 2 vibrant tan bags, 5 pale magenta bags, 3 posh white bags, 5 mirrored gray bags.\n" +
                                        "dull teal bags contain 1 dull brown bag, 2 drab gray bags, 2 shiny cyan bags, 1 mirrored lavender bag.\n" +
                                        "shiny cyan bags contain 1 bright plum bag, 1 shiny violet bag.\n" +
                                        "posh plum bags contain 4 drab brown bags, 4 mirrored olive bags, 4 dim maroon bags, 4 striped orange bags.\n" +
                                        "plaid fuchsia bags contain 5 drab blue bags.\n" +
                                        "dull green bags contain 1 mirrored red bag, 1 bright turquoise bag, 2 dark beige bags.\n" +
                                        "bright chartreuse bags contain 5 dim white bags, 2 faded red bags.\n" +
                                        "faded beige bags contain 5 posh turquoise bags, 5 vibrant tan bags, 2 posh yellow bags, 4 mirrored indigo bags.\n" +
                                        "dim chartreuse bags contain 1 posh magenta bag, 2 dotted crimson bags, 5 clear black bags, 4 striped olive bags.\n" +
                                        "drab indigo bags contain 5 striped orange bags, 1 pale chartreuse bag, 2 mirrored indigo bags, 4 clear purple bags.\n" +
                                        "light bronze bags contain 4 muted red bags.\n" +
                                        "shiny teal bags contain 3 faded beige bags, 2 striped beige bags, 2 mirrored olive bags, 5 plaid white bags.\n" +
                                        "shiny white bags contain 2 wavy silver bags, 3 plaid turquoise bags, 1 dim plum bag, 4 posh plum bags.\n" +
                                        "pale silver bags contain 2 pale cyan bags, 5 muted teal bags, 5 plaid turquoise bags, 2 clear coral bags.\n" +
                                        "dim yellow bags contain 2 vibrant tomato bags, 3 bright salmon bags, 4 dull gray bags.\n" +
                                        "mirrored indigo bags contain 5 posh yellow bags, 5 faded red bags.\n" +
                                        "clear bronze bags contain 1 posh turquoise bag, 3 faded black bags, 3 shiny coral bags.\n" +
                                        "mirrored turquoise bags contain 2 mirrored teal bags, 4 striped black bags, 4 dull teal bags, 4 clear black bags.\n" +
                                        "mirrored red bags contain 3 clear purple bags, 5 light red bags, 5 mirrored beige bags.\n" +
                                        "bright olive bags contain 3 vibrant plum bags.\n" +
                                        "drab white bags contain 4 dim lavender bags.\n" +
                                        "clear red bags contain 5 dark gray bags, 1 shiny green bag, 2 striped brown bags, 3 plaid olive bags.\n" +
                                        "vibrant red bags contain 2 dull bronze bags, 2 dotted magenta bags, 5 dark red bags, 1 drab magenta bag.\n" +
                                        "striped crimson bags contain 4 dull silver bags, 4 dark gray bags, 4 light red bags, 2 posh chartreuse bags.\n" +
                                        "dotted tan bags contain 4 shiny lime bags.\n" +
                                        "plaid orange bags contain 1 wavy maroon bag, 2 drab brown bags, 5 dull black bags.\n" +
                                        "clear plum bags contain 2 muted yellow bags, 5 faded turquoise bags, 1 faded beige bag, 1 dull aqua bag.\n" +
                                        "mirrored bronze bags contain 5 posh magenta bags.\n" +
                                        "mirrored cyan bags contain 4 striped orange bags, 3 wavy gray bags, 1 mirrored olive bag, 2 dim lavender bags.\n" +
                                        "striped white bags contain 4 striped aqua bags.\n" +
                                        "bright red bags contain 4 dotted gray bags, 4 dark green bags, 4 shiny aqua bags, 4 shiny indigo bags.\n" +
                                        "dim blue bags contain 1 dull black bag, 4 dotted turquoise bags.\n" +
                                        "dotted bronze bags contain 5 mirrored indigo bags, 4 wavy coral bags.\n" +
                                        "muted gold bags contain 4 wavy plum bags.\n" +
                                        "clear aqua bags contain 2 clear teal bags, 4 mirrored crimson bags, 1 dull silver bag, 3 bright crimson bags.\n" +
                                        "dim brown bags contain 3 clear green bags, 5 bright cyan bags.\n" +
                                        "bright plum bags contain 3 striped orange bags, 2 pale lime bags.\n" +
                                        "bright blue bags contain 1 shiny violet bag, 4 wavy gold bags.\n" +
                                        "bright maroon bags contain 1 striped indigo bag, 3 striped beige bags, 1 shiny teal bag.\n" +
                                        "pale cyan bags contain 1 dull gray bag, 2 mirrored lime bags.\n" +
                                        "wavy chartreuse bags contain 5 dark red bags, 5 plaid fuchsia bags, 2 dim salmon bags.\n" +
                                        "dull cyan bags contain 2 dim lavender bags, 3 dull yellow bags, 5 dim crimson bags, 5 dull gray bags.\n" +
                                        "shiny brown bags contain 3 wavy aqua bags, 2 faded lime bags.\n" +
                                        "dim tan bags contain 5 pale orange bags, 2 mirrored blue bags.\n" +
                                        "drab purple bags contain 1 vibrant bronze bag, 4 pale magenta bags.\n" +
                                        "wavy fuchsia bags contain 3 bright aqua bags, 2 dim lavender bags, 4 pale lime bags.\n" +
                                        "mirrored teal bags contain 4 dull yellow bags, 2 faded black bags, 3 pale blue bags, 5 wavy coral bags.\n" +
                                        "plaid brown bags contain 4 posh chartreuse bags, 2 dark beige bags.\n" +
                                        "plaid tan bags contain 3 pale turquoise bags, 3 dark teal bags.\n" +
                                        "posh tan bags contain 2 faded yellow bags, 3 dim tomato bags, 1 dotted olive bag, 1 light violet bag.\n" +
                                        "plaid plum bags contain 5 muted yellow bags, 2 dim crimson bags.\n" +
                                        "plaid purple bags contain 2 posh magenta bags.\n" +
                                        "wavy gold bags contain 2 shiny teal bags, 2 mirrored lime bags.\n" +
                                        "striped tomato bags contain 5 shiny maroon bags, 3 mirrored lime bags.\n" +
                                        "vibrant lavender bags contain 1 bright turquoise bag.\n" +
                                        "muted violet bags contain 2 dull tomato bags, 4 mirrored lavender bags.\n" +
                                        "light crimson bags contain 4 drab violet bags.\n" +
                                        "bright crimson bags contain 3 drab silver bags.\n" +
                                        "muted purple bags contain 3 dim aqua bags.\n" +
                                        "posh lavender bags contain 4 mirrored magenta bags.\n" +
                                        "posh olive bags contain 2 bright salmon bags, 2 faded violet bags, 2 wavy indigo bags, 2 vibrant yellow bags.\n" +
                                        "muted aqua bags contain 4 bright red bags, 3 vibrant crimson bags, 3 dotted red bags.\n" +
                                        "shiny aqua bags contain 2 mirrored lavender bags.\n" +
                                        "bright yellow bags contain 2 muted gray bags, 4 plaid turquoise bags, 1 dull yellow bag, 5 wavy green bags.\n" +
                                        "light chartreuse bags contain 5 vibrant bronze bags, 5 posh magenta bags, 2 dotted salmon bags, 3 plaid red bags.\n" +
                                        "striped fuchsia bags contain 4 dull plum bags, 5 mirrored silver bags.\n" +
                                        "dull lavender bags contain 4 mirrored lavender bags, 2 plaid crimson bags, 4 dotted turquoise bags, 2 drab purple bags.\n" +
                                        "mirrored lime bags contain 2 pale lime bags, 4 light turquoise bags, 5 bright plum bags.\n" +
                                        "wavy turquoise bags contain 1 pale bronze bag.\n" +
                                        "pale magenta bags contain 2 dull teal bags, 2 muted red bags.\n" +
                                        "dotted plum bags contain 5 light red bags.\n" +
                                        "drab bronze bags contain 5 muted blue bags, 1 faded teal bag, 3 faded yellow bags.\n" +
                                        "plaid teal bags contain 4 wavy maroon bags, 5 pale brown bags.\n" +
                                        "plaid indigo bags contain 5 light olive bags, 4 clear salmon bags, 1 wavy lime bag, 4 drab black bags.\n" +
                                        "shiny blue bags contain 3 bright turquoise bags, 3 mirrored red bags, 1 pale brown bag, 2 dark violet bags.\n" +
                                        "striped turquoise bags contain 4 pale tomato bags, 1 light turquoise bag.\n" +
                                        "mirrored white bags contain 4 dim chartreuse bags.\n" +
                                        "dark fuchsia bags contain 2 dotted lavender bags, 5 pale gray bags, 5 light crimson bags, 5 shiny lavender bags.\n" +
                                        "posh blue bags contain 5 dark orange bags.\n" +
                                        "shiny tan bags contain 5 bright magenta bags, 2 clear beige bags, 1 pale lime bag.\n" +
                                        "dark lime bags contain 1 shiny magenta bag, 2 muted cyan bags.\n" +
                                        "bright magenta bags contain 3 clear blue bags, 3 wavy indigo bags.\n" +
                                        "dotted crimson bags contain 2 wavy turquoise bags.\n" +
                                        "dotted maroon bags contain 5 dark green bags, 1 striped lime bag, 1 dotted black bag, 5 striped beige bags.\n" +
                                        "dark brown bags contain 3 pale white bags.\n" +
                                        "vibrant coral bags contain 5 plaid olive bags, 5 dim maroon bags.\n" +
                                        "posh teal bags contain 5 shiny white bags.\n" +
                                        "plaid crimson bags contain 1 dark coral bag, 2 dotted beige bags, 1 dotted gray bag.\n" +
                                        "mirrored salmon bags contain 1 plaid lavender bag, 2 striped orange bags, 4 clear purple bags.\n" +
                                        "vibrant orange bags contain no other bags.\n" +
                                        "vibrant plum bags contain 1 pale red bag, 2 drab plum bags.\n" +
                                        "dim gray bags contain 5 dull salmon bags.\n" +
                                        "shiny maroon bags contain 3 dim plum bags, 4 pale black bags, 3 dark red bags, 4 light maroon bags.\n" +
                                        "muted tomato bags contain 1 pale bronze bag, 3 dim crimson bags, 3 striped beige bags, 3 muted yellow bags.\n" +
                                        "dotted white bags contain 5 striped red bags.\n" +
                                        "wavy plum bags contain 2 dull indigo bags, 3 plaid turquoise bags, 1 dull silver bag, 5 clear tan bags.\n" +
                                        "light violet bags contain 3 dim crimson bags, 2 drab brown bags.\n" +
                                        "muted salmon bags contain 2 clear yellow bags, 3 faded plum bags.\n" +
                                        "plaid turquoise bags contain 4 faded yellow bags.\n" +
                                        "pale bronze bags contain 2 dim plum bags, 1 posh maroon bag, 4 dim lavender bags.\n" +
                                        "clear chartreuse bags contain 1 clear salmon bag, 4 faded purple bags, 5 mirrored tan bags.\n" +
                                        "bright purple bags contain 5 clear salmon bags, 5 shiny red bags, 5 dotted aqua bags, 1 wavy plum bag.\n" +
                                        "faded gold bags contain 2 faded indigo bags.\n" +
                                        "striped brown bags contain 1 posh magenta bag, 2 dull olive bags, 3 dotted purple bags, 1 dark beige bag.\n" +
                                        "faded gray bags contain 3 shiny green bags.\n" +
                                        "wavy purple bags contain 2 dark beige bags, 2 dotted bronze bags.\n" +
                                        "striped olive bags contain 1 clear tan bag, 2 dim salmon bags, 2 dotted gold bags.\n" +
                                        "dull crimson bags contain 2 drab red bags.\n" +
                                        "dark plum bags contain 1 dark blue bag, 2 light yellow bags, 2 striped silver bags.\n" +
                                        "faded violet bags contain 4 dotted gray bags, 5 muted blue bags.\n" +
                                        "plaid black bags contain 2 posh aqua bags, 5 plaid orange bags.\n" +
                                        "light green bags contain 4 muted silver bags, 2 muted tomato bags, 3 mirrored teal bags.;";
}