package BitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerTwo(15));
    }

    public static boolean powerTwo(int num) {
        return (num & num - 1) == 0;
    }
}
