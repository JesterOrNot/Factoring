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
    public static int[] findRightFactorSet(ArrayList<Integer> keys,ArrayList<Integer> values,int bVal, int Cval) {
        int length = 0;
        int[] bsArray = {0,0};
        for (int var : keys) {
            length++;
        }
        int numOfPairs = length / 2;
        for (int i = 0; i<numOfPairs; i++) {
            if ((keys.get(i) + values.get(i) == bVal) && (keys.get(i) * values.get(i) == Cval)) {
                bsArray[0] = keys.get(i);
                bsArray[1] = values.get(i);
            }
        }
        return bsArray;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = findFactors(-70);
        HashMap<Integer, Integer> map = assembleTable(list);
        ArrayList<Integer> keys = new ArrayList<Integer>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] myArray = findRightFactorSet(keys, values, -3, -70);
        System.out.println("Factor 1 is " + myArray[0] + " and " + myArray[1]);
    }
}