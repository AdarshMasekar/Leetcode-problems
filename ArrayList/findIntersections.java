package learn;

public class Arrayquestion {

    public static void findIntersections(int[] a1, int[] a2, int[] ans, int size1, int size2) {
        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2) {
            if (a1[i] < a2[j]) {
                i++;
            } else if (a1[i] > a2[j]) {
                j++;
            } else {
                ans[k] = a1[i];
                i++;
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 6, 10, 40, 80 };
        int arr2[] = { 6, 10, 40, 80, 100 };
        int arr3[] = { 3, 6, 10, 20, 30, 40, 80, 120 };

        int temp[] = new int[5];

        findIntersections(arr1, arr2, temp, arr1.length, arr2.length);

        int ans[] = new int[5];

        findIntersections(arr3, temp, ans, arr3.length, temp.length);

        for (int l = 0; l < ans.length; l++) {
            if (ans[l] != 0) {
                System.out.println(ans[l]);
            }
        }
    }
}


// output:
// 6
// 10
// 40
// 80
