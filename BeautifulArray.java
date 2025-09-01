import java.util.*;

public class BeautifulArray {

      static void solve(Scanner sc) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();

            // Check feasibility
            if (s < k * b || s > (k * b + n * (k - 1))) {
                  System.out.println(-1);
                  return;
            }

            long a1 = k * b;
            s -= k * b;

            if (s >= k - 1) {
                  a1 += (k - 1);
                  s -= (k - 1);
            } else {
                  a1 += s;
                  s = 0;
            }

            System.out.print(a1 + " ");
            for (int i = 2; i <= n; i++) {
                  long ai;
                  if (s >= k - 1) {
                        ai = k - 1;
                        s -= ai;
                  } else {
                        ai = s;
                        s -= ai;
                  }
                  System.out.print(ai + " ");
            }
            System.out.println();
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = 1;
            t = sc.nextInt();
            while (t-- > 0) {
                  solve(sc);
            }
            sc.close();
      }
}
