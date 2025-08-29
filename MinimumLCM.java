import java.util.*;

public class MinimumLCM {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();

                  if (n % 2 == 0) {
                        // Best case: split equally
                        System.out.println((n / 2) + " " + (n / 2));
                  } else {
                        // Find smallest divisor > 1
                        int d = -1;
                        for (int i = 2; i * i <= n; i++) {
                              if (n % i == 0) {
                                    d = i;
                                    break;
                              }
                        }
                        if (d == -1) {
                              // n is prime
                              System.out.println(1 + " " + (n - 1));
                        } else {
                              int a = n / d;
                              int b = n - a;
                              System.out.println(a + " " + b);
                        }
                  }
            }
      }
}
