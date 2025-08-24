import java.util.*;

public class HelmetsInNightights {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int p = sc.nextInt();
                  int arr[] = new int[n];
                  int b[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }
                  for (int i = 0; i < n; i++) {
                        b[i] = sc.nextInt();
                  }

                  // cost_cap holds pairs (cost, capacity)
                  List<long[]> costCap = new ArrayList<>();
                  costCap.add(new long[] { p, n + 1 }); // Pak Chanek direct informing option
                  for (int i = 0; i < n; i++) {
                        costCap.add(new long[] { b[i], arr[i] });
                  }

                  // sort by cost ascending
                  costCap.sort((x, y) -> {
                        if (x[0] == y[0])
                              return Long.compare(y[1], x[1]); // tie-break: bigger capacity first
                        return Long.compare(x[0], y[0]);
                  });

                  long cost = p; // initial cost (telling one person directly)
                  int total = 1; // one person already informed

                  int idx = 0;
                  while (total < n) {
                        int left = n - total;
                        long cap = costCap.get(idx)[1];
                        long c = costCap.get(idx)[0];

                        if (cap <= left) {
                              total += cap;
                              cost += c * cap;
                        } else {
                              cost += c * left;
                              total = n;
                        }
                        idx++;
                  }

                  System.out.println(cost);
            }
      }
}
