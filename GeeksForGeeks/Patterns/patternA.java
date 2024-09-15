package GeeksForGeeks.Patterns;

public class patternA {
    public static void main(String[] args) {
        //    *****
        //    *****
        //    *****
        //    *****
        //    *****
        int n = 5;
        patternA(n);
    }

    static void patternA(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
