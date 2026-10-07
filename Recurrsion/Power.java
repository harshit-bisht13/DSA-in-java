public class Power{

    public static double myPow(double x, int n) {

        long nn = n;

        // Make exponent positive
        if (nn < 0) {
            nn = -nn;
        }

        double ans = 1.0;

        while (nn > 0) {

            // If exponent is odd
            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            }

            // If exponent is even
            else {
                x = x * x;
                nn = nn / 2;
            }
        }

        // If original exponent was negative
        if (n < 0) {
            ans = 1.0 / ans;
        }

        return ans;
    }

    public static void main(String[] args) {

        double x = 2.0;
        int n = 10;

        double result = myPow(x, n);

        System.out.println("Answer: " + result);
    }
}