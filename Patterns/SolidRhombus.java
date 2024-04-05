package Patterns;

import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int numCols = sc.nextInt();
        solidRhom(numRows, numCols);
        sc.close();
    }

    public static void solidRhom(int numRows, int numCols) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numCols - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numCols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
