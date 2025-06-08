import java.util.ArrayList;
import java.util.Scanner;

public class SequenceGame {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int arr[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }
                  if (n == 1) {
                        System.out.println(1);
                        System.out.println(arr[0]);
                  } else {
                        int c = 1;
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[0]);
                        for (int i = 1; i < arr.length; i++) {
                              if (arr[i] >= arr[i - 1]) {
                                    list.add(arr[i]);
                                    c++;
                              } else {
                                    // int min = Math.min(arr[i - 1], arr[i]);
                                    list.add(arr[i]);
                                    list.add(arr[i]);
                                    c += 2;
                              }
                        }
                        System.out.println(c);
                        for (int i = 0; i < list.size(); i++) {
                              System.out.print(list.get(i) + " ");
                        }
                        System.out.println();
                  }

            }
      }
}
