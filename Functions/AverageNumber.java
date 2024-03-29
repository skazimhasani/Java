package Functions;

import java.util.Scanner;

public class AverageNumber {

    public static int average(int A, int B, int C) {
        int sum = A + B + C;
        int avg = sum / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println("Average of numbers is : " + average(A, B, C));
        sc.close();
    }
}
