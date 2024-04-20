package Arrays;

public class Triplets {
    public static void main(String[] args) {
        int numbers[] = { -1, 0, 1, 2, -1, -4 };
        tripletsSum(numbers);
    }

    public static void tripletsSum(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        System.out.println(numbers[i] + " , " + numbers[j] + " , " + numbers[k]);
                    }
                }
            }
        }
    }
}
