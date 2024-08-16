package GeeksForGeeks.Array;

import java.util.Arrays;

public class SortArray {
    // https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        int n = 5;
        sortArray1(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    // optimize solution is Dutch national flag algorithm
    // time complexity O(n)
    // space complexity O(1)
    static void sortArray1(int[] arr, int n){
        int start =0;
        int mid = 0;
        int end = n-1;
        while (mid<=end){
            if (arr[mid]==0){
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                start++;
                mid++;
            }
            else if (arr[mid] == 1){
                mid++;
            }
            else if (arr[mid] == 2){
                int temp = arr[end];
                arr[end] = arr[mid];
                arr[mid] = temp;
                end--;
            }
        }
    }

    // this approach is worst case because its time complexity is O(n2)
    static void sortArray(int[] arr, int n){
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
