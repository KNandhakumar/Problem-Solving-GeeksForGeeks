package GeeksForGeeks;

public class SquareRootOfNumber {
    // https://www.geeksforgeeks.org/problems/square-root/1
    public static void main(String[] args) {
        long n = 26;
        System.out.println(square1(n));
    }

    // time complexity O(Log(n))
    // space complexity O(1)
    static long square(long n){
        long ans = (long) Math.sqrt(n);
        return ans;
    }

    // using binary search method
    // time complexity O(Log(n))
    // space complexity O(1)
    static long square1(long n){
        long start = 1;
        long end = n;
        long ans = 0;
        if (n==0 || n==1){
            return n;
        }
        while (start<=end){
            long mid = start + (end - start) / 2;
            if (mid*mid==n){
                return mid;
            }
            if (mid*mid<n){
                start = mid+1;
                ans = mid;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }
}
