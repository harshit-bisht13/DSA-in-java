import java.util.*;

public class PowerSet {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    public static void backtrack(
            int index,
            int[] nums,
            List<Integer> current,
            List<List<Integer>> result) {

        // Add current subset
        result.add(new ArrayList<>(current));

        // Try every remaining element
        for (int i = index; i < nums.length; i++) {

            // Include nums[i]
            current.add(nums[i]);

            // Move to next element
            backtrack(i + 1, nums, current, result);

            // Remove nums[i] for the next possibility
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = subsets(nums);

        System.out.println("All subsets:");

        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}