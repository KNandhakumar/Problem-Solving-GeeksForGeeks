package GeeksForGeeks.Array;

public class FindMissingNumber {
    // https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = 5;
        int ans = missingNumber(arr,n);
        System.out.println(ans);
    }

    static int missingNumber(int[] arr, int n){
        int expectedSum = n * (n+1) / 2;

        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
