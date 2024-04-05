package Patterns;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int numLines = sc.nextInt();
        invertedPyramid(numLines);
        sc.close();
    }

    public static void invertedPyramid(int numLines) {
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= (numLines - i) + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
