package Recursion;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.print(length(str));
    }

    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
}
