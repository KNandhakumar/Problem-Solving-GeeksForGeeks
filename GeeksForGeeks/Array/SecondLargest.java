package GeeksForGeeks.Array;

public class SecondLargest {
    // https://www.geeksforgeeks.org/problems/second-largest3735/1
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int second = secondLargest(arr);
        System.out.println(second);
    }

    static int secondLargest(int[] arr){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++) {
            if (arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if (arr[i]>secondLargest && arr[i] != firstLargest){
                secondLargest = arr[i];
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
}
