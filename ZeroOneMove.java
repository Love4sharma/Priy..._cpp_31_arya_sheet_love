import java.util.Scanner;

public class ZeroOneMove {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                  String s = sc.next();
                  int count0 = 0, count1 = 0;

                  for (char ch : s.toCharArray()) {
                        if (ch == '0')
                              count0++;
                        else if (ch == '1')
                              count1++;
                  }

                  int minCount = Math.min(count0, count1);
                  System.out.println(minCount % 2 == 1 ? "DA" : "NET");
            }

      }
}
