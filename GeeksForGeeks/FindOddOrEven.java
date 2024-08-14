package GeeksForGeeks;

public class FindOddOrEven {
    // https://www.geeksforgeeks.org/problems/odd-or-even3618/1
    // time complexity O(1)
    // space complexity O(1)
    public static void main(String[] args) {
        int n = 15;

        if (evenOrOdd(n)){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }

    static boolean evenOrOdd(int n){
        if (n%2==0){
            return true;
        }
        return false;
    }
}
