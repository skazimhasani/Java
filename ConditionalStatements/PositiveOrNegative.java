package ConditionalStatements;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int val = sc.nextInt();
        String num = val >= 0 ? "Positive" : "Negative";
        System.out.println("Number is " + num);
        sc.close();
    }
}
