import java.util.Scanner;

public class ABbalance {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  String s = sc.next();
                  if (s.length() == 1) {
                        System.out.println(s);
                        continue;
                  }

                  int c1 = CountOccurencesOfString("ab", s);
                  int c2 = CountOccurencesOfString("ba", s);
                  if (c1 == c2) {
                        System.out.println(s);
                        continue;
                  } else if (c1 > c2) {
                        StringBuilder sb = new StringBuilder(s);
                        while (c1 > c2) {
                              int index = sb.toString().lastIndexOf("ab");
                              if (index != -1) {
                                    sb.setCharAt(index + 1, 'a');
                              }
                              c1--;
                        }
                        System.out.println(sb.toString());
                  } else {
                        StringBuilder sb = new StringBuilder(s);
                        while (c2 > c1) {
                              int index = sb.toString().lastIndexOf("ba");
                              if (index != -1) {
                                    sb.setCharAt(index + 1, 'b');
                              }
                              c2--;
                        }
                        System.out.println(sb.toString());
                  }
                  sc.close();

            }
      }

      public static int CountOccurencesOfString(String s, String s1) {
            int ans = 0;
            // int n=s.length();
            for (int i = 0; i < s1.length(); i++) {
                  if (i + 2 <= s1.length() && s1.subSequence(i, i + 2).equals(s)) {
                        ans++;
                  }
            }
            return ans;
      }
}
