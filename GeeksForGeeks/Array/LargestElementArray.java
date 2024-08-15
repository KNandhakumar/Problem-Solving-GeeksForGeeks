package GeeksForGeeks.Array;

import java.util.Arrays;

public class LargestElementArray {
    // https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
    public static void main(String[] args) {
        int[] arr = {1, 999, 7, 56, 90};
        int largest = findLargest(arr);
        System.out.println(largest);
    }

    static int findLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
