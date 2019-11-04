import java.util.ArrayList;

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
    public static void main(String[] args) {
        ArrayList list = findFactors(66);
        for (Object var : list) {
            System.out.print(var + " ");
        }
        System.out.println("");
    }
}