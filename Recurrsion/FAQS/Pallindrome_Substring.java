
import java.util.*;

public class Pallindrome_Substring {

    boolean isPalindrome(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        f(0, s, new ArrayList<>(), result);
        return result;
    }

    public void f(int i, String s, List<String> current,
                  List<List<String>> result) {

        if (i == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int j = i; j < s.length(); j++) {
            if (isPalindrome(i, j, s)) {

                current.add(s.substring(i, j + 1));

                f(j + 1, s, current, result);

                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        Pallindrome_Substring obj = new Pallindrome_Substring();
        List<List<String>> result = obj.partition(s);

        System.out.println("Palindrome partitions:");

        for (List<String> list : result) {
            System.out.println(list);
        }

        sc.close();
    }
}
