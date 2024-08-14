package GeeksForGeeks;

public class ArmstrongOrNot {
    // https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
    // time complexity O(1)
    // space complexity O(1)
    public static void main(String[] args) {
        int n = 371;
        System.out.println(ArmstrongNumber(n));
    }

    static String ArmstrongNumber(int n){
        int OriginalNumber = n;
        int sumOfCubes = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sumOfCubes += Math.pow(rem,3); // this is also using for raised power n
            // another method is sumOfCubes = (rem*rem*rem)
        }
        if (OriginalNumber==sumOfCubes){
            return "True";
        }
        return "False";
    }
}
