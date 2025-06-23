import java.util.*;

public class DeletiveEditing {
      public static void main(String[] args) {
            solve();
      }

      public static void solve() {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                  String s = sc.next();
                  String tStr = sc.next();

                  int[] freq = new int[26];

                  for (char ch : tStr.toCharArray()) {
                        freq[ch - 'A']++;
                  }

                  StringBuilder ans = new StringBuilder();

                  for (int i = s.length() - 1; i >= 0; i--) {
                        char ch = s.charAt(i);
                        int idx = ch - 'A';
                        if (freq[idx] > 0) {
                              ans.append(ch);
                              freq[idx]--;
                        }
                  }

                  ans.reverse();

                  if (ans.toString().equals(tStr)) {
                        System.out.println("YES");
                  } else {
                        System.out.println("NO");
                  }
            }

      }
}
