package GeeksForGeeks.Array;

public class rotateArrayByTwo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length; // Size of the array
        int d = 3; // Number of steps to rotate
        rotateArr(arr, d, n); // Pass n as a parameter

        // Print rotated array
        for (int i : arr) {
            System.out.print(i + " ");  // Output: 4 5 6 7 1 2 3
        }
    }

    static void rotateArr(int arr[], int d, int n) {
        // In case d is greater than n, reduce d to within bounds
        d = d % n;
        if (d == 0) return; // No rotation needed if d is 0 or a multiple of n

        // Step 1: Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the rest of the array
        reverse(arr, d, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Helper function to reverse a portion of the array from index start to end
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
