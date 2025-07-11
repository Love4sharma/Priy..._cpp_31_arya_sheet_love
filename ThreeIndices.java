import java.util.*;

public class ThreeIndices {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int arr[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }
                  boolean flag = false;
                  for (int i = 1; i < n - 1; i++) {
                        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                              System.out.println("Yes");
                              int a = i;
                              int b = i + 1;
                              int c = i + 2;
                              System.out.println(a + " " + b + " " + c);
                              flag = true;
                        }
                  }
                  if (flag = false) {
                        System.out.println("No");
                  }
            }
      }
}
