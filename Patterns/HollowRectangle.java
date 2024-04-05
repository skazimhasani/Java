package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int numCols = sc.nextInt();
        hollowRect(numRows, numCols);
        sc.close();
    }

    public static void hollowRect(int numRows, int numCols) {
        for (int i = 1; i <= numRows; i++) {
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
