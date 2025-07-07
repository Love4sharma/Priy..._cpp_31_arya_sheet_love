import java.util.Scanner;

public class excitingbet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == b) {
                System.out.println("0 0");
            } else {
                long g = Math.abs(a - b);
                long m = Math.min(a % g, g - (a % g));
                System.out.println(g + " " + m);
            }
        }

        sc.close();
    }
}
