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

    // to find the second largest number
    public static int findSecond(int[] nums) {
        int firstLargest = nums[0];
        int secondLargest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = nums[i];
            }
            if (secondLargest < nums[i] && nums[i] != firstLargest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 5, 3, 7 };
        int ans = findSecond(nums);
        System.out.println(ans);

    }
}