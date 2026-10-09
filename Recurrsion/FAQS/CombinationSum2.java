
import java.util.*;

public class CombinationSum2 {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int index, int[] candidates, int target,
                                  List<Integer> current,
                                  List<List<Integer>> result) {

        // Target achieved
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Skip duplicate candidates at the same level
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Array is sorted, so stop if candidate exceeds target
            if (candidates[i] > target) {
                break;
            }

            // Pick the candidate
            current.add(candidates[i]);

            // Move to i + 1 because each element can be used only once
            backtrack(i + 1, candidates, target - candidates[i],
                      current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> result = combinationSum2(candidates, target);

        System.out.println("Combinations:");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
