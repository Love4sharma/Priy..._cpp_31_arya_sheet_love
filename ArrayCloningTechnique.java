import java.util.*;

public class Main {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                  int n = sc.nextInt();
                  long[] a = new long[n];

                  for (int i = 0; i < n; i++) {
                        a[i] = sc.nextLong();
                  }

                  Arrays.sort(a);

                  long ma = 0;
                  long ans = 0;

                  for (int i = 0; i < n;) {
                        int j = i;
                        while (i < n && a[i] == a[j]) {
                              i++;
                        }
                        ma = Math.max(ma, i - j);
                  }

                  while (ma < n) {
                        if (2 * ma > n) {
                              ans++;
                              ans += (n - ma);
                              ma = n;
                        } else {
                              ans++;
                              ans += ma;
                              ma *= 2;
                        }
                  }

                  System.out.println(ans);
            }

            sc.close();
      }
}
