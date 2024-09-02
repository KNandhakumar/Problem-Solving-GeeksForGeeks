package GeeksForGeeks.Array;

import java.util.Arrays;

public class RotateDPlaces {
    // https://leetcode.com/problems/rotate-array/
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int D = 3;
        rotate(arr,D);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        // handling edge cases
        int d = k%nums.length;
        //
        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }
    public static void reverse(int[] nums, int start, int end){
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
