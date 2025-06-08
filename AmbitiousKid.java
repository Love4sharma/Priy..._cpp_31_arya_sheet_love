import java.util.Scanner;

public class AmbitiousKid {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                  int m = sc.nextInt();
                  ans = Math.min(ans, Math.abs(m));
            }
            System.out.println(ans);
      }
}
