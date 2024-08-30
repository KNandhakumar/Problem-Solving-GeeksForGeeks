package GeeksForGeeks.Basic;

public class IfElseDecisionMaking {
    // https://www.geeksforgeeks.org/problems/java-if-else-decision-making0924/0?category%255B%255D=Java&difficulty%255B%255D=-2&page=1&query=category%255B%255DJavadifficulty%255B%255D-2page1category%255B%255DJava
    // time complexity O(1)
    // space complexity O(1)
    public static void main(String[] args) {
        int n = 4;
        int m = 8;
        System.out.println(compareNM(n,m));
    }

    public static String compareNM(int n, int m) {
        if (n<m){
            return "lesser";
        }
        else if (n==m){
            return "equal";
        }
        else {
            return "greater";
        }
    }
}
