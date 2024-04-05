package Patterns;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int numLines = sc.nextInt();
        floydTri(numLines);
        sc.close();
    }

    public static void floydTri(int numLines) {
        int count = 1;
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
