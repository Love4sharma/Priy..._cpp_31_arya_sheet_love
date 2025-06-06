import java.util.Scanner;

public class coverinwater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // length of the string
            String s = sc.next(); // input string

            boolean continuousThreeEmptyCells = false;
            int totalCountOfEmptyCells = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.' && i + 2 < n &&
                        s.charAt(i + 1) == '.' && s.charAt(i + 2) == '.') {
                    continuousThreeEmptyCells = true;
                    break;
                }
                if (s.charAt(i) == '.') {
                    totalCountOfEmptyCells++;
                }
            }

            if (continuousThreeEmptyCells) {
                System.out.println(2);
            } else {
                System.out.println(totalCountOfEmptyCells);
            }
        }
    }
}