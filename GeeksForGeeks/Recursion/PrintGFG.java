package GeeksForGeeks.Recursion;

public class PrintGFG {

    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/problems/print-gfg-n-times/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-gfg-n-times
        // time complexity O(n)
        // space complexity O(n) recursively
        int n = 5;
        printGfg(n);
    }

    static void printGfg(int N) {
        if (N == 0){
            return;
        }
        printGfg(N-1);
        System.out.print("GFG" + " ");
    }
}
