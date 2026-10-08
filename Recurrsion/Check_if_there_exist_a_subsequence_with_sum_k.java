public class Check_if_there_exist_a_subsequence_with_sum_k{

    public static boolean checkSubsequenceSum(int[] nums, int k) {
        return solve(nums, 0, k);
    }

    private static boolean solve(int[] nums, int index, int k) {

        // If required sum becomes 0
        if (k == 0) {
            return true;
        }

        // If we reach the end of the array
        if (index == nums.length) {
            return false;
        }

        // Take the current element
        if (solve(nums, index + 1, k - nums[index])) {
            return true;
        }

        // Don't take the current element
        return solve(nums, index + 1, k);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int k = 5;

        boolean result = checkSubsequenceSum(nums, k);

        System.out.println(result);
    }
}