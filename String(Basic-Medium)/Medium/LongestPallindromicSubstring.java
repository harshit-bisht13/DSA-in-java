public class LongestPallindromicSubstring {

    public String longestPallindrome(String s) {

        if (s.length() <= 1) {
            return s;
        }

        String str = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int low = i;
            int high = i;

            while (low >= 0 && high < s.length()
                    && s.charAt(low) == s.charAt(high)) {

                low--;
                high++;
            }

            String palindrome = s.substring(low + 1, high);

            if (palindrome.length() > str.length()) {
                str = palindrome;
            }

            // Even length palindrome
            low = i;
            high = i + 1;

            while (low >= 0 && high < s.length()
                    && s.charAt(low) == s.charAt(high)) {

                low--;
                high++;
            }

            palindrome = s.substring(low + 1, high);

            if (palindrome.length() > str.length()) {
                str = palindrome;
            }
        }

        return str;
    }

    public static void main(String[] args) {

        LongestPallindromicSubstring obj =
                new LongestPallindromicSubstring();

        System.out.println(obj.longestPallindrome("babad"));
    }
}