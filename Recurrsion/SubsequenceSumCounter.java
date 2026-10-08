public class SubsequenceSumCounter {

    public static int countSubsequenceWithTargetSum(int[] nums, int k) {
        return solve(nums, 0, k);
    }

    private static int solve(int[] nums, int index, int k) {

        // Target sum achieved
        if (k == 0) {
            return 1;
        }

        // Reached the end
        if (index == nums.length) {
            return 0;
        }

        // Take the current element
        int take = solve(nums, index + 1, k - nums[index]);

        // Don't take the current element
        int notTake = solve(nums, index + 1, k);

        return take + notTake;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int k = 3;

        int count = countSubsequenceWithTargetSum(nums, k);

        System.out.println("Number of subsequences: " + count);
    }
}