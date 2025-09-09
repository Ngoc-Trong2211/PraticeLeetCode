package LeetCode.Easy;
public class LeetCode88 {
    public static void main(String[] args) {
        int a[] = {1,2,0,0};
        int b[] = {1,5};
        merge(a, 2, b, 2);
        for (int i : a){
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 2 pointer
        int k = m+n-1;
        int i = m-1;
        int j = n-1;
        while (k>=0){
            if (j<0){
                nums1[k] = nums1[i];
                i--;
            }
            else if (i<0){
                nums1[k] = nums2[j];
                j--;
            }
            else if (nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else if (nums1[i]<=nums2[j]){
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // for (int ai : nums2){
        //     addElementIntoNums1(ai, nums1, m);
        //     m++;
        // }
    }

    // private static void addElementIntoNums1(int ai, int[] nums1, int m) {
    //     boolean isChange = false;
    //     for (int i=0; i<nums1.length; i++){
    //         if (nums1[i]>ai){
    //             isChange = true;
    //             for (int j=m-1; j>=i; j--){
    //                 nums1[j+1] = nums1[j];
    //             }
    //             nums1[i] = ai;
    //             break;
    //         }
    //     }
    //     if (!isChange) nums1[m] = ai;
    // }
}
