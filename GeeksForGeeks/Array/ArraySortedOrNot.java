package GeeksForGeeks.Array;

import java.util.Arrays;

public class ArraySortedOrNot {
    // https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        boolean isSorted = Sorting(arr);
        System.out.println(isSorted);
    }

    static boolean Sorting(int[] arr){
        for (int i = 1; i <arr.length; i++) {
            if (arr[i]>arr[i-1]){

            }
            else {
                return false;
            }
        }
        return true;
    }
}
