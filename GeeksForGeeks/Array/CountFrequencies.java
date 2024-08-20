package GeeksForGeeks.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class CountFrequencies {
    // https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        int n = 5;
        int p = 5;
        countFrequencies(arr,n,p);
        System.out.println(Arrays.toString(arr));
    }

    static void countFrequencies(int[] arr, int n, int p){
        // Step 1: Create a HashMap to count the frequencies
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Step 2: Count frequencies of elements in the range 1 to N
        for (int num : arr) {
            if (num >= 1 && num <= n) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) +1);
            }
        }

        // Step 3: Modify the original array based on the frequencies
        for (int i = 0; i < n; i++) {
            arr[i] = freqMap.getOrDefault(i + 1, 0);
        }
    }
}
