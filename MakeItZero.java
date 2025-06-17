import java.util.*;

public class MakeItZero {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T-- > 0) {
                  int n = sc.nextInt();
                  int[] a = new int[n];
                  for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                  }

                  if (n % 2 == 1) {
                        System.out.println(4);
                        System.out.println("1 " + (n - 1));
                        System.out.println("1 " + (n - 1));
                        System.out.println((n - 1) + " " + n);
                        System.out.println((n - 1) + " " + n);
                  } else {
                        System.out.println(2);
                        System.out.println("1 " + n);
                        System.out.println("1 " + n);
                  }
            }
      }
}
