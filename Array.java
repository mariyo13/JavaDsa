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

    // array is sorted are not
    public static boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }

    // reverse the array eleements
    public static int[] reverseArray(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }

    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.println(i);
        }
    }

    // remove the duplicates in sorted array
    public static int[] removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return nums;
    }

    //
    public static int[] rightRotate(int[] nums, int n) {
        for (int i = 0; i < n / n + 1; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j >= 1; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5 };
        nums = rightRotate(nums, 4);
        printArray(nums);

    }
}