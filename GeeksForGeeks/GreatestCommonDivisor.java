package GeeksForGeeks;

public class GreatestCommonDivisor {
    // https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
    // time complexity O(log(min(a, b)))
    // space complexity O(1)
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        System.out.println(GCD(a,b));
    }

    public static int GCD(int a, int b) {
        if (b==0){
            return a;
        }
        return GCD(b,a%b);
    }
}
