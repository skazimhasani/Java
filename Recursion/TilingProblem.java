package Recursion;

public class TilingProblem {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(tilingProb(num));
    }

    public static int tilingProb(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return tilingProb(num - 1) + tilingProb(num - 2);
    }
}
