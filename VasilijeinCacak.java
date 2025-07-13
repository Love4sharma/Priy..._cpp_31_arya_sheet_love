import java.util.*;

public class VasilijeinCacak {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  long n = sc.nextLong();
                  long k = sc.nextLong();
                  long x = sc.nextLong();

                  long low = (k * (k + 1)) / 2;
                  long high = (n * (n + 1)) / 2 - ((n - k) * (n - k + 1)) / 2;

                  if (x >= low && x <= high) {
                        System.out.println("Yes");
                  } else {
                        System.out.println("No");
                  }
            }

      }
}
