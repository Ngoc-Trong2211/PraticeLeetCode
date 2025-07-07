public class LeetCode1295 {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums){
            int countNumber = 0;
            while (i!=0){
                countNumber++;
                i/=10;
            }
            if (countNumber%2==0) count++;
        }
        return count;
    }
}

