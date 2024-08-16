package GeeksForGeeks.Array;

public class SearchArray {
    // https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {1, 4, 10, 7, 5};
        int target = 6;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
