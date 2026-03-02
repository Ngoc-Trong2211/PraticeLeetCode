package LeetCode.Easy;

// Range Sum Query - Immutable

public class LeetCode303 {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        
        System.out.println(obj.sumRange(0, 2)); // 1
        System.out.println(obj.sumRange(2, 5)); // -1
        System.out.println(obj.sumRange(0, 5)); // -3
    }
}

class NumArray {
    public int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if (i!=0) prefix[i] = nums[i] + prefix[i-1];
            else prefix[i] = nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if (left !=0) return prefix[right] - prefix[left-1];
        return prefix[right];
    }
}
