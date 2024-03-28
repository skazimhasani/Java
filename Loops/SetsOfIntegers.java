package Loops;

import java.util.Scanner;

public class SetsOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even_num = 0;
        int odd_num = 0;
        int choice;
        do {
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                even_num += num;
            } else {
                odd_num += num;
            }

            System.out.print("Want to add more number 1-Yes 0-No : ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("The sum of even numbers is : " + even_num);
        System.out.println("The sum of odd numbers is : " + odd_num);
        sc.close();
    }
}
