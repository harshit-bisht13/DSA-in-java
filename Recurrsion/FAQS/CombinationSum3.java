
import java.util.*;

public class CombinationSum3 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int k, int target,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // If k numbers are selected
        if (current.size() == k) {
            if (target == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        // Try numbers from start to 9
        for (int i = start; i <= 9; i++) {

            // Stop if the number exceeds the remaining target
            if (i > target) {
                break;
            }

            current.add(i);

            // Select the next number
            backtrack(i + 1, k, target - i, current, result);

            // Backtrack: remove the last number
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum3 obj = new CombinationSum3();

        System.out.println(obj.combinationSum3(3, 7));
        System.out.println(obj.combinationSum3(3, 9));
    }
}
