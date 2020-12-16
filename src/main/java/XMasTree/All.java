package XMasTree;

import DayEight.DayEight;
import DayFive.DayFive;
import DayFour.DayFour;
import DayNine.DayNine;
import DayOne.DayOne;
import DaySeven.DaySeven;
import DaySix.DaySix;
import DayTen.DayTen;
import DayThree.DayThree;
import DayTwo.DayTwo;

public class All {

    public static void main(String... args) {
        DayOne dayOne = new DayOne(inputDayOne);
        System.out.printf("Day one part one: %d\n", dayOne.partOne());
        System.out.printf("Day one part two: %d\n", dayOne.partTwo());
        DayTwo dayTwo = new DayTwo(inputDayTwo);
        System.out.printf("Day two part one: %d\n", dayTwo.partOne());
        System.out.printf("Day two part two: %d\n", dayTwo.partTwo());
        DayThree dayThree = new DayThree();
        System.out.printf("Day three part one: %d\n", dayThree.partOne(inputDayThree, 3, 1));
        System.out.printf("Day three part two: %d\n", dayThree.partTwo());
        DayFour dayFour = new DayFour();
        System.out.printf("Day four part one: %d\n", dayFour.partOne(inputDayFour));
        System.out.printf("Day four part two: %d\n", dayFour.partTwo(inputDayFour));
        DayFive dayFive = new DayFive();
        System.out.printf("Day five part one: %d\n", dayFive.partOne(inputDayFive));
        System.out.printf("Day five part two: %d\n", dayFive.partTwo());
        DaySix daySix = new DaySix();
        System.out.printf("Day six part one: %d\n", daySix.partOne(inputDaySix));
        System.out.printf("Day six part two: %d\n", daySix.partTwo(inputDaySix));
        DaySeven daySeven = new DaySeven();
        System.out.printf("Day seven part one: %d\n", daySeven.partOne(inputDaySeven));
        System.out.printf("Day seven part two: %d\n", daySeven.partTwo(inputDaySeven));
        DayEight dayEight = new DayEight();
        System.out.printf("Day eight part one: %d\n", dayEight.partOne(inputDayEight));
        System.out.printf("Day eight part two: %d\n", dayEight.partTwo(inputDayEight));
        DayNine dayNine = new DayNine(inputDayNine);
        System.out.printf("Day nine part one: %d\n", dayNine.partOne(25));
        System.out.printf("Day nine part two: %d\n", dayNine.partTwo(14144619));
        DayTen dayTen = new DayTen();
        System.out.printf("Day ten part one: %d\n", dayTen.partOne(inputDayTen, 1, 3));
        System.out.printf("Day ten part two: %d\n", dayTen.partTwo(inputDayTen));
    }

    private static final String inputDayOne = "1826\n" +
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

