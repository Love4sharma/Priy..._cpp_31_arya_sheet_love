import java.util.*;

public class DoremyPaints {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt(); // number of test cases
            while (t-- > 0) {
                  int n = sc.nextInt();
                  Map<Integer, Integer> map = new HashMap<>();

                  for (int i = 0; i < n; i++) {
                        int m = sc.nextInt();
                        map.put(m, map.getOrDefault(m, 0) + 1);
                  }

                  if (map.size() >= 3) {
                        System.out.println("No");
                  } else {
                        List<Integer> freq = new ArrayList<>(map.values());
                        if (freq.size() == 1 || Math.abs(freq.get(0) - freq.get(1)) <= 1) {
                              System.out.println("Yes");
                        } else {
                              System.out.println("No");
                        }
                  }
            }

      }
}
