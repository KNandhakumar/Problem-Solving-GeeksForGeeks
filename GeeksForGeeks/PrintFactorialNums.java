package GeeksForGeeks;

import java.util.ArrayList;

public class PrintFactorialNums {
    // https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        long n = 6;
        ArrayList<Long> ans = factorialNumbers(n);
        System.out.println(ans);
    }

    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> arr = new ArrayList<>();
        long ans = 1;
        int i = 1;
        while (ans<=n){
            arr.add(ans);
            i++;
            ans = ans*i;
        }
        return arr;
    }
}
