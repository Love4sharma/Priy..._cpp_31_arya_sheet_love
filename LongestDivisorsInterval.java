import java.util.*;

public class LongestDivisorsInterval {
      static final long INF = (long) 1e18;

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  long n = sc.nextLong();
                  System.out.println(maxValidIntervalSize(n));
            }
      }

      static int maxValidIntervalSize(long n) {
            int maxLen = 1;

            // Try interval sizes from 1 to 50
            for (int len = 1; len <= 50; len++) {
                  long lcm = 1;
                  boolean valid = true;
                  for (int i = 0; i < len; i++) {
                        lcm = lcm(lcm, len - i);
                        if (lcm > n) {
                              valid = false;
                              break;
                        }
                  }
                  if (valid && n % lcm == 0) {
                        maxLen = len;
                  }
            }

            return maxLen;
      }

      static long gcd(long a, long b) {
            while (b != 0) {
                  long t = a % b;
                  a = b;
                  b = t;
            }
            return a;
      }

      static long lcm(long a, long b) {
            long g = gcd(a, b);
            if (a > INF / (b / g))
                  return INF + 1; // prevent overflow
            return a * (b / g);
      }
}
