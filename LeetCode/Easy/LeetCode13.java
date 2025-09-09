package LeetCode.Easy;
// Roman to Integer

public class LeetCode13 {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int val = convertInteger(s.charAt(i));
            if (i < s.length() - 1 && val < convertInteger(s.charAt(i+1))){
                sum -= val;
            } else sum += val;
        }
        return sum;
    }

    public static int convertInteger(char c){
        switch (c) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
            default ->{
                return 0;
            }
        }
    }
}
