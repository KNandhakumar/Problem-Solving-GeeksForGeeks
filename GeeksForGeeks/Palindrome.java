package GeeksForGeeks;

public class Palindrome {
    // https://www.geeksforgeeks.org/problems/palindrome0746/1
    public static void main(String[] args) {
        int n = 121;
        System.out.println(palindromeOrNot(n));
    }

    static String palindromeOrNot(int n){
        int reverse = 0;
        int originalNumber = n;
        while (n>0){
            int rem = n%10;
            reverse = reverse * 10 + rem;
            n = n/10;
        }
        if (originalNumber==reverse){
            return "Yes";
        }
        return "No";
    }
}
