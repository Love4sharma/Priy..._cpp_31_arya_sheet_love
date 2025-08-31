import java.util.*;

public class BasketBallTeam {

      static void solve(Scanner sc) {
            int n = sc.nextInt();
            long d = sc.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);

            int wins = 0;
            int i = -1, j = n - 1;
            long cur = arr[j];
            while (i < j) {
                  long maxp = arr[j];

                  if (cur <= d) {
                        // take a player from left
                        i++;
                        cur += maxp;
                  } else {
                        wins++;
                        j--;
                        if (j >= 0)
                              cur = arr[j];
                  }
            }

            System.out.println(wins);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = 1;
            // t = sc.nextInt(); // uncomment if multiple test cases
            while (t-- > 0) {
                  solve(sc);
            }
            sc.close();
      }
}