    private static final String inputDayTwo = "3-4 t: dttt\n" +
            "5-7 l: llmlqmblllh\n" +
            "3-10 g: gggxwxggggkgglklhhgg\n" +
            "5-7 d: zxhddvxd\n" +
            "5-12 s: sgscssssphxs\n" +
            "3-4 b: lbbbbntqswsv\n" +
            "1-11 h: hhhhchhhhjhph\n" +
            "10-16 c: ccccqccchcccccjlc\n" +
            "10-11 b: bsbdbblbbjbbbb\n" +
            "3-5 j: jjrjfqz\n" +
            "4-7 q: qqhqdzjqsc\n" +
            "1-5 s: srjfsshkqmxw\n" +
            "5-6 v: xvvzvnp\n" +
            "5-12 f: ffmfffffpffffm\n" +
            "4-5 l: lllllgwdfhl\n" +
            "9-11 b: bgbbbsbbbnbbbvbbbb\n" +
            "5-9 h: hnhhqhshnvhh\n" +
            "7-13 c: cxccxcccglccs\n" +
            "6-9 c: kckpcpgccvmznrccc\n" +
            "11-15 x: xxxgxxkxgxxxxxtxbxkx\n" +
            "11-12 s: sdssnnzzrssssss\n" +
            "9-10 w: wwwwwwwwbxw\n" +
            "10-12 v: dvvvpvrvvvvvv\n" +
            "1-4 w: wdqptjk\n" +
            "17-19 p: ppppppppppppppppkpx\n" +
            "3-4 h: vhhh\n" +
            "9-11 z: zzzzczzztzz\n" +
            "2-5 s: shbfspgszs\n" +
            "13-15 j: jjjfjjtjjjjjjjjj\n" +
            "2-12 l: lhlllchlllcsmlll\n" +
            "12-15 k: kkkxkkkkkkkkkrkk\n" +
            "11-16 g: gggggggggglggggmg\n" +
            "7-8 n: nnnnnnnn\n" +
            "9-11 n: jnwnrmnlnqnnnnn\n" +
            "4-7 x: xlqxxxxhxnpqxgx\n" +
            "2-4 h: srfnbgffjcxhgqh\n" +
            "3-4 t: pdtt\n" +
            "6-10 w: wvwwwqdwww\n" +
            "9-13 x: xzxxxxxxxxxxxx\n" +
            "11-13 s: cmsfqnpwltsgs\n" +
            "2-11 c: kcccqvfccvrcdc\n" +
            "8-10 v: hvvhvwvvvv\n" +
            "6-7 g: gggggdg\n" +
            "7-10 m: mmmmmmmmmm\n" +
            "6-7 z: zzzzzgz\n" +
            "1-3 d: drdsdv\n" +
            "3-5 w: wwxwk\n" +
            "1-4 b: kgcrqkbrdb\n" +
            "1-5 r: dckmrxgndprxlh\n" +
            "5-7 d: dhddvdhx\n" +
            "1-3 r: cpmqdrrfqz\n" +
            "3-4 c: cccc\n" +
            "9-10 h: hhhhhhhhrz\n" +
            "14-15 h: hhhhhhhhhhhhphd\n" +
            "2-6 c: qvmnbgsxjmkff\n" +
            "3-5 r: rhrrf\n" +
            "9-15 r: rrrnrxrrrpprsnrrz\n" +
            "2-5 w: wzwtn\n" +
            "3-7 t: tttttttt\n" +
            "6-7 k: kkmphpsv\n" +
            "2-5 w: wwgwwwk\n" +
            "14-15 q: nqqfqpqqqqvqqcf\n" +
            "12-15 n: nbnnnnnnlnnrnnnngn\n" +
            "13-14 h: hhhthhhhhhvhpsh\n" +
            "4-6 v: vvxvrv\n" +
            "14-18 c: ccccccxcccccccccccc\n" +
            "18-19 s: jhmfgbssnltrcplmxnp\n" +
            "3-4 h: hhhh\n" +
            "3-4 r: rrxp\n" +
            "2-3 r: rqpwzvrk\n" +
            "2-7 q: qqqqqqq\n" +
            "4-6 v: bnvvvp\n" +
            "1-4 v: vxvvk\n" +
            "4-13 z: znlrnnzgzmjsznzszh\n" +
            "3-4 s: dtwx\n" +
            "3-9 c: ccgcccccc\n" +
            "1-7 f: tfqfffkqfvh\n" +
            "4-5 c: ccccccc\n" +
            "6-7 r: rsrthgsrrbr\n" +
            "8-9 q: vqbcqqhzqqgqjnqbqkm\n" +
            "10-19 l: lllcxlzlnlchlbrzwpl\n" +
            "11-14 r: prrrrrrrztrjrrnrrrm\n" +
            "7-10 w: wwwtbwzwtwww\n" +
            "2-4 w: wzcwvfrtdv\n" +
            "7-12 l: fmljlbmlllfl\n" +
            "1-3 n: nnnn\n" +
            "4-5 m: mwmjxd\n" +
            "11-14 v: wfhpfdxbjwvwtg\n" +
            "2-7 h: qsxjzhn\n" +
            "4-7 p: ptxtppcpcp\n" +
            "1-5 j: ssjjqfjjgs\n" +
            "4-7 d: fjpdhdddmb\n" +
            "1-4 t: qjxsvdwttnktq\n" +
            "3-5 f: fffff\n" +
            "10-13 t: ttttttttttttftt\n" +
            "4-8 v: bpqhvcmvm\n" +
            "4-5 q: qqqpq\n" +
            "10-16 w: dwpwsbcwwwwqxhww\n" +
            "8-10 p: ppppqppppdpp\n" +
            "2-4 k: kkwk\n" +
            "1-4 d: ddcdm\n" +
            "7-12 f: ffftfpbffffnp\n" +
            "5-8 x: xxxcqxxzx\n" +
            "3-4 t: ttzg\n" +
            "2-4 m: mmmmm\n" +
            "5-6 g: gggsxg\n" +
            "2-13 j: jkjjjjjjjjjjjjjjjjj\n" +
            "6-8 t: ttfrtftt\n" +
            "7-9 l: lgljnlllllvl\n" +
            "13-20 b: btbbbbbbbzbbkbbbbbbq\n" +
            "1-2 c: cccch\n" +
            "4-15 q: xcqbkmhzxlgswkqkc\n" +
            "2-5 h: hhhhswhhhh\n" +
            "1-5 s: sslss\n" +
            "2-7 t: trttttktt\n" +
            "14-15 k: kkkkkkkhkkkkkkvksk\n" +
            "1-3 l: llllllllg\n" +
            "6-8 s: ssshsjsk\n" +
            "4-8 g: ggwgqbgg\n" +
            "14-17 b: jbbbbdbqtbbvsnkzk\n" +
            "4-5 b: bbbxbbb\n" +
            "10-18 z: zzzzzzzzzzzzzzzzzz\n" +
            "2-4 p: ppxc\n" +
            "8-9 g: qmgsrggchgg\n" +
            "8-9 j: jjjjjjjgj\n" +
            "5-6 f: jfffff\n" +
            "2-3 x: xhbx\n" +
            "9-10 s: ssssmsssfgs\n" +
            "14-16 l: llllllqlllllhrlllxl\n" +
            "10-12 w: glwwwtwkdcgh\n" +
            "3-8 p: pprjpppcpppppppkppp\n" +
            "3-8 v: vxvkkvvvpvbz\n" +
            "4-7 j: jlqgjnljxfwbjjj\n" +
            "1-3 q: wqqddnzfsblvcjldq\n" +
            "2-3 f: mdcqqfgxtcmn\n" +
            "9-16 j: jjjjjjjtjjrjxvjj\n" +
            "3-9 d: zdcndblvd\n" +
            "1-8 w: cdxwltwg\n" +
            "2-10 h: qgftvvwssfhhmjktwfj\n" +
            "5-8 m: mbmmwmmmmmmmm\n" +
            "2-5 k: ckklk\n" +
            "12-18 m: mmmmmmmmmmmmmmmmmmkm\n" +
            "10-13 n: sbnnbnwqwnncnflnkn\n" +
            "2-4 q: qqqh\n" +
            "5-6 w: wwwwxs\n" +
            "1-7 m: smmmmmnm\n" +
            "8-15 j: jjrkhjjjxjkjjwjrfjc\n" +
            "5-6 j: jvjjzt\n" +
            "1-12 g: cbggkptcgxgzt\n" +
            "4-6 v: vvvvvkv\n" +
            "1-4 j: jjjd\n" +
            "12-13 k: kkkkkkkkkmkwmk\n" +
            "2-4 d: jvdwxdk\n" +
            "4-8 k: tfzklvgktd\n" +
            "2-4 t: zlmtdmtz\n" +
            "15-16 q: dkmpgqkzqwqjjqqd\n" +
            "3-8 z: zvjzqmzrzns\n" +
            "2-11 h: hhhhlhtrhhhhq\n" +
            "1-3 r: rrrr\n" +
            "12-19 b: mhfwhbskbpsrvrskphd\n" +
            "2-3 x: pgsfjblxk\n" +
            "2-4 k: cvjs\n" +
            "3-6 s: bswshc\n" +
            "2-3 d: vdstlpdzx\n" +
            "10-11 t: ttnthtwwtpr\n" +
            "2-4 j: jsmjjjj\n" +
            "3-4 g: gggf\n" +
            "11-14 z: hgpzzzzzzczznwkvzz\n" +
            "12-13 v: vvvvvvxvvvdmmv\n" +
            "4-5 w: wnwww\n" +
            "9-10 z: zzzzzzzzzr\n" +
            "3-5 l: tkkllllllllp\n" +
            "1-2 h: hhgst\n" +
            "1-2 h: wwvx\n" +
            "1-14 v: hhcfklvvvvvxzq\n" +
            "2-4 t: wwkttt\n" +
            "6-7 c: jcccxhf\n" +
            "11-16 q: qlxqqbqqqbqqmqqqnqqq\n" +
            "3-5 m: mvmmmmm\n" +
            "7-8 s: gsgsmslh\n" +
            "5-9 m: mmwmjmnfmm\n" +
            "16-17 w: wwlwtwkwwpzbfwbww\n" +
            "3-4 x: mkdxsfxxjxj\n" +
            "6-11 b: jdxkqbxcwvbx\n" +
            "7-8 w: wwwwwwwdtt\n" +
            "5-12 r: hcrrrzrfgbprwrtbr\n" +
            "6-8 n: nnnnnzgw\n" +
            "5-7 q: qhqqczbq\n" +
            "3-8 d: dddcdqddpdddn\n" +
            "6-7 g: ggggggggg\n" +
            "8-13 w: wswwsmwcwdljnldw\n" +
            "3-4 b: bbbdh\n" +
            "5-6 p: pdvcppbkg\n" +
            "7-14 n: qnkhcnmnfnnrcn\n" +
            "12-18 v: zbvvwvvvvvvdxvvvvv\n" +
            "10-13 p: pppppppjppppppp\n" +
            "2-5 p: tvkplq\n" +
            "1-5 g: gmdqggxbg\n" +
            "1-3 s: sgtsrs\n" +
            "11-12 n: nnnnnnnnnnnn\n" +
            "12-17 v: vvvvvvvvvlvvvvvvrvv\n" +
            "4-13 q: qqqqqqqqqqqqk\n" +
            "5-13 w: wxwwwwwwwwwwm\n" +
            "1-2 j: jnjvnxck\n" +
            "11-13 n: nnvtnnrsnnnnnnxnn\n" +
            "2-4 x: jxbxx\n" +
            "10-11 b: bbbbbbbmbbpbzblbbb\n" +
            "1-17 p: bpppppppppppppppppp\n" +
            "3-16 z: lnmqwfvpbdzkmlqzbfg\n" +
            "1-7 k: ktbklkmxkdk\n" +
            "9-12 t: vtttctdttttptt\n" +
            "6-8 v: xmvvvzgr\n" +
            "3-7 k: wckkcwmkpxldc\n" +
            "2-6 t: ljzwsxxfz\n" +
            "4-5 v: ptvvv\n" +
            "3-8 r: gmrzrvjct\n" +
            "3-7 l: llllfltpsl\n" +
            "2-5 p: rnzpp\n" +
            "14-15 x: mxxgkxxxxvxxvxx\n" +
            "5-6 p: pgppfmprwdjd\n" +
            "9-10 z: vzzzzzzzsb\n" +
            "13-14 t: ttttttttthstttttt\n" +
            "12-13 w: wkwwwwnwwwwwfw\n" +
            "7-10 d: wsldjfwdkqddd\n" +
            "3-5 b: sbbbh\n" +
            "1-4 t: tqdttt\n" +
            "14-16 h: phhtkhdhdhpfrjwh\n" +
            "15-19 d: dddgdjddpddxdbbndfd\n" +
            "2-4 g: mgbgjjdgd\n" +
            "3-6 d: bdhtwd\n" +
            "7-13 p: bppsmwtqpxpfppqczpkw\n" +
            "6-11 n: nnnwnnxntnnzvn\n" +
            "8-10 w: nwhzwwjwcjgwwwnfwwwj\n" +
            "6-9 g: gglkkgxkt\n" +
            "2-4 p: pppp\n" +
            "6-8 b: bbbbbfbv\n" +
            "3-4 m: mmps\n" +
            "14-17 l: lllllllllllllllll\n" +
            "7-9 z: wzzzzfdzth\n" +
            "2-3 d: gqdmlmxxldklkmdlngdh\n" +
            "6-11 p: ppjppxppppp\n" +
            "8-11 p: pppppppdppt\n" +
            "1-2 m: hgmmmm\n" +
            "2-5 g: gsjghqqrgqps\n" +
            "14-15 r: rnrrrrrrrrrrrjd\n" +
            "4-6 w: wwwtwh\n" +
            "7-11 b: bhbbbbqqbbbbbbb\n" +
            "8-10 d: ljsvsdkdxd\n" +
            "3-5 l: lbxwmlx\n" +
            "5-11 n: xdqnnnnnnnnnkn\n" +
            "10-13 w: wfwwwdwwrwwxbw\n" +
            "2-9 h: lvgzwwjzwlchvf\n" +
            "2-6 h: hhjhhk\n" +
            "2-3 j: njjvglndfmqcjfh\n" +
            "11-17 n: hxnnnnnnntngnrnnn\n" +
            "4-9 c: knsltvmnt\n" +
            "9-10 z: xnzzlzzzztzzz\n" +
            "7-9 q: qqqqqqqqnq\n" +
            "11-17 p: ppppppppppppppppqpp\n" +
            "8-12 w: wwptwwfltwbwww\n" +
            "4-8 k: kkbskkgkc\n" +
            "10-18 q: qnqcqqkggqcqcqqfqq\n" +
            "3-4 p: bppqxptcpq\n" +
            "2-3 s: sjfz\n" +
            "4-7 j: rjdjtgjksznhhsg\n" +
            "8-9 x: cxxxdfxtxrxxxx\n" +
            "8-12 f: fffffffrffff\n" +
            "4-7 c: ccccczn\n" +
            "1-2 v: zzvv\n" +
            "2-3 k: glfrfqkvzkk\n" +
            "3-15 q: zqqbmqgqksnttjqgnq\n" +
            "5-14 c: fzcvnxcccckccctc\n" +
            "2-12 k: pkstjpkqvnnglxgkwffx\n" +
            "3-5 q: qwqlqwbqw\n" +
            "11-13 q: hwqqqqqqqqqqqqq\n" +
            "18-20 m: mmmmmmmgmmmmmmmmmdrw\n" +
            "2-5 j: djjgb\n" +
            "16-17 m: mmmmmmmmmrmmmmmxg\n" +
            "6-13 d: mbfgqrfrhtlxddnfcxj\n" +
            "15-18 l: llllllllllllllllllll\n" +
            "10-14 w: wwwwwwmpwwwdwlwwwrx\n" +
            "7-9 f: glbffbbtff\n" +
            "16-19 l: lllllxlllllnlllldls\n" +
            "4-5 l: plllg\n" +
            "6-7 c: rcpchcc\n" +
            "7-8 p: ppppppslp\n" +
            "1-8 z: zzzszzzz\n" +
            "3-16 f: flkffclcklnffzfkw\n" +
            "3-8 l: gnlfltll\n" +
            "1-2 w: wrww\n" +
            "10-12 h: hhhhzzhhhhhh\n" +
            "12-14 v: vvvvvvvvvvwvvv\n" +
            "5-11 h: hhhhhhhhhhhhh\n" +
            "2-15 g: rwlvdlschqsbrzg\n" +
            "6-7 d: thcdqdd\n" +
            "4-6 r: jwvkfvjrd\n" +
            "10-12 g: gggggggggwgfggggg\n" +
            "1-7 d: rddddddd\n" +
            "3-5 d: dgjhmd\n" +
            "3-16 h: hhthhhhhhhhhhhhzh\n" +
            "1-3 k: krtcnqklsw\n" +
            "12-17 j: jjjgjcfvjjjdjptjbjkj\n" +
            "9-12 k: kjkkkwkknkkkkk\n" +
            "10-17 l: llllllllllllllllll\n" +
            "6-10 g: gggzfgrgzgggsgg\n" +
            "5-8 n: mnnxrnln\n" +
            "3-6 l: lrlrlfflbllwklbcqd\n" +
            "10-11 c: cccltccccsfxjcfc\n" +
            "2-7 s: srssssssw\n" +
            "1-17 t: tttttttttttttttttt\n" +
            "7-9 w: fhwwdwmwswrhnwcw\n" +
            "6-7 j: jjjjjqd\n" +
            "13-14 x: vxgbmptxxxsxxp\n" +
            "2-3 m: gmmdsm\n" +
            "6-7 f: qfffffffw\n" +
            "7-9 k: kjkkkmmkwkkk\n" +
            "10-11 g: ggggdggggggg\n" +
            "14-19 r: rrrrrrrprnvrrrrrrrrr\n" +
            "1-3 t: rtttt\n" +
            "5-6 q: qxqqsqq\n" +
            "16-17 q: qqqpqqqqqqqqqqqlx\n" +
            "5-6 v: vmbfvvvvvxdvvc\n" +
            "10-13 l: llllllllllllm\n" +
            "4-12 d: mgvcvfrdrfdddk\n" +
            "4-5 v: vvbvv\n" +
            "2-5 v: lvvnvgbssk\n" +
            "5-8 v: fvvvgfvgv\n" +
            "5-6 v: vvvbms\n" +
            "13-17 q: qqqqqqqqqqqqgqqqqq\n" +
            "1-3 t: lrtjw\n" +
            "5-13 g: nnggglrkgjrgg\n" +
            "1-5 n: nnbnn\n" +
            "16-19 b: bbbbbbbbbbbbbbbzbbb\n" +
            "8-9 d: dddddddddd\n" +
            "7-10 h: hfslhhhkqh\n" +
            "12-14 p: phpsppwpjppsppppppp\n" +
            "2-6 s: ptkhqsztgjqrfqzd\n" +
            "4-8 h: hhhqhhhp\n" +
            "4-13 p: ppsjptpfppqkpv\n" +
            "2-5 p: sppvp\n" +
            "5-7 w: wqxmhbrvwlw\n" +
            "14-16 r: rrvrrrrkrrrrrfzrrmz\n" +
            "11-12 h: bpdkkghmqhhv\n" +
            "10-20 r: hrxdwrqwrmrfrnrrqqrf\n" +
            "11-12 v: bvvvvvvvvvvmv\n" +
            "3-4 x: xzxmdxzxx\n" +
            "7-9 v: vvvvvhvvcv\n" +
            "4-5 z: zzzsz\n" +
            "16-17 t: tttttttctttttttttt\n" +
            "3-10 k: wdkkxtbgskkkkzkbvck\n" +
            "3-4 l: dlsjt\n" +
            "2-6 t: snmtntgglhrghnprpcv\n" +
            "3-10 l: llvlllwllhrlljlll\n" +
            "5-11 m: mzmrncmmgmwmrm\n" +
            "13-15 c: ccccccccccccccjsc\n" +
            "4-5 q: qqqffh\n" +
            "2-8 j: jzjjjjjjj\n" +
            "5-11 n: nnxqdnnnmnnnnpnn\n" +
            "8-11 x: xxxxxxlxxxgxx\n" +
            "7-11 g: gggcghggmglhglggx\n" +
            "4-17 l: xllbllflllllllcvpll\n" +
            "3-6 z: zzxqzbzz\n" +
            "9-18 s: sssssstsssssssssms\n" +
            "14-16 r: rrkrrrrhrrrrrrrr\n" +
            "10-12 m: mmmmmmmmmrmtm\n" +
            "4-5 z: zqtzzzlnpz\n" +
            "6-16 c: kcwcjcrtchccmgdsdkc\n" +
            "10-11 n: nnnnnnnnnnnnnnnfnn\n" +
            "9-15 n: nnnncnnnnnnnnsnkr\n" +
            "1-7 d: dddddddd\n" +
            "12-19 j: jgvjmjnjkjjtjjjjjjd\n" +
            "9-14 j: jjjjjjjmwjpjjtjhjdj\n" +
            "6-7 j: jljjjjjqj\n" +
            "2-5 n: nnnsxmjlvznn\n" +
            "4-7 r: rrrzwhrhrm\n" +
            "9-10 x: xxxxxxxxxx\n" +
            "4-5 k: sqkgkm\n" +
            "1-4 g: sgkmzgtgggp\n" +
            "10-14 k: zkkkhkdkkwkkstkkk\n" +
            "3-10 g: xglkpghggrqnwzxbvm\n" +
            "7-8 s: ssssssss\n" +
            "6-9 m: sbmxmmbmmbj\n" +
            "11-15 z: hzzwzzzzzzrzzzz\n" +
            "9-10 n: lvlnjnjgnb\n" +
            "1-5 c: zmscfzg\n" +
            "2-6 d: kxndkbj\n" +
            "1-7 j: jfjqjqj\n" +
            "12-13 w: nwwwwwwwwwwww\n" +
            "7-8 v: vxcvvvkd\n" +
            "3-7 f: fqfnvsfqvlhqqq\n" +
            "3-12 b: hvsvcvmbbgjbncgdpq\n" +
            "7-12 n: tpjprfntnpnnpnnsn\n" +
            "6-11 g: gwgggmgbggxgqgg\n" +
            "15-16 v: vvvzvvvvvvvvvvwv\n" +
            "12-14 p: ppppppprpppgpgp\n" +
            "3-11 s: ssvsssssssms\n" +
            "8-9 q: qqqqqqwtqq\n" +
            "4-5 d: ddddddddmddddd\n" +
            "11-12 c: cccscccccnccc\n" +
            "4-5 k: glzjkx\n" +
            "2-7 j: fjfdqhq\n" +
            "6-9 s: ssnwsssfm\n" +
            "16-17 r: rrrrfwrprrrtrrrcrrr\n" +
            "3-11 c: fcczfsxvcbmcwktn\n" +
            "4-6 l: qllcllll\n" +
            "7-10 h: hhkhhhwhhhhh\n" +
            "4-9 x: xxdxxxxxmxxx\n" +
            "2-7 t: ttrtrtt\n" +
            "3-7 l: llblllcl\n" +
            "1-2 g: jgtdt\n" +
            "7-14 p: pgpdtkplcpfhppphqdp\n" +
            "3-12 b: nbqpbgmbhfwbbbzbnb\n" +
            "4-6 k: kkxcphk\n" +
            "12-16 x: kqpkvpnqxgvxwxxmbnh\n" +
            "5-11 p: pfppgcrhqcxpv\n" +
            "2-3 w: lfdpwgk\n" +
            "7-10 t: shktvjtztttqttt\n" +
            "13-15 f: pffffffgffqfxflfl\n" +
            "8-14 d: ddddwddddndddddd\n" +
            "5-9 c: cbhvwcccsccxcw\n" +
            "2-5 v: jwbrcvxssj\n" +
            "3-13 q: gzqzqwnprgzjqrp\n" +
            "5-9 w: wwwwwwwwwwwwwwwwwww\n" +
            "3-4 p: pktgpzbzlps\n" +
            "9-14 k: pkmkjkkkhgkkbkkmksd\n" +
            "7-9 r: rrkfrgtrrkhrw\n" +
            "2-14 q: qnqqqqqqqqqqqqq\n" +
            "4-5 d: ddmdddds\n" +
            "1-13 f: fffffffffffffkfffff\n" +
            "5-6 f: ffffffffffflfcff\n" +
            "5-9 s: dwswbrswbv\n" +
            "11-12 j: rjjjjkjjjjjrjj\n" +
            "2-5 v: vwdngzv\n" +
            "2-4 p: spgkbpghbfmnhl\n" +
            "8-9 c: cccckccxc\n" +
            "6-8 m: mpkmkkhw\n" +
            "3-4 q: qqqmq\n" +
            "1-5 s: szpsz\n" +
            "14-15 f: wffffffffffffnf\n" +
            "16-19 d: ddddddddddddddddvvdd\n" +
            "7-16 q: qfhqqqdqjqqqqqfvqsqq\n" +
            "3-6 g: ggggggg\n" +
            "12-16 k: kklkrkkkkkkkfkkkrkk\n" +
            "7-11 x: xxxxxxhxxxcx\n" +
            "12-13 r: bsrkmkwrwzsrv\n" +
            "6-9 b: bbbbbqbkfb\n" +
            "12-16 d: ddddddddddddcddqd\n" +
            "2-10 t: ttxptzmfftbrsttgzlp\n" +
            "6-7 z: zczzzwspzg\n" +
            "6-8 z: whdrvzrzjwmbz\n" +
            "5-7 d: fhxvdxdjsgdmgqxb\n" +
            "5-8 h: qhhbvhhhhhw\n" +
            "9-11 b: xbbbmbbqhdgbbbb\n" +
            "6-8 h: hmcgnhmvwmrcqhkht\n" +
            "6-8 m: mmmmmxmbf\n" +
            "2-6 g: grgggg\n" +
            "4-5 g: ggggg\n" +
            "5-14 k: mhkkkkkgskkwrfkvkkkd\n" +
            "1-10 g: mggxbcqggpgjg\n" +
            "3-4 p: pplk\n" +
            "4-6 j: jjjzjj\n" +
            "16-17 x: xhxxxxxxxxxxxdvbx\n" +
            "2-5 c: csxbls\n" +
            "3-6 h: hhhhzhh\n" +
            "2-8 r: rwrrkrrrrr\n" +
            "18-19 q: clhbgqrkfsmnjmfxszq\n" +
            "9-13 f: pffffffgfffffffff\n" +
            "7-10 x: wxxxbxbtbfxxx\n" +
            "5-6 x: xctnxg\n" +
            "7-11 r: rrrchcrrrrr\n" +
            "1-6 f: fsdjnfgffgr\n" +
            "17-18 l: lllvlllflcsdlllllll\n" +
            "4-15 j: pjjcjjjjjjjjjjrjjjj\n" +
            "1-5 c: ccccckcdsz\n" +
            "4-6 f: fgfqfg\n" +
            "3-16 v: zvvpqxqsvtptqmpvw\n" +
            "1-11 k: wgnzrddkkfj\n" +
            "15-16 d: dpdddddddsddddrsd\n" +
            "4-5 m: gmggcjg\n" +
            "6-9 q: lfsltjpdj\n" +
            "8-11 n: bdnnbjdnnvnrnchnd\n" +
            "2-10 r: rrrvrrrrrrrjrrr\n" +
            "1-4 h: mdwnzthhvg\n" +
            "8-9 d: dddvdddbpdd\n" +
            "1-7 n: hxrlndrnh\n" +
            "19-20 x: xxxxxxxxxxxxxxxxxrxx\n" +
            "7-8 b: bbbbhmcc\n" +
            "8-11 p: ppppppppppr\n" +
            "7-13 g: ztggpmgfgcgggjg\n" +
            "5-6 m: gxmmmmxmbsvmdmvprlxn\n" +
            "8-13 j: bjjgjmnjjjvjj\n" +
            "4-9 q: qvqqqmnfqwqzjggrqqnq\n" +
            "3-8 b: bsbnbjdbwbpbb\n" +
            "5-12 j: vrnjjjmjpjnkrdjckx\n" +
            "1-6 w: wwwwwwwwwqwwww\n" +
            "9-11 j: jbjwjjjmjnqjjjj\n" +
            "7-18 z: zzzzzzlzzzzzzzzzzszz\n" +
            "8-9 j: jjjjjjjljj\n" +
            "13-16 g: gggggggggnghvgglggg\n" +
            "2-14 m: kvmqzmmmmmmmmpm\n" +
            "4-5 f: fffffhf\n" +
            "4-5 w: wwwwwwx\n" +
            "4-17 v: vtvcvvkjvvvvsdvhptv\n" +
            "4-6 l: qlllllwlljtbdlfk\n" +
            "1-14 z: sqvjzdswcchfczvvq\n" +
            "2-9 s: wshsspkcdnbcjcvl\n" +
            "6-8 n: nnnngnnn\n" +
            "5-8 n: nnnnndnn\n" +
            "2-6 t: ftdrttqrt\n" +
            "8-13 p: mpwpfpjfnppqmppmxf\n" +
            "1-4 q: qqqq\n" +
            "9-10 f: fcffpffrdfkfh\n" +
            "1-3 v: vkvcxm\n" +
            "9-10 j: jjjjjjjjjbj\n" +
            "6-7 v: vvfrldv\n" +
            "1-9 n: qnnnnnhqxnn\n" +
            "4-5 q: qqqqqqx\n" +
            "6-10 c: vcbpcclzmn\n" +
            "3-4 j: jjjj\n" +
            "9-10 n: nnnnnnzngn\n" +
            "4-5 q: qxdqqqs\n" +
            "2-7 l: hlhllhll\n" +
            "8-9 d: dmdrddrqndddwddcdd\n" +
            "4-6 z: zfzzzhz\n" +
            "4-7 g: ggggggg\n" +
            "4-6 s: njzwmgbw\n" +
            "16-17 q: qqqqqqqqcqqqbqqmqq\n" +
            "5-12 q: qqvqkwqqmqrdbqsqx\n" +
            "2-8 v: vvvvnvvvv\n" +
            "5-12 m: smhfmmmfxmhmmxmj\n" +
            "3-4 f: fffmrjfhnfbpcmcj\n" +
            "6-10 c: ccrhcqlczsc\n" +
            "1-7 b: xbbbbblb\n" +
            "19-20 m: mlhmdcwmxmmmmphqmkmm\n" +
            "8-10 r: brrrrrrmrfrgr\n" +
            "4-8 s: sssnsssdsh\n" +
            "1-7 g: qgggtgsn\n" +
            "19-20 w: wwwwwwwwwwwwhwwwwwwl\n" +
            "1-2 x: xxqlxx\n" +
            "3-5 g: ggwgg\n" +
            "4-5 s: ssqsxs\n" +
            "6-13 w: kxwwwwwwwwfjrw\n" +
            "12-13 m: mmmmmmkmmmmmn\n" +
            "15-17 h: jkhhqwhgbwhfhfvhm\n" +
            "14-17 n: nnnnncsnnnnnngnngncn\n" +
            "4-5 l: lldllj\n" +
            "4-5 j: jjktv\n" +
            "9-16 p: pppbpptppvpppnppgp\n" +
            "3-7 m: pwtwglmqrfmfrsfwm\n" +
            "5-6 x: bxqwxxl\n" +
            "6-19 j: sjjvtjsgjgdfzjjsjst\n" +
            "10-14 h: bhhhhhhhhxhhhwz\n" +
            "8-10 x: xxtvxxxxxx\n" +
            "6-14 z: zzrzzvzzzzzzzczczzz\n" +
            "7-8 q: qnsjqwfqqzqgqdq\n" +
            "6-7 l: rrlrhlw\n" +
            "1-2 g: ggpgggggggggggggggg\n" +
            "9-10 x: drdlgbxwphrnqmq\n" +
            "1-7 s: swszthj\n" +
            "5-6 w: kwvqkwwwww\n" +
            "5-7 d: cdwndjddfghqdf\n" +
            "5-10 z: zzzzzzzzzbz\n" +
            "1-8 l: tplzsllbbndnltphw\n" +
            "4-17 l: lckxdfblllccqlbll\n" +
            "8-9 d: ddddddddd\n" +
            "11-13 f: fffffffffpfffwff\n" +
            "3-6 m: mmmtmm\n" +
            "9-10 c: cccjccccccccck\n" +
            "8-9 g: ggggggggg\n" +
            "1-13 k: sdqlkcjxbhmkpskkwkb\n" +
            "6-12 c: vbccrljmccdcccccf\n" +
            "5-6 r: crbcrrd\n" +
            "5-8 x: knxxxbxxxqltfxw\n" +
            "3-13 g: npgcxgfndxgmg\n" +
            "2-9 j: tnbnvvgghzcsjznqqln\n" +
            "11-12 z: zzzzzzzzjzlzzz\n" +
            "12-13 t: tttttrtttttcttvbl\n" +
            "1-6 d: dxgldtdld\n" +
            "17-18 s: wnnkgsmhrhtvjbmkmm\n" +
            "4-9 t: ttdsttjttvclttgtt\n" +
            "6-8 t: xgtztttqtttttt\n" +
            "17-19 q: qqqqqqqcqqqqqhqqhqbq\n" +
            "8-16 w: wwwwwwwwwwwrwwww\n" +
            "8-11 n: nnnqnnspnnmnbld\n" +
            "7-8 n: nngnnnnd\n" +
            "6-10 l: lnltlcdwlmlslllz\n" +
            "19-20 w: wwwwwwwwwwwwwwwwwwww\n" +
            "4-9 d: gdddmdhbv\n" +
            "6-7 v: vvvvvwv\n" +
            "4-5 g: gggggg\n" +
            "5-11 g: gggskbqgpgdgvlgg\n" +
            "9-14 f: ffffffffffffff\n" +
            "5-6 c: cwcctlc\n" +
            "3-8 m: mdmzmzwmmfmxwzfrpm\n" +
            "10-16 f: ffffmffplgfmhwff\n" +
            "8-14 d: pkkbrdhfttjdfd\n" +
            "1-10 n: sbnzncfxcqntzpnvcgw\n" +
            "6-15 d: zxtdddnmntxvknbwdc\n" +
            "10-11 g: gggggggjggggjk\n" +
            "7-9 n: vnqnnqdggnnznw\n" +
            "9-11 j: fjljjjjjcjgj\n" +
            "8-9 j: jjjjjjjdj\n" +
            "8-9 v: cgtlnjclqkprbmv\n" +
            "13-17 f: fgwfffdfgffntfbfffft\n" +
            "9-10 v: qvlvtvvrmwrvsvlvvkrr\n" +
            "2-8 t: ttnrtmttlbtt\n" +
            "2-4 k: kkrp\n" +
            "5-6 k: kkpkkkl\n" +
            "3-5 c: zwcwccc\n" +
            "10-12 j: rjjjjjjjjjjjjj\n" +
            "1-5 j: jjzjjjml\n" +
            "4-6 f: hffffffff\n" +
            "4-5 x: txxcp\n" +
            "1-4 w: wwwk\n" +
            "3-16 j: jjsjjjjjjjjjjjjnj\n" +
            "2-4 n: nnngn\n" +
            "2-6 c: cckdnz\n" +
            "8-11 b: bbbbbbbbbbb\n" +
            "4-18 g: crgqggghggggglgggdg\n" +
            "11-14 m: glrtzmfgcnmmwmnm\n" +
            "7-9 w: swwvwwwdszwwwwww\n" +
            "4-20 v: vvvxvvvvvvvvvvvvhxvv\n" +
            "2-3 q: qdxqq\n" +
            "2-5 r: qrrrr\n" +
            "11-13 s: sssssssssssshs\n" +
            "3-4 s: zdnlshs\n" +
            "7-9 w: wwwwwwmcnw\n" +
            "5-8 q: qqqqqqqqq\n" +
            "11-14 h: hchhdctlhhcphnhghhhs\n" +
            "10-14 f: fvfffffffffffffff\n" +
            "13-15 q: qfqqqqzqqqqqqqqdq\n" +
            "7-16 l: phclwxgcghmlldljdlhd\n" +
            "7-15 t: tttttwgqnbtdttrfft\n" +
            "1-3 d: dcdsxfsqlcddsdfs\n" +
            "1-4 w: wwwwchqw\n" +
            "8-9 b: lgbbbdbbb\n" +
            "5-9 j: lpcbjpxzjjsj\n" +
            "11-18 r: rwhrfbpcwmzjtfjrrr\n" +
            "4-8 x: xxxxxxhxxx\n" +
            "3-8 k: kkkkkkkkk\n" +
            "4-5 h: hhmfq\n" +
            "7-9 j: jjjjjjjjj\n" +
            "7-9 q: chvtrdgkndnqq\n" +
            "10-13 j: jjjjjjjjjzjjjj\n" +
            "1-3 j: jjqj\n" +
            "8-9 g: gggggggvg\n" +
            "5-9 t: ttwttbttt\n" +
            "5-6 l: lqkklp\n" +
            "5-9 f: fffffffffxff\n" +
            "2-5 b: bbmbpb\n" +
            "5-6 j: jjjjnj\n" +
            "1-4 m: mknpnnmcbvt\n" +
            "3-4 b: bbbb\n" +
            "9-10 l: llllslnllx\n" +
            "2-4 h: hhhg\n" +
            "3-7 w: wwwnwwwwhw\n" +
            "2-6 k: ddckrbrkk\n" +
            "4-5 g: gzjnf\n" +
            "14-19 l: llllllllllllllllllf\n" +
            "12-14 h: hhkhhhhhhhhhht\n" +
            "1-5 w: xkvrwzwwl\n" +
            "11-12 z: zzzzjzzzzzzzznzb\n" +
            "2-4 j: wjjzjsj\n" +
            "1-6 h: hhhhhhh\n" +
            "2-4 w: wrwmrsvws\n" +
            "5-7 k: kkkkgkbkkkkkkkkkk\n" +
            "2-5 g: gxncz\n" +
            "3-11 h: hhhhhxhxhhmjh\n" +
            "2-4 d: kdxd\n" +
            "4-5 j: jjjjc\n" +
            "1-7 q: qzxsgqqgvq\n" +
            "3-5 x: kwxnnrxhxh\n" +
            "5-9 r: rrrkgrrrsr\n" +
            "4-5 g: gfggzghggmg\n" +
            "10-11 l: lllllllllrl\n" +
            "11-12 x: xxxxxxtxxxwx\n" +
            "11-12 b: bbbbbbbbxbbjb\n" +
            "7-8 b: bbbbbbbrj\n" +
            "6-7 r: xnrrcrrrrr\n" +
            "11-13 r: rrrnlrrrrrrrrr\n" +
            "4-6 v: vhtvjv\n" +
            "11-15 d: ddnddsdfpgcddwrddd\n" +
            "12-13 q: zbdfqvxzqgdkb\n" +
            "5-13 s: gqqbsccpjwrqsvsj\n" +
            "9-10 x: xxxfxxxxxx\n" +
            "4-6 s: zsssssbs\n" +
            "4-5 q: qnqqv\n" +
            "4-7 m: mzcmzmmmjmf\n" +
            "1-6 q: qqxgmj\n" +
            "7-15 d: djnfvjdkddddddtd\n" +
            "4-5 s: sssfws\n" +
            "6-13 v: jxxgmvmcvmccv\n" +
            "12-13 l: lllllllljllzm\n" +
            "5-6 l: mlljlqvfshdltbwbql\n" +
            "2-9 x: xxkhxmflxxxgxxrfxxxt\n" +
            "17-20 c: ccccccccccccccccjccq\n" +
            "5-17 m: mmmmmmmbmmmmmmmtmmm\n" +
            "15-16 m: mmmmmmmmmmmmzmmmm\n" +
            "4-5 f: fffwf\n" +
            "12-14 g: gggggggggggngz\n" +
            "4-5 d: gqdqt\n" +
            "5-8 h: hvhbsvvkp\n" +
            "6-7 r: rrrrrrrf\n" +
            "4-7 b: pbtdgxbvqdkrmpz\n" +
            "6-9 v: bpvpnsvlf\n" +
            "2-5 k: cbhkpr\n" +
            "8-9 w: bgwzbxxnv\n" +
            "3-4 c: ccctc\n" +
            "3-4 z: zzzbw\n" +
            "11-13 k: kpwbmdzbkgmctwhcp\n" +
            "2-7 r: bcphdlk\n" +
            "14-15 l: ldlllllnlllllhql\n" +
            "10-11 f: fffffpffffw\n" +
            "4-9 g: ggghggggz\n" +
            "6-8 s: tdsxjsxs\n" +
            "7-10 k: kwkrzhkckkkbkzdhpk\n" +
            "10-11 s: rdsqsshhskb\n" +
            "2-4 f: rscnkqfqdtnnglv\n" +
            "3-6 n: qjvqnz\n" +
            "7-8 j: jrjjjjpdpf\n" +
            "6-7 s: rswksssss\n" +
            "2-3 x: xxxx\n" +
            "12-18 l: vljllllllvhlllvllln\n" +
            "3-5 t: ftttt\n" +
            "10-16 j: mjjhhjjjjfjpwjjrjc\n" +
            "7-13 n: gnnnnntvggnwn\n" +
            "12-15 q: qkqqqqqqqqlqqcvqq\n" +
            "12-17 j: njjjcvjjsjsjjjdjjsj\n" +
            "5-16 n: qfpvnrttbnfdjdbncdj\n" +
            "15-16 j: jjjjjjjjjtjmjjvjjj\n" +
            "6-14 n: nnnnnrnnnnnnnx\n" +
            "1-4 x: xxxt\n" +
            "5-12 c: cckfqcvwcqcpcc\n" +
            "2-7 x: tkpwsfzfkpxbt\n" +
            "13-15 h: hhhhhhhhhhhhhhh\n" +
            "1-2 x: xwxkmm\n" +
            "17-18 k: qkkkdjkkkkkkkkkkfxkk\n" +
            "3-4 v: vwqf\n" +
            "2-5 l: slzlllt\n" +
            "8-9 z: gzztzzzjzjzz\n" +
            "10-14 v: pzqkvvvvvgvxvvvzvvmp\n" +
            "9-19 f: fzzffjffnffdslffcqk\n" +
            "5-15 v: vxvzvvvvqtvvrvvvvvvv\n" +
            "7-10 x: xxxxxxxxxx\n" +
            "1-8 k: kkkjkkkqkkkkkbkk\n" +
            "2-16 j: jwjjjjjjjjjjsjjgjj\n" +
            "8-9 n: nnnnnnnrvw\n" +
            "11-12 p: pppppppppppp\n" +
            "5-7 h: hqhhhjthqphhbhhgppp\n" +
            "7-9 k: zdkkkwkkvskf\n" +
            "12-13 m: mmmmmmmmlmmrmm\n" +
            "9-15 j: wjmjfjjjfqjjjmjjlj\n" +
            "2-9 c: czcccccct\n" +
            "8-10 c: cwcgcccfcwc\n" +
            "13-15 v: vbfvvvvwvvvvnvjvvv\n" +
            "12-13 j: jfjjjmjjchjjjjjjj\n" +
            "2-7 s: sgcswlb\n" +
            "4-6 f: fffccrfks\n" +
            "4-16 h: hwqhhgdhqzhhfhhhh\n" +
            "4-13 k: kvkkkkkkgkkkkkkk\n" +
            "12-13 r: qdfwlrwxpqjsrdg\n" +
            "1-8 k: bkkkkkkpkrk\n" +
            "4-7 j: jjjxjjn\n" +
            "7-9 m: mmzmkmvmmlm\n" +
            "9-10 k: kpkkkbbkdknkkkd\n" +
            "3-4 s: sskw\n" +
            "8-9 b: bbbsbbblmbjbqbbbb\n" +
            "11-12 g: gggggggggfgn\n" +
            "1-2 f: fqrtz\n" +
            "4-6 m: mmmmmm\n" +
            "2-9 t: tmntbqqtd\n" +
            "4-12 m: rwbfnkrmmttmn\n" +
            "9-10 n: ncnnknnnzvn\n" +
            "1-3 f: fffffffffffw\n" +
            "3-5 x: lvxgxlx\n" +
            "3-17 c: rjgsstrzjmhqcrcccmg\n" +
            "9-10 n: nnbnnnnnnnn\n" +
            "4-7 p: pppfpptpp\n" +
            "4-5 l: lllhw\n" +
            "10-14 q: lrccqhjkqqrnpqq\n" +
            "2-9 q: jqqhqqqqqwdrxq\n" +
            "11-15 r: xrrrrrrrrgdrrrnrcr\n" +
            "2-5 b: cbbfcd\n" +
            "6-13 l: fxlnjlklbglnln\n" +
            "3-6 v: wvwrwkvtqnvgbvv\n" +
            "14-19 p: prpppznppkrjwrtpspk\n" +
            "5-6 w: khvwwwwsxwlb\n" +
            "10-16 f: fffwcffzfffjfffflfn\n" +
            "1-5 r: rhsrktwlkbmgs\n" +
            "9-10 z: zznzzmznzzznzgzzrq\n" +
            "2-6 k: kkkkkwk\n" +
            "7-8 l: rllclllllvlmhbzlqct\n" +
            "3-9 b: pwbbbbdwblzwxx\n" +
            "2-5 d: cxrddddddfddrqt\n" +
            "8-9 j: cknlrwqnnj\n" +
            "6-8 j: jjjjjrjw\n" +
            "1-5 g: gfqgg\n" +
            "1-2 n: nktnn\n" +
            "4-7 c: cccccchc\n" +
            "1-5 d: dddddhdz\n" +
            "14-16 f: vbwfxffmjfxjrdffwfxz\n" +
            "2-8 m: npnwxrlhmmmwmf\n" +
            "10-11 s: vssnrsksssssnswst\n" +
            "6-10 z: zzhzzzvrzdh\n" +
            "7-11 r: rfhdrrrrrrrrr\n" +
            "3-4 v: gfvvcvrgv\n" +
            "7-11 r: drxqrdrrrcrsrwrpjmrm\n" +
            "2-6 f: xfnmxfhfwd\n" +
            "3-7 z: ggtkmmzz\n" +
            "2-4 m: mmkm\n" +
            "6-7 v: pdvqvvsvvrfvvmxpfq\n" +
            "2-7 t: nttnfcttlz\n" +
            "6-9 f: fffxkfrnffgjrjfz\n" +
            "2-4 s: nmpfs\n" +
            "1-4 n: dhpn\n" +
            "8-10 d: ddqdddddddddd\n" +
            "4-5 x: xzxnwxxxx\n" +
            "11-12 p: ppcppppppppn\n" +
            "5-11 s: rgsssrqssss\n" +
            "3-5 z: vjzzzq\n" +
            "11-12 r: rrrrrrrrrrrr\n" +
            "1-2 t: ttstnw\n" +
            "18-20 b: bssdfwzspgjdglxnhqrb\n" +
            "2-3 z: zzzhjkjklhwc\n" +
            "12-14 f: ffmffffwfffpfffff\n" +
            "10-13 s: kscrplsqsxsfcsbnszqh\n" +
            "1-20 w: wkwcvwwfwtwpwwwjwwww\n" +
            "2-5 k: kkkkm\n" +
            "9-12 c: czpccccbbbcccc\n" +
            "5-6 v: vxmvkg\n" +
            "3-4 f: ffns\n" +
            "7-13 t: thtttcgttttttmntct\n" +
            "2-3 c: gqwb\n" +
            "12-13 w: jwjtzwjwwwwwb\n" +
            "13-16 n: nnpnnnnnwjnghnfnxknn\n" +
            "10-12 b: bbbhbbbbbbbbvb\n" +
            "16-18 n: nnnnnnjnnnnnnnnnpn\n" +
            "4-7 s: wssstjs\n" +
            "2-5 v: tvhbvmxzt\n" +
            "2-3 x: fxtx\n" +
            "2-9 q: mqpgsdvdsfdqgx\n" +
            "4-6 c: cqfntrvjtdk\n" +
            "5-7 f: ffffmfcq\n" +
            "14-15 m: mjmmmmmmmmmmmgx\n" +
            "5-11 j: gxjjjjjhbjjjhwxvjtg\n" +
            "6-9 m: mmmxmfvjcgm\n" +
            "2-5 j: jqjjrjjj\n" +
            "13-14 h: hghrhhhhhhhhzh\n" +
            "3-4 x: xxxs\n" +
            "15-16 h: hhhhhhrhhhhlghvhkhh\n" +
            "5-6 l: lllldl\n" +
            "1-5 t: gtflt\n" +
            "10-11 f: fvfrrfffpnczj\n" +
            "8-13 s: sssvnsztsssdsssps\n" +
            "13-16 c: ccqccccgcccczccnbcc\n" +
            "7-9 h: hqszthxczlhthhhjbhk\n" +
            "3-6 f: vrfwff\n" +
            "11-17 f: fffffjffffqfffffgfz\n" +
            "2-4 t: xstt\n" +
            "2-7 c: ckccqcscccbc\n" +
            "5-18 k: wkkkkkkhkkkkkkkfgq\n" +
            "19-20 p: ptcpbpppppzpzrdkpxhk\n" +
            "1-2 j: vsfjf\n" +
            "3-4 f: bfffkffvk\n" +
            "4-14 h: hhhghghhhhhhhlhhh\n" +
            "15-17 p: pvdpppppppppppppp\n" +
            "8-13 m: mkmmmmggmczwmmlmmm\n" +
            "6-14 b: bfdhgncbhcbbqgmbp\n" +
            "2-4 z: dzpzfzz\n" +
            "7-13 f: ffffffffffffnf\n" +
            "5-12 z: zgzkzfpzzzzzgqhz\n" +
            "7-11 s: cssnpsrslshsszs\n" +
            "8-9 f: fffffffff\n" +
            "5-8 n: nnnnhnnnn\n" +
            "11-12 j: jjjmjjjjjjxjd\n" +
            "1-18 x: vjbxxxxmxxxrxwmsxxxx\n" +
            "8-9 r: rrrrrrrrrr\n" +
            "10-12 z: zzzzcrzzzzzzz\n" +
            "1-3 t: ttttt\n" +
            "2-6 h: hhhfhh\n" +
            "3-10 w: wkwfdctzzwnv\n" +
            "14-17 v: vvvvvvvvvvvvvlvvtv\n" +
            "12-14 h: tmlhvrsscqphnhdtdtm\n" +
            "7-9 f: fbffjxfszffg\n" +
            "6-8 h: thhhsgjr\n" +
            "4-14 s: fqnbddlrwqcsswnff\n" +
            "11-12 d: ddddddddkxddd\n" +
            "11-14 p: jhxpppcppphpppppp\n" +
            "3-5 s: sssslk\n" +
            "10-12 v: vvvvvvvvvqvk\n" +
            "9-10 d: ddddddddgrdk\n" +
            "12-18 s: swlsssssdsksvssspz\n" +
            "2-4 k: nqfkd\n" +
            "5-13 m: msxnwjwdqkssm\n" +
            "3-7 k: kkkkkkgk\n" +
            "14-15 w: wwwwwghwwwwwwwcw\n" +
            "1-6 q: qqrqqqqqq\n" +
            "3-4 t: tsbz\n" +
            "9-16 s: sdsbwzzssssssssxc\n" +
            "12-16 w: wwwzwwwwwwwzwxwsw\n" +
            "1-3 p: gpnwgsstmpr\n" +
            "5-6 m: gdmmbzm\n" +
            "1-3 k: jkhkkkk\n" +
            "11-16 s: sssshsspssppsssmsstv\n" +
            "19-20 g: gggggggggggggggggghf\n" +
            "4-5 x: xxxrmx\n" +
            "17-18 h: hhhlhhhmhhhhhhhhhhh\n" +
            "1-16 k: tkkkkkkkkkkkkkkkkkk\n" +
            "5-7 x: xjrhxxxxwx\n" +
            "2-3 t: ttcx\n" +
            "4-5 m: vmsmmlmmmjh\n" +
            "6-7 g: ggggggg\n" +
            "7-11 r: drrvzhrrgqfrfr\n" +
            "3-4 q: mqcj\n" +
            "4-10 q: vqzbqzqqfqhdrncgpptk\n" +
            "2-8 k: jkftkskk\n" +
            "5-13 l: gfkxlbmczmzbhgl\n" +
            "13-18 x: xxxxxxxxxxxxfmlrxh\n" +
            "8-10 q: nqqqqqqgqqqq\n" +
            "2-6 m: kcfqmcjzbw\n" +
            "3-5 k: kkkszl\n" +
            "3-4 h: hhfhh\n" +
            "1-3 k: kbkzkqk\n" +
            "5-6 l: shlznplzllvrk\n" +
            "1-7 n: knnnnnnnnn\n" +
            "5-7 n: csfnnmn\n" +
            "5-11 x: xpxxxxwxxxxq\n" +
            "3-10 f: fffffblffcffffd\n" +
            "7-9 h: dghhhhscvhhhh\n" +
            "3-4 q: qkwwq\n" +
            "5-6 s: sszdsvss\n" +
            "3-8 s: lshsslsslsss\n" +
            "3-10 m: twmmwtcrpmz\n" +
            "5-12 w: rwjrrcwfgwwnk\n" +
            "10-11 g: npfbgvsgbmg\n" +
            "6-8 w: vwwwxwwkgw\n" +
            "1-3 n: hnbn\n" +
            "8-10 b: bbbbbbmbbw\n" +
            "2-11 k: fkgtskhzjzkf\n" +
            "7-9 q: qqqtqqvqp\n" +
            "9-14 b: bpqpbbldbqwbwc\n" +
            "1-5 c: xrlwjm\n" +
            "1-3 f: ffsv\n" +
            "14-16 n: nnnndnnnnnnnnpndn\n" +
            "9-13 x: xxmxwpxxxxxxlhxxxxx\n" +
            "8-11 f: frhqgdcflvf\n" +
            "3-7 l: zrbslhpbjgkcvbjfq\n" +
            "1-2 h: thnkhhl\n" +
            "5-8 b: bbbbbbbnxb\n" +
            "6-7 b: bsgbtth\n" +
            "18-19 m: mpmmmmmmmmmmmmmmmwmm\n" +
            "14-15 w: wwwwwnwwwwwwwfx\n" +
            "14-17 d: ddxdddddddddddddd\n" +
            "13-16 k: kkkkkkkkkkkkkkkkkkk\n" +
            "3-10 h: jkhhnknnthjbwxswqjc\n" +
            "11-14 d: ddddddddddddddd\n" +
            "5-10 h: xjrbhcsjjhn\n" +
            "6-7 n: jgzqntv\n" +
            "9-12 f: ffffffjfbffffqf\n" +
            "1-12 q: wqqqqqqqqqqqq\n" +
            "6-11 l: lllllqllllcqlhl\n" +
            "3-4 r: rrrrfvrchslkldq\n" +
            "1-13 s: szsssjscwksfssssw\n" +
            "5-9 b: vjwtbkwbbnbbhbbbszbc\n" +
            "1-3 n: kntnn\n" +
            "8-9 p: pppppppqcp\n" +
            "12-13 c: cccccqccccchc\n" +
            "17-18 w: wwwwwwwwwwkwwwwwmdr\n" +
            "2-3 h: hfrghmhh\n" +
            "5-6 t: jxttttttttt\n" +
            "1-3 m: vmnh\n" +
            "8-11 c: cccqcxcjccj\n" +
            "2-10 v: vvvvkvkvrvv\n" +
            "3-8 j: ksjrzwqjnvfchjxq\n" +
            "4-8 b: bbbxsbbtqrbb\n" +
            "7-19 b: bbbbmbhkbsbbbbhbtbf\n" +
            "2-4 g: lqsg\n" +
            "10-14 z: zgzzzhzzkwzzzzpzhzz\n" +
            "7-8 m: bmmmmvsqmpdjmtm\n" +
            "4-6 z: cgmzlzwhfgkrhgzszvwd\n" +
            "1-3 w: pbwwwq\n" +
            "3-6 v: vvvvvv\n" +
            "13-14 m: zmfpcmmxbwspmmkpx\n" +
            "3-4 x: xtxrb\n" +
            "8-9 p: ppppsxpppcpl\n" +
            "7-9 s: qtsscqbjn\n" +
            "5-6 q: qmcxqqqm\n" +
            "3-4 n: nnnwqjknqf\n" +
            "4-5 s: snssj\n" +
            "8-16 v: vfvvhvvtvvvjdvvfvv\n" +
            "3-7 m: mqcwmpxsm\n" +
            "3-5 p: hrppp\n" +
            "2-5 f: tkfff\n" +
            "5-9 f: ffbffffff\n" +
            "3-6 d: bxjdfdk\n" +
            "8-12 l: lllllhlllvlllllll\n" +
            "4-13 g: gggwgjlvmqgdgfg\n" +
            "5-7 v: wvkkvbvcrvtvvmh\n" +
            "14-15 h: hhhhhhhhhhhhhjh\n" +
            "14-16 p: tpkppppppppppppppppp";

