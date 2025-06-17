import java.util.*;

public class Desorting {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int T = sc.nextInt();

            while (T-- > 0) {
                  int n = sc.nextInt();
                  int[] nums = new int[n];
                  int diff = (int) 1e9;
                  boolean sorted = true;

                  for (int i = 0; i < n; i++) {
                        nums[i] = sc.nextInt();
                        if (i > 0) {
                              diff = Math.min(nums[i] - nums[i - 1], diff);
                              if (nums[i] < nums[i - 1]) {
                                    sorted = false;
                              }
                        }
                  }

                  if (!sorted) {
                        System.out.println(0);
                  } else {
                        System.out.println(diff / 2 + 1);
                  }
            }

            sc.close();
      }
}
