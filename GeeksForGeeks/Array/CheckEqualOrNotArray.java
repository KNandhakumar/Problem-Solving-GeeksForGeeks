package GeeksForGeeks.Array;

import java.util.Arrays;

public class CheckEqualOrNotArray {
    // https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    // time complexity O(n)
    // space complexity O(n)
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};
        boolean ans = equalOrNot(arr1,arr2);
        System.out.println(ans);
    }

    static boolean equalOrNot(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }

        // sort the two arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
