package Patterns;

import java.util.Scanner;

public class NumbersPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int numLines = sc.nextInt();
        numsPyramid(numLines);
        sc.close();
    }

    public static void numsPyramid(int numLines) {
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= numLines - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
