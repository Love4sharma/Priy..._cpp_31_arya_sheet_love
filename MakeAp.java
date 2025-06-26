import java.util.Scanner;

public class MakeAp {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(); // number of test cases
            while (t-- > 0) {
                  long a = sc.nextLong();
                  long b = sc.nextLong();
                  long c = sc.nextLong();

                  if (canFormAP(a, b, c)) {
                        System.out.println("YES");
                  } else {
                        System.out.println("NO");
                  }
            }
      }

      static boolean canFormAP(long a, long b, long c) {
            // Case 1: Multiply a
            if ((2 * b - c) % a == 0 && (2 * b - c) / a > 0) {
                  return true;
            }
            // Case 2: Multiply b
            if ((a + c) % (2 * b) == 0 && (a + c) / (2 * b) > 0) {
                  return true;
            }
            // Case 3: Multiply c
            if ((2 * b - a) % c == 0 && (2 * b - a) / c > 0) {
                  return true;
            }
            return false;
      }
}
