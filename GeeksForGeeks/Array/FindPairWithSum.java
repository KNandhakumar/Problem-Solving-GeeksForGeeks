package GeeksForGeeks.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindPairWithSum {
    // https://www.geeksforgeeks.org/problems/key-pair5616/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    // time complexity O(n)
    // space complexity O(n)
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int x = 16;
        boolean ans = twoSum(arr,x);
        System.out.println(ans);
    }

    // brute force approach tc -> O(n2) space -> O(n)
    static boolean hasArrayTwoCandidates(int arr[], int x) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i] + arr[j] == x){
                    return true;
                }
            }
        }
        return false;
    }

    // better approach tc -> O(n * log n) because iterate forloop n and Hashmap is log n
    static boolean hashMapTwoSum(int[] arr, int x){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            int sum = x - arr[i];
            if (map.containsKey(sum)){
                return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }

    // better approach hashset for hashmap tc -> O(n * log n)
    static boolean hashSetTwoSum(int[] arr, int x){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = x - arr[i];
            if (set.contains(sum)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    // optimize approach two pointer tc -> O(n) space -> O(n)
    static boolean twoSum(int[] arr, int x){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int sum = arr[start] + arr[end];
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
        return false;
    }
}
