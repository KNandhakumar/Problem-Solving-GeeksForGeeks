package GeeksForGeeks;

public class ReverseDigits {
    // https://www.geeksforgeeks.org/problems/reverse-digit0316/1
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int n = 200;
        System.out.println(reverseNumber(n));
    }

    static int reverseNumber(int n){
        int reverse = 0;
        while (n>0){
            int rem = n%10;
            reverse = reverse*10+rem;
            n = n/10;
        }
        return reverse;
    }
}
