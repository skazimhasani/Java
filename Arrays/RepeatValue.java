package Arrays;

public class RepeatValue {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(RepeatingValues(nums));
    }

    public static boolean RepeatingValues(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
