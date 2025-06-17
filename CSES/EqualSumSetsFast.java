import java.io.*;
import java.util.*;

public class EqualSumSetsFast {
      public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(System.out);

            int n = Integer.parseInt(br.readLine());
            long totalSum = (long) n * (n + 1) / 2;

            if (totalSum % 2 != 0) {
                  out.println("NO");
            } else {
                  out.println("YES");
                  List<Integer> set1 = new ArrayList<>();
                  List<Integer> set2 = new ArrayList<>();
                  long target = totalSum / 2;

                  for (int i = n; i >= 1; i--) {
                        if (target >= i) {
                              set1.add(i);
                              target -= i;
                        } else {
                              set2.add(i);
                        }
                  }

                  out.println(set1.size());
                  for (int num : set1) {
                        out.print(num + " ");
                  }
                  out.println();

                  out.println(set2.size());
                  for (int num : set2) {
                        out.print(num + " ");
                  }
                  out.println();
            }

            out.flush();
            out.close();
      }
}
