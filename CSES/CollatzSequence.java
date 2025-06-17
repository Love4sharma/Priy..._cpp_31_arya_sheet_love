import java.util.Scanner;

public class CollatzSequence {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long n = scanner.nextLong();
            scanner.close();

            while (n != 1) {
                  System.out.print(n + " ");
                  if (n % 2 == 0) {
                        n = n / 2;
                  } else {
                        n = n * 3 + 1;
                  }
            }
            System.out.println(1);
      }
}
