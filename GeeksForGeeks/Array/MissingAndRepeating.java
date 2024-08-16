package GeeksForGeeks.Array;

public class MissingAndRepeating {
    // https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
    // Time complexity: O(n)
    // Space complexity: O(1)
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int n = 6;
        int[] result = findTwoElement(arr, n);

        // Print the repeating and missing numbers
        System.out.println("Repeating: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }

    public static int[] findTwoElement(int arr[], int n) {
        int repeating = -1;
        int missing = -1;

        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // Get the absolute value of the current element
            int element = Math.abs(arr[i]);

            // If the value at index (element - 1) is already negative,
            // it means this is the repeating element.
            if (arr[element - 1] < 0) {
                repeating = element;
            } else {
                // Otherwise, mark the index (element - 1) as visited by
                // multiplying the value by -1.
                arr[element - 1] = -arr[element - 1];
            }
        }

        // Now find the missing element by looking for the positive number in the array.
        for (int i = 0; i < n; i++) {
            // The index where the value is still positive is the missing element
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        // Return the repeating and missing numbers
        return new int[]{repeating, missing};
    }
}
