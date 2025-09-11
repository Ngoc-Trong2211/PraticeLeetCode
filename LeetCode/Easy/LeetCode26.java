// Remove Duplicates from Sorted Array

public class LeetCode26 {
    public static void main(String[] args){
        int[] a = {1,1,2};
        System.out.println(removeDuplicates(a));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int n = nums.length;
        for (int i=1; i<n; i++){
            if (nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}