package GeeksForGeeks.Basic;

public class WhileLoopPrintTable {
    // https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1
    public static void main(String[] args) {
        int n = 2;
        printTable(n);
    }

    static void printTable (int n)
    {
        int multiplier=10;
        while(multiplier>0)
        {
            System.out.println(n*multiplier + " ");
            multiplier--;
        }
        System.out.println();
    }
}