    private static final String inputDayThree = "....#...............#.#..###.##\n" +
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

    private static final String inputDayFour = "ecl:#eef340 eyr:2023 hcl:#c0946f pid:244684338 iyr:2020 cid:57 byr:1969 hgt:152cm\n" +
            "\n" +
            "pid:303807545 cid:213 ecl:gry hcl:#fffffd\n" +
            "eyr:2038 byr:1951\n" +
            "hgt:171cm iyr:2011\n" +
            "\n" +
            "hcl:#c0946f byr:1933 eyr:2025 pid:517067213 hgt:173cm\n" +
            "ecl:hzl\n" +
            "iyr:2018\n" +
            "\n" +
            "pid:5253256652 byr:2009 hgt:152cm iyr:1989 eyr:1968 hcl:64cb63 ecl:hzl\n" +
            "\n" +
            "iyr:2013\n" +
            "pid:862607211 eyr:2020\n" +
            "hgt:174cm\n" +
            "byr:1990\n" +
            "ecl:blu hcl:#888785\n" +
            "\n" +
            "ecl:grn byr:1955\n" +
            "pid:608098408 eyr:2027 iyr:2020 hcl:#b6652a cid:264\n" +
            "hgt:181cm\n" +
            "\n" +
            "byr:1998 ecl:hzl eyr:2021\n" +
            "hcl:#866857 hgt:189cm iyr:2030\n" +
            "pid:013735467\n" +
            "\n" +
            "pid:075417314 hcl:#b6652a byr:1957\n" +
            "iyr:2011\n" +
            "hgt:154cm\n" +
            "eyr:2025\n" +
            "ecl:amb\n" +
            "\n" +
            "iyr:1993 hgt:74cm eyr:1960\n" +
            "byr:2029\n" +
            "hcl:293244 ecl:#3cb5e5 pid:4861232363\n" +
            "\n" +
            "hgt:153cm hcl:#6b5442 pid:065240897 byr:1932\n" +
            "cid:196 ecl:blu eyr:2028 iyr:2019\n" +
            "\n" +
            "eyr:2024 ecl:amb\n" +
            "hcl:#866857 byr:1922 pid:496904942 hgt:164cm iyr:2020\n" +
            "\n" +
            "pid:847705161 byr:1951 cid:124 iyr:1991\n" +
            "eyr:2028 ecl:dne\n" +
            "hcl:6b2d28 hgt:172cm\n" +
            "\n" +
            "byr:2007 iyr:2029 ecl:hzl eyr:2026 hgt:168in\n" +
            "hcl:z\n" +
            "pid:63151612\n" +
            "\n" +
            "iyr:2027 hgt:172in\n" +
            "cid:174 byr:2014 hcl:z eyr:1921\n" +
            "ecl:grt pid:#cebdc2\n" +
            "\n" +
            "ecl:amb hcl:#d09c0f\n" +
            "iyr:2015 hgt:156cm eyr:2026 byr:1962\n" +
            "pid:086120872\n" +
            "\n" +
            "cid:125\n" +
            "pid:837849996\n" +
            "byr:1958 ecl:brn hgt:166cm hcl:#ceb3a1 eyr:2028 iyr:2012\n" +
            "\n" +
            "ecl:gry hgt:180cm\n" +
            "pid:939059935 eyr:2023 byr:1977 hcl:#b6652a\n" +
            "\n" +
            "hgt:190in byr:2029 eyr:1984\n" +
            "ecl:gry hcl:z pid:055092916 iyr:2010\n" +
            "\n" +
            "hgt:63in ecl:blu byr:1940 iyr:2012 eyr:2029 hcl:#7d3b0c\n" +
            "pid:163033394\n" +
            "\n" +
            "eyr:2040 pid:181cm\n" +
            "iyr:1928 hgt:76cm hcl:d8aafb byr:1949 cid:275 ecl:xry\n" +
            "\n" +
            "hcl:#cfa07d ecl:oth byr:1948 eyr:2021\n" +
            "pid:719690182 hgt:179cm iyr:2020\n" +
            "\n" +
            "byr:1939 cid:266\n" +
            "eyr:2026 iyr:2017 hcl:#f116d2\n" +
            "ecl:hzl pid:522421825\n" +
            "hgt:68in\n" +
            "\n" +
            "hcl:z hgt:61in\n" +
            "cid:115 pid:180cm iyr:2030 byr:2014 eyr:2032 ecl:hzl\n" +
            "\n" +
            "ecl:xry\n" +
            "eyr:2028 pid:191cm iyr:2015 hgt:150cm byr:2029\n" +
            "\n" +
            "eyr:2027\n" +
            "hcl:#a97842 pid:997937480 hgt:61in iyr:2019\n" +
            "byr:1921\n" +
            "ecl:grn\n" +
            "\n" +
            "hgt:163cm\n" +
            "pid:912318455 iyr:2016 byr:1988 ecl:brn hcl:#a97842 cid:221 eyr:2029\n" +
            "\n" +
            "cid:333 hcl:#c0946f\n" +
            "hgt:163cm iyr:2018 eyr:2027 ecl:oth\n" +
            "\n" +
            "cid:70 hcl:#c0946f\n" +
            "pid:961507902 byr:1949 ecl:grn iyr:2017 eyr:2029 hgt:69in\n" +
            "\n" +
            "hgt:169cm ecl:amb\n" +
            "iyr:2013 pid:496169901\n" +
            "byr:1943 eyr:2028 hcl:#ceb3a1\n" +
            "cid:249\n" +
            "\n" +
            "ecl:blu cid:343\n" +
            "iyr:1998 hgt:154in hcl:#efcc98 byr:1972\n" +
            "\n" +
            "pid:508213120 iyr:2012 eyr:2025 hcl:z hgt:70cm byr:1976\n" +
            "ecl:brn\n" +
            "\n" +
            "iyr:1924\n" +
            "eyr:2005\n" +
            "hcl:z\n" +
            "hgt:167 pid:154cm\n" +
            "byr:2007\n" +
            "\n" +
            "pid:761333244 hgt:180cm iyr:2017 hcl:#18171d eyr:2021\n" +
            "byr:1983\n" +
            "cid:67 ecl:oth\n" +
            "\n" +
            "eyr:1993\n" +
            "byr:2003\n" +
            "hcl:#602927\n" +
            "ecl:grt\n" +
            "cid:84 hgt:178\n" +
            "pid:1847086637 iyr:2026\n" +
            "\n" +
            "hcl:#866857 hgt:162cm pid:483774485 iyr:2010\n" +
            "byr:1946 eyr:2028 ecl:gry\n" +
            "\n" +
            "pid:726639691 eyr:2028\n" +
            "hgt:171cm hcl:#ff65a6\n" +
            "iyr:2011 byr:1989\n" +
            "\n" +
            "hcl:z iyr:2026 ecl:xry\n" +
            "eyr:2037 byr:2005 pid:#f09a0f\n" +
            "hgt:68 cid:156\n" +
            "\n" +
            "hgt:71in ecl:blu eyr:2026 hcl:#18171d\n" +
            "byr:1981 iyr:2017\n" +
            "pid:698636544\n" +
            "\n" +
            "eyr:2021\n" +
            "byr:1957 ecl:brn pid:365378126 cid:93 iyr:2019 hcl:#18171d hgt:179cm\n" +
            "\n" +
            "byr:1996 iyr:2014 hgt:64cm\n" +
            "eyr:2034\n" +
            "hcl:z\n" +
            "\n" +
            "pid:629486472 cid:140\n" +
            "hgt:192cm eyr:2020 hcl:#b6652a iyr:1988 byr:2021 ecl:brn\n" +
            "\n" +
            "byr:1955 iyr:2015 eyr:2030\n" +
            "ecl:gry hcl:z pid:6550198754\n" +
            "hgt:158cm cid:305\n" +
            "\n" +
            "ecl:gry hcl:#a97842\n" +
            "hgt:176cm eyr:2022 pid:810146585 iyr:2020\n" +
            "\n" +
            "byr:2027 hcl:#cfa07d\n" +
            "iyr:2011 ecl:#f07598\n" +
            "cid:293\n" +
            "hgt:150cm pid:#fa948d eyr:2029\n" +
            "\n" +
            "eyr:2028 iyr:2013 hgt:69in ecl:gry pid:317170371\n" +
            "cid:147 hcl:#bfe1f1\n" +
            "\n" +
            "byr:1976\n" +
            "pid:059341891 hgt:174cm\n" +
            "ecl:oth\n" +
            "eyr:2029 iyr:2017 hcl:#733820\n" +
            "\n" +
            "iyr:2018 hcl:#ceb3a1 hgt:188cm cid:308\n" +
            "pid:792826885 byr:1948 ecl:blu eyr:2028\n" +
            "\n" +
            "iyr:2017 cid:94 hcl:#95c7dc\n" +
            "pid:231757803 eyr:2022\n" +
            "byr:1992 hgt:153cm ecl:amb\n" +
            "\n" +
            "eyr:2027\n" +
            "iyr:2011 hgt:186cm\n" +
            "ecl:brn pid:996347346 hcl:#866857\n" +
            "byr:1960\n" +
            "\n" +
            "eyr:2025 byr:2001\n" +
            "ecl:blu pid:755715478 iyr:2019 hgt:61in\n" +
            "\n" +
            "ecl:gry\n" +
            "eyr:2038\n" +
            "hgt:81 hcl:z iyr:2028\n" +
            "cid:214 byr:1965\n" +
            "\n" +
            "pid:412744447 byr:1979 hcl:#cfa07d ecl:blu\n" +
            "eyr:2029 cid:157\n" +
            "hgt:180in iyr:1948\n" +
            "\n" +
            "hgt:170cm\n" +
            "pid:623557081 byr:1924 eyr:2024 hcl:98d623 iyr:2012 ecl:amb\n" +
            "\n" +
            "cid:311 ecl:grn\n" +
            "iyr:2011 byr:1982\n" +
            "eyr:2002 hcl:#ef318a\n" +
            "pid:0548169957\n" +
            "hgt:87\n" +
            "\n" +
            "eyr:2030 hcl:#733820 iyr:2016 pid:558470391\n" +
            "byr:1936 ecl:oth hgt:185cm\n" +
            "\n" +
            "iyr:2019\n" +
            "ecl:amb byr:1949\n" +
            "pid:376468392\n" +
            "hgt:178cm\n" +
            "\n" +
            "pid:019195245\n" +
            "ecl:grn hgt:171cm\n" +
            "byr:1978 iyr:2011 eyr:2022 hcl:#733820\n" +
            "cid:134\n" +
            "\n" +
            "hcl:#623a2f hgt:192cm eyr:2026 byr:1977\n" +
            "ecl:grn cid:308\n" +
            "\n" +
            "ecl:hzl pid:715816358 hgt:69in iyr:2014 hcl:#623a2f\n" +
            "byr:1996\n" +
            "eyr:2027\n" +
            "\n" +
            "iyr:1947\n" +
            "ecl:#39a697\n" +
            "hgt:183cm byr:2029\n" +
            "eyr:2022 pid:7951883913\n" +
            "hcl:z\n" +
            "\n" +
            "ecl:gry byr:1950\n" +
            "hcl:#18171d hgt:168cm iyr:2020 pid:677187333 eyr:2027\n" +
            "\n" +
            "byr:1969 ecl:blu hcl:#18171d iyr:2011\n" +
            "hgt:162cm\n" +
            "pid:701349891\n" +
            "\n" +
            "cid:269 byr:1966\n" +
            "iyr:2011\n" +
            "pid:905940527 eyr:2023 hgt:190cm\n" +
            "ecl:brn hcl:#ceb3a1\n" +
            "\n" +
            "eyr:2027 pid:454627395 ecl:brn\n" +
            "hcl:#ceb3a1 cid:302 hgt:184cm\n" +
            "byr:1959\n" +
            "iyr:2015\n" +
            "\n" +
            "iyr:2011\n" +
            "eyr:2028\n" +
            "hgt:166cm\n" +
            "hcl:#733820 byr:1938 ecl:blu pid:857984986\n" +
            "\n" +
            "hcl:#c0946f ecl:brn pid:226877822\n" +
            "hgt:182cm byr:1998\n" +
            "cid:160\n" +
            "\n" +
            "hgt:186in pid:26499164 byr:2017\n" +
            "hcl:z\n" +
            "iyr:1998 eyr:2026\n" +
            "cid:331 ecl:#236556\n" +
            "\n" +
            "pid:328866543\n" +
            "hgt:165cm eyr:2039 iyr:1987 ecl:amb byr:2018 hcl:z\n" +
            "\n" +
            "iyr:2016 eyr:2036 hcl:#888785 byr:1976 pid:160402352 hgt:76cm ecl:blu\n" +
            "\n" +
            "ecl:blu\n" +
            "hcl:#fffffd eyr:2025 hgt:66in pid:979788527\n" +
            "byr:1957 iyr:2013\n" +
            "\n" +
            "ecl:grn pid:279357265 iyr:2019 eyr:2021 byr:1953\n" +
            "hgt:177cm hcl:#c0946f\n" +
            "\n" +
            "ecl:oth hcl:z eyr:2025 byr:1949 hgt:189cm iyr:2020 pid:901383503\n" +
            "\n" +
            "byr:2019 hcl:#733820\n" +
            "pid:31022828 eyr:1929\n" +
            "hgt:75cm iyr:2012 ecl:grn\n" +
            "\n" +
            "pid:080462937\n" +
            "ecl:blu hcl:#866857\n" +
            "cid:102\n" +
            "iyr:2013 eyr:2025 byr:1975 hgt:64in\n" +
            "\n" +
            "iyr:2016\n" +
            "eyr:2028\n" +
            "cid:125\n" +
            "byr:1979 hcl:#866857\n" +
            "ecl:brn hgt:173cm pid:814947616\n" +
            "\n" +
            "hcl:z byr:2020 pid:#c3b54b hgt:174in eyr:2038\n" +
            "iyr:2016\n" +
            "ecl:gmt\n" +
            "\n" +
            "cid:132\n" +
            "iyr:1958\n" +
            "pid:61543452 hcl:z\n" +
            "ecl:zzz eyr:2039 byr:2006\n" +
            "\n" +
            "cid:55 eyr:2022 byr:1954 iyr:2015\n" +
            "hgt:188cm hcl:#a97842 pid:49143631 ecl:amb\n" +
            "\n" +
            "hgt:152cm\n" +
            "byr:1982\n" +
            "iyr:2013 ecl:blu\n" +
            "hcl:#341e13\n" +
            "eyr:2026 pid:440841976\n" +
            "\n" +
            "iyr:2019 ecl:blu pid:553456616 hcl:#733820 hgt:160cm byr:1932 eyr:2030\n" +
            "\n" +
            "byr:1980 hgt:169cm hcl:#7d3b0c cid:312 iyr:2010\n" +
            "eyr:2026 pid:028550304 ecl:grn\n" +
            "\n" +
            "ecl:amb eyr:2021 iyr:2014 hgt:71in pid:986053283 byr:1981\n" +
            "\n" +
            "ecl:oth\n" +
            "eyr:2023 hcl:#888785\n" +
            "byr:1949\n" +
            "iyr:2016 pid:699325656\n" +
            "\n" +
            "hgt:63cm cid:297 eyr:2020 pid:990390922\n" +
            "hcl:#602927 ecl:lzr\n" +
            "iyr:2012 byr:2016\n" +
            "\n" +
            "hcl:9ea2fa eyr:2023 pid:088680493\n" +
            "byr:1998 iyr:2017 ecl:utc hgt:170cm cid:175\n" +
            "\n" +
            "cid:316 iyr:2016 eyr:2026 hcl:#79ff1d hgt:65in\n" +
            "byr:1997 pid:215466710 ecl:oth\n" +
            "\n" +
            "cid:213 byr:1983 hcl:#888785 iyr:2016 pid:767747981 eyr:2025\n" +
            "ecl:hzl hgt:168cm\n" +
            "\n" +
            "eyr:2030 byr:1972\n" +
            "cid:282\n" +
            "ecl:gry hgt:178cm\n" +
            "hcl:#a97842\n" +
            "iyr:2018\n" +
            "\n" +
            "hcl:#6b5442 ecl:amb\n" +
            "eyr:2028 cid:104 hgt:159cm pid:446429120 iyr:2012\n" +
            "byr:1938\n" +
            "\n" +
            "byr:1940 hgt:178cm ecl:oth\n" +
            "hcl:#ceb3a1\n" +
            "pid:845683663 iyr:2015 eyr:2024\n" +
            "\n" +
            "byr:1940 pid:496262233\n" +
            "hgt:184cm hcl:#b6652a\n" +
            "ecl:grn cid:152 iyr:2012 eyr:2029\n" +
            "\n" +
            "hgt:185cm pid:455744229 byr:1954 eyr:2022 ecl:gry hcl:#6b5442 iyr:2012\n" +
            "\n" +
            "hgt:182cm byr:1966 eyr:2028 ecl:#a5b7fc\n" +
            "iyr:2029\n" +
            "\n" +
            "pid:343591896\n" +
            "cid:58\n" +
            "ecl:hzl\n" +
            "eyr:2022 hgt:180in byr:2021\n" +
            "hcl:#6b5442\n" +
            "\n" +
            "ecl:utc hcl:#b6652a\n" +
            "pid:635147657 byr:2020\n" +
            "eyr:2022 hgt:157cm iyr:2018\n" +
            "\n" +
            "ecl:grt cid:312 iyr:1959 pid:154262836\n" +
            "hgt:171cm\n" +
            "hcl:#fffffd\n" +
            "eyr:2024\n" +
            "byr:1982\n" +
            "\n" +
            "hcl:#7a12b4 pid:223424149 ecl:hzl hgt:175cm\n" +
            "byr:1930 iyr:2010 eyr:2028\n" +
            "\n" +
            "hcl:#c0946f pid:633476454 eyr:2026 iyr:2011\n" +
            "byr:1934\n" +
            "hgt:186cm\n" +
            "cid:289 ecl:gry\n" +
            "\n" +
            "hcl:#fffffd pid:376300524 hgt:155cm byr:1964 iyr:2017 eyr:2021 ecl:grn\n" +
            "\n" +
            "hcl:a5d4dc byr:2006 cid:165 ecl:#db800f iyr:2029 pid:0199789970 eyr:1961 hgt:61cm\n" +
            "\n" +
            "eyr:2027 hgt:170cm iyr:2010\n" +
            "hcl:#c0946f\n" +
            "ecl:grn pid:415726530\n" +
            "byr:1985\n" +
            "\n" +
            "cid:197 byr:1957 hgt:192in hcl:#a97842 ecl:hzl eyr:2029 pid:958973455 iyr:2011\n" +
            "\n" +
            "iyr:2015 pid:933689314 hgt:162cm ecl:amb\n" +
            "cid:122 eyr:2021\n" +
            "hcl:#6b5442 byr:1973\n" +
            "\n" +
            "eyr:2026 hgt:172cm\n" +
            "iyr:2012\n" +
            "ecl:brn hcl:#733820 pid:004474632\n" +
            "byr:2000\n" +
            "\n" +
            "hgt:191cm eyr:2030 byr:1999 pid:9155071477 iyr:2026 hcl:#602927 cid:315\n" +
            "ecl:grn\n" +
            "\n" +
            "iyr:2010 pid:182884251 hcl:#18171d hgt:154cm\n" +
            "eyr:2020\n" +
            "byr:1926 ecl:oth\n" +
            "\n" +
            "iyr:2019 eyr:1920 pid:132839546\n" +
            "cid:283 hgt:188in hcl:#efcc98 byr:2027\n" +
            "\n" +
            "iyr:2011 hgt:177cm\n" +
            "cid:117 byr:1976\n" +
            "ecl:gry\n" +
            "hcl:#623a2f eyr:2030 pid:134592046\n" +
            "\n" +
            "byr:1968 hgt:146\n" +
            "iyr:2013 hcl:eefdc4 eyr:2028\n" +
            "ecl:xry pid:722120008\n" +
            "\n" +
            "iyr:2016 byr:1941 hgt:67cm cid:51 hcl:#b6652a ecl:hzl eyr:2034 pid:994005715\n" +
            "\n" +
            "hcl:#cfa07d ecl:oth\n" +
            "hgt:182cm eyr:2021 pid:612583941\n" +
            "byr:1983\n" +
            "iyr:2019\n" +
            "\n" +
            "byr:1922\n" +
            "hcl:#602927 hgt:161cm ecl:gry eyr:2020 pid:190170808 iyr:2013\n" +
            "\n" +
            "hgt:63cm cid:136\n" +
            "iyr:1999\n" +
            "pid:8235748647 hcl:z\n" +
            "byr:2022 eyr:1933\n" +
            "ecl:#304383\n" +
            "\n" +
            "cid:273 ecl:blu hcl:z\n" +
            "iyr:2011 byr:2007\n" +
            "eyr:2020\n" +
            "pid:942473857 hgt:178in\n" +
            "\n" +
            "ecl:grt byr:2029 hgt:187in eyr:2030 cid:160\n" +
            "hcl:#efcc98 pid:#39f22b\n" +
            "iyr:1966\n" +
            "\n" +
            "byr:1978 ecl:oth iyr:2011 hgt:164cm eyr:2027 hcl:#cfa07d\n" +
            "\n" +
            "hgt:75cm hcl:#1e8137 byr:1986 ecl:blu eyr:2022 pid:796688423\n" +
            "iyr:2012\n" +
            "\n" +
            "eyr:2026\n" +
            "ecl:#3013af hcl:z pid:#e8597f hgt:123 iyr:2025 byr:1942\n" +
            "\n" +
            "hcl:z hgt:177in\n" +
            "iyr:1993 pid:#4c9348 byr:2008 eyr:1989\n" +
            "\n" +
            "pid:123524366 byr:1935\n" +
            "hgt:156cm hcl:#7d3b0c\n" +
            "iyr:2020 ecl:brn eyr:2020\n" +
            "\n" +
            "hcl:z eyr:2038 pid:7663741757 ecl:gmt hgt:174\n" +
            "byr:2008 iyr:1939\n" +
            "cid:225\n" +
            "\n" +
            "hcl:#888785 hgt:172cm\n" +
            "ecl:oth pid:500711541 eyr:2027\n" +
            "byr:1931 iyr:2012\n" +
            "\n" +
            "pid:575447108 ecl:amb byr:1943\n" +
            "hcl:#888785 hgt:173cm eyr:2024\n" +
            "\n" +
            "eyr:2021 iyr:2010 pid:178773264 hgt:157cm byr:1965 hcl:#bb7bcf ecl:amb\n" +
            "\n" +
            "iyr:2023 ecl:#35bd84 byr:2020\n" +
            "hgt:72in\n" +
            "eyr:2037\n" +
            "hcl:#6b5442\n" +
            "pid:421311669\n" +
            "\n" +
            "byr:1921 iyr:2011\n" +
            "pid:146088688\n" +
            "eyr:2023 hcl:#15ed24 hgt:183cm\n" +
            "ecl:brn\n" +
            "\n" +
            "hcl:#b6652a cid:243\n" +
            "byr:1993 eyr:2024\n" +
            "iyr:2014 hgt:172cm\n" +
            "pid:771275594\n" +
            "\n" +
            "eyr:2024\n" +
            "hcl:#cfa07d pid:858807920 cid:293 hgt:157cm ecl:hzl iyr:2013 byr:1984\n" +
            "\n" +
            "ecl:blu hgt:193cm cid:73 hcl:#18171d eyr:2026\n" +
            "iyr:2016 pid:124151812 byr:1945\n" +
            "\n" +
            "ecl:amb iyr:2018\n" +
            "pid:214555737 hgt:157cm\n" +
            "eyr:2028\n" +
            "byr:1925 hcl:#866857\n" +
            "\n" +
            "pid:5633250409\n" +
            "hcl:4ef7d8\n" +
            "byr:2004 iyr:1958\n" +
            "hgt:96\n" +
            "eyr:2038 ecl:xry cid:274\n" +
            "\n" +
            "byr:1972 pid:401239851 hgt:184in hcl:z iyr:2017\n" +
            "eyr:2030 ecl:#cb289a cid:140\n" +
            "\n" +
            "hgt:175cm\n" +
            "byr:1926 hcl:#cfa07d eyr:2029 ecl:gry pid:325039730 iyr:2017\n" +
            "\n" +
            "cid:101 hgt:166cm byr:1986 ecl:amb\n" +
            "hcl:#7d3b0c iyr:2013\n" +
            "pid:413769688 eyr:2024\n" +
            "\n" +
            "hgt:159cm cid:311\n" +
            "byr:1993 eyr:2028 pid:188cm ecl:oth hcl:#602927 iyr:2013\n" +
            "\n" +
            "pid:565831038\n" +
            "ecl:amb\n" +
            "hgt:155cm hcl:#fffffd cid:335 iyr:2016\n" +
            "eyr:2029 byr:1997\n" +
            "\n" +
            "hgt:122\n" +
            "byr:2022\n" +
            "eyr:2028 ecl:blu iyr:2017 pid:269710626 hcl:#b6652a\n" +
            "\n" +
            "cid:196\n" +
            "byr:1953 hcl:#6b5442 iyr:2010\n" +
            "pid:216121215 hgt:188cm ecl:blu\n" +
            "\n" +
            "iyr:2011 hcl:98166c hgt:62cm\n" +
            "byr:2028\n" +
            "eyr:2024\n" +
            "pid:792478385 ecl:grn\n" +
            "\n" +
            "hcl:#efcc98 iyr:2012 pid:020039675 eyr:2021 byr:1974 hgt:156cm\n" +
            "ecl:hzl\n" +
            "\n" +
            "cid:123 hcl:#7d3b0c\n" +
            "byr:2026 eyr:2004 iyr:2012 ecl:oth pid:349203133 hgt:160cm\n" +
            "\n" +
            "pid:085461475\n" +
            "byr:1962 iyr:2020 hcl:#623a2f\n" +
            "eyr:2024\n" +
            "cid:80 ecl:brn\n" +
            "hgt:154cm\n" +
            "\n" +
            "ecl:oth hgt:156cm iyr:2016\n" +
            "hcl:#6b5442\n" +
            "byr:1973\n" +
            "eyr:2021 pid:539898580\n" +
            "\n" +
            "iyr:2026 hgt:191cm\n" +
            "hcl:z\n" +
            "byr:1930 pid:#abc2f0 ecl:blu cid:242 eyr:2024\n" +
            "\n" +
            "cid:167\n" +
            "hgt:179cm\n" +
            "iyr:2017 eyr:2021 pid:756797571 byr:1949 ecl:brn hcl:#a97842\n" +
            "\n" +
            "byr:1975 eyr:2030\n" +
            "ecl:oth hgt:169in pid:4031206183 hcl:#733820 iyr:2017 cid:244\n" +
            "\n" +
            "ecl:#54cfeb hgt:152cm\n" +
            "iyr:2026 hcl:36b4b9\n" +
            "byr:2030\n" +
            "pid:#fa1cb9 eyr:1964\n" +
            "\n" +
            "byr:1974 cid:99 hcl:9e3296\n" +
            "eyr:2032\n" +
            "pid:686747414\n" +
            "iyr:1995\n" +
            "ecl:amb\n" +
            "\n" +
            "iyr:2030 ecl:oth hcl:z byr:1979\n" +
            "pid:114661006 hgt:191cm eyr:1941\n" +
            "\n" +
            "hcl:#341e13 iyr:2014 byr:1953\n" +
            "pid:188326193 ecl:gry hgt:189cm cid:283\n" +
            "eyr:2030\n" +
            "\n" +
            "byr:1975\n" +
            "pid:092061576 hgt:73in eyr:2023\n" +
            "ecl:brn cid:227 hcl:#5e9d91\n" +
            "iyr:2011\n" +
            "\n" +
            "hcl:#7d3b0c hgt:167cm cid:141\n" +
            "eyr:1957 byr:2012 ecl:gmt iyr:2019 pid:#1b7c8a\n" +
            "\n" +
            "hgt:168cm hcl:#c0946f pid:599500784 byr:1930 eyr:2023 ecl:hzl cid:113\n" +
            "iyr:2013\n" +
            "\n" +
            "eyr:2030 hcl:#b4cb4f\n" +
            "hgt:68in\n" +
            "ecl:brn byr:1923 pid:699162086\n" +
            "\n" +
            "iyr:2013\n" +
            "ecl:dne hcl:z eyr:1971\n" +
            "pid:#580add byr:2020\n" +
            "hgt:190cm\n" +
            "\n" +
            "hcl:#ceb3a1\n" +
            "byr:1976 eyr:2020\n" +
            "cid:162 iyr:2016\n" +
            "hgt:168cm\n" +
            "ecl:hzl\n" +
            "\n" +
            "pid:050478613 hgt:59cm\n" +
            "iyr:2017\n" +
            "ecl:grn byr:2030 hcl:#cfa07d eyr:2025\n" +
            "\n" +
            "pid:352943968 eyr:2025 byr:1980 iyr:2014 ecl:gry hcl:#c0946f\n" +
            "hgt:193cm\n" +
            "\n" +
            "pid:328621931 cid:310 hgt:170cm\n" +
            "hcl:#733820 byr:1955\n" +
            "iyr:2016\n" +
            "eyr:2028 ecl:hzl\n" +
            "\n" +
            "hcl:#866857\n" +
            "pid:095858739 byr:1956\n" +
            "iyr:2018 hgt:193cm\n" +
            "ecl:hzl\n" +
            "eyr:2029\n" +
            "\n" +
            "pid:70973661 eyr:2039 ecl:gry\n" +
            "iyr:2016\n" +
            "cid:291\n" +
            "hcl:#623a2f hgt:97\n" +
            "\n" +
            "hcl:4d51a8\n" +
            "eyr:1978\n" +
            "ecl:gmt\n" +
            "byr:2029 iyr:2022\n" +
            "pid:34507041 hgt:61cm\n" +
            "\n" +
            "byr:1989 ecl:brn pid:769582914\n" +
            "eyr:2026 cid:218\n" +
            "iyr:2020 hcl:#866857 hgt:184cm\n" +
            "\n" +
            "ecl:brn\n" +
            "iyr:1998 cid:227\n" +
            "hgt:162in\n" +
            "byr:2026\n" +
            "hcl:#602927 eyr:2027 pid:236998728\n" +
            "\n" +
            "ecl:gry byr:1984 hgt:157 cid:295\n" +
            "eyr:2020\n" +
            "iyr:2018 hcl:#733820\n" +
            "pid:037871534\n" +
            "\n" +
            "hgt:166cm hcl:#c0946f pid:412146401\n" +
            "iyr:2011\n" +
            "eyr:2022\n" +
            "byr:1938\n" +
            "ecl:brn\n" +
            "\n" +
            "ecl:brn cid:95 byr:1981 eyr:2030 hcl:#efcc98 pid:777041035 hgt:152cm iyr:2011\n" +
            "\n" +
            "eyr:2024 hgt:89 pid:3761913749 iyr:1939 byr:1967 hcl:a222f6 cid:165 ecl:#7fe574\n" +
            "\n" +
            "cid:339 hgt:156cm\n" +
            "ecl:brn iyr:2013 byr:1951 hcl:#efcc98 eyr:2026\n" +
            "pid:863566946\n" +
            "\n" +
            "ecl:brn hcl:#6b5442 eyr:2023\n" +
            "pid:787129723 byr:1949 iyr:2015\n" +
            "\n" +
            "pid:#7f615a\n" +
            "cid:202 hcl:#6b5442 eyr:2028\n" +
            "ecl:#a5419c\n" +
            "hgt:75cm\n" +
            "iyr:2011\n" +
            "byr:2001\n" +
            "\n" +
            "pid:864001133\n" +
            "cid:236\n" +
            "byr:1943 hcl:#733820 ecl:dne eyr:2025 hgt:171cm iyr:1989\n" +
            "\n" +
            "pid:193073684 ecl:grn byr:1962 iyr:2014\n" +
            "hcl:#cfa07d hgt:189cm\n" +
            "cid:321 eyr:2029\n" +
            "\n" +
            "byr:1959\n" +
            "hcl:#b6652a\n" +
            "eyr:2026\n" +
            "hgt:159cm pid:815014918 iyr:2011 ecl:amb\n" +
            "\n" +
            "iyr:2017 hgt:182cm\n" +
            "hcl:#a97842 eyr:2023 ecl:grn pid:656177536\n" +
            "byr:1973\n" +
            "\n" +
            "eyr:1923 ecl:grn\n" +
            "cid:138 iyr:2020\n" +
            "hgt:164cm byr:1958 hcl:#c0946f pid:783366277\n" +
            "\n" +
            "iyr:1932 hgt:172 ecl:blu\n" +
            "hcl:#733820 byr:1962 pid:554221464\n" +
            "\n" +
            "cid:169 pid:922622614\n" +
            "byr:1942 hcl:#ceb3a1 hgt:169cm eyr:2024\n" +
            "ecl:gry iyr:2017\n" +
            "\n" +
            "cid:219 ecl:grn\n" +
            "hgt:156cm byr:1998 eyr:2021\n" +
            "iyr:2017 hcl:#ceb3a1 pid:450186263\n" +
            "\n" +
            "ecl:amb hgt:179cm pid:768428582 iyr:2010 eyr:2023 byr:1952 hcl:#fffffd\n" +
            "\n" +
            "eyr:2024\n" +
            "hgt:193cm\n" +
            "iyr:2017 pid:469033795 byr:1979 hcl:#18171d cid:67 ecl:amb\n" +
            "\n" +
            "iyr:2016 byr:1937 pid:798267514 hgt:155cm hcl:#866857 eyr:2026\n" +
            "ecl:oth\n" +
            "\n" +
            "hgt:172cm hcl:#866857 iyr:2018 pid:662186551\n" +
            "byr:1996\n" +
            "eyr:2025 ecl:amb\n" +
            "\n" +
            "pid:2854521962\n" +
            "iyr:2021\n" +
            "ecl:zzz\n" +
            "hcl:12f1ba eyr:2037 hgt:159cm\n" +
            "byr:1937\n" +
            "\n" +
            "ecl:oth pid:488050418 byr:1927 hcl:#a97842 hgt:153cm iyr:2013 eyr:2024\n" +
            "\n" +
            "pid:119536312 ecl:#2036ad\n" +
            "hcl:543178 iyr:2020\n" +
            "byr:2013\n" +
            "hgt:177cm\n" +
            "eyr:2022\n" +
            "\n" +
            "pid:788908662 hcl:#602927 eyr:2029\n" +
            "ecl:oth byr:1930\n" +
            "iyr:2020\n" +
            "hgt:179cm\n" +
            "\n" +
            "byr:1972\n" +
            "pid:053386972 iyr:2014 ecl:grn hgt:65in hcl:#cfa07d\n" +
            "\n" +
            "pid:9828921035 ecl:blu\n" +
            "hcl:z hgt:152in\n" +
            "eyr:1949 byr:2010\n" +
            "\n" +
            "cid:157 pid:097910554 byr:1999\n" +
            "hgt:159cm hcl:#6b5442 ecl:blu eyr:2024\n" +
            "iyr:2010\n" +
            "\n" +
            "hcl:#a97842\n" +
            "eyr:2040 ecl:#f8ad77\n" +
            "hgt:173cm\n" +
            "byr:2019 iyr:2010\n" +
            "pid:#d16a6e\n" +
            "\n" +
            "ecl:dne hgt:191cm iyr:2020 hcl:#b6652a\n" +
            "eyr:2021 pid:571971509 byr:1983\n" +
            "\n" +
            "hcl:#18171d iyr:2016 pid:159074622\n" +
            "eyr:2027 hgt:163cm byr:1954\n" +
            "cid:257\n" +
            "\n" +
            "pid:243560302 cid:58\n" +
            "hcl:53a4cf byr:2012\n" +
            "ecl:#fdbfb8 eyr:1920 hgt:179 iyr:2026\n" +
            "\n" +
            "pid:040606106 eyr:2030 hgt:188cm\n" +
            "byr:1969\n" +
            "iyr:2012 hcl:#ceb3a1 ecl:amb\n" +
            "\n" +
            "eyr:2022\n" +
            "hgt:175cm hcl:#b6652a byr:1967 pid:269969031\n" +
            "iyr:2018\n" +
            "\n" +
            "hcl:#18171d cid:278 byr:1931\n" +
            "pid:134809791\n" +
            "eyr:2035 ecl:#44e6cd iyr:1993\n" +
            "\n" +
            "hgt:177in\n" +
            "ecl:utc cid:289\n" +
            "iyr:1923\n" +
            "hcl:13a67a pid:3045345984 byr:2030 eyr:1944\n" +
            "\n" +
            "pid:839901650 eyr:2030\n" +
            "ecl:grn\n" +
            "byr:2015 iyr:2017 hgt:168 hcl:131f4e\n" +
            "\n" +
            "iyr:2015 pid:529736732 ecl:brn hgt:176cm\n" +
            "eyr:2026 byr:1952 hcl:#6b5442\n" +
            "\n" +
            "hcl:#c0946f\n" +
            "cid:323 pid:303966428 iyr:2019\n" +
            "eyr:2027 hgt:170cm\n" +
            "byr:2001\n" +
            "ecl:brn\n" +
            "\n" +
            "pid:193678728 hgt:72in eyr:2027 iyr:2015 byr:1951 ecl:gry hcl:#18171d\n" +
            "\n" +
            "eyr:2026 cid:283\n" +
            "iyr:1938 pid:687430885\n" +
            "hgt:186cm\n" +
            "byr:1949 ecl:#521638 hcl:d13b2f\n" +
            "\n" +
            "eyr:2024 hcl:#ceb3a1 iyr:2013 ecl:brn\n" +
            "hgt:168cm pid:792088241\n" +
            "\n" +
            "hcl:#888785 ecl:amb\n" +
            "byr:2009 iyr:2015\n" +
            "hgt:151cm\n" +
            "eyr:2020 pid:223927808\n" +
            "\n" +
            "byr:1926\n" +
            "pid:717704850\n" +
            "hcl:#623a2f eyr:2022 hgt:64in iyr:2018 ecl:gry\n" +
            "\n" +
            "eyr:2023 byr:1954\n" +
            "hgt:169cm\n" +
            "ecl:hzl\n" +
            "iyr:2010 pid:116868997 hcl:#18171d\n" +
            "\n" +
            "ecl:hzl byr:1965 hcl:#a97842 iyr:2011 pid:506354451 hgt:172cm eyr:2029\n" +
            "\n" +
            "eyr:2022 pid:994565705\n" +
            "iyr:2013 ecl:brn hcl:#623a2f\n" +
            "byr:1979\n" +
            "\n" +
            "iyr:2011\n" +
            "byr:1931 hgt:183cm hcl:#284f26 cid:306\n" +
            "ecl:amb eyr:2021\n" +
            "pid:977533079\n" +
            "\n" +
            "eyr:2027\n" +
            "iyr:2011 ecl:gry\n" +
            "byr:1993\n" +
            "pid:272334781 hgt:161cm hcl:#9a35b6\n" +
            "\n" +
            "eyr:2026\n" +
            "hcl:#602927 ecl:blu\n" +
            "pid:212300161 byr:1946\n" +
            "cid:193 iyr:2020 hgt:157cm\n" +
            "\n" +
            "pid:538594567 byr:1976 eyr:2027 hcl:#efcc98 iyr:2011 hgt:154cm ecl:oth\n" +
            "\n" +
            "byr:1949\n" +
            "hcl:z ecl:#ce67aa\n" +
            "eyr:1942 pid:7978941589 iyr:2025 hgt:161in\n" +
            "\n" +
            "hcl:#c0946f\n" +
            "cid:55\n" +
            "byr:1963 ecl:blu hgt:161cm\n" +
            "pid:547120453 iyr:2015 eyr:2021\n" +
            "\n" +
            "hgt:173cm eyr:2022\n" +
            "iyr:2016 byr:2001\n" +
            "ecl:hzl pid:239803460\n" +
            "\n" +
            "hcl:#b6652a ecl:oth eyr:2021 hgt:167cm pid:401266644 iyr:1969 byr:1974\n" +
            "\n" +
            "eyr:2030 pid:581963885\n" +
            "hcl:#64cb23\n" +
            "ecl:blu\n" +
            "byr:1928 hgt:181cm iyr:2018\n" +
            "\n" +
            "pid:186338247\n" +
            "ecl:hzl hgt:193cm hcl:#ceb3a1\n" +
            "eyr:2022 iyr:2010\n" +
            "\n" +
            "iyr:2015 ecl:gry hgt:159cm eyr:2027 hcl:#ceb3a1\n" +
            "byr:1925 pid:715902111 cid:149\n" +
            "\n" +
            "iyr:2018 hcl:#623a2f eyr:2020 hgt:162cm ecl:grn cid:135\n" +
            "byr:1922\n" +
            "pid:373216777\n" +
            "\n" +
            "eyr:2020 pid:749899012 hcl:#888785 ecl:brn\n" +
            "iyr:2010 cid:225 hgt:172cm\n" +
            "byr:1972\n" +
            "\n" +
            "iyr:2020 hgt:178cm ecl:grn hcl:#18171d pid:613792489 cid:240\n" +
            "eyr:2028\n" +
            "byr:1972\n" +
            "\n" +
            "iyr:2015 byr:1938 eyr:2026\n" +
            "cid:113 ecl:grn\n" +
            "pid:846231640 hgt:161cm\n" +
            "hcl:#b6652a\n" +
            "\n" +
            "ecl:gry\n" +
            "hcl:#ceb3a1\n" +
            "byr:1956 cid:338 pid:936012518\n" +
            "hgt:62in\n" +
            "eyr:2029 iyr:2016\n" +
            "\n" +
            "pid:730866353 ecl:brn byr:1986\n" +
            "iyr:2014\n" +
            "hgt:190cm\n" +
            "eyr:2021 hcl:#a97842 cid:126\n" +
            "\n" +
            "eyr:2021\n" +
            "cid:180 pid:958310635 ecl:brn iyr:2015 hgt:189cm hcl:#efcc98\n" +
            "\n" +
            "hgt:188cm ecl:hzl pid:179001863 iyr:2016 eyr:2029 hcl:#341e13 byr:1932\n" +
            "\n" +
            "cid:77 eyr:2027 hcl:#623a2f iyr:2016 ecl:brn hgt:170cm\n" +
            "byr:1947\n" +
            "\n" +
            "hgt:66in pid:617518313 iyr:2013 byr:1977 hcl:#b6652a ecl:brn eyr:2025\n" +
            "\n" +
            "pid:787861420\n" +
            "iyr:2014 hcl:#623a2f hgt:61in\n" +
            "ecl:oth cid:78\n" +
            "eyr:2022 byr:1975\n" +
            "\n" +
            "ecl:hzl\n" +
            "iyr:2017 eyr:2028 hcl:#602927\n" +
            "byr:1958 pid:985208714\n" +
            "hgt:160cm\n" +
            "\n" +
            "byr:2002\n" +
            "iyr:2013\n" +
            "hcl:#341e13 pid:188110633 ecl:gry hgt:169cm\n" +
            "eyr:2025\n" +
            "\n" +
            "byr:1981\n" +
            "eyr:2028\n" +
            "hcl:#341e13 ecl:amb hgt:160cm cid:121\n" +
            "iyr:2015 pid:963848397\n" +
            "\n" +
            "iyr:2013 hcl:#866857 pid:#db8648 eyr:2021 ecl:gry\n" +
            "byr:1975\n" +
            "hgt:153cm cid:114\n" +
            "\n" +
            "hgt:109\n" +
            "cid:287 hcl:#6b5442\n" +
            "iyr:2028 byr:1926 eyr:2036 pid:2378208387\n" +
            "ecl:#245a62\n" +
            "\n" +
            "pid:857722366\n" +
            "byr:1975 eyr:2027\n" +
            "ecl:grn iyr:2019 hcl:#0afad1\n" +
            "hgt:66in\n" +
            "\n" +
            "byr:1935 hcl:#cfa07d hgt:173cm ecl:brn eyr:2021 iyr:2019\n" +
            "\n" +
            "cid:66 eyr:2024 hcl:#efcc98 byr:2002 iyr:2010\n" +
            "hgt:176cm pid:697153153 ecl:amb\n" +
            "\n" +
            "iyr:2019\n" +
            "hcl:#cfa07d ecl:blu\n" +
            "pid:695914972\n" +
            "eyr:2024\n" +
            "hgt:158cm\n" +
            "byr:1943\n" +
            "\n" +
            "ecl:xry hgt:62in\n" +
            "pid:14733148 cid:148\n" +
            "iyr:2016 byr:1925 hcl:#6b5442\n" +
            "eyr:2028\n" +
            "\n" +
            "iyr:2025\n" +
            "cid:53 hgt:132 ecl:gmt hcl:159b19\n" +
            "pid:156cm\n" +
            "byr:2025 eyr:2001\n" +
            "\n" +
            "hcl:#623a2f ecl:oth byr:1974 iyr:2018 hgt:161cm eyr:2029 pid:6826285172\n" +
            "\n" +
            "ecl:gry\n" +
            "byr:1956 hcl:#7d3b0c hgt:170cm iyr:2020\n" +
            "\n" +
            "eyr:2020\n" +
            "pid:#946a88 hgt:186cm hcl:#733820 byr:1946 ecl:#016645 iyr:2015\n" +
            "\n" +
            "hgt:181cm hcl:#888785 iyr:2013 pid:634152817\n" +
            "byr:1982 cid:245 ecl:grn eyr:2021\n" +
            "\n" +
            "ecl:brn\n" +
            "pid:737531770 iyr:2010\n" +
            "eyr:2020\n" +
            "byr:1929 hgt:189cm hcl:#c0946f\n" +
            "\n" +
            "cid:158 iyr:2019 hcl:#341e13 eyr:2027 ecl:amb\n" +
            "byr:1986 pid:834976623\n" +
            "\n" +
            "pid:976934668 cid:61 eyr:2020 iyr:2020\n" +
            "hgt:76in byr:1927 ecl:amb\n" +
            "hcl:#e05ee3\n" +
            "\n" +
            "pid:526042518 iyr:2019 eyr:2027 hcl:#623a2f byr:1976 ecl:amb\n" +
            "\n" +
            "pid:279367290 hcl:#a97842 hgt:158cm\n" +
            "eyr:2027\n" +
            "byr:1959\n" +
            "iyr:2020\n" +
            "\n" +
            "ecl:xry byr:2028\n" +
            "pid:357216861 hcl:#a97842 eyr:2024 hgt:66cm\n" +
            "iyr:2012\n" +
            "\n" +
            "hgt:188in\n" +
            "ecl:lzr cid:64 eyr:1958 byr:2014 hcl:z pid:285207570 iyr:2026\n" +
            "\n" +
            "eyr:1973 iyr:2017 ecl:oth cid:282 pid:695814158\n" +
            "hcl:z\n" +
            "\n" +
            "iyr:2010 pid:661168409\n" +
            "hcl:#53c696\n" +
            "hgt:186cm ecl:amb\n" +
            "byr:1960\n" +
            "eyr:2029\n" +
            "\n" +
            "eyr:1982 hgt:169cm\n" +
            "iyr:2002 byr:2025 hcl:327f93 pid:831648100\n" +
            "\n" +
            "byr:1967 ecl:oth\n" +
            "eyr:2021\n" +
            "hcl:#602927 iyr:2014\n" +
            "pid:274974402 hgt:183cm";

