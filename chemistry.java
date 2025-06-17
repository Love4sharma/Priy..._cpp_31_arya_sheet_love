import java.util.Scanner;

public class chemistry {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long t = sc.nextLong();

            while (t-- > 0) {
                  long n = sc.nextLong();
                  long k = sc.nextLong();
                  String s = sc.next();

                  int[] freq = new int[26];
                  for (int i = 0; i < s.length(); i++) {
                        freq[s.charAt(i) - 'a']++;
                  }

                  long oddCount = 0;
                  for (int i = 0; i < 26; i++) {
                        if (freq[i] % 2 != 0) {
                              oddCount++;
                        }
                  }

                  if (oddCount > k + 1) {
                        System.out.println("NO");
                  } else {
                        System.out.println("YES");
                  }
            }

            sc.close();
      }
}