package DayOne;

import java.util.Arrays;

public class DayOne {

    private int[] values;

    public DayOne(String input) {
        values = Arrays.stream(input.split("\n"))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();
    }

    public int partOne() {
        for(int x = 0; x < values.length; x++) {
            int valueOne = values[x];
            for(int y = x + 1; y < values.length; y++) {
                int valueTwo = values[y];
                if(valueOne + valueTwo == 2020) {
                    return valueOne * valueTwo;
                }
            }
        }
        return 0;
    }

    public int partTwo() {
        for(int x = 0; x < values.length; x++) {
            int valueOne = values[x];
            for(int y = x + 1; y < values.length; y++) {
                int valueTwo = values[y];
                for(int z = 0; z < values.length; z++) {
                   int valueThree = values[z];
                   if(valueOne + valueTwo + valueThree == 2020) {
                       return valueOne * valueTwo * valueThree;
                   }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        DayOne dayOne = new DayOne(input);
        int result =  dayOne.partOne();
        System.out.printf("Part one: %d", result);
        result =  dayOne.partTwo();
        System.out.printf("\nPart two: %d", result);
    }

    private static final String input = "1826\n" +
                                        "1895\n" +
                                        "1427\n" +
                                        "1931\n" +
                                        "1651\n" +
                                        "1638\n" +
                                        "1507\n" +
                                        "1999\n" +
                                        "1886\n" +
                                        "1824\n" +
                                        "1902\n" +
                                        "1995\n" +
                                        "1945\n" +
                                        "1735\n" +
                                        "1823\n" +
                                        "1595\n" +
                                        "1936\n" +
                                        "1476\n" +
                                        "2010\n" +
                                        "1833\n" +
                                        "1932\n" +
                                        "1772\n" +
                                        "1791\n" +
                                        "1814\n" +
                                        "1783\n" +
                                        "1957\n" +
                                        "1901\n" +
                                        "1600\n" +
                                        "1502\n" +
                                        "1521\n" +
                                        "1812\n" +
                                        "1974\n" +
                                        "1880\n" +
                                        "1790\n" +
                                        "1672\n" +
                                        "1541\n" +
                                        "1807\n" +
                                        "426\n" +
                                        "1858\n" +
                                        "1699\n" +
                                        "1964\n" +
                                        "1996\n" +
                                        "1983\n" +
                                        "1498\n" +
                                        "1863\n" +
                                        "1976\n" +
                                        "1492\n" +
                                        "1930\n" +
                                        "1838\n" +
                                        "1941\n" +
                                        "1764\n" +
                                        "1929\n" +
                                        "1897\n" +
                                        "2009\n" +
                                        "1853\n" +
                                        "1753\n" +
                                        "1759\n" +
                                        "1860\n" +
                                        "1952\n" +
                                        "1988\n" +
                                        "1727\n" +
                                        "1751\n" +
                                        "1943\n" +
                                        "1830\n" +
                                        "1645\n" +
                                        "1907\n" +
                                        "1857\n" +
                                        "1714\n" +
                                        "1798\n" +
                                        "1944\n" +
                                        "1868\n" +
                                        "1630\n" +
                                        "959\n" +
                                        "2003\n" +
                                        "1987\n" +
                                        "1890\n" +
                                        "1962\n" +
                                        "1928\n" +
                                        "1872\n" +
                                        "1912\n" +
                                        "1709\n" +
                                        "1809\n" +
                                        "1650\n" +
                                        "1980\n" +
                                        "1737\n" +
                                        "1898\n" +
                                        "1817\n" +
                                        "1736\n" +
                                        "1991\n" +
                                        "1788\n" +
                                        "1776\n" +
                                        "1845\n" +
                                        "1854\n" +
                                        "1963\n" +
                                        "1554\n" +
                                        "1949\n" +
                                        "1576\n" +
                                        "1819\n" +
                                        "1960\n" +
                                        "699\n" +
                                        "1990\n" +
                                        "1757\n" +
                                        "1698\n" +
                                        "1596\n" +
                                        "304\n" +
                                        "1982\n" +
                                        "1477\n" +
                                        "1961\n" +
                                        "1636\n" +
                                        "1619\n" +
                                        "1946\n" +
                                        "1876\n" +
                                        "1592\n" +
                                        "1848\n" +
                                        "1707\n" +
                                        "1958\n" +
                                        "1874\n" +
                                        "1867\n" +
                                        "52\n" +
                                        "1881\n" +
                                        "1665\n" +
                                        "1463\n" +
                                        "1799\n" +
                                        "1979\n" +
                                        "677\n" +
                                        "1710\n" +
                                        "1869\n" +
                                        "1639\n" +
                                        "1787\n" +
                                        "1633\n" +
                                        "1956\n" +
                                        "1457\n" +
                                        "1581\n" +
                                        "2005\n" +
                                        "1782\n" +
                                        "1904\n" +
                                        "1910\n" +
                                        "62\n" +
                                        "1593\n" +
                                        "1695\n" +
                                        "1915\n" +
                                        "1922\n" +
                                        "1797\n" +
                                        "1715\n" +
                                        "1981\n" +
                                        "1925\n" +
                                        "1893\n" +
                                        "1562\n" +
                                        "1789\n" +
                                        "2008\n" +
                                        "1939\n" +
                                        "1669\n" +
                                        "1992\n" +
                                        "1652\n" +
                                        "117\n" +
                                        "1609\n" +
                                        "1686\n" +
                                        "1953\n" +
                                        "2007\n" +
                                        "599\n" +
                                        "1547\n" +
                                        "1959\n" +
                                        "1691\n" +
                                        "1520\n" +
                                        "1444\n" +
                                        "1641\n" +
                                        "887\n" +
                                        "1579\n" +
                                        "1778\n" +
                                        "1977\n" +
                                        "1768\n" +
                                        "1942\n" +
                                        "1713\n" +
                                        "1603\n" +
                                        "1926\n" +
                                        "1855\n" +
                                        "1655\n" +
                                        "1673\n" +
                                        "1887\n" +
                                        "1994\n" +
                                        "1839\n" +
                                        "1725\n" +
                                        "928\n" +
                                        "1771\n" +
                                        "1761\n" +
                                        "1971\n" +
                                        "1571\n" +
                                        "1806\n" +
                                        "1821\n" +
                                        "1624\n" +
                                        "1701\n" +
                                        "1436\n" +
                                        "1748\n" +
                                        "1921\n" +
                                        "1617\n" +
                                        "2004\n" +
                                        "1792\n" +
                                        "1732\n" +
                                        "1740\n" +
                                        "1831";
}
