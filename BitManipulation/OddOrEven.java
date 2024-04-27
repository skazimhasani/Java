package BitManipulation;

public class OddOrEven {
    public static void main(String[] args) {
        getOddEven(5);
        getOddEven(14);

    }

    public static void getOddEven(int num) {
        int bitMask = 1;
        if ((num & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
