import java.util.*;

public class NitDestroyTheUniverse {

      public static void solve(Scanner sc) {
            int n = sc.nextInt();
            int[] v = new int[n + 1]; // 1-based indexing, v[0] = 0 by default
            int ans = 0;

            for (int i = 1; i <= n; i++) {
                  v[i] = sc.nextInt();
                  if (v[i - 1] == 0 && v[i] != 0) {
                        ans++;
                  }
            }

            ans = Math.min(ans, 2);
            System.out.println(ans);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long testCase = sc.nextLong();
            while (testCase-- > 0) {
                  solve(sc);
            }
            sc.close();
      }
}
