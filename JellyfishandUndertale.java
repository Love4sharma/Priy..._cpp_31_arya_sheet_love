import java.util.*;

public class JellyfishandUndertale {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  int n = sc.nextInt();
                  int arr[] = new int[n];

                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }

                  long timer = b - 1;
                  b = 1;
                  for (int i = 0; i < n; i++) {
                        b = Math.min(b + arr[i], a);
                        timer += (b - 1);
                        b = 1;
                  }
                  System.out.println(timer + b);
            }
      }
}
