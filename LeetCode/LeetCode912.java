package LeetCode;
// Sort an Array

public class LeetCode912 {
    public static void main(String[] args) {
        int a[] = {5,2,3,1};
        int b[] = sortArray(a);
        for (int i : b){
            System.out.println(i);
        }
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    private static int[] mergeSort(int[] nums, int left, int right) {
        if (left > right) return new int[0];
        if (left == right){
            int a[] = {nums[left]};
            return a;
        }
        int k = (left + right) / 2;
        int t1[] = mergeSort(nums, left, k);
        int t2[] = mergeSort(nums, k+1, right);

        int n = t1.length + t2.length;
        int merge[] = new int[n]; 

        return mergeArr(merge, t1, t2);
    }

    private static int[] mergeArr(int[] nums, int[] t1, int[] t2) {
        int i=0, i1=0, i2=0;
        while (i<nums.length){
            if (i1<t1.length && i2<t2.length){
                if (t1[i1] <= t2[i2]){
                    nums[i] = t1[i1];
                    i++;
                    i1++;
                }
                else {
                    nums[i] = t2[i2];
                    i++;
                    i2++;
                }
            }
            else{
                if (i1<t1.length){
                    nums[i] = t1[i1];
                    i++;
                    i1++;
                }
                if (i2<t2.length) {
                    nums[i] = t2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return nums;
    }
}
