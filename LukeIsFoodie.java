import java.util.*;

public class LukeIsFoodie {
      static void solve(Scanner sc) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextLong();
            }

            int changes = 0;
            long[] prev = { arr[0] - x, arr[0] + x };

            for (int i = 1; i < n; i++) {
                  long[] cur = { arr[i] - x, arr[i] + x };
                  long[] overlap = { Math.max(prev[0], cur[0]), Math.min(prev[1], cur[1]) };

                  // if there is no overlap
                  if (overlap[0] > overlap[1]) {
                        changes++;
                        prev = cur;
                  } else {
                        prev = overlap;
                  }
            }

            System.out.println(changes);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  solve(sc);
            }
            sc.close();
      }
}
