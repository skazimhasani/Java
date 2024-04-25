package TwoDimensionalArrays;

public class SpecialNumberSum {
    public static void main(String[] args) {
        int array[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println(numSum(array));
    }

    public static int numSum(int array[][]) {
        int numSeven = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 7) {
                    numSeven++;
                }
            }
        }
        return numSeven;
    }
}
