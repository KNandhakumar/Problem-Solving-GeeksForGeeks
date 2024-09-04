package GeeksForGeeks.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class unionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> ans= unionArrays(arr1,arr2,n,m);
        System.out.println(ans);
    }

    static ArrayList<Integer> unionArrays(int[] arr1, int[] arr2, int n, int m){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i <n; i++) {
            hashSet.add(arr1[i]);
        }
        for (int i = 0; i <m; i++) {
            hashSet.add(arr2[i]);
        }
        ArrayList<Integer> temp = new ArrayList<>(hashSet);
        return temp;
    }
}
