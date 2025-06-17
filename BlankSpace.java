import java.util.*;

public class BlankSpace {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int c = 0;
                  int ans = 0;
                  for (int i = 0; i < n; i++) {
                        int m = sc.nextInt();
                        if (m == 0) {
                              c++;
                        } else {
                              ans = Math.max(ans, c);
                              c = 0;
                        }
                  }
                  ans = Math.max(ans, c);
                  System.out.println(ans);
            }
      }
}
