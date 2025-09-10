package LeetCode.Easy;
// Longest Common Prefix

public class LeetCode14 {
    public static void main(String[] args) {
        String[] ar = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(ar));
    }

    public static String longestCommonPrefix(String[] strs) {
        String sample = strs[0];
        for (String s : strs){
            while (!s.startsWith(sample)) {
                sample = sample.substring(0, sample.length() - 1);
                if (sample.isEmpty()) return "";
            }
        }
        return sample;
    }
}
