package Questions.Question91;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 4, 10);
        System.out.println(Collections.frequency(list, 9));
        System.out.println(Collections.frequency(list, 4));
    }
}
