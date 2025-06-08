import java.util.Scanner;

public class TargetPractice {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int t = scanner.nextInt(); // Number of test cases
            scanner.nextLine(); // Consume the newline

            while (t-- > 0) {
                  char[][] target = new char[10][10];

                  // Input the target grid
                  for (int i = 0; i < 10; i++) {
                        String line = scanner.nextLine();
                        target[i] = line.toCharArray();
                  }

                  int ans = 0;
                  for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                              if (target[i][j] == 'X') {
                                    if (i == 0 || i == 9 || j == 0 || j == 9) {
                                          ans += 1;
                                    } else if (i == 1 || i == 8 || j == 1 || j == 8) {
                                          ans += 2;
                                    } else if (i == 2 || i == 7 || j == 2 || j == 7) {
                                          ans += 3;
                                    } else if (i == 3 || i == 6 || j == 3 || j == 6) {
                                          ans += 4;
                                    } else {
                                          ans += 5;
                                    }
                              }
                        }
                  }
                  System.out.println(ans);
            }
      }
}
