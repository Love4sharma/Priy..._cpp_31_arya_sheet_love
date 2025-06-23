import java.util.Scanner;

public class MakeItIncreasing {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int[] arr = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }
                  int ans = 0;

                  if (isStrictlyIncreasing(arr)) {
                        System.out.println(0);
                  } else {
                        for (int i = n - 2; i >= 0; i--) {
                              if (arr[i] < arr[i + 1]) {
                                    continue;
                              } else {
                                    while (arr[i] >= arr[i + 1]) {
                                          if (arr[i] == 0) {
                                                break;
                                          }
                                          arr[i] /= 2;
                                          ans++;
                                    }
                              }
                        }
                        if (isStrictlyIncreasing(arr)) {
                              System.out.println(ans);
                        } else {
                              System.out.println(-1);
                        }

                  }

            }

      }

      public static boolean isStrictlyIncreasing(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                  if (arr[i] <= arr[i - 1]) {
                        return false;
                  }
            }
            return true;
      }
}
