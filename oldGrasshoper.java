import java.util.*;

public class oldGrasshoper {

      static boolean isEven(long num) {
            return (num & 1) == 0;
      }

      static void solve(Scanner sc) {
            long x = sc.nextLong();
            long n = sc.nextLong();

            long d;

            switch ((int) (n % 4)) {
                  case 0:
                        d = 0;
                        break;
                  case 1:
                        d = -n;
                        break;
                  case 2:
                        d = 1;
                        break;
                  case 3:
                        d = n + 1;
                        break;
                  default:
                        d = 0;
            }

            if (isEven(x)) {
                  System.out.println(x + d);
            } else {
                  System.out.println(x - d);
            }
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = 1;

            if (sc.hasNextInt())
                  t = sc.nextInt();

            while (t-- > 0) {
                  solve(sc);
            }

            sc.close();
      }
}