package GeeksForGeeks;

public class PerfectNumber {
    // https://www.geeksforgeeks.org/problems/perfect-numbers3207/1
    // time complexity = O(sqrt(n))
    // space complexity = O(1)
    public static void main(String[] args) {
        int n = 28;
        System.out.println(checkPerfectNumber(n));
    }

    static int checkPerfectNumber(int n){
        if (n<=1){
            return 0;
        }
        long sum = 1; // 1 is a divisor for all numbers
        for (long i = 2; i <=Math.sqrt(n); i++) {
            if (n%i==0){
                sum += i;

                if (i != n / i && n / i != n) {
                    sum += n / i;
                }
            }
        }
        // Check if the sum of proper divisors equals the number
        if (n==sum){
            return 1;
        }
        return 0;
    }
 }