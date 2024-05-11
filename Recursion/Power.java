package Recursion;

public class Power {
    public static void main(String[] args) {
        int num = 2;
        int pow = 4;
        System.out.println(optimized(num, pow));

    }

    // O(n)
    public static int powerOf(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * powerOf(num, pow - 1);
    }

    // O(Logn)
    public static int optimized(int num, int pow) {
        // base case
        if (pow == 0) {
            return 1;
        }
        // even
        int halfPower = optimized(num, pow / 2);
        int halfPowerSq = halfPower * halfPower;
        // odd
        if (pow % 2 != 0) {
            halfPowerSq = num * halfPowerSq;
        }
        return halfPowerSq;
    }
}
