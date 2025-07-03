import java.util.Scanner;

public class MakeItDivisibleByTwentyFive {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt(); // number of test cases
            sc.nextLine(); // consume the remaining newline

            while (t-- > 0) {
                  String a = sc.nextLine();
                  int n = a.length();
                  int ans = n - 2;

                  for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                              int num = 0;
                              num = num * 10 + (a.charAt(i) - '0');
                              num = num * 10 + (a.charAt(j) - '0');

                              if (num % 25 == 0) {
                                    ans = Math.min(ans, n - i - 2);
                              }
                        }
                  }

                  System.out.println(ans);
            }

            sc.close();
      }
}
