package GeeksForGeeks;

public class PrimeNumber {
    // https://www.geeksforgeeks.org/problems/prime-number2314/1
    // time complexity O(sqrt(N))
    // space complexity O(1)
    public static void main(String[] args) {
        int n = 29;
        int ans = primeOrNot(n);
        if (ans == 1){
            System.out.println(n + " " + "this is prime");
        }
        else {
            System.out.println(n + " " + "this is not prime");
        }
    }

    static int primeOrNot(int n){
        // special case for 0 and 1 because these are not prime numbers
        if (n<=1){
            return 0;
        }

        // 2 and 3 are prime so return these
        if (n==2 || n==3){
            return 1; // prime
        }

        if (n%2==0 | n%3==0){
            return 0; // not prime
        }

        for (int i = 5; i*i<=n; i++) {
            if (n%i==0){
                return 0;
            }
        }
        return 1;
    }
}