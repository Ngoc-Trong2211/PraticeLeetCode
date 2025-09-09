package LeetCode.Easy;
// Third Maximum Number

public class LeetCode414 {
    public static void main(String[] args) {
        int a[] = {2,2,3,1};
        System.out.println(thirdMax(a));
    }

    public static int thirdMax(int[] nums) {
        long maxArr[] = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for (int i=0; i<nums.length; i++){
            insert(nums[i], maxArr);
        }
        if (maxArr[2] != Long.MIN_VALUE) return (int) maxArr[2];
        return (int) maxArr[0];
    }

    private static void insert(int value, long[] maxArr) {
        int i=0;
        while (i<maxArr.length){
            if (value == maxArr[i]) return;
            else if (value > maxArr[i]) break;
            else i++;
        }
        if (i<maxArr.length){
            for (int j = maxArr.length-2; j>=i; j--){
                maxArr[j+1] = maxArr[j];
            }
            maxArr[i] = value;
        }
    }

    
}
