import java.util.*;

public class StrangePartition {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int x = sc.nextInt();
                  long arr[] = new long[n];
                  long max = 0;
                  long sum = 0;
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextLong();
                        sum += arr[i];
                  }
                  long min = sum / x + (sum % x != 0 ? 1 : 0);
                  for (int i = 0; i < n; i++) {
                        max += arr[i] / x + (arr[i] % x != 0 ? 1 : 0);
                  }
                  System.out.println(min + " " + max);
            }
      }
}
