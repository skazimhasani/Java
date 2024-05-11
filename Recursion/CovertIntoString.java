package Recursion;

public class CovertIntoString {

    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void main(String[] args) {
        printString(1234);
    }

    public static void printString(int numbers) {
        if (numbers == 0) {
            return;
        }
        int lastDigit = numbers % 10;
        printString(numbers / 10);
        System.out.print(digits[lastDigit] + " ");
    }
}
