package learn;

import java.util.ArrayList;

public class LearnArrayList {

    // 1. Inserting Elements in an Array at the End
    public static ArrayList<Integer> insertAtEnd(ArrayList<Integer> arr, int value) {
        arr.add(value);
        return arr;
    }

    // 2. Inserting Elements in an Array at any Position in the Middle
    public static ArrayList<Integer> insertAtPosition(ArrayList<Integer> arr, int index, int value) {
        arr.add(arr.get(arr.size() - 1));
        for (int i = arr.size() - 1; i >= index; i--) {
            if (i == index) {
                arr.set(i, value);
                break;
            }
            arr.set(i, arr.get(i - 1));
        }
        return arr;
    }

    // 3. Inserting Elements in a Sorted Array
    public static ArrayList<Integer> insertInSorted(ArrayList<Integer> arr, int value) {
        arr.add(arr.get(arr.size() - 1));
        for (int i = arr.size() - 2; i > 0; i--) {
            if (arr.get(i) >= arr.get(i - 1) && arr.get(i - 1) > value) {
                arr.set(i, arr.get(i - 1));
            } else {
                arr.set(i, value);
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println("inserted at the end : " + insertAtEnd(arr, 60));
        System.out.println("inserted at the specified position : " + insertAtPosition(arr, 1, 15));

        arr2.add(15);
        arr2.add(25);
        arr2.add(35);
        arr2.add(45);
        arr2.add(55);
        System.out.println("inserted value in a sorted arraylist: " + insertInSorted(arr2, 20));
        // arr.clear();
    }
}

// output:
// inserted at the end : [10, 20, 30, 40, 50, 60]
// inserted at the specified position : [10, 15, 20, 30, 40, 50, 60]
// inserted value in a sorted arraylist: [15, 20, 25, 35, 45, 55]
