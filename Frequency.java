package Questions.Question91;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class countFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers (Identical OR Unidentical): ");

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }

        System.out.println("Enter a number to find its frequency: ");
        int n = in.nextInt();

        int count = Collections.frequency(list, n);
        System.out.println("Frequency of number is: "+count);
    }
}
