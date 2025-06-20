import java.util.*;

public class OddQueries {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(); // Number of test cases

            while (t-- > 0) {
                  int n = sc.nextInt();
                  int q = sc.nextInt();

                  long[] a = new long[n + 1]; // Input array (1-based index)
                  long[] pref = new long[n + 1]; // Prefix sum array (1-based index)

                  for (int i = 1; i <= n; i++) {
                        a[i] = sc.nextLong();
                        pref[i] = pref[i - 1] + a[i];
                  }

                  for (int i = 0; i < q; i++) {
                        int l = sc.nextInt();
                        int r = sc.nextInt();
                        long k = sc.nextLong();

                        long sumWithoutRange = pref[n] - (pref[r] - pref[l - 1]);
                        long modifiedSum = sumWithoutRange + k * (r - l + 1);

                        if (modifiedSum % 2 == 1) {
                              System.out.println("YES");
                        } else {
                              System.out.println("NO");
                        }
                  }
            }

            sc.close();
      }
}
