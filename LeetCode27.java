public class LeetCode27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        // 2 pointer
        int k=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

        // int n = nums.length;
        // for (int i=0; i<n; ){
        //     if (nums[i]==val){
        //         for (int j=i; j<=n-2; j++){
        //             nums[j] = nums[j+1];
        //         }
        //         n--;
        //     } else i++;
        // }
        // return n;
    }
}
