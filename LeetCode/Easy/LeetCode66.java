package LeetCode.Easy;
// Plus One

public class LeetCode66 {
    public static void main(String[] args) {
        int[] a = {8,9,9};
        int[] c = plusOne(a);
        for(int b : c) System.out.println(b + "hi");
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] b = new int[n+1];
        if (digits[n-1] < 9){
            digits[n-1] = digits[n-1] + 1;
            return digits;
        }
        else{
            boolean check = true;
            for (int i=0; i<n; i++){
                if (digits[i] != 9){
                    check = false;
                    break;
                }
            }
            if (check){
                b[0] = 1;
                return b;
            }
            else{
                for (int i=n-1; i>=0; i--){
                    if (digits[i] == 9){
                        digits[i] = 0;
                    }
                    else {
                        digits[i] = digits[i] + 1;
                        break;
                    }
                }
            }
        }
        return digits;
    }
}
