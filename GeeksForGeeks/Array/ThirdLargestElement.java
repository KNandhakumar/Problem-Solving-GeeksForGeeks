package GeeksForGeeks.Array;

import java.util.Arrays;

public class ThirdLargestElement {
    // https://www.geeksforgeeks.org/problems/third-largest-element/1
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int thirdLargest = thirdLargest(arr);
        System.out.println(thirdLargest);
    }

    static int thirdLargest(int[] arr) {

        // check edge cases
        if (arr.length < 3) {
            return -1;
        }

        int fLargest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++) {
            if (arr[i]>fLargest){
                thirdLargest = sLargest;
                sLargest = fLargest;
                fLargest = arr[i];
            }
            else if(arr[i]>sLargest && arr[i] != fLargest){
                sLargest = arr[i];
            }
            else if (arr[i]>thirdLargest && arr[i] != sLargest && arr[i] != fLargest){
                thirdLargest = arr[i];
            }
        }
        return thirdLargest == Integer.MIN_VALUE?-1:thirdLargest;
    }
}
