package GeeksForGeeks.Strings;

public class ReverseString {
    // https://www.geeksforgeeks.org/problems/reverse-a-string/1?page=1&difficulty=Basic&sortBy=submissions
    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        String name = "vishnu";
        String ans = reverseWord(name);
        System.out.println(ans);
    }

    // time complexity O(n)
    // space complexity O(1)
    public static String reverseWord(String str){
        return new StringBuilder(str).reverse().toString();
    }

    // time complexity O(n2)
    // space complexity O(1)
    public static String reverseWord1(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
