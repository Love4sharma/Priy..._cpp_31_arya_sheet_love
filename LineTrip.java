import java.util.Scanner;

public class LineTrip {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int x = sc.nextInt();

                  int prev = 0;
                  int ans = 0;

                  for (int i = 0; i < n; i++) {
                        int a = sc.nextInt();
                        ans = Math.max(ans, a - prev);
                        prev = a;
                  }

                  ans = Math.max(ans, 2 * (x - prev));
                  System.out.println(ans);
            }
      }
}
