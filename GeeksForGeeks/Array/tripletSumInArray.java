package GeeksForGeeks.Array;

import java.util.Arrays;

public class tripletSumInArray {
    // https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    // time complexity O(n2)
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {1,4,45,6,10,8};
        int n = arr.length;
        int x = 20;
        boolean ans = find3Numbers(arr,n,x);
        System.out.println(ans);
    }

    // tc -> n * n(n log n) = O(n2) array sort method is O(n log n)
    public static boolean find3Numbers(int arr[], int n, int x) {
        // Step 1: Sort the array
        Arrays.sort(arr);
        // Step 2: Traverse the array
        for (int i = 0; i <n; i++) {
            // Step 3: Set up two pointers
            int start = i+1;
            int end = n-1;

            // Step 4: Use two pointers to find the triplet
            while (start < end){
                int sum = arr[i] + arr[start] + arr[end];
                if (sum == x){
                    // Triplet found
                    return true;
                }
                else if (sum < x){
                    // Move the left pointer to the right
                    start++;
                }
                else {
                    // Move the right pointer to the left
                    end--;
                }
            }
        }
        // If no triplet is found
        return false;
    }
}
