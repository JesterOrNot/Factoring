import java.util.ArrayList;
import java.util.HashMap;

/**
 * app
 */
public class app {
    static ArrayList<Integer> findFactors(int num) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = num; i>=1; i--) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
    static HashMap<Integer,Integer> assembleTable(ArrayList<Integer> list) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int length = 0;
        for (int var : list) {
            length++;
        }
        int numOfPairs = length / 2;
        for(int i = 1; i<=numOfPairs; i++) {
            int item1 = list.get(list.size() - 1);
            int item2 = list.get(0);
            map.put(item1,item2);
            list.remove(0);
            list.remove(length-2);
            length-=2;
        }
        return map;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = findFactors(66);
        HashMap<Integer,Integer> map = assembleTable(list);
        for (Object i : map.values()) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Object i : map.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}