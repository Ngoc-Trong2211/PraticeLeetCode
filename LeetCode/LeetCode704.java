package LeetCode;
// Binary Search

public class LeetCode704 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(deQuy(a, 9, 0 , a.length-1));
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    public static int deQuy (int[] a, int target, int left, int right){
        if (left <= right){
            int mid = (left + right)/2;
            if (a[mid] == target) return mid;
            else if (a[mid] > target) return deQuy (a, target, left, mid - 1);
            else return deQuy (a, target, mid + 1, right);
        }
        return -1;
    }
}
