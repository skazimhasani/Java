package DivideAndConquer;

public class RotatedArraySearch {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int index = search(arr, target, 0, arr.length - 1);
        System.out.println(index);
    }

    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // Mid on Line 1
        if (arr[si] <= arr[mid]) {
            // Case A : Left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }
            // Case B : Right
            else {
                return search(arr, target, mid + 1, ei);
            }
        }
        // Mid on Line 2
        else {
            // Case C : Right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                return search(arr, target, si, mid - 1);
            }

        }
    }
}
