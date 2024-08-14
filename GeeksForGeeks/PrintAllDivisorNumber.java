package GeeksForGeeks;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisorNumber {
    // https://www.naukri.com/code360/problems/print-all-divisors-of-a-number_1164188
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int n = 10;
        System.out.println(printDivisors(n));
    }

    static List<Integer> printDivisors(int n){
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if (n%i==0){
                divisors.add(i);
            }
        }
        return divisors;
    }
}
