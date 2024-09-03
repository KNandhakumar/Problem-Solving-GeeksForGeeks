package GeeksForGeeks.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZeros {
    // https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {3, 5, 0, 0, 4};
        int n = arr.length;
        pushZerosToEnd(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    static void pushZerosToEnd(int[] arr, int n) {
        int check = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] != 0){
                arr[check] = arr[i];
                check++;
            }
        }
        for (int i = check; i <arr.length; i++) {
            arr[i] = 0;
        }
    }
    // time complexity O(n)
    // space complexity O(1)

    // time complexity O(n)
    // space complexity O(n)
    static void pushZerosToEnd1(int[] arr, int n) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            if (arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        for (int i = 0; i <temp.size(); i++) {
            arr[i] = temp.get(i);
        }
        for (int i = temp.size(); i <n; i++) {
            arr[i] = 0;
        }
    }
}
