import java.util.*;

public class HalloumiBoxes {

      public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped;

            // Outer loop for all passes
            for (int i = 0; i < n - 1; i++) {
                  swapped = false;

                  // Inner loop for pairwise comparison
                  for (int j = 0; j < n - i - 1; j++) {
                        // Swap if elements are in the wrong order
                        if (arr[j] > arr[j + 1]) {
                              // Swap arr[j] and arr[j+1]
                              int temp = arr[j];
                              arr[j] = arr[j + 1];
                              arr[j + 1] = temp;

                              swapped = true;
                        }
                  }

                  // If no two elements were swapped in inner loop, array is sorted
                  if (!swapped)
                        break;
            }
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int k = sc.nextInt();
                  int arr[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }
                  if (isSorted(arr)) {
                        System.out.println("YES");
                  } else if (k == 1) {
                        System.out.println("NO");
                  } else {
                        // bubbleSort(arr);
                        System.out.println("YES");
                  }
            }
      }

      public static boolean isSorted(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                  // If any previous element is greater than the next, it's not sorted
                  if (arr[i] < arr[i - 1]) {
                        return false;
                  }
            }
            return true;
      }

}