package BitManipulation;

public class SwapWithoutThird {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println(x + " and " + y + " before swap");
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x + " swap " + y + " after swap");
    }

}