    private static final String inputDayFive = "BFBBBFBLRR\n" +
            "BBFFFFFLRR\n" +
            "BFBFBFFRLR\n" +
            "FBBBBFFLLL\n" +
            "BFBBBBFRRL\n" +
            "FFBFFBFRLR\n" +
            "FFFBFBBRRL\n" +
            "FBFBBFBLRL\n" +
            "FBFFFBFLLR\n" +
            "FFBBFBBLLL\n" +
            "FBFBBFFRLL\n" +
            "FFBFFBFLRL\n" +
            "FFBFBFFRRR\n" +
            "BFFFFBBLRR\n" +
            "FFBFFBFRRL\n" +
            "FFBFBFFLRL\n" +
            "BBFFFFFRLL\n" +
            "FFFBFBBRRR\n" +
            "FBFBFBBLLR\n" +
            "FBFBFBFLLR\n" +
            "BFBFBFFRLL\n" +
            "FFFBFFBRLL\n" +
            "BBFFFBFLRL\n" +
            "BFBFBFBLLR\n" +
            "FFFFBBBRLL\n" +
            "FFBBBFFLRL\n" +
            "FBFFBFBRLR\n" +
            "FFBFBBFLLR\n" +
            "FBFBFFFRRL\n" +
            "BFBBFBBLRR\n" +
            "BFBFFFBRRR\n" +
            "BFFBBBFRLL\n" +
            "FFBFFFFRRL\n" +
            "FFFFBBFLRL\n" +
            "BBFFFBBRLR\n" +
            "BFFBFBBRRL\n" +
            "BFFFFFBLRR\n" +
            "FBFFFFBLLL\n" +
            "FFBFBBFLLL\n" +
            "BFBBBFBRRR\n" +
            "BBFFFBFLLR\n" +
            "FBBBFFFRRL\n" +
            "BFBBBBBLLL\n" +
            "BFBFFFBRLR\n" +
            "FFBBFBBLRR\n" +
            "FBFBFFFLLL\n" +
            "BFBBBFBRLL\n" +
            "BFFBFBFRRL\n" +
            "BFBFBFFRRR\n" +
            "FBBFFFFLLR\n" +
            "FFBBBFFLLL\n" +
            "BFFBFBBRRR\n" +
            "FFBFBFBRRR\n" +
            "FFFBBFFRRR\n" +
            "FFBBFBFRLR\n" +
            "FBBBFBFRRR\n" +
            "FFBFFBFRLL\n" +
            "BFBBBFFRLR\n" +
            "FBFFFFFRLR\n" +
            "BFBBBFBRRL\n" +
            "FBFFBFBRRL\n" +
            "FFBFBBFRLL\n" +
            "FFFBBBBLLL\n" +
            "FFBBBFBLLR\n" +
            "FFBBFFBRRR\n" +
            "FFBBBBFRRR\n" +
            "FFBFBBBLRL\n" +
            "FBBBBBFLLR\n" +
            "BFBFBBFLLR\n" +
            "FFFBBBFRLL\n" +
            "BFBFFBBRRL\n" +
            "FBFBBFBLLL\n" +
            "FBFFBBFLRR\n" +
            "FBBBFBFLRL\n" +
            "FFBBFBFRLL\n" +
            "FFBBBFFRRR\n" +
            "BFFBBBBRLR\n" +
            "FFBFFBBRLL\n" +
            "FBFBFBBRRL\n" +
            "FFBFFBFLLR\n" +
            "FBFBFFBLLR\n" +
            "FBFBBFFLLL\n" +
            "FBFBBFBLLR\n" +
            "FBBFBBFRLL\n" +
            "BFFFBFFRLL\n" +
            "FFBBBFFRLL\n" +
            "FBFBBFBRRR\n" +
            "BFFBBFFRLL\n" +
            "FFBFBBFRRR\n" +
            "FBBFFFFRRL\n" +
            "BFBBFBFLRR\n" +
            "BFBFFFFLRL\n" +
            "BFFFFBBRRR\n" +
            "BFFBFFBLRR\n" +
            "FBFFFBFLRL\n" +
            "FBFBFBFLRL\n" +
            "FFBBFBFRRR\n" +
            "BFFFFBFRRR\n" +
            "FBBBBBFLRL\n" +
            "BFFFBBBRLL\n" +
            "BFFBBBBLRR\n" +
            "FFBBBBFRLR\n" +
            "BFFFBBFRLR\n" +
            "FBBFFBFLLR\n" +
            "FBFBBBFLRR\n" +
            "FBFFFFBRRR\n" +
            "FFBBBBBLLR\n" +
            "FFBBFFFRRL\n" +
            "FBBFFBBLRL\n" +
            "FBFBBBFRRL\n" +
            "BFFBFBFRRR\n" +
            "FFBBBBFLLR\n" +
            "FFBBFFBLRL\n" +
            "FFBBBBBRLL\n" +
            "FFFBFBBLRL\n" +
            "BFFFBFFLRR\n" +
            "BFBBBFFLRR\n" +
            "FFBFFFFRRR\n" +
            "FBBFFBBLLR\n" +
            "FBBBBFFRRR\n" +
            "BFBBBFFRRL\n" +
            "FBBFFBBLLL\n" +
            "FBFBFBBLRL\n" +
            "BFBBBFFLLR\n" +
            "BBFFFBBLRL\n" +
            "FBBBFBBLLR\n" +
            "BBFFBFFLLL\n" +
            "FBBBFFFRRR\n" +
            "BFFBBFFLRR\n" +
            "FFBBFFFRLL\n" +
            "BFBBFFFLRR\n" +
            "FFBFFFFLLR\n" +
            "FFFBFFBLLL\n" +
            "FFBBBFFRLR\n" +
            "FFBFFFBRRR\n" +
            "FBFBBBBLRL\n" +
            "FBBFBBBRLL\n" +
            "FBBFBFFLLR\n" +
            "FFFFBFBLRR\n" +
            "BFFFBBFLRL\n" +
            "FBFFBBFRLR\n" +
            "BBFFFFBRRR\n" +
            "FFFBBBFLRL\n" +
            "FBBFBFFRRR\n" +
            "BFFBBFBRRR\n" +
            "FFFFBBBRLR\n" +
            "FBBBFBBRLL\n" +
            "FBBFBFFRRL\n" +
            "FBFFFFBLRR\n" +
            "BFFBBBBLRL\n" +
            "FBBBBBFRLR\n" +
            "FFFBFFBLLR\n" +
            "FBBFBFBRLR\n" +
            "FBBBBBFRRR\n" +
            "BFBBFFBRLR\n" +
            "BFFFFFBRRR\n" +
            "FFFBFFBRRR\n" +
            "BFBBBBFLLL\n" +
            "BFBFFFFLRR\n" +
            "FFBBFBBRRR\n" +
            "BBFFFBFRLL\n" +
            "FFBBBBBLRR\n" +
            "FBBBFBFLLR\n" +
            "FBFFFFFRLL\n" +
            "FFBBFFBLRR\n" +
            "FBFFFFFLRR\n" +
            "BFBBFBFRRR\n" +
            "FFBBFFBRLR\n" +
            "FBBFFFBLLL\n" +
            "BFFBFBFLLR\n" +
            "FBBFBFFRLL\n" +
            "FBBBBFBLRL\n" +
            "BFFFFBFRRL\n" +
            "FBFBBFBRRL\n" +
            "BFFFFBBLLL\n" +
            "FBFFBFBLLR\n" +
            "BFFBBFBRLL\n" +
            "BFBFFFBRRL\n" +
            "FBFFBFFLLR\n" +
            "BFBFFFFRRL\n" +
            "FFBFFFBRLR\n" +
            "FFBBBBFLRR\n" +
            "BBFFFFBLLL\n" +
            "BFBBBBBRLL\n" +
            "FFBFBBFRLR\n" +
            "BBFFFFFRLR\n" +
            "FBFFFBBRRR\n" +
            "BFFFBFBRLL\n" +
            "FBBBBFFLRL\n" +
            "BFFFFBFLRR\n" +
            "FBBFBFFLRL\n" +
            "BFBFBFBLRL\n" +
            "FBBFFBFRLR\n" +
            "FBBFFFBLLR\n" +
            "FBBBBFFRLL\n" +
            "BFBBBFFRRR\n" +
            "FBBFBBFLLR\n" +
            "FBBFFBFLRL\n" +
            "BFFBFBBLLR\n" +
            "FBBBFBFLLL\n" +
            "FBBBBBBRRR\n" +
            "FBFBBFBRLR\n" +
            "FFBFBFBRRL\n" +
            "FBFBBBBRRR\n" +
            "FFBBBFBLRR\n" +
            "FBFFBFBLRL\n" +
            "FFBFFFBLRL\n" +
            "BFBFBFFLRR\n" +
            "FBFFFFBLRL\n" +
            "BFFBFFFLRR\n" +
            "BFBBBBFRLL\n" +
            "FBFFBBBLRL\n" +
            "FBFBFBBLRR\n" +
            "BFBFFFBLRL\n" +
            "BFBFBBBLRL\n" +
            "FFBFBFBLRL\n" +
            "BFFBFFBRRL\n" +
            "BBFFFBFRRR\n" +
            "FFFBFFFRLR\n" +
            "FFFBFBFRRL\n" +
            "FFBBBFFLRR\n" +
            "BFBBBFFRLL\n" +
            "BFBBFBBLLL\n" +
            "FBBBBFBLLL\n" +
            "BFFFBFFRLR\n" +
            "BFFBBFBLLL\n" +
            "FFBBFBFLLL\n" +
            "FFFBFBFLLR\n" +
            "FBFFBFFLRR\n" +
            "BFBFFBFRLR\n" +
            "BFFBBBFLLL\n" +
            "FFBFFFBLLL\n" +
            "FFFBFFFRRL\n" +
            "FFBFFFBLRR\n" +
            "FBBFBBFRRR\n" +
            "BBFFFBBLLR\n" +
            "BFFFBFFLLR\n" +
            "FFBFBBBRLL\n" +
            "BFFFBBBLRR\n" +
            "FFBFBFFLLL\n" +
            "FFBFFBBLLL\n" +
            "BFBBFBBRRL\n" +
            "BBFFFFFRRL\n" +
            "FBFFBFFLLL\n" +
            "FFBFFBFLRR\n" +
            "BBFFFFFRRR\n" +
            "FBBFFFBRRL\n" +
            "FBFFBBFLRL\n" +
            "BFFBBBFRRL\n" +
            "BFBBFFFRRL\n" +
            "BFBFFBFLRR\n" +
            "FBBBFFFLLR\n" +
            "FFFFBBBLLR\n" +
            "BFFBFFBLRL\n" +
            "FFBFFFBLLR\n" +
            "FFFBFBBRLL\n" +
            "FBFBBBFLLL\n" +
            "BFBFBFBRRL\n" +
            "BFFFBBBRRL\n" +
            "FFFFBBFRRR\n" +
            "FBBFBBBLRL\n" +
            "FFBBBBBLLL\n" +
            "BBFFBFFLLR\n" +
            "FBFFBBBLLR\n" +
            "BFBFFBFRLL\n" +
            "BFFFFFBLRL\n" +
            "FFFFBFBLLL\n" +
            "FBBBBFBRRL\n" +
            "FBFBFFBLRR\n" +
            "FFFBBFFLLR\n" +
            "FBFBFBFLRR\n" +
            "BBFFFBBLRR\n" +
            "FFFBBFBLLR\n" +
            "FFBBBFBRRR\n" +
            "FFFBBBFRRR\n" +
            "BFBFBFFLLL\n" +
            "FBBBBBFRRL\n" +
            "BFFBFFBLLR\n" +
            "FFBFBBFLRR\n" +
            "BFFBFBBLRR\n" +
            "FBBBFBBLRL\n" +
            "FBFFBBFRLL\n" +
            "BFFBBBBRRL\n" +
            "BFFBBBBRRR\n" +
            "BFFFBBFRLL\n" +
            "BFBBBBBLRR\n" +
            "FFBBBBFLRL\n" +
            "FBBBBFFLRR\n" +
            "BFBFFBBRLR\n" +
            "FBBFBBBLRR\n" +
            "FBFBFBBRRR\n" +
            "BBFFFBBRLL\n" +
            "FBBBBFBRLL\n" +
            "FFBFBFFLLR\n" +
            "FBFFFBFRRR\n" +
            "BFBFBBFRRR\n" +
            "BFFFBFFRRL\n" +
            "BFBFFBFLLR\n" +
            "FFFBBBBLLR\n" +
            "FBBBFFFLRL\n" +
            "FBBFBBFRRL\n" +
            "FBBFBBBLLR\n" +
            "BFFFFBBLLR\n" +
            "FBBBBBBLLL\n" +
            "BFFFFFFRRR\n" +
            "FFFBBBBRLR\n" +
            "FFFBFBFRLR\n" +
            "FFFFBFBLRL\n" +
            "FBFBFFBRRR\n" +
            "FBBBBBBLRR\n" +
            "BFBBBFBRLR\n" +
            "FBFBBBFRLL\n" +
            "FBBFFBBLRR\n" +
            "BFFFBBFRRL\n" +
            "FBBBBFFRLR\n" +
            "BFFBFFBRRR\n" +
            "BFFFBFBLLR\n" +
            "BFFFBBBRRR\n" +
            "BFFBBBFLRL\n" +
            "BFBBFBBLRL\n" +
            "BFFBBFFLLR\n" +
            "BFFFFFBRLR\n" +
            "FBBFFBBRRL\n" +
            "BFFFFFBRRL\n" +
            "FBBBFFBLRL\n" +
            "FBFBBFBRLL\n" +
            "BFFBFBFLLL\n" +
            "BFFBFBBRLR\n" +
            "BFFBFFFLRL\n" +
            "BFBFBBBLLR\n" +
            "FBFBFFBRLL\n" +
            "BFFBBFBLLR\n" +
            "BFFBFBBLLL\n" +
            "BFFBBFBLRL\n" +
            "FBBFFBFRRL\n" +
            "BFBFBBFRLR\n" +
            "FBFFFFBRRL\n" +
            "FBFBFFFRRR\n" +
            "FFFBBFFRRL\n" +
            "FFFFBFBRRL\n" +
            "BFFFFFFLLR\n" +
            "FBBFFFFRLR\n" +
            "FBFBBFFRLR\n" +
            "FFBBFFBRRL\n" +
            "FBBFBBFRLR\n" +
            "FFBBFBFLRL\n" +
            "FFFFBBBLLL\n" +
            "FFBBFFFLLR\n" +
            "BFBBFBBRLL\n" +
            "BFFFFBBRRL\n" +
            "BFFBBFBRRL\n" +
            "FBBFBBBRRL\n" +
            "BFBFBFFLRL\n" +
            "FBFFFBBLRL\n" +
            "FFFFBBBRRR\n" +
            "FBFFBBFLLR\n" +
            "BFFBBFBRLR\n" +
            "FBBFBBFLRL\n" +
            "FFBBFFFRLR\n" +
            "BBFFFBBRRR\n" +
            "FFBBBBBLRL\n" +
            "FBBBBBBRLL\n" +
            "FFFBBBFRLR\n" +
            "FFBBFBFRRL\n" +
            "FFBBBBBRRL\n" +
            "BFBFBBFRLL\n" +
            "FBFFBFFRLR\n" +
            "BFBFBBBRLR\n" +
            "FFBFFFFLRL\n" +
            "FBFFBFBLRR\n" +
            "FBFFBFBRRR\n" +
            "FFFBBFBRRR\n" +
            "FBFFFBFLLL\n" +
            "BFFBFBFRLL\n" +
            "FBFFBFBRLL\n" +
            "FFBFFBBLRR\n" +
            "FFFFBFBRLR\n" +
            "BFFBBBBRLL\n" +
            "BFBBFFBLRR\n" +
            "FFBFFBFLLL\n" +
            "FFBFBBBRLR\n" +
            "FFBFFFFRLR\n" +
            "FBBFFFBRLR\n" +
            "BFFFFFFLLL\n" +
            "BFBBBFFLRL\n" +
            "FBBFBFFLLL\n" +
            "BFBBFBBRRR\n" +
            "BFBFFBBRLL\n" +
            "FBBFBFBLRL\n" +
            "BBFFFFFLLL\n" +
            "FBFFFBFRRL\n" +
            "BFBBBFBLLR\n" +
            "BFFFFBBRLL\n" +
            "FFBFBBFLRL\n" +
            "FFFBFBBLLR\n" +
            "FBFBFFFLRR\n" +
            "FBBBBBBLLR\n" +
            "BFFBFFBRLL\n" +
            "FBFFBFFRRL\n" +
            "FFBFBBBLLR\n" +
            "FBBBFBFLRR\n" +
            "FFBFBBBRRL\n" +
            "FBBFFBBRLR\n" +
            "BFFFBBBLRL\n" +
            "FBBFBBBRRR\n" +
            "BFFBBBFLRR\n" +
            "FBBFFFBRRR\n" +
            "BFBFFFFRLL\n" +
            "BFBBBBBRRR\n" +
            "FBFBBFFRRR\n" +
            "FBBBBBFLRR\n" +
            "FBBBFFBLRR\n" +
            "FFBBBBBRRR\n" +
            "FFFBFFFLLR\n" +
            "BFBBBBFRRR\n" +
            "BFFBFBFLRR\n" +
            "BFFFBBFLLR\n" +
            "FBFFFFFLLL\n" +
            "FBBFFFFRLL\n" +
            "BFFBBBFRLR\n" +
            "BBFFFFBLLR\n" +
            "FBBBBFFLLR\n" +
            "BFFFBFBRLR\n" +
            "BBFFFFFLRL\n" +
            "BFFFFBFLRL\n" +
            "BFFFFBBLRL\n" +
            "FBFFBBBLRR\n" +
            "FBFFBBBRRR\n" +
            "FBFBBFBLRR\n" +
            "FBBBBBBRRL\n" +
            "FFFBFFBLRL\n" +
            "FBFBFBFRLR\n" +
            "FFFBBFBLRR\n" +
            "BFBFFBFLRL\n" +
            "BFBFFFBRLL\n" +
            "BFFFBFBRRR\n" +
            "FBFBBBFLLR\n" +
            "BFFBBBFRRR\n" +
            "BFBFBBFLRR\n" +
            "FBBFBFBLLL\n" +
            "FBFBBBFRRR\n" +
            "BFBBBBFRLR\n" +
            "FFFBBBBLRL\n" +
            "FFFBFFFLLL\n" +
            "FFFBBBFLLL\n" +
            "BFBBFFBRRL\n" +
            "BFBBFBBLLR\n" +
            "FFBBBBFRLL\n" +
            "FBBBBFFRRL\n" +
            "FFBBBFBRRL\n" +
            "FBBFFFBLRL\n" +
            "FFBFFBBRLR\n" +
            "BFBFFBBLLL\n" +
            "FBFFFBFLRR\n" +
            "FFBBFFBLLL\n" +
            "BFFFFBFLLR\n" +
            "FFFBFBFLRL\n" +
            "FFFBBBBRLL\n" +
            "BBFFFBBRRL\n" +
            "BFBFFBBLRR\n" +
            "FFFFBFBLLR\n" +
            "BFBBFBFLLR\n" +
            "BFBBFBFRRL\n" +
            "FFBBFBBLLR\n" +
            "FBFFBBFRRL\n" +
            "BFFBBFFRRL\n" +
            "FBFBBBBLLR\n" +
            "FBFBBBFRLR\n" +
            "BFBFFFFLLL\n" +
            "FFBBFFBLLR\n" +
            "FBFFBBFRRR\n" +
            "BFFFFFFRLL\n" +
            "FBFFFFFLLR\n" +
            "FFFBFFBRRL\n" +
            "FFBBFBBLRL\n" +
            "FBBFBFBLLR\n" +
            "BBFFFBFRRL\n" +
            "FFBBFBFLRR\n" +
            "BFBBFBFLRL\n" +
            "FBFBBBFLRL\n" +
            "BFFFFFFLRL\n" +
            "FFFBFBBRLR\n" +
            "FFBBFBBRLR\n" +
            "FBBFFBFLLL\n" +
            "BFFBFBBLRL\n" +
            "FBFFBBBLLL\n" +
            "FBBBFFFLRR\n" +
            "BFFBBBBLLL\n" +
            "FBBBFBFRLL\n" +
            "FBBBFBBLRR\n" +
            "FBFFFBBRLL\n" +
            "FFBFBBBLRR\n" +
            "FBFBFFFLRL\n" +
            "BFFBFFFRLR\n" +
            "FFBBBFBRLR\n" +
            "FFFBBFBRLL\n" +
            "BFFFFFFLRR\n" +
            "FBBBFBBRRR\n" +
            "FBFFBFFLRL\n" +
            "FBFFBFBLLL\n" +
            "FBBBFBFRLR\n" +
            "FBFBFBBRLL\n" +
            "FBBBFBBLLL\n" +
            "FFBBBFBRLL\n" +
            "FFFBFBFLLL\n" +
            "FBFFFBBRRL\n" +
            "BFFFBFFLLL\n" +
            "FBBFBFBLRR\n" +
            "FBBBBFBLRR\n" +
            "FBBFFBFLRR\n" +
            "FBBBBBBLRL\n" +
            "BFFBFFFRLL\n" +
            "BFBFBBFRRL\n" +
            "BFBFFFFRRR\n" +
            "BFFFBFBRRL\n" +
            "FFFFBFBRLL\n" +
            "FBFBBFFLRR\n" +
            "BBFFFBFLLL\n" +
            "BFBBFFBRRR\n" +
            "FBBFBFBRRR\n" +
            "FBFFBFFRLL\n" +
            "BFBFBBBLRR\n" +
            "FBBFFBFRRR\n" +
            "FBBFBFBRLL\n" +
            "BFFFFBBRLR\n" +
            "BFBFBBBLLL\n" +
            "FBFBFBFLLL\n" +
            "BFFBFFBRLR\n" +
            "BFBFFFBLLR\n" +
            "FFFBFFFRLL\n" +
            "FBFFFFFRRR\n" +
            "FFFBFFFLRR\n" +
            "FFBFFBFRRR\n" +
            "BFFFFBFLLL\n" +
            "FBBBBFBRRR\n" +
            "FBBBFFFLLL\n" +
            "FFBFFBBLLR\n" +
            "BFFFFFFRRL\n" +
            "FFFFBBBLRL\n" +
            "FBFBFBBRLR\n" +
            "FBBBFFBRLR\n" +
            "FBBFBFFRLR\n" +
            "BBFFFBFRLR\n" +
            "FBBFBBFLLL\n" +
            "FBBFFFFLRR\n" +
            "FBFFFBBLLL\n" +
            "BFBBFFFRLL\n" +
            "FFFBFBFRLL\n" +
            "BFFFBBFRRR\n" +
            "FFBFFBBRRL\n" +
            "BBFFFBBLLL\n" +
            "BBFFFFFLLR\n" +
            "BBFFFFBRLL\n" +
            "FBBBFFBRLL\n" +
            "FBFBFBFRRL\n" +
            "FFFBFBBLLL\n" +
            "BFFBFBFLRL\n" +
            "BFBFFBBRRR\n" +
            "FFFBBBBRRL\n" +
            "BFFFBBFLLL\n" +
            "FBFFBBBRLL\n" +
            "FFFBFBBLRR\n" +
            "FBBFFFBLRR\n" +
            "BFBBFFFLLR\n" +
            "FFBBFFFLRL\n" +
            "FBBBFFBRRR\n" +
            "FFFBBFFRLR\n" +
            "FBFFFFBLLR\n" +
            "BFFBFFFRRL\n" +
            "FBFBFBFRRR\n" +
            "FBBBBBFRLL\n" +
            "BFFFFFBRLL\n" +
            "FFFBBFBLRL\n" +
            "BFFFFFBLLL\n" +
            "BFFFBFBLLL\n" +
            "FBFBFFFRLR\n" +
            "BFBFFFFRLR\n" +
            "FBFBBFFRRL\n" +
            "BFBBFFFRLR\n" +
            "FFBFFFFRLL\n" +
            "FFFBBFBRRL\n" +
            "FBBBFFBLLL\n" +
            "BFBFBFBLRR\n" +
            "BFFFFBFRLL\n" +
            "BFBBFFBLLL\n" +
            "FBBFBBBLLL\n" +
            "FBBFBBBRLR\n" +
            "BBFFFFBRRL\n" +
            "BFBFBFFRRL\n" +
            "FBBBFBBRRL\n" +
            "BFBBBBFLRR\n" +
            "FFBFBBBRRR\n" +
            "FFFBFFFLRL\n" +
            "FFFBFFFRRR\n" +
            "FFBBFBBRRL\n" +
            "FFBFBFBLLR\n" +
            "BFBFFFBLLL\n" +
            "FBFBFFBLLL\n" +
            "BFFFBFBLRR\n" +
            "BFFBFFBLLL\n" +
            "BBFFFFBLRR\n" +
            "FFBFBFFRLR\n" +
            "FBFFFBFRLR\n" +
            "FFBBBBBRLR\n" +
            "FBFFFBFRLL\n" +
            "FBFBBBBRLL\n" +
            "FFBFFFBRRL\n" +
            "BFFFBBBLLL\n" +
            "FFBBBFBLLL\n" +
            "BFFFBFFRRR\n" +
            "FFFBBFFRLL\n" +
            "FFFBBBFRRL\n" +
            "FBFBBFFLRL\n" +
            "FFBBFFFLRR\n" +
            "FFFFBBBRRL\n" +
            "FFBBBBFLLL\n" +
            "FFBFFFBRLL\n" +
            "FBFFBBBRRL\n" +
            "BFBBFFFRRR\n" +
            "FFBBBFFLLR\n" +
            "FFBBBFFRRL\n" +
            "BFBBFBFRLR\n" +
            "FFFFBBFLLL\n" +
            "FFBBBBFRRL\n" +
            "FBBFFFFLLL\n" +
            "BFFFBBBRLR\n" +
            "FBFFBBBRLR\n" +
            "BFBBFFFLRL\n" +
            "BFBFBBFLLL\n" +
            "FBFFFFBRLR\n" +
            "BFFBBFFRRR\n" +
            "FBFBBBBLLL\n" +
            "BFFBFBBRLL\n" +
            "FBFBFFBRLR\n" +
            "BFBFBFFLLR\n" +
            "FFFFBBFRLL\n" +
            "BFFBFFFRRR\n" +
            "FBFBBBBRLR\n" +
            "BFBBBBFLRL\n" +
            "BFBFBFBLLL\n" +
            "BFBFFBBLRL\n" +
            "BFBFFBBLLR\n" +
            "BFBBFFBRLL\n" +
            "FFBFBBBLLL\n" +
            "BFBFBBBRLL\n" +
            "BFBFBBBRRR\n" +
            "FFFFBBBLRR\n" +
            "FFFBFBFLRR\n" +
            "BFFFBBBLLR\n" +
            "FBBBBBFLLL\n" +
            "FFFBBFBLLL\n" +
            "FBFBFFFRLL\n" +
            "FBBBFFFRLR\n" +
            "FFBFBFFLRR\n" +
            "FFFFBBFRLR\n" +
            "FFFFBFBRRR\n" +
            "FFFBBFBRLR\n" +
            "FFBFBFBLLL\n" +
            "FFBFFFFLRR\n" +
            "FFFBFBFRRR\n" +
            "FFBBFFFLLL\n" +
            "FBBBFFBLLR\n" +
            "BFBFBBBRRL\n" +
            "FFBBBFBLRL\n" +
            "BFBBBBBRRL\n" +
            "FFFBBBBLRR\n" +
            "FBBBFFBRRL\n" +
            "FFBFBFFRRL\n" +
            "FBBBBBBRLR\n" +
            "FBFFBFFRRR\n" +
            "BFFFFBFRLR\n" +
            "FFBBFFBRLL\n" +
            "BFFBBBFLLR\n" +
            "FBFBFBFRLL\n" +
            "BFBFBFBRLR\n" +
            "FBFFFBBLLR\n" +
            "FBFBFFBRRL\n" +
            "FBBFFFBRLL\n" +
            "FFBFBFBRLR\n" +
            "FFBFBFFRLL\n" +
            "FFFBFFBRLR\n" +
            "BFBFBFBRRR\n" +
            "FFFBBBBRRR\n" +
            "BFBFFBFRRR\n" +
            "BFBBFFBLRL\n" +
            "FBBFFBFRLL\n" +
            "BFFBBFFLRL\n" +
            "FFBFBFBRLL\n" +
            "FBFBBBBLRR\n" +
            "BFBFBFBRLL\n" +
            "BFBFFBFRRL\n" +
            "BFFFFFFRLR\n" +
            "FFBFFBBRRR\n" +
            "FFBBFBFLLR\n" +
            "FFFBBFFLLL\n" +
            "BFBBBFBLRL\n" +
            "FBFFFFBRLL\n" +
            "FBBBFBBRLR\n" +
            "BFFFBBFLRR\n" +
            "FBBBBFBRLR\n" +
            "BFBBBFFLLL\n" +
            "FBFBFBBLLL\n" +
            "BBFFFFBRLR\n" +
            "FBFBFFFLLR\n" +
            "FBFBBBBRRL\n" +
            "FFBFBBFRRL\n" +
            "BFFBBFFLLL\n" +
            "FBBFBBFLRR\n" +
            "BFFFFFBLLR\n" +
            "BFBBFFFLLL\n" +
            "FBBFBFFLRR\n" +
            "FBBFFBBRRR\n" +
            "FBFFFFFLRL\n" +
            "BFBFFFBLRR\n" +
            "FFFBFFBLRR\n" +
            "FBBFFBBRLL\n" +
            "BFBBBBBLRL\n" +
            "FFFBBBFLRR\n" +
            "BFBBBFBLLL\n" +
            "FBFFFBBRLR\n" +
            "FFBBFBBRLL\n" +
            "FBFFFBBLRR\n" +
            "FBFBBFFLLR\n" +
            "FFFFBBFRRL\n" +
            "FBBFFFFRRR\n" +
            "BFFBFFFLLR\n" +
            "FFFBBFFLRL\n" +
            "FFFBBBFLLR\n" +
            "BFFFBFFLRL\n" +
            "FBBBBFBLLR\n" +
            "FFBFBFBLRR\n" +
            "BFBBFBFLLL\n" +
            "BFFBBFFRLR\n" +
            "BFBBBBFLLR\n" +
            "FFFFBBFLRR\n" +
            "BFBFBBFLRL\n" +
            "BBFFFBFLRR\n" +
            "BFBBFBBRLR\n" +
            "FBFBFFBLRL\n" +
            "FFFBBFFLRR\n" +
            "FFBBFFFRRR\n" +
            "BFFBBBBLLR\n" +
            "BBFFFFBLRL\n" +
            "FBFFBBFLLL\n" +
            "FFFFBBFLLR\n" +
            "FBBBFBFRRL\n" +
            "FFBFFBBLRL\n" +
            "BFBBFFBLLR\n" +
            "BFBFFFFLLR\n" +
            "BFBBBBBRLR\n" +
            "BFBBFBFRLL\n" +
            "BFFBFFFLLL\n" +
            "FFBFFFFLLL\n" +
            "BFBFFBFLLL\n" +
            "FBBFFFFLRL\n" +
            "BFBBBBBLLR\n" +
            "BFFBBFBLRR\n" +
            "BFFFBFBLRL\n" +
            "FBBBFFFRLL\n" +
            "FBBFBFBRRL\n" +
            "FBFFFFFRRL";

