package Functions;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10;
            rev = rev + (temp % 10);
            temp /= 10;
        }
        if (rev == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        if (isPalindrome(num) == true) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is not a Palindrome Number");
        }
        sc.close();
    }
}
