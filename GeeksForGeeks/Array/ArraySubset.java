package GeeksForGeeks.Array;

import java.util.HashMap;

public class ArraySubset {
    // https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
    // time complexity O(n+m)
    // space complexity O(n)
    public static void main(String[] args) {
        long[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
        long[] a2 = {10, 3, 7, 1, 7};
        long an1 = a1.length;
        long an2 = a2.length;
        String ans = isSubset(a1,a2,an1,an2);
        System.out.println(ans);
    }

    public static String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Long> map = new HashMap<>();

        // traverse the a1 array and store the a1 arrays values and keys
        for (long i = 0; i < n; i++) {
            map.put(a1[(int)i], map.getOrDefault(a1[(int)i], 0L) +1);
        }

        // traverse the a2 array check if elements are present in a1 array
        for (long i = 0; i <m; i++) {
            if (!map.containsKey(a2[(int)i])){
                return "No";
            }
        }
        return "Yes";
    }
}
