package GeeksForGeeks;

public class CountDigits {
    // https://www.geeksforgeeks.org/problems/count-digits5716/1
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int n = 12;
        System.out.println(countDigits(n));
    }

    static int countDigits(int n){
        int originalNumber = n;
        int count = 0;
        while (n>0){
            int rem = n%10;
            if (rem != 0 && originalNumber%rem==0){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}
