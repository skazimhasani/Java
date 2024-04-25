package TwoDimensionalArrays;

public class SumOfNumbers {
    public static void main(String[] args) {
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        sumOfSecond(nums);
    }

    public static void sumOfSecond(int nums[][]) {
        int sum = 0;
        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }
        System.out.println("Sum of Second Row is " + sum);
    }
}
