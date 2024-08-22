package GeeksForGeeks.Array;

public class FindPeakElement {
    // https://www.geeksforgeeks.org/problems/peak-element/1?page=1&difficulty=Basic&sortBy=submissions
    // time complexity O(log(n))
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 3, 2};
        int n = arr.length;
        int ans = peakElement(arr,n);
        System.out.println(ans);
    }

    public static int peakElement(int[] arr,int n){
        int start = 0;
        int end = n-1;
        while (start<end){
            int mid = start + (end - start)/2;
            if (arr[mid]>=arr[mid+1]){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
