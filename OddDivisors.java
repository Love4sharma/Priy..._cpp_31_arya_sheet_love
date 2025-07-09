import java.util.*;

public class OddDivisors {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  long n = sc.nextLong();
                  if (isPowerTwo(n) == false) {
                        System.out.println("YES");
                  } else {
                        System.out.println("NO");
                  }
            }
      }

      public static boolean isPowerTwo(long n) {
            return n != 0 && ((n & (n - 1)) == 0);
      }
}
