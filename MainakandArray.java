import java.util.*;

public class MainakandArray {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt(); // number of test cases

            while (t-- > 0) {
                  int n = sc.nextInt();
                  List<Integer> v = new ArrayList<>();

                  for (int i = 0; i < n; i++) {
                        v.add(sc.nextInt());
                  }

                  int mini = Integer.MAX_VALUE;
                  int maxi = 0;

                  // First loop: find minimum from left to n-2 and compare with last element
                  for (int i = 0; i < n - 1; i++) {
                        mini = Math.min(mini, v.get(i));
                  }
                  maxi = Math.max(maxi, v.get(n - 1) - mini);

                  // Second loop: find maximum from right to 1 and compare with first element
                  int maxi1 = 0;
                  for (int i = n - 1; i > 0; i--) {
                        maxi1 = Math.max(maxi1, v.get(i));
                  }
                  maxi = Math.max(maxi, maxi1 - v.get(0));

                  // Third loop: compare adjacent differences
                  for (int i = 0; i < n - 1; i++) {
                        maxi = Math.max(maxi, v.get(i) - v.get(i + 1));
                  }

                  System.out.println(maxi);
            }

            sc.close();
      }
}
