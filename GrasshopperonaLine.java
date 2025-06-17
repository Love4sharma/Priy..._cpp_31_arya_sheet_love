import java.util.*;

public class GrasshopperonaLine {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while (t-- > 0) {
                  int x = scanner.nextInt();
                  int k = scanner.nextInt();
                  if (x % k != 0) {
                        System.out.println(1);
                        System.out.println(x);
                  } else {
                        System.out.println(2);
                        System.out.println(x - k - 1 + " " + (k + 1));
                  }
            }
      }
}