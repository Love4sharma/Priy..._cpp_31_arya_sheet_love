import java.util.Scanner;

public class MochAndMath {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long t = sc.nextLong();

            while (t-- > 0) {
                  int n = sc.nextInt();
                  long[] a = new long[n];

                  for (int i = 0; i < n; i++) {
                        a[i] = sc.nextLong();
                  }

                  long totalAnd = a[0];
                  for (int i = 1; i < n; i++) {
                        totalAnd &= a[i];
                  }

                  System.out.println(totalAnd);
            }

            sc.close();
      }
}
