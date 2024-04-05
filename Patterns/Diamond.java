package Patterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int numLines = sc.nextInt();
        diamondPatt(numLines);
        sc.close();
    }

    public static void diamondPatt(int numLines) {
        // 1st Half
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= numLines - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half
        for (int i = numLines; i >= 1; i--) {
            for (int j = 1; j <= numLines - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
