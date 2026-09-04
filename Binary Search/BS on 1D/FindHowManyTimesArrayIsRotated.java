import java.util.ArrayList;
import java.util.Arrays;

public class FindHowManyTimesArrayIsRotated {

    public int find(ArrayList<Integer> list) {

        int low = 0;
        int high = list.size() - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (list.get(mid) > list.get(high)) {
                low = mid + 1;
            }

        
            else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        FindHowManyTimesArrayIsRotated f =
                new FindHowManyTimesArrayIsRotated();

        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));

        System.out.println(f.find(list));
    }
}