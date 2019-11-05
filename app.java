import java.util.ArrayList;
import java.util.HashMap;

/**
 * app
 */
public class app {
    public static ArrayList<Integer> findFactors(int num) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = num; i >= 1; i--) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static HashMap<Integer, Integer> assembleTable(ArrayList<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int length = 0;
        for (int var : list) {
            length++;
        }
        int numOfPairs = length / 2;
        for (int i = 1; i <= numOfPairs; i++) {
            int item1 = list.get(list.size() - 1);
            int item2 = list.get(0);
            map.put(item1, item2);
            list.remove(0);
            list.remove(length - 2);
            length -= 2;
        }
        return map;
    }

    public static ArrayList<Integer> findRightFactorSet(ArrayList<Integer> keys, ArrayList<Integer> values, int aVal,
            int bVal, int cVal) {
        ArrayList<Integer> awns = new ArrayList<Integer>();
        // int length = 0;
        // for (int var : keys) {
        // length++;
        // }
        // int numOfPairs = length / 2;
        if (aVal == 1) {
            for (int i = 0; i <= keys.size() - 1; i++) {
                if ((keys.get(i) + values.get(i) == bVal) && (keys.get(i) * values.get(i) == cVal)) {
                    awns.add(keys.get(i));
                    awns.add(values.get(i));
                }
            }
        }
        return awns;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = findFactors(56);
        HashMap<Integer, Integer> map = assembleTable(list);
        ArrayList<Integer> list2 = findFactors(14);
        HashMap<Integer, Integer> map2 = assembleTable(list2);
        ArrayList<Integer> keys = new ArrayList<Integer>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        for (int i : map.keySet()) {
            keys.add(i);
        }
        for (int i : map.values()) {
            values.add(i);
        }
        for (int i : map2.keySet()) {
            keys.add(i);
        }
        for (int i : map2.values()) {
            values.add(i);
        }
        System.out.println(findRightFactorSet(keys, values, 1, 15, 56));
        System.out.println(findRightFactorSet(keys, values, 1, 9, 14));
        System.out.println(values + "\n" + keys);
    }
}