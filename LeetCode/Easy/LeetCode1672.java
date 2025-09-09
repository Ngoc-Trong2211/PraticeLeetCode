package LeetCode.Easy;
// Richest Customer Wealth

public class LeetCode1672 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(a));
    }

    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int max = 0;
        for (int i=0; i<accounts.length; i++){
            sum = 0;
            for (int j=0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if (sum > max) max = sum;
        }
        return max;
    }
}
