package ConditionalStatements;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary : ");
        float salary = sc.nextFloat();
        float tax;
        if (salary < 500000) {
            tax = 0;
        } else if (salary > 500000 && salary < 1000000) {
            tax = salary * 0.2f;
        } else {
            tax = salary * 0.3f;
        }
        System.out.println("Tax will be : " + tax);
        sc.close();
    }
}
