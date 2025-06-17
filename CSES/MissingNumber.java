import java.util.Scanner;

public class MissingNumber {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            long totalSum = (long) n * (n + 1) / 2;

            long actualSum = 0;
            for (int i = 0; i < n - 1; i++) {
                  actualSum += scanner.nextInt();
            }

            scanner.close();

            System.out.println(totalSum - actualSum);
      }
}
