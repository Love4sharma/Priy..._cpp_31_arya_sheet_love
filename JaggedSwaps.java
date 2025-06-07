import java.util.Arrays;
import java.util.Scanner;

public class JaggedSwaps {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while (t-- > 0) {
                  int n = scanner.nextInt();
                  int arr[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                  }
                  int nums[] = Arrays.copyOfRange(arr, 0, n);
                  Arrays.sort(arr);
                  if (nums[0] == arr[0]) {
                        System.out.println("YES");
                  } else {
                        System.out.println("NO");
                  }
            }
      }
}
