package Functions;

import java.util.Scanner;

public class SumOfIntegers {

    public static int sumOfGiven(int num) {
        int sum = 0;
        while (num > 0) {
            int lastdig = num % 10;
            sum += lastdig;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println("Sum of Given Number is : " + sumOfGiven(num));
        sc.close();
    }
}
