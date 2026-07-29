package for_each_example;

import java.util.ArrayList;
import java.util.Arrays;

public class tree5 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50, 60)
        );
        System.out.println("Using normal for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("--------");
        System.out.println("Using for-each loop:");
        for (int elem : list) {
            System.out.println(elem);
        }
    }
}