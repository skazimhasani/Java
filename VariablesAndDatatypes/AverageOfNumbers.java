package VariablesAndDatatypes;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A + B + C;
        int average = sum / 3;
        System.out.println("Average of Numbers is " + average);
        sc.close();
    }
}