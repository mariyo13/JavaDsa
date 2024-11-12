public class Array {
    // to find the maximum in array
    public static int findMax(int[] nums) {
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (res < nums[i]) {
                res = nums[i];
            }
        }
        return res;
    }

    // to find the minimum in array
    public static int findMin(int[] nums) {
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (res > nums[i]) {
                res = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 5, 3, 7 };
        int ans = findMin(nums);
        System.out.println(ans);
    }
}