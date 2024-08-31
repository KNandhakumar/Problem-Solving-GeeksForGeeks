package GeeksForGeeks.Recursion;

public class SumOfN {
    // https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
    public static void main(String[] args) {
        long n = 5;
        long ans = sumOfSeries(n);
        System.out.println(ans);
    }

    // time complexity O(n)
    // space complexity O(n)
    static long sumOfSeries(long n) {
        if (n==1){
            return 1;
        }
        return sumOfSeries(n-1) + n*n*n;
    }

    static long sumOfSeries1(long n) {
        // Calculate sum of first n natural numbers
        long sumOfN = n * (n + 1) / 2;
        // Return the square of the sum
        return sumOfN * sumOfN;
    }
}
