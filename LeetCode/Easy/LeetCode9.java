package LeetCode.Easy;
// Palindrome Number

public class LeetCode9 {
    public static void main(String[] args) {
        int b = -121;
        System.out.println(isPalindrome(b));
    }

    public static boolean isPalindrome(int x) {
        int a = 0;
        int b = x;
        if (x<0) return false;
        while (x!=0) {
            a = a*10 + x%10;
            x/=10;
        }
        if (a==b) return true;
        return false;
    }
}
