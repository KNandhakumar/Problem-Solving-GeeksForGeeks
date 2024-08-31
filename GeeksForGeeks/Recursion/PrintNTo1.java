package GeeksForGeeks.Recursion;

public class PrintNTo1 {
    // https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-n-to-1-without-loop
    // time complexity O(n)
    // space complexity O(n) recursively
    public static void main(String[] args) {
        int n = 5;
        printNos(n);
    }

    static void printNos(int N) {
        if (N == 0){
            return;
        }
        System.out.print(N + " ");
        printNos(N-1);
    }
}
