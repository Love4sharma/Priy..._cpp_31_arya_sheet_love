import java.util.*;

public class ComparingString {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {

                  int n = sc.nextInt();
                  String s1 = sc.next();
                  int ans = 1, cur = 1;
                  for (int i = 1; i < n; i++) {
                        if (s1.charAt(i) != s1.charAt(i - 1))
                              cur = 1;
                        else
                              cur++;
                        ans = Math.max(ans, cur);
                  }
                  System.out.println(ans + 1);
            }
      }
}