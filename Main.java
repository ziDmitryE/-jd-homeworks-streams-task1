package LYAMBDA.РаботаCчислами;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sortedList = new ArrayList<>();
        for (int i : list) {
            if (i > 0) {
                if (i % 2 == 0) {
                    sortedList.add(i);
                }
            }
        }
        Integer[] result = sortedList.toArray(new Integer[0]);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
