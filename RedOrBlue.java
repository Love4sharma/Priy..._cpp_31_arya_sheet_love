import java.util.Scanner;

public class RedOrBlue {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int r = sc.nextInt();
                  int b = sc.nextInt();

                  int p = r / (b + 1);
                  int q = r % (b + 1);

                  StringBuilder result = new StringBuilder();

                  for (int i = 0; i < q; i++) {
                        result.append("R".repeat(p + 1)).append("B");
                  }
                  for (int i = q; i < b; i++) {
                        result.append("R".repeat(p)).append("B");
                  }
                  result.append("R".repeat(p));

                  System.out.println(result.toString());
            }

            sc.close();
      }
}
