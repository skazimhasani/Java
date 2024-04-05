package Patterns;

import java.util.Scanner;

public class Palindromic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int numLine = sc.nextInt();
        palindromicPattern(numLine);
        sc.close();
    }

    public static void palindromicPattern(int numLine) {
        for (int i = 1; i <= numLine; i++) {
            for (int j = 1; j <= numLine - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
