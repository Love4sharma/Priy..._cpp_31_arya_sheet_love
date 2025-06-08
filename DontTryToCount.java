import java.util.Scanner;

public class DontTryToCount {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int m = sc.nextInt();
                  String x = sc.next();
                  String s = sc.next();

                  int count = 0;
                  String temp = x;

                  boolean found = false;

                  // Limit to max 10 doublings
                  for (int i = 0; i <= 10; i++) {
                        if (temp.contains(s)) {
                              found = true;
                              break;
                        }
                        temp += temp;
                        count++;
                  }

                  System.out.println(found ? count : -1);
            }
            sc.close();
      }
}
