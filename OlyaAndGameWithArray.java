import java.util.*;
import java.io.*;

public class OlyaAndGameWithArray {

      static void solve(Scanner sc) {
            int n = sc.nextInt();

            int mini = Integer.MAX_VALUE;
            ArrayList<Integer> min2 = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                  int m = sc.nextInt();
                  int[] arr = new int[m];
                  for (int j = 0; j < m; j++) {
                        arr[j] = sc.nextInt();
                  }

                  // find minimum element
                  int minEl = Arrays.stream(arr).min().getAsInt();
                  mini = Math.min(mini, minEl);

                  // remove first occurrence of minEl
                  ArrayList<Integer> temp = new ArrayList<>();
                  boolean removed = false;
                  for (int val : arr) {
                        if (!removed && val == minEl) {
                              removed = true;
                        } else {
                              temp.add(val);
                        }
                  }

                  // add 2nd minimum
                  int secondMin = Collections.min(temp);
                  min2.add(secondMin);
            }

            // compute beauty
            long sum = 0;
            for (int val : min2)
                  sum += val;

            long beauty = mini + sum - Collections.min(min2);
            System.out.println(beauty);
      }

      public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int t = 1;
            if (sc.hasNextInt()) {
                  t = sc.nextInt();
            }
            while (t-- > 0) {
                  solve(sc);
            }
      }
}
