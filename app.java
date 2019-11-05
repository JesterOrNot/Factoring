import java.util.ArrayList;
import java.util.HashMap;

/**
 * app
 */
public class app {
    static ArrayList<Integer> findFactors(int num) {
        ArrayList list = new ArrayList<Integer>();
        for (int i = num; i>=1; i--) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
    static HashMap assembleTable(ArrayList<Integer> list) {
        HashMap map = new HashMap<>();
        int length = 0;
        for (Object var : list) {
            length++;
        }
        int numOfPairs = length / 2;
        for(int i = 1; i<=numOfPairs; i++) {
            int item1 = list.get(length - 1);
            int item2 = list.get(0);
            map.put(item1,item2);
            list.remove(0);
            list.remove(length - 1);
            length-=2;
        }
        return map;
    }
    public static void main(String[] args) {
        ArrayList list = findFactors(66);
        for (Object var : list) {
            System.out.print(var + " ");
        }
        System.out.println("");
    }
}