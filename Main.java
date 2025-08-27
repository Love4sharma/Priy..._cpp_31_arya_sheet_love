//   brute force approach

// import java.util.*;

// class pair {
//       int value;
//       int index;

//       pair(int value, int index) {
//             this.value = value;
//             this.index = index;
//       }
// }

// public class Monsters {

//       public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int t = sc.nextInt();
//             while (t-- > 0) {
//                   int n = sc.nextInt();
//                   int k = sc.nextInt();
//                   int arr[] = new int[n];
//                   for (int i = 0; i < n; i++) {
//                         arr[i] = sc.nextInt();
//                   }
//                   PriorityQueue<pair> pq = new PriorityQueue<>(
//                               (a, b) -> (a.value != b.value) ? b.value - a.value : a.index - b.index);

//                   for (int i = 0; i < n; i++) {
//                         pq.add(new pair(arr[i], i));
//                   }
//                   int ans[] = new int[n];
//                   int c = 0;
//                   while (!pq.isEmpty()) {
//                         pair top = pq.poll();
//                         top.value -= k;
//                         if (top.value <= 0) {
//                               ans[c++] = top.index + 1;
//                               continue;
//                         }
//                         pq.add(top);

//                   }
//                   for (int ele : ans) {
//                         System.out.print(ele + " ");
//                   }
//                   System.out.println();
//             }
//       }
// }

//   optimized approach

import java.util.*;

public class Main {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int k = sc.nextInt();

                  int[] a = new int[n];
                  for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt() % k;
                        if (a[i] == 0)
                              a[i] = k;
                  }

                  Integer[] ord = new Integer[n];
                  for (int i = 0; i < n; i++)
                        ord[i] = i;

                  // Stable sort: by value desc, then index asc
                  Arrays.sort(ord, (i, j) -> {
                        if (a[i] == a[j])
                              return Integer.compare(i, j);
                        return Integer.compare(a[j], a[i]);
                  });

                  for (int i = 0; i < n; i++) {
                        System.out.print((ord[i] + 1) + " ");
                  }
                  System.out.println();
            }
            sc.close();
      }
}
