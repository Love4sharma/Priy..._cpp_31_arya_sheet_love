import java.util.*;

public class Raspberries {

      // Function to compute how many increments needed to make num divisible by k
      static int costToReach(int num, int k) {
            if (num % k == 0)
                  return 0;
            return k - (num % k);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                  int n = sc.nextInt();
                  int k = sc.nextInt();
                  int[] arr = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }

                  int ans = Integer.MAX_VALUE;

                  if (k == 2) {
                        // Need at least one even number
                        for (int v : arr) {
                              ans = Math.min(ans, costToReach(v, 2));
                        }
                  } else if (k == 3) {
                        // Need at least one multiple of 3
                        for (int v : arr) {
                              ans = Math.min(ans, costToReach(v, 3));
                        }
                  } else if (k == 5) {
                        // Need at least one multiple of 5
                        for (int v : arr) {
                              ans = Math.min(ans, costToReach(v, 5));
                        }
                  } else if (k == 4) {
                        // Need two factors of 2
                        int best = Integer.MAX_VALUE;

                        // Case 1: Make some number divisible by 4
                        for (int v : arr) {
                              best = Math.min(best, costToReach(v, 4));
                        }

                        // Case 2: Make two numbers even
                        int[] evens = new int[n];
                        for (int i = 0; i < n; i++) {
                              evens[i] = costToReach(arr[i], 2);
                        }
                        Arrays.sort(evens);
                        if (n >= 2) {
                              best = Math.min(best, evens[0] + evens[1]);
                        } else {
                              best = Math.min(best, evens[0]); // only one element case
                        }

                        ans = best;
                  }

                  System.out.println(ans);
            }
      }
}
