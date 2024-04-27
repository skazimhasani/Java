package BitManipulation;

public class BitsOperations {
    public static void main(String[] args) {
        System.out.println(clearBitsInRange(10, 2, 4));
    }

    // Get ith Bit
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        }
        return 1;
    }

    // Set ith Bit into 1
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Clear ith Bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // Update ith Bit
    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    // Clear Last i Bits
    public static int clearIesBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    // Clear Bits in Range
    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
}
