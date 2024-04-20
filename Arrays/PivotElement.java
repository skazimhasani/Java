package Arrays;

public class PivotElement {
    public static void main(String[] args) {
        int numbers[] = { 4, 5, 6, 7, 1, 2, 3 };
        int key = 2;
        System.out.println(invertedSearch(numbers, key));
    }

    public static int minSearch(int numbers[]) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (mid > 0 && numbers[mid - 1] > numbers[mid]) {
                return mid;
            } else if (numbers[left] <= numbers[mid] && numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int binarySearch(int numbers[], int key, int left, int right) {
        int l = left;
        int r = right;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] > key) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static int invertedSearch(int numbers[], int key) {
        int min = minSearch(numbers);
        if (numbers[min] <= key && key <= numbers[numbers.length - 1]) {
            return binarySearch(numbers, key, min, numbers.length - 1);
        } else {
            return binarySearch(numbers, key, 0, min - 1);
        }
    }
}