    private static final String inputDaySix = "qzbw\n" +
            "qez\n" +
            "\n" +
            "xgedfibnyuhqsrazlwtpocj\n" +
            "fxgpoqijdzybletckwaunsr\n" +
            "pwnqsizrfcbyljexgouatd\n" +
            "ljtperqsodghnufiycxwabz\n" +
            "\n" +
            "uk\n" +
            "kupacjlriv\n" +
            "dku\n" +
            "qunk\n" +
            "\n" +
            "yjnprofmcuhdlawt\n" +
            "frmhulyncvweatodzjp\n" +
            "fhadtrcyjzwlnpumo\n" +
            "hrcutablndyjpfmwo\n" +
            "\n" +
            "rdclv\n" +
            "lrvdc\n" +
            "crldv\n" +
            "dvrcl\n" +
            "vrlcd\n" +
            "\n" +
            "dqrwajpb\n" +
            "asrfpdjwbq\n" +
            "wjdtarq\n" +
            "\n" +
            "nalkhgoi\n" +
            "bmiad\n" +
            "sdvpiyerma\n" +
            "ami\n" +
            "\n" +
            "smg\n" +
            "wlmdftcr\n" +
            "mk\n" +
            "my\n" +
            "\n" +
            "ebaxsun\n" +
            "uaxnebs\n" +
            "suxnbea\n" +
            "eanxusb\n" +
            "aexusnb\n" +
            "\n" +
            "zoxegrfd\n" +
            "qorjv\n" +
            "oqr\n" +
            "vor\n" +
            "roq\n" +
            "\n" +
            "jpasdnrcvhglft\n" +
            "dgkstavnhjrclfx\n" +
            "crtndjglfvwahq\n" +
            "hjclinvdtagrkf\n" +
            "gjfcdtuhlanvr\n" +
            "\n" +
            "exiopqbgrj\n" +
            "undhwyfkvltis\n" +
            "\n" +
            "npsxwlyog\n" +
            "udylki\n" +
            "\n" +
            "bnuwck\n" +
            "nuack\n" +
            "\n" +
            "cahpwtlozkm\n" +
            "ghnpzfqmoxabi\n" +
            "\n" +
            "hvwgxesraocbpnf\n" +
            "ewvranqcpbghoxf\n" +
            "paxfnwoegrhcvub\n" +
            "qbrawpfscexngvho\n" +
            "ahpxognlrvebwfc\n" +
            "\n" +
            "agqmwpvlb\n" +
            "waklrnbqyp\n" +
            "blquawtp\n" +
            "qltabwp\n" +
            "\n" +
            "rymhgolkustipjxbzqnafe\n" +
            "frzqjiuktbsxmahdepylg\n" +
            "\n" +
            "zricqdofygvtbsjmeu\n" +
            "vudjctzynegboiafqmrsx\n" +
            "rsbefoytcqgiuvzdjm\n" +
            "zucobitsgyjrfqemvd\n" +
            "\n" +
            "y\n" +
            "yc\n" +
            "tg\n" +
            "lavoqef\n" +
            "by\n" +
            "\n" +
            "fevykin\n" +
            "wxytrhqk\n" +
            "\n" +
            "pxbclzknowyq\n" +
            "lybwkpcoqxn\n" +
            "oknlpbxcyqw\n" +
            "\n" +
            "l\n" +
            "f\n" +
            "gixvd\n" +
            "\n" +
            "unogwsfavzkhi\n" +
            "siohufnkzgavw\n" +
            "ahitunswfvkzog\n" +
            "gvhknzuaisfow\n" +
            "ukasozfihnwgv\n" +
            "\n" +
            "ulhgwo\n" +
            "ghluo\n" +
            "ogulh\n" +
            "oughl\n" +
            "lphuog\n" +
            "\n" +
            "nike\n" +
            "bkn\n" +
            "\n" +
            "gefzwrdjsqx\n" +
            "fegzsjwxrpqh\n" +
            "\n" +
            "lfknweboxyrpajmig\n" +
            "gkpafnieojybrwl\n" +
            "iafesdyulrkpgnwbjo\n" +
            "\n" +
            "zjoiqtgpwxdach\n" +
            "iajdhqucpxtzgl\n" +
            "\n" +
            "yhav\n" +
            "vnshac\n" +
            "hcav\n" +
            "hvw\n" +
            "cyvh\n" +
            "\n" +
            "hwz\n" +
            "whz\n" +
            "\n" +
            "dhunracmzksvxopjgtbqi\n" +
            "vqhpowubyzirdksmgca\n" +
            "\n" +
            "ckrhefz\n" +
            "rkvexdfzcbh\n" +
            "heczkrf\n" +
            "\n" +
            "rbsldt\n" +
            "qgr\n" +
            "\n" +
            "a\n" +
            "ea\n" +
            "a\n" +
            "\n" +
            "wnadxkgehtpsv\n" +
            "gwnexkavshpd\n" +
            "bfkdpansvhewxg\n" +
            "kvtwdnsahpxge\n" +
            "xnhdpvekwgsa\n" +
            "\n" +
            "ydajvctr\n" +
            "drcejtgin\n" +
            "\n" +
            "kw\n" +
            "cbmj\n" +
            "l\n" +
            "t\n" +
            "n\n" +
            "\n" +
            "gyzlnp\n" +
            "zahsyu\n" +
            "rek\n" +
            "\n" +
            "vjdmhsorqw\n" +
            "whdjoqvrms\n" +
            "rhsjqdmov\n" +
            "omdsqjrzhv\n" +
            "\n" +
            "rcxsgnluhtqey\n" +
            "ldejuqpykrtc\n" +
            "\n" +
            "rylcqxt\n" +
            "wlgtzyrcf\n" +
            "yrltc\n" +
            "rclpyt\n" +
            "\n" +
            "frke\n" +
            "kfe\n" +
            "\n" +
            "nchvxtqarsejld\n" +
            "rkhntaexcbqljod\n" +
            "qhdepzrxljtifcan\n" +
            "\n" +
            "uyfshgxzbqvrdwintjlmec\n" +
            "oyrvdwtgeczsfbmluqih\n" +
            "kabdlqytwgfrhmuevczpsi\n" +
            "\n" +
            "guwmkrfyex\n" +
            "fxekmrygwu\n" +
            "wfgremukiyx\n" +
            "aywegkrmxufl\n" +
            "wukygimrxfe\n" +
            "\n" +
            "m\n" +
            "m\n" +
            "m\n" +
            "m\n" +
            "m\n" +
            "\n" +
            "hbgnkqe\n" +
            "khgn\n" +
            "\n" +
            "hngypzmd\n" +
            "oixyanpdg\n" +
            "\n" +
            "qbdklpvhjaeif\n" +
            "kzaiglyjfpmeurn\n" +
            "\n" +
            "ynsm\n" +
            "smjn\n" +
            "nsyum\n" +
            "\n" +
            "mpcztqkydxifv\n" +
            "zdqfvxtmpcyk\n" +
            "zkcmxfpqvydt\n" +
            "yopktfnqrmvxdczw\n" +
            "mdckxypvztqf\n" +
            "\n" +
            "va\n" +
            "bvhg\n" +
            "\n" +
            "fe\n" +
            "ef\n" +
            "\n" +
            "n\n" +
            "hpmqn\n" +
            "n\n" +
            "dn\n" +
            "\n" +
            "njxazhtevsmlir\n" +
            "txmsijvaezwn\n" +
            "tezacmwsvinxj\n" +
            "\n" +
            "gvzpbmeijyhaukflcrdqw\n" +
            "sivlhgumyzkdrjfeoxqtc\n" +
            "\n" +
            "ouq\n" +
            "h\n" +
            "\n" +
            "csxewy\n" +
            "kxoscmw\n" +
            "ucnvwsxg\n" +
            "hfocysxmiwe\n" +
            "wcsmx\n" +
            "\n" +
            "retcxugsdwjnykm\n" +
            "sfhudnxoqwjktyzarc\n" +
            "rklvinxudpsbywtjc\n" +
            "\n" +
            "cwfizpyguatbodsqemxrjknlv\n" +
            "ujikxwsmntcloyqgaebrzfdvp\n" +
            "jreyubofkpdnzsimxwvgaqtlc\n" +
            "nuewfvmlidsatzqbkcjgorpyx\n" +
            "\n" +
            "ycqolubpktxwshegafvm\n" +
            "djnlhafsreuzgxkb\n" +
            "\n" +
            "odasxjtqcepgrzl\n" +
            "jsoelxpqgtczam\n" +
            "qiajrhesdzoxfplcgt\n" +
            "\n" +
            "vnthkurzf\n" +
            "bnfpqutvekra\n" +
            "\n" +
            "gujxqsnitohp\n" +
            "tchxqjgoiu\n" +
            "\n" +
            "hgparlm\n" +
            "mjxghlqzp\n" +
            "fmlpahcg\n" +
            "\n" +
            "deptkcyasiwgfonv\n" +
            "ptqufxjhcyglrzdov\n" +
            "\n" +
            "awnxeshvrbcjm\n" +
            "xreswnhbcmvja\n" +
            "axvwnsejrmbhc\n" +
            "xajcmrnevhwbs\n" +
            "sjxhcbearmwnv\n" +
            "\n" +
            "woystmzcbgrljqhxdiukn\n" +
            "mzhlbgcwjusnortdqky\n" +
            "tunrjlzmqosygbwhkcd\n" +
            "\n" +
            "agh\n" +
            "ahg\n" +
            "agh\n" +
            "hga\n" +
            "hag\n" +
            "\n" +
            "cmzkthbquilgwypreno\n" +
            "tsmezpqlwkhrcginuo\n" +
            "gmniotwlpzyqceukrh\n" +
            "wztuikrglhqocnpme\n" +
            "ekqchwogpliumrtzn\n" +
            "\n" +
            "jqadntioypevlwcksmb\n" +
            "hymnfzcvtdaxsekrqijo\n" +
            "dvqmgiacknyoesjt\n" +
            "\n" +
            "cdnbkfzev\n" +
            "bfvdwcezk\n" +
            "kzeblcdvf\n" +
            "vfdkneczb\n" +
            "fdeovjczystkib\n" +
            "\n" +
            "rzc\n" +
            "pma\n" +
            "zwvx\n" +
            "zyrlt\n" +
            "\n" +
            "lmwvudafhnczxibsgpjkreoq\n" +
            "durlgqhmvpxofsiejwcbkzan\n" +
            "mieraklxftswzjbuocndvpqghy\n" +
            "\n" +
            "qlaxkbf\n" +
            "rfhyxtbkseaq\n" +
            "bxkqaf\n" +
            "fkxbaqn\n" +
            "\n" +
            "lpntzrufvskoqciaxhedw\n" +
            "arsztnpofkxcqudilhewv\n" +
            "srvlzcujywkenimafhtoqxp\n" +
            "\n" +
            "snxwjqapfo\n" +
            "nwsfqxpajo\n" +
            "npfqjowaxs\n" +
            "opjfxanwqs\n" +
            "sjaonwxqpf\n" +
            "\n" +
            "cswjquxv\n" +
            "uyecrkg\n" +
            "ufjcl\n" +
            "\n" +
            "qjvzl\n" +
            "jvqzl\n" +
            "lzjqv\n" +
            "qlvjz\n" +
            "\n" +
            "h\n" +
            "h\n" +
            "\n" +
            "mprvotcsgadybjfkqehz\n" +
            "bjsordtucqlgkhfzvepy\n" +
            "fsoqijpvhgkczybrted\n" +
            "yzsgkfhvcbjpeqtrdo\n" +
            "cjzdvkprbheysmofgqt\n" +
            "\n" +
            "jzontimefb\n" +
            "ldorvefxuatpj\n" +
            "\n" +
            "i\n" +
            "xi\n" +
            "\n" +
            "zhtkdvl\n" +
            "pchznv\n" +
            "jmryxuwgazvfh\n" +
            "lkdevczh\n" +
            "\n" +
            "subt\n" +
            "utsb\n" +
            "fsuobt\n" +
            "jutsb\n" +
            "utbjs\n" +
            "\n" +
            "n\n" +
            "n\n" +
            "n\n" +
            "dnk\n" +
            "\n" +
            "qkrfv\n" +
            "fqgvkseut\n" +
            "qvrfk\n" +
            "\n" +
            "w\n" +
            "x\n" +
            "n\n" +
            "n\n" +
            "\n" +
            "mkpoyfrngtwdcjlv\n" +
            "yprcuimjsz\n" +
            "rcyjzxphm\n" +
            "pjecrmyx\n" +
            "ipyramcqj\n" +
            "\n" +
            "puwnzsohkv\n" +
            "nsohwkuzvp\n" +
            "upnhokswvzx\n" +
            "\n" +
            "rmvjwzhx\n" +
            "kpxhqevglom\n" +
            "mzxfhbv\n" +
            "mhwjitfrvnx\n" +
            "mcusxhvwj\n" +
            "\n" +
            "vipkgth\n" +
            "oskhetgp\n" +
            "zlqhnbdjwgurxapc\n" +
            "\n" +
            "vn\n" +
            "vna\n" +
            "gwvdn\n" +
            "\n" +
            "rugcbipvzow\n" +
            "uogrzcvpbwi\n" +
            "\n" +
            "jwxuc\n" +
            "krngvmypl\n" +
            "jwxzi\n" +
            "qashtbedfco\n" +
            "\n" +
            "bzfyl\n" +
            "yzflb\n" +
            "fylbz\n" +
            "lyfzb\n" +
            "ylfbz\n" +
            "\n" +
            "uhkvb\n" +
            "kjhulb\n" +
            "vbkhu\n" +
            "\n" +
            "andlzobvguqsk\n" +
            "nkgvqlzbu\n" +
            "klbiezughvmxnrt\n" +
            "bunkzgljvf\n" +
            "yvkgjpwzubln\n" +
            "\n" +
            "t\n" +
            "t\n" +
            "\n" +
            "bdrjpavtiqlhxuw\n" +
            "pjmzbxidrtulcfw\n" +
            "\n" +
            "wqylp\n" +
            "mrhgfxsjcaltonedv\n" +
            "ywbkul\n" +
            "ikl\n" +
            "\n" +
            "hxpivszmbaodecnlurq\n" +
            "cedlpnibqmwxaghrszou\n" +
            "hunbrdzpsxleaitmqyco\n" +
            "\n" +
            "pymewobv\n" +
            "veazgoy\n" +
            "yvoxle\n" +
            "youfveix\n" +
            "syegdvo\n" +
            "\n" +
            "ogceirlsaqjtmvzdx\n" +
            "rtsaijxocelmzgdvq\n" +
            "dvrqjxizmgscteoal\n" +
            "\n" +
            "jeupkmhcydwaz\n" +
            "daykzechjpwmu\n" +
            "umkaejhwydpzc\n" +
            "aywkjphdzeucm\n" +
            "ypdchmujekazw\n" +
            "\n" +
            "suzacvgjnoi\n" +
            "evgsufjaitn\n" +
            "rqeanjskxbvfgiwu\n" +
            "dknubsaxgvji\n" +
            "\n" +
            "ojxfyetcpdbglmwqunrsi\n" +
            "fjletcbrdsnviogpxwuq\n" +
            "jcgprswxiaefdqnotlub\n" +
            "zfgjewrpldsioxcqntub\n" +
            "nxcgewpqolibrktujsfd\n" +
            "\n" +
            "vwh\n" +
            "hjvw\n" +
            "hvjw\n" +
            "hvwr\n" +
            "vhw\n" +
            "\n" +
            "md\n" +
            "m\n" +
            "m\n" +
            "m\n" +
            "\n" +
            "xkpu\n" +
            "izfmrosjbd\n" +
            "eywqt\n" +
            "xgak\n" +
            "hgn\n" +
            "\n" +
            "layhskgxrpfnwqmdj\n" +
            "mlsxywoakrectnzgqdjf\n" +
            "fbsxnmuikqwrljgv\n" +
            "\n" +
            "rhcn\n" +
            "lon\n" +
            "dln\n" +
            "pban\n" +
            "nhd\n" +
            "\n" +
            "uxwhl\n" +
            "hx\n" +
            "\n" +
            "aesduycrgfmhjblnkzt\n" +
            "jktlhwqioepzgcbnmda\n" +
            "\n" +
            "tbhfongxiudcrv\n" +
            "rqoyfnuxabjekl\n" +
            "\n" +
            "ajd\n" +
            "wjdmak\n" +
            "jda\n" +
            "jad\n" +
            "\n" +
            "ghimtjly\n" +
            "hjtgilm\n" +
            "ghixmjtpal\n" +
            "jtmhilg\n" +
            "imhgtjluo\n" +
            "\n" +
            "ewpfam\n" +
            "epmwa\n" +
            "epwma\n" +
            "ewamp\n" +
            "\n" +
            "cslywuzkdg\n" +
            "jfluyxgbsma\n" +
            "ugysbl\n" +
            "ytlqgaus\n" +
            "hsufgloxyr\n" +
            "\n" +
            "eigjpobrlxnasvhquwy\n" +
            "nirbjslgwyxuoaqevhp\n" +
            "fpnsuxbleoajwyhgirvq\n" +
            "ayinxhubgvweprqljso\n" +
            "\n" +
            "andu\n" +
            "sguand\n" +
            "\n" +
            "embqxktgpduyjia\n" +
            "qtjagiydempukxb\n" +
            "axswpjdgqbumyteik\n" +
            "kgaexydbupqtjmi\n" +
            "uqjbixkdptgmeya\n" +
            "\n" +
            "uxzwnlgyareost\n" +
            "nesygtowzuralx\n" +
            "lnguxsaoyzwtre\n" +
            "\n" +
            "thfobmluspeiwxygv\n" +
            "ibtfgsyouvxdpelh\n" +
            "txqerhuolbpsgfyvi\n" +
            "oehxfsmbiuvpyltg\n" +
            "pfoiuhlebvyxwdgst\n" +
            "\n" +
            "e\n" +
            "ke\n" +
            "e\n" +
            "e\n" +
            "\n" +
            "zhxyc\n" +
            "hczxy\n" +
            "ohzycx\n" +
            "\n" +
            "sylzvbx\n" +
            "sxzvlyb\n" +
            "vltysxbz\n" +
            "ylbxzsvf\n" +
            "\n" +
            "zxkt\n" +
            "xztk\n" +
            "\n" +
            "mnctogxvwkseh\n" +
            "owrsadeqmhtykcg\n" +
            "matkscwo\n" +
            "mcwpzbofs\n" +
            "\n" +
            "wvpybgulfrhnixjka\n" +
            "rgawyujfcsveki\n" +
            "\n" +
            "hbmljqxrtza\n" +
            "xmutqzahl\n" +
            "zaqlmhxtu\n" +
            "hziqlatxumc\n" +
            "\n" +
            "sjwq\n" +
            "qjws\n" +
            "wqjs\n" +
            "jqsw\n" +
            "\n" +
            "ithgcoaed\n" +
            "qtgsdohec\n" +
            "\n" +
            "puidogmhysnk\n" +
            "pgszdunhyiomk\n" +
            "gmyivhnksqodpt\n" +
            "\n" +
            "ionrt\n" +
            "yhvsiud\n" +
            "\n" +
            "xtzrljypsknh\n" +
            "jkhztpylxnrs\n" +
            "yxlkrshtpnjz\n" +
            "\n" +
            "veyflgkws\n" +
            "jwukvfeshmr\n" +
            "evfwksdz\n" +
            "fekvsw\n" +
            "vkfsew\n" +
            "\n" +
            "qbercltdyiwzpfghujxa\n" +
            "bvzlratfchxyijqewpdgu\n" +
            "hfrtqbiayzdxpwujlcge\n" +
            "ejhbpuwytgixrdzaflqc\n" +
            "phrjagczeiyxwdufltbq\n" +
            "\n" +
            "chxzbkemyjgqvltsardoi\n" +
            "osykewcidjtuvzpbqhg\n" +
            "ibqozcsvygmkedfjhtn\n" +
            "\n" +
            "czgih\n" +
            "zcg\n" +
            "\n" +
            "dpulzxtweoafsvnrykqg\n" +
            "zoasklutxwnqevyfgrd\n" +
            "vnrequfolxgtzsdawyk\n" +
            "ynurtkjfogvdqzlewsax\n" +
            "kuydfznpatgvrelxoqws\n" +
            "\n" +
            "fmpeunzs\n" +
            "sumpfzn\n" +
            "fzpmnus\n" +
            "\n" +
            "sadewmz\n" +
            "sldnwe\n" +
            "wjduetyxsh\n" +
            "\n" +
            "no\n" +
            "ou\n" +
            "oua\n" +
            "ybwdoe\n" +
            "\n" +
            "etjdmfhkvupsgob\n" +
            "zjvatuxrhomingds\n" +
            "\n" +
            "wcrpzale\n" +
            "ctyzwdsulbvmexo\n" +
            "ikecwnzlg\n" +
            "ngjwczlae\n" +
            "zlqhwgecj\n" +
            "\n" +
            "p\n" +
            "p\n" +
            "p\n" +
            "v\n" +
            "\n" +
            "x\n" +
            "i\n" +
            "p\n" +
            "x\n" +
            "bgckq\n" +
            "\n" +
            "huty\n" +
            "yatu\n" +
            "cytrqju\n" +
            "wtyu\n" +
            "\n" +
            "k\n" +
            "k\n" +
            "s\n" +
            "\n" +
            "ti\n" +
            "ut\n" +
            "ut\n" +
            "\n" +
            "ltyxj\n" +
            "vaicrwnzb\n" +
            "yegjqp\n" +
            "mjogk\n" +
            "\n" +
            "ifyupadt\n" +
            "idutaypf\n" +
            "\n" +
            "civyufabow\n" +
            "oafw\n" +
            "eawtof\n" +
            "\n" +
            "tdxrcuvqmaoblhsjfynpwigkze\n" +
            "hqfymskzljrtexwugbnacpiov\n" +
            "nymlpweztcgrhjqfuiasbkxvo\n" +
            "qxcponmlbwtvazuykfsegjrih\n" +
            "vuaoelhfcyztjpxingmbkqsrw\n" +
            "\n" +
            "zqtkcomfdyrs\n" +
            "qokdtmzyawfrlc\n" +
            "qdmzejfctykor\n" +
            "\n" +
            "qgkmhvx\n" +
            "vnqmkxlh\n" +
            "kqvhxmre\n" +
            "\n" +
            "aklnbydq\n" +
            "dqynjokaebzlu\n" +
            "kblqrdany\n" +
            "\n" +
            "znaepc\n" +
            "uthvilcm\n" +
            "cpbda\n" +
            "\n" +
            "cep\n" +
            "wgecdbpz\n" +
            "pce\n" +
            "pce\n" +
            "\n" +
            "qgtaelxzvnfr\n" +
            "vwlquxfbmhgdjzir\n" +
            "fqvryplogztx\n" +
            "krfvglqszx\n" +
            "\n" +
            "xebsp\n" +
            "vohgfurnmsa\n" +
            "dqws\n" +
            "ysl\n" +
            "eqyps\n" +
            "\n" +
            "fxnlgkjizbsupyt\n" +
            "aixlkfuwezbgcpsnh\n" +
            "\n" +
            "fliogmexzuqc\n" +
            "ygxqvoeklitmfu\n" +
            "iofxzueqmgl\n" +
            "qouifehxalmg\n" +
            "oefiuqjgdmplx\n" +
            "\n" +
            "cjqnrvu\n" +
            "cquvrn\n" +
            "vqnur\n" +
            "qvrnu\n" +
            "qwsvruxnmf\n" +
            "\n" +
            "esxbjiwnya\n" +
            "ibwnjsxyae\n" +
            "abienjwys\n" +
            "ijwaybnsep\n" +
            "ybeiasjnw\n" +
            "\n" +
            "f\n" +
            "f\n" +
            "f\n" +
            "f\n" +
            "j\n" +
            "\n" +
            "dwfgkqohamebnzly\n" +
            "vhyokaeqpufjdlb\n" +
            "ayhlqfbnoedkg\n" +
            "\n" +
            "g\n" +
            "ijur\n" +
            "ad\n" +
            "\n" +
            "oxpwmzunkjved\n" +
            "dgwxejtpzn\n" +
            "exnrwizdpljhfy\n" +
            "ekzxwdjnpt\n" +
            "\n" +
            "jghbztdkypsovc\n" +
            "arefyzdnlhwpoivbsqj\n" +
            "\n" +
            "cwvpyqnhjmsblikorx\n" +
            "ywjmvfxnbqoitdls\n" +
            "gyuloqbznavmijsxw\n" +
            "\n" +
            "tv\n" +
            "vt\n" +
            "vt\n" +
            "\n" +
            "cxvwzdbpsqnhoa\n" +
            "thoqpsvmaxcbkzlin\n" +
            "anecpvqohsxzb\n" +
            "xscpvobnaqhz\n" +
            "\n" +
            "axnrzgyvepoif\n" +
            "zovgfipynhr\n" +
            "grodvzhinfpy\n" +
            "rnipgfojyhvz\n" +
            "\n" +
            "pbmhlxwqfezrscdtykn\n" +
            "cfmbkwtnlryzqehxpsd\n" +
            "qrbylwtdnsckzefxhmp\n" +
            "\n" +
            "zkqw\n" +
            "wzkq\n" +
            "jqwxzk\n" +
            "\n" +
            "vrdnmyfspbzlxw\n" +
            "izepalkytdnfcxjwhg\n" +
            "nxuwdfqzlyp\n" +
            "\n" +
            "bc\n" +
            "cb\n" +
            "\n" +
            "bf\n" +
            "fb\n" +
            "bfh\n" +
            "efbq\n" +
            "\n" +
            "amw\n" +
            "mpa\n" +
            "maw\n" +
            "\n" +
            "bqwtvl\n" +
            "vlzwtq\n" +
            "ytlqv\n" +
            "zvlqtb\n" +
            "tlqxvc\n" +
            "\n" +
            "lbhxpnkiurmwates\n" +
            "fuwrqbeztjmlpsnxaik\n" +
            "\n" +
            "jpwm\n" +
            "zwljp\n" +
            "jwmp\n" +
            "\n" +
            "zep\n" +
            "cep\n" +
            "pe\n" +
            "\n" +
            "mzx\n" +
            "zmx\n" +
            "xzbck\n" +
            "\n" +
            "dlmvbnupathgjsf\n" +
            "blknfsvtjpgmhdu\n" +
            "pnufdgmhsqtbljv\n" +
            "ijeoufmnchvysrlwzpgtdb\n" +
            "xvpudhgsjmlnbtkf\n" +
            "\n" +
            "cnyuhkmbswzilxovjp\n" +
            "ybjtdewvsrfcznalqhgiku\n" +
            "\n" +
            "bi\n" +
            "rzla\n" +
            "j\n" +
            "\n" +
            "graezckvnqx\n" +
            "agwzkcqnxre\n" +
            "grzxeckaqn\n" +
            "ghercxazknq\n" +
            "rzqakdgexcns\n" +
            "\n" +
            "sfe\n" +
            "b\n" +
            "f\n" +
            "xpjtuand\n" +
            "boies\n" +
            "\n" +
            "kgjfzqlwic\n" +
            "rkcdstgp\n" +
            "\n" +
            "fgsndtox\n" +
            "zodnyxlgts\n" +
            "otxdsgn\n" +
            "nxtfgodis\n" +
            "\n" +
            "zwrtohqdey\n" +
            "teqwry\n" +
            "pvytwegf\n" +
            "ltioweyrc\n" +
            "myeaxntuw\n" +
            "\n" +
            "bw\n" +
            "bw\n" +
            "bw\n" +
            "bw\n" +
            "fbw\n" +
            "\n" +
            "o\n" +
            "gh\n" +
            "\n" +
            "owadmhy\n" +
            "admhoyw\n" +
            "wmohyda\n" +
            "\n" +
            "nywib\n" +
            "ceulqpzh\n" +
            "\n" +
            "zs\n" +
            "sz\n" +
            "zs\n" +
            "zsko\n" +
            "szr\n" +
            "\n" +
            "izaqf\n" +
            "uijrf\n" +
            "infgq\n" +
            "\n" +
            "w\n" +
            "qw\n" +
            "m\n" +
            "bzr\n" +
            "o\n" +
            "\n" +
            "emavls\n" +
            "hbxwektuqjo\n" +
            "\n" +
            "qrhspwbulzkaxdm\n" +
            "auwbhyxlkdvq\n" +
            "\n" +
            "turdsw\n" +
            "utxrwsd\n" +
            "rtundsw\n" +
            "usdtrjwo\n" +
            "utdowrs\n" +
            "\n" +
            "gjro\n" +
            "gojm\n" +
            "\n" +
            "xhnilqdp\n" +
            "ienxaovqldkhg\n" +
            "\n" +
            "rgjonh\n" +
            "nvokcjqrt\n" +
            "argnjo\n" +
            "\n" +
            "jmgchqb\n" +
            "jivdabluqf\n" +
            "\n" +
            "ylmicxtahwqfvukneopgzsbrdj\n" +
            "hbzpeaqvlxgotsjkwmfndyiruc\n" +
            "\n" +
            "p\n" +
            "rop\n" +
            "\n" +
            "delgcpurwxniqohkvyas\n" +
            "gurxclnvdwbikoqezs\n" +
            "rnxewiqvgktmosfjd\n" +
            "\n" +
            "tigwskmhvupobfnydxcre\n" +
            "qwmdoycrhvsjptzxngbikue\n" +
            "yvmetfcbahuklxpdgowrisn\n" +
            "\n" +
            "wsy\n" +
            "wys\n" +
            "syjw\n" +
            "wys\n" +
            "yws\n" +
            "\n" +
            "srwpt\n" +
            "wtsrp\n" +
            "\n" +
            "lhafkqwscv\n" +
            "aklhcvrsqfw\n" +
            "vfsqckalwh\n" +
            "hlnqskcfvwa\n" +
            "klfwvzsdpacmhq\n" +
            "\n" +
            "ehbzglfvtdxpkicy\n" +
            "dl\n" +
            "jnmdl\n" +
            "wdsl\n" +
            "\n" +
            "rew\n" +
            "rek\n" +
            "ehi\n" +
            "ilehwkm\n" +
            "axe\n" +
            "\n" +
            "bl\n" +
            "hzlgey\n" +
            "\n" +
            "iboqgtdxprunz\n" +
            "uonzipxrgqbtd\n" +
            "\n" +
            "o\n" +
            "o\n" +
            "\n" +
            "bldk\n" +
            "bkpl\n" +
            "fklbc\n" +
            "\n" +
            "ynmuedqwhoktxprcavz\n" +
            "fshlwuznoymekqtprdv\n" +
            "\n" +
            "hjtwrzo\n" +
            "rowhztj\n" +
            "wuxrojhzt\n" +
            "ozjhrtw\n" +
            "hotzwjr\n" +
            "\n" +
            "senxaq\n" +
            "baen\n" +
            "ajmne\n" +
            "gaielnd\n" +
            "htfnpkuvwoae\n" +
            "\n" +
            "joklzmcuyg\n" +
            "uyzrifcmlkgsj\n" +
            "kyoumjcagblz\n" +
            "uytcgqklzjm\n" +
            "\n" +
            "ujvi\n" +
            "ijuv\n" +
            "epmijuv\n" +
            "viju\n" +
            "\n" +
            "tahxdeq\n" +
            "dazexot\n" +
            "baelxdq\n" +
            "pwexdgvyiukjcaf\n" +
            "edrnamzx\n" +
            "\n" +
            "zxqslwyh\n" +
            "shgyqlwxaz\n" +
            "\n" +
            "xbs\n" +
            "xbs\n" +
            "bsx\n" +
            "\n" +
            "kwlhvxy\n" +
            "kqwvlyxh\n" +
            "klvxwyqh\n" +
            "hxlkwvyq\n" +
            "kylwpvhxd\n" +
            "\n" +
            "koznivas\n" +
            "basiozvkn\n" +
            "ovzkluniash\n" +
            "ksnxcavioz\n" +
            "\n" +
            "g\n" +
            "g\n" +
            "g\n" +
            "g\n" +
            "shin\n" +
            "\n" +
            "e\n" +
            "qtvo\n" +
            "ac\n" +
            "ksw\n" +
            "ae\n" +
            "\n" +
            "pay\n" +
            "nau\n" +
            "a\n" +
            "\n" +
            "czkmwrvefultigxjhdqaopsnby\n" +
            "flqrbdxungowzkmjsyepvhitca\n" +
            "\n" +
            "ymw\n" +
            "vurft\n" +
            "\n" +
            "wqpgys\n" +
            "ywsq\n" +
            "qswy\n" +
            "qsyew\n" +
            "ywsq\n" +
            "\n" +
            "ndmo\n" +
            "fdoznkmw\n" +
            "hmuzndo\n" +
            "mtqdrnyo\n" +
            "uwfomnd\n" +
            "\n" +
            "pktnzsqhyvmaejclwuor\n" +
            "jwznystlkmqcraeovhup\n" +
            "vuwmteknjqohylazsrcp\n" +
            "\n" +
            "k\n" +
            "k\n" +
            "k\n" +
            "okxe\n" +
            "\n" +
            "fjilbxs\n" +
            "ib\n" +
            "bi\n" +
            "iqb\n" +
            "ibeq\n" +
            "\n" +
            "gjlyop\n" +
            "opglehyztj\n" +
            "jpclgymno\n" +
            "dopglymwj\n" +
            "gojplrbcy\n" +
            "\n" +
            "nuygowpxetsahrv\n" +
            "jgtpyhruwonexq\n" +
            "rlepnuikhgybxwot\n" +
            "svnygeuroxhzptqw\n" +
            "\n" +
            "wkies\n" +
            "eisqwk\n" +
            "kisew\n" +
            "eiwks\n" +
            "gxbkwsiep\n" +
            "\n" +
            "oj\n" +
            "joe\n" +
            "oj\n" +
            "jo\n" +
            "oj\n" +
            "\n" +
            "gtzunomec\n" +
            "cezutnko\n" +
            "tunzeco\n" +
            "cuoftneazk\n" +
            "\n" +
            "vpifjqnbcuaelxzgdwos\n" +
            "gfsyuwzclexopjvimqabd\n" +
            "\n" +
            "npaxeizolfrygctvw\n" +
            "rgtpxwicvafozenl\n" +
            "\n" +
            "e\n" +
            "e\n" +
            "p\n" +
            "t\n" +
            "e\n" +
            "\n" +
            "ohiaqmdktxnbpwlc\n" +
            "iqcopmavhwxbgnl\n" +
            "bhqaoiwxlpmcnzy\n" +
            "oxhwifeapuncblrmq\n" +
            "\n" +
            "wghbsijofevcu\n" +
            "qtlmkday\n" +
            "xlrznmp\n" +
            "\n" +
            "zbrjh\n" +
            "rzbjh\n" +
            "vebhzr\n" +
            "klrzhb\n" +
            "rjbhznl\n" +
            "\n" +
            "kcgzmvfrxebiautyohdwq\n" +
            "thdkgwzymrafbxecqiovus\n" +
            "rgtwzvocydiafmkqubehx\n" +
            "\n" +
            "i\n" +
            "ry\n" +
            "n\n" +
            "xgscp\n" +
            "\n" +
            "kzjngd\n" +
            "rdmwgnujzok\n" +
            "\n" +
            "djpivm\n" +
            "mdipjv\n" +
            "mlvdjip\n" +
            "\n" +
            "ilbdjmvfhyzxcqwuspn\n" +
            "lichmuxnzpqsyvwbfj\n" +
            "umnvlbiwqsfchxpzyj\n" +
            "uylzhpvfqbscijxmwn\n" +
            "clwjnihuyzpmqbxsfv\n" +
            "\n" +
            "o\n" +
            "o\n" +
            "fo\n" +
            "pon\n" +
            "\n" +
            "aowpk\n" +
            "zg\n" +
            "dt\n" +
            "uc\n" +
            "u\n" +
            "\n" +
            "ymhiouqp\n" +
            "lkyoqi\n" +
            "ywtsvqio\n" +
            "lnmyoiq\n" +
            "\n" +
            "ydbhigntrexvkua\n" +
            "urlaigkqnydwxhb\n" +
            "\n" +
            "nfro\n" +
            "z\n" +
            "jz\n" +
            "\n" +
            "ojsag\n" +
            "gajso\n" +
            "gjsao\n" +
            "jhsog\n" +
            "\n" +
            "t\n" +
            "t\n" +
            "y\n" +
            "h\n" +
            "\n" +
            "jieqmryxv\n" +
            "xqvimey\n" +
            "umyqveix\n" +
            "vtedmnxliqyf\n" +
            "\n" +
            "tmd\n" +
            "tdm\n" +
            "dtm\n" +
            "mkdt\n" +
            "hmdt\n" +
            "\n" +
            "px\n" +
            "gwruq\n" +
            "pz\n" +
            "\n" +
            "tejofhqklimp\n" +
            "thojpkfgelwmrq\n" +
            "\n" +
            "tseirdkyqvcghwju\n" +
            "tjhycvgilezdws\n" +
            "\n" +
            "roqbndl\n" +
            "rdql\n" +
            "qlrd\n" +
            "lqremd\n" +
            "\n" +
            "qvgunystzpckrwifmxdolajehb\n" +
            "bgtixcwloydzqjskvnfmpeurah\n" +
            "\n" +
            "soviern\n" +
            "rlakxngecptvsz\n" +
            "nvdsre\n" +
            "\n" +
            "gzkoiysxl\n" +
            "vjrlmtpbsceozhauwx\n" +
            "kfnqdzolsx\n" +
            "\n" +
            "kwzaqnipgxfhoy\n" +
            "hanwlofgqxpzk\n" +
            "xqngazkwphof\n" +
            "pqwkfghaoxzn\n" +
            "qwnfgpakxhzo\n" +
            "\n" +
            "zhurktfoqmlbnx\n" +
            "mhlxorzbntufqk\n" +
            "qbzklhnurmotfx\n" +
            "\n" +
            "gezmci\n" +
            "oecmg\n" +
            "\n" +
            "pcyteovnsz\n" +
            "dptlfuzh\n" +
            "\n" +
            "roxjhkng\n" +
            "xonksrad\n" +
            "rxnikos\n" +
            "\n" +
            "vbgmsrecxpj\n" +
            "srcjxmbgep\n" +
            "rbgsxcepjkmq\n" +
            "pjgcmzbsrxe\n" +
            "\n" +
            "gkvwndflryjshmbqxtpizuocea\n" +
            "fwndvekqtzployghijsmruabx\n" +
            "\n" +
            "dcxtogbifek\n" +
            "ifkdgoxbc\n" +
            "\n" +
            "srmqlnhbwv\n" +
            "liwsqzvtn\n" +
            "wgeoqvpfs\n" +
            "wkyqvsacd\n" +
            "\n" +
            "yswarofhdmqclxkgut\n" +
            "daxhzkgumjysrlwq\n" +
            "qfamswzyiglxdruhk\n" +
            "vsnwxadlhrbgqmuyk\n" +
            "\n" +
            "rxwzkmd\n" +
            "kwzx\n" +
            "qawokzlxe\n" +
            "xmdnfkwz\n" +
            "\n" +
            "exo\n" +
            "xvqod\n" +
            "cv\n" +
            "pnrkmywh\n" +
            "uztea\n" +
            "\n" +
            "ma\n" +
            "ma\n" +
            "qamfr\n" +
            "am\n" +
            "\n" +
            "nksp\n" +
            "kvpn\n" +
            "pkn\n" +
            "nkvp\n" +
            "nkp\n" +
            "\n" +
            "pwlvdsagy\n" +
            "islyawu\n" +
            "\n" +
            "sgbnwulekhpmy\n" +
            "mjgqeyshpbwuln\n" +
            "yubghpanecmszwlv\n" +
            "euwohbysqngptlmx\n" +
            "\n" +
            "gs\n" +
            "e\n" +
            "kas\n" +
            "a\n" +
            "md\n" +
            "\n" +
            "i\n" +
            "x\n" +
            "bl\n" +
            "\n" +
            "vishqyrzgmpbeuldj\n" +
            "gwcpvnskbftudyorj\n" +
            "\n" +
            "ueswlatkopc\n" +
            "wbeosclpktau\n" +
            "lcpvaswokuet\n" +
            "ltkupsmeawoc\n" +
            "\n" +
            "iwtvopbgyc\n" +
            "widjykopv\n" +
            "ivowyp\n" +
            "iwyvhop\n" +
            "\n" +
            "bfnwdumyozhpxre\n" +
            "zhweumdnpbofy\n" +
            "dcsobyuhfntpmzwe\n" +
            "\n" +
            "zrlaspbhty\n" +
            "oyhrftzbslap\n" +
            "ysztbhlapr\n" +
            "tszhpbayrl\n" +
            "\n" +
            "wbgxh\n" +
            "gnhwxcb\n" +
            "wxbhg\n" +
            "gxhwb\n" +
            "gxbwh\n" +
            "\n" +
            "ngribvdawujskcmfx\n" +
            "rvskbgiwjxuca\n" +
            "wiyvgcsbjxkrua\n" +
            "\n" +
            "ifstrq\n" +
            "fk\n" +
            "\n" +
            "b\n" +
            "b\n" +
            "b\n" +
            "u\n" +
            "\n" +
            "hpqy\n" +
            "wjplyq\n" +
            "\n" +
            "zwkfgbsmedluyot\n" +
            "fdtrhsgeumk\n" +
            "vexgtudkshfim\n" +
            "eutigskmdrf\n" +
            "\n" +
            "imljkdnzpx\n" +
            "jqwknpxlhmzd\n" +
            "pmdyxgnjklz\n" +
            "rxbjmlnkzdpg\n" +
            "ulxbmpdnzykj\n" +
            "\n" +
            "vetubnwdy\n" +
            "bnwatdvyou\n" +
            "zfwgvtdbnki\n" +
            "dlvewatnb\n" +
            "\n" +
            "uj\n" +
            "otuj\n" +
            "uj\n" +
            "\n" +
            "ifstpgrbcnywaxmkdzoqvh\n" +
            "qkbfhovrginxapzywdct\n" +
            "vyofbwcdginrkqtazhxp\n" +
            "\n" +
            "mvnaokugdshybwtr\n" +
            "ntvsywuadrkmohgb\n" +
            "\n" +
            "fauo\n" +
            "pnofxadk\n" +
            "sfoa\n" +
            "sofa\n" +
            "\n" +
            "akecpnjdwrztvlfbuhsiq\n" +
            "jehrndzisqcauwlftkbpv\n" +
            "uawiskrjentfbcqlpdvhz\n" +
            "crtpjbdalsviwfnhqezuk\n" +
            "ncawkfdsqtrhpjzielvub\n" +
            "\n" +
            "otazsfhc\n" +
            "ltkacysow\n" +
            "pvtomna\n" +
            "tacok\n" +
            "\n" +
            "mx\n" +
            "x\n" +
            "x\n" +
            "x\n" +
            "x\n" +
            "\n" +
            "hmoy\n" +
            "zmyhjuo\n" +
            "ypmxohn\n" +
            "hoxym\n" +
            "\n" +
            "dm\n" +
            "md\n" +
            "dm\n" +
            "md\n" +
            "\n" +
            "uqvbhfdomlwtkxez\n" +
            "szaqwmlhytgvxkr\n" +
            "wmpzhxqktlv\n" +
            "\n" +
            "btkpdjinsrmogfywzhlvecau\n" +
            "idylbvnopjsgrkfheuczawtm\n" +
            "tygvsizrwjneplkohcmafudb\n" +
            "wtvprskenjchmiyfuzglodba\n" +
            "jwdafzcemrbsunotyglpihkv\n" +
            "\n" +
            "e\n" +
            "ouxg\n" +
            "ei\n" +
            "shp\n" +
            "\n" +
            "ul\n" +
            "ul\n" +
            "ulrspe\n" +
            "louy\n" +
            "uynlvo\n" +
            "\n" +
            "yibgqkf\n" +
            "uvcwx\n" +
            "mvxdohjlw\n" +
            "\n" +
            "q\n" +
            "z\n" +
            "z\n" +
            "\n" +
            "orxgfiqznujyplsbadv\n" +
            "gtzieoxspqrvndjbylfu\n" +
            "\n" +
            "hmlqcujrysbgoentdp\n" +
            "dyjmrbtpuhgslncw\n" +
            "rmyfuhdgclnpsktjb\n" +
            "ptucnyhsmlwrbgjd\n" +
            "wrhnldscjeyupmtgb\n" +
            "\n" +
            "sowieczubgx\n" +
            "firsgewzpbo\n" +
            "\n" +
            "txeo\n" +
            "exot\n" +
            "oext\n" +
            "oxte\n" +
            "otxe\n" +
            "\n" +
            "ontlbzyekruhpscwqvaxmdj\n" +
            "ahrtijxdepnokymcsgwuf\n" +
            "\n" +
            "ftsraxmwogvnkdbzqiyhju\n" +
            "ylsdhonjzrfwmqukc\n" +
            "\n" +
            "leiupzardbfsv\n" +
            "dzuwlesifrbp\n" +
            "ldiupzersfb\n" +
            "fupwslrzbedi\n" +
            "\n" +
            "jtdp\n" +
            "dajg\n" +
            "\n" +
            "jpglzoriafexks\n" +
            "gpaozketlcixs\n" +
            "\n" +
            "butisvecnfplqmygworax\n" +
            "jrhpbwztcveifamlyqxdung\n" +
            "\n" +
            "r\n" +
            "r\n" +
            "r\n" +
            "zr\n" +
            "\n" +
            "eyniaztvgdrl\n" +
            "dalgonxbiecywthzvr\n" +
            "dtzrgenvliya\n" +
            "\n" +
            "akzferolcmstgby\n" +
            "kmcagsbteyrlfzo\n" +
            "aoktgslmcrzbfye\n" +
            "\n" +
            "jqigpeydwl\n" +
            "mkeaxqcudzgvfhb\n" +
            "\n" +
            "ayhgbfzerjxd\n" +
            "rnzfaxy\n" +
            "wyzaxnrf\n" +
            "ycazxfrw\n" +
            "ayzxrf\n" +
            "\n" +
            "jgmkwtnizxrcbvfqhyeal\n" +
            "mwatrngvlezckqfiybhjx\n" +
            "vmrwyqnigzhtjfckxaeb\n" +
            "wkehnqrtcjigzxavbfym\n" +
            "vrczmohgtfbnaejxqiwyk\n" +
            "\n" +
            "c\n" +
            "c\n" +
            "c\n" +
            "c\n" +
            "\n" +
            "idx\n" +
            "id\n" +
            "id\n" +
            "\n" +
            "zaipnjbsxkg\n" +
            "xevnfipkjgb\n" +
            "ujxldqcnbhi\n" +
            "\n" +
            "hco\n" +
            "co\n" +
            "\n" +
            "ztlrica\n" +
            "ktneixcrs\n" +
            "\n" +
            "hlutcdsgoj\n" +
            "mwlypnzbqafvxkire\n" +
            "\n" +
            "lznhjwgsiv\n" +
            "wricunaxj\n" +
            "\n" +
            "fdqgyzopwlen\n" +
            "rkvt\n" +
            "\n" +
            "vy\n" +
            "gy\n" +
            "\n" +
            "ihbpfsx\n" +
            "pshixfb\n" +
            "sifxhpb\n" +
            "\n" +
            "begmqirvflkxuyanp\n" +
            "dmpvhfbnaxsuloqitjy\n" +
            "\n" +
            "uwamykhsnbfzxielpdo\n" +
            "cxzswhvtabupmqjlekond\n" +
            "\n" +
            "gisqpjrubx\n" +
            "rjbiuqxspg\n" +
            "gqpirxbsju\n" +
            "\n" +
            "u\n" +
            "u\n" +
            "v\n" +
            "u\n" +
            "\n" +
            "gnjqsoha\n" +
            "qgandhlyrs\n" +
            "snhqvlrabg\n" +
            "\n" +
            "vo\n" +
            "vo\n" +
            "ov\n" +
            "vo\n" +
            "\n" +
            "iudvwxpmtac\n" +
            "owlyxsangim\n" +
            "hbdrxmwaei\n" +
            "wjimax\n" +
            "\n" +
            "xmubte\n" +
            "yuogxa\n" +
            "\n" +
            "nwkurtxjcpqozmhgsvbe\n" +
            "chrmvakuyxtowqpgzbej\n" +
            "\n" +
            "manbesvzpyt\n" +
            "dgtwazpqjmbnr\n" +
            "itfkoupbhlcnax\n" +
            "\n" +
            "omhinsxf\n" +
            "lnmdoix\n" +
            "eimgrno\n" +
            "hyomidn\n" +
            "nmjodi\n" +
            "\n" +
            "qmpn\n" +
            "ripmn\n" +
            "\n" +
            "wfm\n" +
            "wmf\n" +
            "mwf\n" +
            "mfw\n" +
            "fwm\n" +
            "\n" +
            "uaoxphg\n" +
            "phoxb\n" +
            "\n" +
            "btfprm\n" +
            "ztmrf\n" +
            "mrft\n" +
            "ramft\n" +
            "tmrezfa\n" +
            "\n" +
            "uaznory\n" +
            "zyaiourn\n" +
            "nouryaz\n" +
            "coszugmanyr\n" +
            "lqazryonu\n" +
            "\n" +
            "vqlswifmcg\n" +
            "wzuclnxsvt\n" +
            "\n" +
            "eh\n" +
            "eh\n" +
            "he\n" +
            "\n" +
            "siuhfpb\n" +
            "iuhfs\n" +
            "\n" +
            "yfhciqlnwpgemoxktas\n" +
            "ticjauwfsygepqnhx\n" +
            "\n" +
            "ndmhwtub\n" +
            "zbagktxiulnwh\n" +
            "\n" +
            "txdikm\n" +
            "boldxtiqmf\n" +
            "dxtimj\n" +
            "\n" +
            "wvr\n" +
            "vwrb\n" +
            "wrv\n" +
            "\n" +
            "utyjachpfordvw\n" +
            "benvkudcfta\n" +
            "vduqiftcgsa\n" +
            "fcuatdxv\n" +
            "\n" +
            "doivj\n" +
            "jiv\n" +
            "vjkpyi\n" +
            "jvi\n" +
            "dijv\n" +
            "\n" +
            "mhyn\n" +
            "mxngywh\n" +
            "yjhmn\n" +
            "dmynhulkacb\n" +
            "\n" +
            "hpidlbezkwqtr\n" +
            "dgtaflrnyscm\n" +
            "\n" +
            "osqeajcvduwhzrtkl\n" +
            "zcaevujrqsdolgwkyt\n" +
            "uokqnrdjaecvwtlzs\n" +
            "\n" +
            "ovsbxzgaju\n" +
            "vliydjht\n" +
            "dvjt\n" +
            "\n" +
            "stlxuabmcwqkodevrhf\n" +
            "ajskvtpmlicqewbhuzfd\n" +
            "\n" +
            "g\n" +
            "cg\n" +
            "ezfo\n" +
            "\n" +
            "zqfmuxlnhkgdpvwrtjio\n" +
            "rkjqvomtguhpiwfzxnld\n" +
            "zfgxrclnimokhvpjdutwq\n" +
            "tgkxfqrnhdzowpvijlmu\n" +
            "\n" +
            "ni\n" +
            "qn\n" +
            "nq\n" +
            "\n" +
            "sn\n" +
            "qn\n" +
            "fdn\n" +
            "qn\n" +
            "hson\n" +
            "\n" +
            "tplicyhxqfujbkzv\n" +
            "qfbzvwkuycsa\n" +
            "vzqnbfcokyuda\n" +
            "\n" +
            "apoy\n" +
            "plfxotkv\n" +
            "iphsqjorged\n" +
            "\n" +
            "ravyhbsfelgcmzponqwikj\n" +
            "bitfjzwakhmvxngsoepcyrlq\n" +
            "cevpwyrnlobjsfziagkhmq\n" +
            "mswnezcpklfrjqgiyovabdh\n" +
            "cijelkwpbnhrsmzofygavq\n" +
            "\n" +
            "sqvnuedcytaxohplzf\n" +
            "cekhbgwadpmyofslxq\n" +
            "\n" +
            "gclfnxakjzsw\n" +
            "wzjcnsgka\n" +
            "ciwzsganjk\n" +
            "aspicokjgnwz\n" +
            "\n" +
            "qrabg\n" +
            "ajbgmw\n" +
            "yabg\n" +
            "vgsrba\n" +
            "hcgtbya\n" +
            "\n" +
            "xarbuvi\n" +
            "ivaku\n" +
            "kiuav\n" +
            "vzgxiah\n" +
            "flsivaj\n" +
            "\n" +
            "ckodrthljgyfwm\n" +
            "mgytohfxnrdkjbvlwc\n" +
            "cfdwmjoltkshrgy\n" +
            "yhwmrldfucogkjt\n" +
            "fmctpgwydhkajlro\n" +
            "\n" +
            "qvibocelnsdyzfkjhpuxmtrg\n" +
            "zgdksnoypqebifltcrjvuxmh\n" +
            "giocmuefxsprhdjkzntvqlyb\n" +
            "\n" +
            "xkcrlwomygs\n" +
            "grluckhsanomxwf\n" +
            "sriokwlmcyxg\n" +
            "kxgirswtcvlom\n" +
            "\n" +
            "budr\n" +
            "brdu\n" +
            "dibur\n" +
            "urbd\n" +
            "\n" +
            "o\n" +
            "o\n" +
            "\n" +
            "p\n" +
            "p\n" +
            "p\n" +
            "p\n" +
            "\n" +
            "wnydf\n" +
            "wrptghizjqk\n" +
            "\n" +
            "wnbdmltxcq\n" +
            "dfcwl\n" +
            "\n" +
            "ksaveflzdxqocbgyjp\n" +
            "bcxavldgysqozpkjfe\n" +
            "ozpvselaqgbdycjxfk\n" +
            "clpzdoebvqjgaskxfy\n" +
            "qykodlgvzjaxspfceb\n" +
            "\n" +
            "nrmdjstqozklxvcyag\n" +
            "ejzwbu\n" +
            "\n" +
            "kfgijmd\n" +
            "zmgjdikf\n" +
            "jgimfdk\n" +
            "ijfgkmdz\n" +
            "smbrfkxdwgeij\n" +
            "\n" +
            "yhtuxnfcq\n" +
            "tcyufhnxq\n" +
            "hfuxytcqn\n" +
            "nqtufyxch\n" +
            "\n" +
            "rlhzknoiuycefpmvxqbg\n" +
            "nbvgfexmqikpyhruo\n" +
            "hqkgnvyieomubfxpr\n" +
            "\n" +
            "bjyadnftcsxqk\n" +
            "lpfbvzcsumerho\n" +
            "wctsbf\n" +
            "\n" +
            "iyamec\n" +
            "myeibctka\n" +
            "egyicam\n" +
            "\n" +
            "ac\n" +
            "pvaqdb\n" +
            "a\n" +
            "au\n" +
            "\n" +
            "giltsum\n" +
            "ixyhncbjqped\n" +
            "\n" +
            "cinzuvkystgfodr\n" +
            "rksphwcfxdgey\n" +
            "xrdjkygcsfq\n" +
            "bfmdecpysrkg\n" +
            "gcrdyslfk\n" +
            "\n" +
            "ayqpgucwedftoxjk\n" +
            "eoagwdtkfqlypjuc\n" +
            "\n" +
            "ktysxp\n" +
            "sptx\n" +
            "qpxst\n" +
            "ptsqx\n" +
            "\n" +
            "uvclismeajkpbzgqwn\n" +
            "aicbqfzvlnuegpm\n" +
            "glecvmpzrnioudaq\n" +
            "kanmveflzpcgyuqi\n" +
            "\n" +
            "vklag\n" +
            "glv\n" +
            "lvg\n" +
            "lgv\n" +
            "vgl\n" +
            "\n" +
            "tyuh\n" +
            "hut\n" +
            "thu\n" +
            "htu\n" +
            "thu\n" +
            "\n" +
            "eyipwtfuhxzalmdgrs\n" +
            "whfcvbquxgepn\n" +
            "\n" +
            "tg\n" +
            "ge\n" +
            "g\n" +
            "\n" +
            "vk\n" +
            "uatvn\n" +
            "mzv\n" +
            "\n" +
            "jhfmpux\n" +
            "mhjquxkp\n" +
            "\n" +
            "gzyxjwfb\n" +
            "grzfxmwybj\n" +
            "cywfjpxztgb\n" +
            "\n" +
            "udrye\n" +
            "eqdyr\n" +
            "yerd\n" +
            "eryd\n" +
            "\n" +
            "kwdoynribhpsqmlgvuje\n" +
            "gunbjywvmheirdqpok\n" +
            "dnqeivoptrkwuyjhmg\n" +
            "\n" +
            "czvmpr\n" +
            "sxpum\n" +
            "\n" +
            "qlktsn\n" +
            "tkclq\n" +
            "sbqlkwt\n" +
            "luetjiqpk\n" +
            "lcvtqsk\n" +
            "\n" +
            "rotvsfwelbnj\n" +
            "fwbqmaolesn\n" +
            "qbfwegzislpnoc\n" +
            "nzoelswfpab\n" +
            "\n" +
            "wsecbml\n" +
            "sclabmwe\n" +
            "ezpsidclwtmbgvr\n" +
            "mcelawsb\n" +
            "\n" +
            "ngz\n" +
            "zg\n" +
            "gz\n" +
            "zg\n" +
            "gz\n" +
            "\n" +
            "xqjwnaiyb\n" +
            "jayxibqngw\n" +
            "qinjwxbay\n" +
            "nbaiwyxqj\n" +
            "jniaxqwyb\n" +
            "\n" +
            "hktywl\n" +
            "htwlyk\n" +
            "kytwlh\n" +
            "\n" +
            "ymbeahldgz\n" +
            "pjaoszx\n" +
            "\n" +
            "b\n" +
            "b\n" +
            "bz\n" +
            "kb\n" +
            "\n" +
            "gvdcqp\n" +
            "qpvyrcdlk\n" +
            "\n" +
            "nij\n" +
            "jfiub\n" +
            "jtieyxl\n" +
            "mnij\n" +
            "imvju\n" +
            "\n" +
            "qh\n" +
            "hq\n" +
            "hq\n" +
            "hq\n" +
            "\n" +
            "tez\n" +
            "zet\n" +
            "etz\n" +
            "etz\n" +
            "\n" +
            "wz\n" +
            "wz\n" +
            "\n" +
            "xc\n" +
            "jvxc\n" +
            "xpzc\n" +
            "rgumxc\n" +
            "xc\n" +
            "\n" +
            "nizsgkvylw\n" +
            "ngylivwzks\n" +
            "ylgsiznvkw\n" +
            "ilgyvsankzw\n" +
            "ilzywsnkgv\n" +
            "\n" +
            "emhpiwfyung\n" +
            "qlzkob\n" +
            "ldjx\n" +
            "xvat\n" +
            "\n" +
            "luzfaswdyj\n" +
            "jsdyuzlafw\n" +
            "ljdsafzuwy\n" +
            "yusdjwzfal\n" +
            "dsyjwuzafl\n" +
            "\n" +
            "uioafnlegsvjdxphr\n" +
            "lnfrjdpehvsxguoa\n" +
            "najruefdlxogvhsp\n" +
            "\n" +
            "gumjphl\n" +
            "mplchdjuw\n" +
            "hmjrlup\n" +
            "jmpgulh\n" +
            "\n" +
            "q\n" +
            "q\n" +
            "q\n" +
            "q\n" +
            "q\n" +
            "\n" +
            "feyimktsugrq\n" +
            "qygsrtlpmfkeui\n" +
            "sfkmrgqyitue\n" +
            "\n" +
            "xpklzsyodcnhrjq\n" +
            "xcznojsdpqhrlky\n" +
            "\n" +
            "btmsc\n" +
            "mtscbv\n" +
            "csmtb\n" +
            "tmbcsx\n" +
            "mbxtsc\n" +
            "\n" +
            "dvrfumay\n" +
            "ymafr\n" +
            "mrifya\n" +
            "ykrmaf\n" +
            "\n" +
            "do\n" +
            "d\n" +
            "andk\n" +
            "dcp\n" +
            "d\n" +
            "\n" +
            "glhmjykfaznvrd\n" +
            "bvmijshzga\n" +
            "vmjuqazhgpx\n" +
            "voczhgamj\n" +
            "wjhizgqavms\n" +
            "\n" +
            "voilgtup\n" +
            "\n" +
            "vrphtmc\n" +
            "bgfkjvad\n" +
            "\n" +
            "bxkfi\n" +
            "kixbf\n" +
            "xfkbi\n" +
            "xfikb\n" +
            "xfkbi\n" +
            "\n" +
            "lfixvpozghcauk\n" +
            "plgixmzukcovh\n" +
            "hyruilocxgkztqv\n" +
            "uglxkaihcozv\n" +
            "\n" +
            "avgptdmi\n" +
            "gydpvt\n" +
            "dptawvu\n" +
            "rvtdopxlqs\n" +
            "\n" +
            "rsmglpt\n" +
            "gpmnlthr\n" +
            "\n" +
            "tqmeukoia\n" +
            "kamiout\n" +
            "mqwauekov\n" +
            "macoryuk\n" +
            "nujbskgapmlo\n" +
            "\n" +
            "ndjrglykwoi\n" +
            "jrwkdnolygi\n" +
            "ownkidlryjg\n" +
            "\n" +
            "kwheact\n" +
            "txukwjcgbhar\n" +
            "whgotjk\n" +
            "kzhtw\n" +
            "lmvynhptdqkifw\n" +
            "\n" +
            "odkzwylprhvn\n" +
            "pwozvnydrh\n" +
            "zdhnpryowv\n" +
            "\n" +
            "crni\n" +
            "qdnkiou\n" +
            "gbwhyasjx\n" +
            "\n" +
            "bxitsamogcq\n" +
            "erbxklyhvtczu\n" +
            "\n" +
            "swrfxdpjhly\n" +
            "pwdjkvfyxrshl\n" +
            "sxehqrtwpdamnyjzolbui\n" +
            "gpdryslhwxcj\n" +
            "\n" +
            "fhldcksrpyi\n" +
            "qfejshrcat\n" +
            "wsmrvcnogxh\n" +
            "\n" +
            "vwacyofjtilrxngp\n" +
            "otylvxpfwgcnjria\n" +
            "xojfignyrtlpwvca\n" +
            "\n" +
            "qvz\n" +
            "ozm\n" +
            "\n" +
            "msrdwqahutefvxy\n" +
            "rjmyotiefuh\n" +
            "ltyrmenbzjuhf\n" +
            "felbyputmhr\n" +
            "\n" +
            "riyzo\n" +
            "kzroyuwi\n" +
            "yirozp\n" +
            "yoirz\n" +
            "roiyz\n" +
            "\n" +
            "rqjz\n" +
            "vjrq\n" +
            "qrj\n" +
            "prqj\n" +
            "zqjr\n" +
            "\n" +
            "vdx\n" +
            "xvd\n" +
            "xdvu\n" +
            "vdx\n" +
            "\n" +
            "xeauhryviqg\n" +
            "wpxkufzsjmctlnybd\n" +
            "\n" +
            "hbzwdlno\n" +
            "tmrj\n" +
            "np\n" +
            "lqfx\n" +
            "kuygescvia\n" +
            "\n" +
            "iqph\n" +
            "ihpq\n" +
            "pqhi\n" +
            "ihqp\n" +
            "qpih\n" +
            "\n" +
            "lsfwxmpkgqzvhecoay\n" +
            "gqfszwakhvymptcexol\n" +
            "cpaxwlzkfqvhsgemyo\n" +
            "lghfwvcmzxpokeysaq\n" +
            "\n" +
            "tgmpafqbuds\n" +
            "hspdfabuqgctm\n" +
            "tpcubdaqsvgm\n" +
            "mxqbktspoaujd\n" +
            "\n" +
            "xktgfvyprhndme\n" +
            "vntmyskfegprid\n" +
            "dsvpfmnkygtre\n" +
            "ydmvpkfretng\n" +
            "\n" +
            "npvgjzuo\n" +
            "mwlackhs\n" +
            "\n" +
            "gyj\n" +
            "myk\n" +
            "\n" +
            "w\n" +
            "w\n" +
            "w\n" +
            "k\n" +
            "w\n" +
            "\n" +
            "sgrhv\n" +
            "rixdgjluf\n" +
            "rgs\n" +
            "rsbg\n" +
            "\n" +
            "kmiqobutwplfryxgeajhnz\n" +
            "ylrtmpauodjnfvwgeixqz\n" +
            "extlfwjsirnmgyuqaopz\n" +
            "\n" +
            "vdngfjbwypio\n" +
            "sukyvfzpeqwthdxg\n" +
            "fyvrndgbwp\n" +
            "ydwfvglp\n" +
            "\n" +
            "fhsi\n" +
            "hsbif\n" +
            "\n" +
            "fihzecojaqm\n" +
            "jzchuomvwsqfr\n" +
            "jzchoqtfm\n" +
            "\n" +
            "kqafdzcgphvbos\n" +
            "qbspzodfavhck\n" +
            "adfozhquktlcibspv\n" +
            "szhpfboagdcqkv\n" +
            "\n" +
            "tmeb\n" +
            "takbe\n" +
            "\n" +
            "ymrhgdo\n" +
            "ypgzhmltd\n" +
            "fdbymgshcx\n" +
            "nghyzldm\n" +
            "\n" +
            "bxgm\n" +
            "gmxb\n" +
            "mxgb\n" +
            "gxbm\n" +
            "xbmvg\n" +
            "\n" +
            "fep\n" +
            "lnp\n" +
            "trjim\n" +
            "dauy\n" +
            "fplk\n" +
            "\n" +
            "udhzexv\n" +
            "dhmezvx\n" +
            "qdxylbhvzw\n" +
            "zveduxcht\n" +
            "\n" +
            "wgvhaokesjirly\n" +
            "osrewigqfdyvzk\n" +
            "kupsxrimowgbe\n" +
            "\n" +
            "skzvhanpljbogdyxtiquw\n" +
            "xzgdwyjluhnbstopikaqv\n" +
            "pasixghzovnjylbwudqkt\n" +
            "\n" +
            "wj\n" +
            "wj\n" +
            "wkj\n" +
            "jw\n" +
            "wj\n" +
            "\n" +
            "nsmyxfhc\n" +
            "xcfymhsn\n" +
            "hxscmnyf\n" +
            "cfxsmnlyh\n" +
            "\n" +
            "jpblgmiyunazcfd\n" +
            "tabnyfmupclzgd\n" +
            "esyvuphfgwbknodzcxlqa\n" +
            "\n" +
            "xkyqozefvgutmrw\n" +
            "rmhzwgeutoypx\n" +
            "\n" +
            "rzaxcemljnvo\n" +
            "kdwyqvohesitfb\n" +
            "\n" +
            "kfqrcezwn\n" +
            "qrnwkzcf\n" +
            "frcnqwzk\n" +
            "frnckvhzwq\n" +
            "kqzrcnfw\n" +
            "\n" +
            "fqux\n" +
            "qxuyfod\n" +
            "ufxq\n" +
            "qxfu\n" +
            "qxuf\n" +
            "\n" +
            "ztopdir\n" +
            "ritpozd\n" +
            "otrpizd\n" +
            "idpotzr\n" +
            "\n" +
            "jzhngmufw\n" +
            "zguwhfj\n" +
            "\n" +
            "ndxhmysbgcriqkewoztujva\n" +
            "cmtwbudvysekqaxizrojng\n" +
            "itncgkdyoaxswrqvmejzpbu\n" +
            "qyvcdusgwbomejtxznkira\n" +
            "\n" +
            "nik\n" +
            "yfi\n" +
            "i\n" +
            "i\n" +
            "\n" +
            "hpsdjo\n" +
            "hobps\n" +
            "ohsp\n" +
            "shpo\n" +
            "kypshio\n" +
            "\n" +
            "jbiyatwz\n" +
            "zbtagnrc\n" +
            "ztnagb\n" +
            "batz\n" +
            "\n" +
            "fvkurj\n" +
            "kfgjvru\n" +
            "jukfrv\n" +
            "kvfujr";

