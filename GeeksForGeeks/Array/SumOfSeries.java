package GeeksForGeeks.Array;

public class SumOfSeries {
    // https://www.geeksforgeeks.org/problems/sum-of-series2811/1?page=1&difficulty=Basic&sortBy=submissions
    // time complexity O(1)
    // space complexity O(1)
    public static void main(String[] args) {
        long n = 5;
        System.out.println(seriesSum(n));
    }

    public static long seriesSum(long n) {
        return (long) n * (n+1)/ 2;
    }
}
