package Patterns;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int numCols = sc.nextInt();
        hollowRhom(numRows, numCols);
        sc.close();
    }

    public static void hollowRhom(int numRows, int numCols) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numCols - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numCols; j++) {
                if (i == 1 || j == 1 || i == numRows || j == numCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}
