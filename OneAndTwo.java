import java.util.Scanner;

public class OneAndTwo {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(); // number of test cases

            while (t-- > 0) {
                  int n = sc.nextInt(); // size of array
                  int[] a = new int[n];
                  for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt(); // reading original array
                  }

                  // compute prefix product
                  int[] prefix = new int[n];
                  prefix[0] = a[0];
                  for (int i = 1; i < n; i++) {
                        prefix[i] = prefix[i - 1] * a[i];
                  }

                  boolean found = false;
                  for (int k = 0; k < n - 1; k++) {
                        int leftProduct = prefix[k];
                        int rightProduct = prefix[n - 1] / prefix[k];
                        if (leftProduct == rightProduct) {
                              System.out.println(k + 1); // 1-based indexing
                              found = true;
                              break; // smallest k, so break
                        }
                  }

                  if (!found) {
                        System.out.println(-1);
                  }
            }
      }
}
