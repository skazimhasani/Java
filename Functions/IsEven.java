package Functions;

import java.util.Scanner;

public class IsEven {

    public static boolean evenOdd(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        if (evenOdd(num) == true) {
            System.out.println(num + " is a Even Number");
        } else {
            System.out.println(num + " is a Odd Number");
        }
        sc.close();
    }
}
