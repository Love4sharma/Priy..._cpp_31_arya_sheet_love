import java.util.*;

public class ShoeShuffling {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();

            while (tc-- > 0) {
                  int n = sc.nextInt();
                  long[] s = new long[n];
                  long[] p = new long[n];

                  for (int i = 0; i < n; i++) {
                        s[i] = sc.nextLong();
                  }

                  for (int i = 0; i < n; i++) {
                        p[i] = i + 1;
                  }

                  int l = 0, r = 0;
                  boolean ans = true;

                  while (r < n) {
                        while (r < n - 1 && s[r] == s[r + 1]) {
                              r++;
                        }
                        if (l == r) {
                              ans = false;
                        } else {
                              // rotate right in range [l, r]
                              long temp = p[r];
                              for (int k = r; k > l; k--) {
                                    p[k] = p[k - 1];
                              }
                              p[l] = temp;
                        }
                        l = r + 1;
                        r++;
                  }

                  if (ans) {
                        for (long val : p) {
                              System.out.print(val + " ");
                        }
                        System.out.println();
                  } else {
                        System.out.println(-1);
                  }
            }
            sc.close();
      }
}