    private static final String inputDaySeven = "light beige bags contain 5 dark green bags, 5 light gray bags, 3 faded indigo bags, 2 vibrant aqua bags.\n" +
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
            "light green bags contain 4 muted silver bags, 2 muted tomato bags, 3 mirrored teal bags.";

    private static final String inputDayEight = "nop +355\n" +
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

    static final String inputDayNine = "30\n" +
            "16\n" +
            "33\n" +
            "40\n" +
            "41\n" +
            "25\n" +
            "2\n" +
            "29\n" +
            "37\n" +
            "4\n" +
            "11\n" +
            "1\n" +
            "42\n" +
            "10\n" +
            "21\n" +
            "13\n" +
            "48\n" +
            "28\n" +
            "19\n" +
            "5\n" +
            "46\n" +
            "49\n" +
            "24\n" +
            "8\n" +
            "34\n" +
            "3\n" +
            "6\n" +
            "30\n" +
            "7\n" +
            "22\n" +
            "9\n" +
            "12\n" +
            "14\n" +
            "15\n" +
            "16\n" +
            "27\n" +
            "4\n" +
            "11\n" +
            "60\n" +
            "10\n" +
            "17\n" +
            "56\n" +
            "13\n" +
            "18\n" +
            "19\n" +
            "20\n" +
            "21\n" +
            "23\n" +
            "29\n" +
            "24\n" +
            "25\n" +
            "39\n" +
            "47\n" +
            "71\n" +
            "34\n" +
            "22\n" +
            "26\n" +
            "28\n" +
            "30\n" +
            "14\n" +
            "15\n" +
            "27\n" +
            "31\n" +
            "32\n" +
            "35\n" +
            "38\n" +
            "37\n" +
            "48\n" +
            "33\n" +
            "36\n" +
            "40\n" +
            "64\n" +
            "41\n" +
            "66\n" +
            "49\n" +
            "42\n" +
            "58\n" +
            "45\n" +
            "83\n" +
            "29\n" +
            "75\n" +
            "60\n" +
            "44\n" +
            "51\n" +
            "53\n" +
            "46\n" +
            "68\n" +
            "69\n" +
            "70\n" +
            "62\n" +
            "113\n" +
            "65\n" +
            "71\n" +
            "76\n" +
            "95\n" +
            "73\n" +
            "74\n" +
            "78\n" +
            "139\n" +
            "86\n" +
            "106\n" +
            "80\n" +
            "82\n" +
            "89\n" +
            "119\n" +
            "112\n" +
            "90\n" +
            "133\n" +
            "159\n" +
            "99\n" +
            "127\n" +
            "140\n" +
            "147\n" +
            "169\n" +
            "135\n" +
            "136\n" +
            "212\n" +
            "144\n" +
            "149\n" +
            "160\n" +
            "208\n" +
            "188\n" +
            "222\n" +
            "162\n" +
            "166\n" +
            "170\n" +
            "179\n" +
            "181\n" +
            "292\n" +
            "189\n" +
            "268\n" +
            "358\n" +
            "226\n" +
            "393\n" +
            "243\n" +
            "284\n" +
            "271\n" +
            "337\n" +
            "302\n" +
            "332\n" +
            "280\n" +
            "304\n" +
            "293\n" +
            "309\n" +
            "322\n" +
            "328\n" +
            "336\n" +
            "341\n" +
            "349\n" +
            "345\n" +
            "415\n" +
            "471\n" +
            "370\n" +
            "711\n" +
            "432\n" +
            "469\n" +
            "762\n" +
            "497\n" +
            "514\n" +
            "523\n" +
            "608\n" +
            "573\n" +
            "582\n" +
            "584\n" +
            "589\n" +
            "597\n" +
            "602\n" +
            "615\n" +
            "658\n" +
            "650\n" +
            "669\n" +
            "677\n" +
            "719\n" +
            "863\n" +
            "954\n" +
            "1179\n" +
            "802\n" +
            "1369\n" +
            "1890\n" +
            "1344\n" +
            "1216\n" +
            "1239\n" +
            "1308\n" +
            "1037\n" +
            "1181\n" +
            "1756\n" +
            "1266\n" +
            "1569\n" +
            "1173\n" +
            "1186\n" +
            "1604\n" +
            "1612\n" +
            "1695\n" +
            "1319\n" +
            "1327\n" +
            "1623\n" +
            "1396\n" +
            "1521\n" +
            "1665\n" +
            "1839\n" +
            "2547\n" +
            "2041\n" +
            "2210\n" +
            "2253\n" +
            "2420\n" +
            "2835\n" +
            "2218\n" +
            "2356\n" +
            "2364\n" +
            "2359\n" +
            "2965\n" +
            "2868\n" +
            "2492\n" +
            "3733\n" +
            "3537\n" +
            "2646\n" +
            "2984\n" +
            "4765\n" +
            "2715\n" +
            "2723\n" +
            "5343\n" +
            "2917\n" +
            "3186\n" +
            "3918\n" +
            "3880\n" +
            "4251\n" +
            "4405\n" +
            "4428\n" +
            "5481\n" +
            "4720\n" +
            "7455\n" +
            "4715\n" +
            "5591\n" +
            "4856\n" +
            "8833\n" +
            "5138\n" +
            "5207\n" +
            "5901\n" +
            "9128\n" +
            "7699\n" +
            "5361\n" +
            "5909\n" +
            "5632\n" +
            "7128\n" +
            "5640\n" +
            "11046\n" +
            "8278\n" +
            "7066\n" +
            "8131\n" +
            "13600\n" +
            "8966\n" +
            "9120\n" +
            "9143\n" +
            "20012\n" +
            "14179\n" +
            "15902\n" +
            "13681\n" +
            "9994\n" +
            "10063\n" +
            "10345\n" +
            "26247\n" +
            "15052\n" +
            "10993\n" +
            "11001\n" +
            "11270\n" +
            "11272\n" +
            "11541\n" +
            "16209\n" +
            "12706\n" +
            "13771\n" +
            "15197\n" +
            "15344\n" +
            "26885\n" +
            "17097\n" +
            "21604\n" +
            "21615\n" +
            "18263\n" +
            "21333\n" +
            "20987\n" +
            "20057\n" +
            "27091\n" +
            "20339\n" +
            "23051\n" +
            "20408\n" +
            "21338\n" +
            "21994\n" +
            "43982\n" +
            "22263\n" +
            "22271\n" +
            "39591\n" +
            "25043\n" +
            "25312\n" +
            "35401\n" +
            "44389\n" +
            "28968\n" +
            "35605\n" +
            "32441\n" +
            "35360\n" +
            "37154\n" +
            "56739\n" +
            "42320\n" +
            "38320\n" +
            "40465\n" +
            "42679\n" +
            "40396\n" +
            "43601\n" +
            "42402\n" +
            "42671\n" +
            "41746\n" +
            "57631\n" +
            "57484\n" +
            "60917\n" +
            "44534\n" +
            "47314\n" +
            "78785\n" +
            "114145\n" +
            "54280\n" +
            "69364\n" +
            "100155\n" +
            "61409\n" +
            "80640\n" +
            "95059\n" +
            "92991\n" +
            "75474\n" +
            "82211\n" +
            "78716\n" +
            "80066\n" +
            "80861\n" +
            "82142\n" +
            "82798\n" +
            "96951\n" +
            "84148\n" +
            "84417\n" +
            "122326\n" +
            "115197\n" +
            "91848\n" +
            "125395\n" +
            "98814\n" +
            "101594\n" +
            "173844\n" +
            "145557\n" +
            "115689\n" +
            "140125\n" +
            "156335\n" +
            "142049\n" +
            "154190\n" +
            "155540\n" +
            "214174\n" +
            "158272\n" +
            "166946\n" +
            "158782\n" +
            "162208\n" +
            "181612\n" +
            "198487\n" +
            "167215\n" +
            "183231\n" +
            "238607\n" +
            "186011\n" +
            "190662\n" +
            "214503\n" +
            "207537\n" +
            "200408\n" +
            "302333\n" +
            "241719\n" +
            "257738\n" +
            "346997\n" +
            "408934\n" +
            "352957\n" +
            "356759\n" +
            "300321\n" +
            "350177\n" +
            "313812\n" +
            "558059\n" +
            "317054\n" +
            "320990\n" +
            "369745\n" +
            "393548\n" +
            "348827\n" +
            "557167\n" +
            "440969\n" +
            "619387\n" +
            "376673\n" +
            "908236\n" +
            "514220\n" +
            "502741\n" +
            "617375\n" +
            "499457\n" +
            "542040\n" +
            "983009\n" +
            "604735\n" +
            "614133\n" +
            "671167\n" +
            "649148\n" +
            "621311\n" +
            "763293\n" +
            "630866\n" +
            "998283\n" +
            "697663\n" +
            "638044\n" +
            "878157\n" +
            "742375\n" +
            "940426\n" +
            "1152264\n" +
            "1041497\n" +
            "943710\n" +
            "1013677\n" +
            "1148605\n" +
            "1130323\n" +
            "1002198\n" +
            "1044781\n" +
            "1104192\n" +
            "1113590\n" +
            "1146775\n" +
            "1320315\n" +
            "1259355\n" +
            "1633064\n" +
            "1252177\n" +
            "1287192\n" +
            "1268910\n" +
            "1335707\n" +
            "1328529\n" +
            "1380419\n" +
            "1581754\n" +
            "1516201\n" +
            "1620532\n" +
            "1686085\n" +
            "2411619\n" +
            "2057300\n" +
            "2576774\n" +
            "1945908\n" +
            "2015875\n" +
            "3462109\n" +
            "2106390\n" +
            "2158371\n" +
            "2425200\n" +
            "2217782\n" +
            "2372945\n" +
            "2595062\n" +
            "2528265\n" +
            "2511532\n" +
            "3631993\n" +
            "2521087\n" +
            "3486809\n" +
            "2597439\n" +
            "2664236\n" +
            "4457440\n" +
            "4003208\n" +
            "3639054\n" +
            "6059548\n" +
            "5252525\n" +
            "4613314\n" +
            "4578387\n" +
            "5544109\n" +
            "5887309\n" +
            "4233657\n" +
            "6143525\n" +
            "4583571\n" +
            "4264761\n" +
            "4738869\n" +
            "4590727\n" +
            "5261675\n" +
            "4884477\n" +
            "5032619\n" +
            "5039797\n" +
            "6153080\n" +
            "6897893\n" +
            "10882394\n" +
            "6084248\n" +
            "6236493\n" +
            "10820064\n" +
            "7903815\n" +
            "7642262\n" +
            "7872711\n" +
            "8498418\n" +
            "8812044\n" +
            "8817228\n" +
            "8972526\n" +
            "8824384\n" +
            "8848332\n" +
            "8855488\n" +
            "9630524\n" +
            "9003630\n" +
            "12526739\n" +
            "9623346\n" +
            "11116867\n" +
            "10294294\n" +
            "9917096\n" +
            "16907445\n" +
            "14012323\n" +
            "13726510\n" +
            "12320741\n" +
            "14582666\n" +
            "15546077\n" +
            "13878755\n" +
            "15514973\n" +
            "15776526\n" +
            "18889622\n" +
            "22157263\n" +
            "17315646\n" +
            "17784570\n" +
            "18626976\n" +
            "17672716\n" +
            "17703820\n" +
            "17851962\n" +
            "14144619\n" +
            "19253870\n" +
            "29655281\n" +
            "19540442\n" +
            "19917640\n" +
            "23929419\n" +
            "24499762\n" +
            "26047251\n" +
            "33628488\n" +
            "36926586\n" +
            "26465360\n" +
            "26199496\n" +
            "28023374\n" +
            "29393728\n" +
            "29921145\n" +
            "29659592\n" +
            "36330796\n" +
            "31460265\n" +
            "31817335\n" +
            "35636532\n" +
            "31848439\n" +
            "31996581\n" +
            "33398489\n" +
            "33685061\n" +
            "56844226\n" +
            "34062259\n" +
            "38794312\n" +
            "48429181\n" +
            "44417402\n" +
            "50965122\n" +
            "49976670\n" +
            "56496343\n" +
            "52246747\n" +
            "52664856\n" +
            "54222870\n" +
            "56120641\n" +
            "55593224\n" +
            "63277600\n" +
            "59053320\n" +
            "63058081\n" +
            "68148131\n" +
            "63308704\n" +
            "69321593\n" +
            "107475483\n" +
            "63845020\n" +
            "65395070\n" +
            "67460748\n" +
            "67083550\n" +
            "111706781\n" +
            "72856571\n" +
            "78479661\n" +
            "87223493\n" +
            "92846583\n" +
            "111500952\n" +
            "100941792\n" +
            "124644474\n" +
            "104911603\n" +
            "117500470\n" +
            "106887726\n" +
            "109816094\n" +
            "217291577\n" +
            "136165275\n" +
            "184961218\n" +
            "122898340\n" +
            "152618563\n" +
            "127153724\n" +
            "174559033\n" +
            "166336862\n" +
            "184563352\n" +
            "129240090\n" +
            "239193433\n" +
            "134544298\n" +
            "151336232\n" +
            "179421453\n" +
            "165703154\n" +
            "171326244\n" +
            "180070076\n" +
            "197758186\n" +
            "205853395\n" +
            "207829518\n" +
            "302502137\n" +
            "263318999\n" +
            "232714434\n" +
            "216703820\n" +
            "388030064\n" +
            "259063615\n" +
            "285880530\n" +
            "470443882\n" +
            "250052064\n" +
            "263784388\n" +
            "404896587\n" +
            "437216762\n" +
            "280576322\n" +
            "294943244\n" +
            "300247452\n" +
            "305870542\n" +
            "337029398\n" +
            "604733884\n" +
            "345124607\n" +
            "486429717\n" +
            "351396320\n" +
            "377828262\n" +
            "456821801\n" +
            "625700929\n" +
            "424533338\n" +
            "449418254\n" +
            "466755884\n" +
            "475767435\n" +
            "1092456813\n" +
            "509115679\n" +
            "789692001\n" +
            "657266862\n" +
            "544995308\n" +
            "513836452\n" +
            "714857660\n" +
            "631972642\n" +
            "575519566\n" +
            "580823774\n" +
            "595190696\n" +
            "637276850\n" +
            "932220094\n" +
            "786447652\n" +
            "696520927\n" +
            "953185601\n" +
            "1067253491\n" +
            "729224582\n" +
            "970658253\n" +
            "942523319\n" +
            "900300773\n" +
            "873951592\n" +
            "975871563\n" +
            "980592336\n" +
            "1141088321\n" +
            "1022952131\n" +
            "1243061034\n" +
            "1058831760\n" +
            "1218100624\n" +
            "1310048356\n" +
            "1212796416\n" +
            "1844609845\n" +
            "1277344701\n" +
            "1156343340\n" +
            "1176014470\n" +
            "1232467546\n" +
            "1333797777\n" +
            "1425745509\n" +
            "1639044246\n" +
            "1603176174\n" +
            "1752176713\n" +
            "1671747901\n" +
            "1629525355\n" +
            "1774252365\n" +
            "1896903723\n" +
            "2703090210\n" +
            "2448697640\n" +
            "1956463899\n" +
            "2003544467\n" +
            "2081783891\n" +
            "2215175100\n" +
            "2234846230\n" +
            "2551898401\n" +
            "2445263962\n" +
            "2332357810\n" +
            "3727912871\n" +
            "3000953185\n" +
            "2433688041\n" +
            "2388810886\n" +
            "2658213055\n" +
            "2566265323\n" +
            "2936973951\n" +
            "3028921683\n" +
            "3232701529\n" +
            "4345601363\n" +
            "3381702068\n" +
            "4106610175\n" +
            "4131749953\n" +
            "4414141701\n" +
            "4316630121\n" +
            "3960008366\n" +
            "4038247790\n" +
            "4085328358\n" +
            "4218719567\n" +
            "4781440423\n" +
            "6029874868\n" +
            "4801111553\n" +
            "7782393608\n" +
            "7367376876\n" +
            "5417732569\n" +
            "7086281543\n" +
            "4999953364\n" +
            "4822498927\n" +
            "4955076209\n" +
            "13116156411\n" +
            "7114250041\n" +
            "7022302309\n" +
            "6261623212\n" +
            "8452389491\n" +
            "7341710434\n" +
            "7419949858\n" +
            "7998256156\n" +
            "9414095065\n" +
            "8401958479\n" +
            "8045336724\n" +
            "8123576148\n" +
            "8839359343\n" +
            "8304047925\n" +
            "9218672931\n" +
            "9582551976\n" +
            "9623610480\n" +
            "16709892023\n" +
            "12782346972\n" +
            "12114203405\n" +
            "14578686689\n" +
            "15872339349\n" +
            "9777575136\n" +
            "11084122139\n" +
            "11216699421\n" +
            "19486080618\n" +
            "17241317822\n" +
            "13283925521\n" +
            "13603333646\n" +
            "30313225669\n" +
            "14761660292\n" +
            "17620631410\n" +
            "16168912872\n" +
            "16884696067\n" +
            "16349384649\n" +
            "25568057580\n" +
            "20666674115\n" +
            "17143407268\n" +
            "26292443999\n" +
            "18801224907\n" +
            "19206162456\n" +
            "19401185616\n" +
            "20861697275\n" +
            "20994274557\n" +
            "36349569724\n" +
            "22300821560\n" +
            "23061500657\n" +
            "24539235428\n" +
            "24368047660\n" +
            "30702780039\n" +
            "29772246518\n" +
            "32382291702\n" +
            "28045585813\n" +
            "33970016059\n" +
            "30930573164\n" +
            "31111044941\n" +
            "32518297521\n" +
            "33053608939\n" +
            "41660948672\n" +
            "40262882891\n" +
            "35944632175\n" +
            "36544592884\n" +
            "38005104543\n" +
            "43162518835\n" +
            "38007387363\n" +
            "43923197932\n" +
            "47600736085\n" +
            "41855971832\n" +
            "43295096117\n" +
            "45362322217\n" +
            "46668869220\n" +
            "48907283088\n" +
            "70523402064\n" +
            "52413633473\n" +
            "57817832331\n" +
            "58976158977\n" +
            "63984182103\n" +
            "59156630754\n" +
            "62041618105\n" +
            "73316491830\n" +
            "85451875972\n" +
            "76012491906\n" +
            "89170165979\n" +
            "73949736718\n" +
            "105964816037\n" +
            "149962228624\n" +
            "74549697427\n" +
            "79861076375\n" +
            "79863359195\n" +
            "81930585295\n" +
            "85151067949\n" +
            "88524841052\n" +
            "239132394603\n" +
            "92031191437\n" +
            "122960341080\n" +
            "110948901193\n" +
            "101320916561\n" +
            "119859450436\n" +
            "137865509445\n" +
            "121017777082\n" +
            "159100804667\n" +
            "180514513464\n" +
            "121198248859\n" +
            "135358109935\n" +
            "260825850525\n" +
            "177333408467\n" +
            "148499434145\n" +
            "307600238812\n" +
            "195747946286\n" +
            "154410773802\n" +
            "154413056622\n" +
            "300293749547\n" +
            "313513861289\n" +
            "161793944490\n" +
            "268358884581\n" +
            "467926917911\n" +
            "250318785542\n" +
            "193352107998\n" +
            "202980092630\n" +
            "350161002908\n" +
            "380313501097\n" +
            "221180366997\n" +
            "240877227518\n" +
            "242216025941\n" +
            "256375887017\n" +
            "415476691684\n" +
            "373866621462\n" +
            "256556358794\n" +
            "316204718292\n" +
            "445692293048\n" +
            "537385085289\n" +
            "302912490767\n" +
            "410969415416\n" +
            "355146052488\n" +
            "543789718285\n" +
            "443670893540\n" +
            "364774037120\n" +
            "382974311487\n" +
            "913619210959\n" +
            "601493868094\n" +
            "396332200628\n" +
            "414532474995\n" +
            "819558914510\n" +
            "585954404117\n" +
            "462057594515\n" +
            "497253114535\n" +
            "463396392938\n" +
            "658058543255\n" +
            "702248651842\n" +
            "905728488055\n" +
            "559468849561\n" +
            "572761077086\n" +
            "611702411282\n" +
            "619117209059\n" +
            "667686527887\n" +
            "685886802254\n" +
            "699244691395\n" +
            "719920089608\n" +
            "738120363975\n" +
            "747748348607\n" +
            "761106237748\n" +
            "779306512115\n" +
            "880227426022\n" +
            "858389795143\n" +
            "955801050189\n" +
            "810864675623\n" +
            "1033649684054\n" +
            "1056721964096\n" +
            "925453987453\n" +
            "1178586058620\n" +
            "1075098804220\n" +
            "1149283195192\n" +
            "1132229926647\n" +
            "1171171260843\n" +
            "1184463488368\n" +
            "1286803736946\n" +
            "1191878286145\n" +
            "1230819620341\n" +
            "1305004011313\n" +
            "1353573330141\n" +
            "1433635150861\n" +
            "1619496032891\n" +
            "1540412749863\n" +
            "1558613024230\n" +
            "1508854586355\n" +
            "1590171187738\n" +
            "1637696307258\n" +
            "3023806338599\n" +
            "1943094602270\n" +
            "1982035936466\n" +
            "2476175272156\n" +
            "2380102815533\n" +
            "1982175951549\n" +
            "2000552791673\n" +
            "2310815985267\n" +
            "3610922435874\n" +
            "2281513121839\n" +
            "2303401187490\n" +
            "2457974997789\n" +
            "2422697906486\n" +
            "4285437123956\n" +
            "4964495766015\n" +
            "2535823631654\n" +
            "2658577341454\n" +
            "2787208481002\n" +
            "2942489737216\n" +
            "4282065913512\n" +
            "3619732243724\n" +
            "3148784211968\n" +
            "3099025774093\n" +
            "4839224819144\n" +
            "3619872258807\n" +
            "4292991936816\n" +
            "3925130538736\n" +
            "3964211888015\n" +
            "4661615937372\n" +
            "3982728743222\n" +
            "4817336753493\n" +
            "4303953979163\n" +
            "4584914309329\n" +
            "4704211028325\n" +
            "8210567662692\n" +
            "4726099093976\n" +
            "6091273949184\n" +
            "4958521538140\n" +
            "5194400973108\n" +
            "5601067078670\n" +
            "5323032112656\n" +
            "8942764356380\n" +
            "13246718335543\n" +
            "6562221980940\n" +
            "10559588616810\n" +
            "8437209012300\n" +
            "6247809986061\n" +
            "6718898032900\n" +
            "8651229632712\n" +
            "9779315282437\n" +
            "14083269261600\n" +
            "8922733426155\n" +
            "7946940631237\n" +
            "8286682722385\n" +
            "18065998004822\n" +
            "8888868288492\n" +
            "11570842098717\n" +
            "9289125337654\n" +
            "12914778691017\n" +
            "14523800504825\n" +
            "9684620632116\n" +
            "10152922511248\n" +
            "18177993626146\n" +
            "10517433085764\n" +
            "13974261745368\n" +
            "11885254093596\n" +
            "26889040436385\n" +
            "13281120013840\n" +
            "14509162612177\n" +
            "32149267266422\n" +
            "18954642098064\n" +
            "40972309697985\n" +
            "14665838664137\n" +
            "16233623353622\n" +
            "17631561263353\n" +
            "16835808919729\n" +
            "22402687179360\n" +
            "32140723875530\n" +
            "17175551010877\n" +
            "18573488920608\n" +
            "19041790799740\n" +
            "18973745969770\n" +
            "19442047848902\n" +
            "19837543143364\n" +
            "32155361768178\n" +
            "20202053717880\n" +
            "34807112274230\n" +
            "33620480762201\n" +
            "44025977969126\n" +
            "26394416705773\n" +
            "25166374107436\n" +
            "31344971531906\n" +
            "27790282626017\n" +
            "29175001276314\n" +
            "30899462017759\n" +
            "44023905979639\n" +
            "31501647583866\n" +
            "33639584633907\n" +
            "38811289113134\n" +
            "34011359930606\n" +
            "48520522542783\n" +
            "35749039931485\n" +
            "65141232217773\n" +
            "36149296980647\n" +
            "37547234890378\n" +
            "46764028595787\n" +
            "38415793818672\n" +
            "69192352076562\n" +
            "83327634817013\n" +
            "55569417982087\n" +
            "55009165992110\n" +
            "63941651596151\n" +
            "52956656733453\n" +
            "51560790813209\n" +
            "54184699331790\n" +
            "54341375383750\n" +
            "62244433549665";

    private static final String inputDayTen = "26\n" +
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
