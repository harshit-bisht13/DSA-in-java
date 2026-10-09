
import java.util.*;

public class Subset2 {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array so duplicate elements are adjacent
        Arrays.sort(nums);

        findSubsets(0, nums, new ArrayList<>(), result);

        return result;
    }

    private static void findSubsets(int index, int[] nums,
                                   List<Integer> current,
                                   List<List<Integer>> result) {

        // Add a copy of the current subset
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            // Skip duplicates at the same recursion level
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            // Pick the current element
            current.add(nums[i]);

            // Recursively process the remaining elements
            findSubsets(i + 1, nums, current, result);

            // Backtrack: remove the last element
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};

        List<List<Integer>> result = subsetsWithDup(nums);

        System.out.println("Unique subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
