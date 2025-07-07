public class LeetCode88 {
    public static void main(String[] args) {
        int a[] = {2,0};
        int b[] = {1};
        merge(a, 1, b, 1);
        for (int i : a){
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2){
            addElementIntoNums1(ai, nums1, m);
            m++;
        }
    }

    private static void addElementIntoNums1(int ai, int[] nums1, int m) {
        boolean isChange = false;
        for (int i=0; i<nums1.length; i++){
            if (nums1[i]>ai){
                isChange = true;
                for (int j=m-1; j>=i; j--){
                    nums1[j+1] = nums1[j];
                }
                nums1[i] = ai;
                break;
            }
        }
        if (!isChange) nums1[m] = ai;
    }
}
