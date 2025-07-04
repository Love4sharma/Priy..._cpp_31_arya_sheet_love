import java.util.Scanner;

public class LuntikandSubsequences {
      public static long powerOfTwo(int exp) {
            return 1L << exp; // Fast 2^exp
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                  int n = sc.nextInt();
                  int arr[] = new int[n];
                  int zeros = 0, ones = 0;

                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                        if (arr[i] == 1)
                              ones++;
                        if (arr[i] == 0)
                              zeros++;
                  }

                  if (ones == 0) {
                        System.out.println(0);
                  } else {
                        long ans = ones * powerOfTwo(zeros);
                        System.out.println(ans);
                  }
            }
      }
}
