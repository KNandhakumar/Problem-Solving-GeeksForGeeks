package GeeksForGeeks.Array;

import java.util.Arrays;

public class FourSumInArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 2, 1, 1};
        int n = arr.length;
        int x = 2;
        boolean ans = fourSum(arr,n,x);
        System.out.println(ans);
    }

    static boolean fourSum(int[] arr, int n, int x){
        Arrays.sort(arr);
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n; j++) {
                int start = j+1;
                int end = n-1;

                while (start<end){
                    int sum = arr[i] + arr[j] + arr[start] + arr[end];
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
        }
        return false;
    }
}
