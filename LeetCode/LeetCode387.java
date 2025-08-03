package LeetCode;
// First Unique Character in a String

public class LeetCode387 {
    public static void main(String[] args) {
        
    }

    public static int firstUniqChar(String s) {
        int[] a = new int[26];
        for (int i=0; i<s.length(); i++){
            a[s.charAt(i) - 'a']++;
        }
        for (int i=0; i<s.length(); i++){
            if (a[s.charAt(i) - 'a']==1) return i;
        }
        return -1;
    }
}