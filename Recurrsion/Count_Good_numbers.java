public class Count_good_numbers{

    static final long MOD = 1000000007;

    public static int countGoodNumbers(long n) {

        long evenPositions = (n + 1) / 2;

        long oddPositions = n / 2;

        long ans = power(5, evenPositions);

        ans = (ans * power(4, oddPositions)) % MOD;

        return (int) ans;
    }

    // Binary exponentiation
    public static long power(long x, long n) {

        long ans = 1;

        while (n > 0) {

            // If n is odd
            if (n % 2 == 1) {
                ans = (ans * x) % MOD;
            }

            // Square x
            x = (x * x) % MOD;

            // Divide exponent by 2
            n = n / 2;
        }

        return ans;
    }

    public static void main(String[] args) {

        long n = 5;

        int result = countGoodNumbers(n);

        System.out.println("Number of good numbers: " + result);
    }
}