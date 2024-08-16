package GeeksForGeeks.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrayByOne {
    // https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    // time complexity O(n)
    // space complexity O(n)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArray(int[] arr){
        // initialize the arr length
        int n = arr.length;
        // store the last element in the array
        int last = arr[n-1];
        for (int i = arr.length-1; i > 0 ; i--) {
            // Shift all elements one position to the right
            arr[i] = arr[i-1];
        }
        // Place the last element at the first position
        arr[0] = last;
    }
}