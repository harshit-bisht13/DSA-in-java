import java.util.*;

public class BinaryStringsWithoutConsecutiveOnes {

    public static List<String> generateBinaryStrings(int n) {

        List<String> result = new ArrayList<>();

        generate(n, "", result);

        return result;
    }

    private static void generate(int n, String current, List<String> result) {

        // Base case
        if (current.length() == n) {
            result.add(current);
            return;
        }

        // We can always add 0
        generate(n, current + "0", result);

        // Add 1 only if previous character is not 1
        if (current.length() == 0 ||
            current.charAt(current.length() - 1) != '1') {

            generate(n, current + "1", result);
        }
    }

    public static void main(String[] args) {

        int n = 3;

        List<String> result = generateBinaryStrings(n);

        System.out.println("Binary strings without consecutive 1s:");
        System.out.println(result);
    }
}