package GeeksForGeeks.Array;

import java.util.*;

public class RemoveDuplicates {
    // https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3};
        List<Integer> ans = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3));
        System.out.println(remove_duplicate(ans));
    }

    public static int remove_duplicate(List<Integer> arr) {
        int i = 0;
        for (int j = 1; j <arr.size(); j++) {
            if (!arr.get(i).equals(arr.get(j))){
                i++;
                arr.set(i, arr.get(j));
            }
        }
        return (i+1);
    }

    // two pointer method
    // time complexity O(n)
    // space complexity O(1)
    static int removeDuplicate(int[] arr){
        int i = 0;
        for (int j = 1; j <arr.length; j++) {
            if (arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return (i+1);
    }

    // time complexity O(n log n) + O(n)
    // space complexity O(n)
    static Set<Integer> removeDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <arr.length; i++) {
            set.add(arr[i]);
        }
        return set;
    }
}
