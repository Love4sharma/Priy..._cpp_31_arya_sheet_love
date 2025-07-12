import java.util.*;

public class ThreeIndices {

    static final String YES = "Yes";
    static final String NOPE = "No";

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 2; i <= n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(YES);
                System.out.println((i - 1) + " " + i + " " + (i + 1));
                return;
            }
        }

        System.out.println(NOPE);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}
