
import java.util.*;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private static void findCombinations(int index, int[] candidates, int target,
                                         List<Integer> current,
                                         List<List<Integer>> result) {
        // Base case: target achieved
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Stop if no candidates remain or target is negative
        if (index == candidates.length || target < 0) {
            return;
        }

        // Pick the current candidate (can be reused)
        current.add(candidates[index]);
        findCombinations(index, candidates, target - candidates[index],
                         current, result);

        // Backtrack
        current.remove(current.size() - 1);

        // Skip the current candidate
        findCombinations(index + 1, candidates, target, current, result);
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(candidates, target);

        System.out.println("Combinations:");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
