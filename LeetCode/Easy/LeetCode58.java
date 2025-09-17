package LeetCode.Easy;
// Length of Last Word

public class LeetCode58 {
    public static void main(String[] args){
        String s = "           h asdfasdfas fasdfasd";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String a = s.trim();
        int k = 0;
        for(int i=a.length()-1; i>=0; i--){
            if (a.charAt(i) != ' ') k++;
            else break;
        }
        return k;
    }
}