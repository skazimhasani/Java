package Recursion;

public class AllOccurrences {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        allOccur(arr, 0, key);
    }

    public static void allOccur(int arr[], int idx, int key) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        allOccur(arr, idx + 1, key);
    }
}
