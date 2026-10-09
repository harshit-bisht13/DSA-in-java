
import java.util.*;

public class SubsetSums {

    public static List<Integer> subsetSums(int[] nums) {
        List<Integer> result = new ArrayList<>();

        findSums(0, nums, 0, result);

        Collections.sort(result);
        return result;
    }

    private static void findSums(int index, int[] nums, int sum,
                                 List<Integer> result) {

        // Base case: all elements have been processed
        if (index == nums.length) {
            result.add(sum);
            return;
        }

        // Choice 1: Include the current element
        findSums(index + 1, nums, sum + nums[index], result);

        // Choice 2: Exclude the current element
        findSums(index + 1, nums, sum, result);
    }

    public static void main(String[] args) {
        int[] nums = {2, 3};

        List<Integer> result = subsetSums(nums);

        System.out.println("Subset sums: " + result);
    }
}
