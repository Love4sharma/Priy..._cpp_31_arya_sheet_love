import java.util.Scanner;

public class BeautifulPermutation {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();

            if (n == 2 || n == 3) {
                  System.out.println("NO SOLUTION");
                  return;
            }

            StringBuilder result = new StringBuilder();

            for (int i = 2; i <= n; i += 2) {
                  result.append(i).append(" ");
            }

            for (int i = 1; i <= n; i += 2) {
                  result.append(i).append(" ");
            }

            System.out.println(result.toString().trim());
      }
}
