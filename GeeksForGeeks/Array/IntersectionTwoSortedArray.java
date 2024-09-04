package GeeksForGeeks.Array;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionTwoSortedArray {
    // https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1
    // time complexity O(n+m)
    // space complexity O(n)
    public static void main(String[] args) {
        int[] arr1 = {89, 24, 75, 11, 23};
        int[] arr2 = {89, 75, 75, 23, 75, 11};
        int n = arr1.length;
        int m = arr2.length;
        int ans = NumberofElementsInIntersection(arr1,arr2,n,m);
        System.out.println(ans);
    }

    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        Arrays.sort(a);
        Arrays.sort(b);

        int count = 0;
        int i = 0; // Pointer for array a
        int j = 0; // Pointer for array b

        while (i < n && j < m) {
            if (a[i] == b[j]) {
                count++;
                // Move both pointers to the next unique element
                int current = a[i];
                while (i < n && a[i] == current) i++;
                while (j < m && b[j] == current) j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }

    static int CountInterSectionArray(int[] arr1, int[] arr2, int n, int m){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <n; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) +1);
        }
        for (int i = 0; i <m; i++) {
            if (map.containsKey(arr2[i]) && map.get(arr2[i])>0){
                count++;
                map.put(arr2[i],map.get(arr2[i])-1);
            }
        }
        return count;
    }
}
