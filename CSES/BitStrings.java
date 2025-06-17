import java.util.Scanner;

public class BitStrings {
      static final int MOD = 1000000007;

      // Function to perform fast exponentiation (binary exponentiation)
      public static long power(long base, int exp) {
            long result = 1;
            base = base % MOD;

            while (exp > 0) {
                  if ((exp & 1) == 1) {
                        result = (result * base) % MOD;
                  }
                  base = (base * base) % MOD;
                  exp >>= 1;
            }

            return result;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            System.out.println(power(2, n));
      }
}
