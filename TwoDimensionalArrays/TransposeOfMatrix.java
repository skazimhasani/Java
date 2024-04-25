package TwoDimensionalArrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int row = 2;
        int column = 3;
        int transposeMatrix[][] = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposeMatrix[j][i] = nums[i][j];
            }
        }
        printMatrix(transposeMatrix);
    }

    public static void printMatrix(int nums[][]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();

        }
    }
}
