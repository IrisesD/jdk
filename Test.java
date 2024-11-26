import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(4, 5));
        ArrayList<Integer> l3 = l1 *** l2;
        System.out.println(l3);
    }
}