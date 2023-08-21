package learn;

import java.util.ArrayList;
import java.util.Collection;

public class LearnArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        arr.remove(2);

        System.out.println(arr.contains(10));
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.get(2));
        arr.remove(Integer.valueOf(20));
        System.out.println(arr.isEmpty());

        arr.clear();
    }
}
