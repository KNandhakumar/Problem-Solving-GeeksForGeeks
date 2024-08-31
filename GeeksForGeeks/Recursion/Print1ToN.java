package GeeksForGeeks.Recursion;

public class Print1ToN {
    // https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops
    // time complexity O(n)
    // space complexity O(n) recursively
    public static void main(String[] args) {
        int n = 5;
        printNos(n);
    }

    public static void printNos(int N){
        if (N==0){
            return;
        }
        printNos(N-1);
        System.out.println(N);
    }
}
