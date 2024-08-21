package GeeksForGeeks.Array;

import java.util.Arrays;

public class FindTripletsWithZero {
    // https://www.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1
    // time complexity O(n2)
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int n = arr.length;
        boolean ans = findTriplets(arr,n);
        System.out.println(ans);
    }

    public static boolean findTriplets(int arr[] , int n){
        Arrays.sort(arr);
        for (int i = 0; i <n; i++) {
            int start = i+1;
            int end = n-1;
            int x = 0;
            while (start<end){
                int sum = arr[i] + arr[start] + arr[end];
                if (sum == x){
                    return true;
                }
                else if (sum < x){
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        return false;
    }
}
