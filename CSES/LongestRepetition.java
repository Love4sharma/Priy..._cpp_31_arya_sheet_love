import java.util.Scanner;

public class LongestRepetition {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String dna = scanner.nextLine();
            scanner.close();

            int maxLength = 1, currentLength = 1;

            for (int i = 1; i < dna.length(); i++) {
                  if (dna.charAt(i) == dna.charAt(i - 1)) {
                        currentLength++;
                  } else {
                        maxLength = Math.max(maxLength, currentLength);
                        currentLength = 1;
                  }
            }

            maxLength = Math.max(maxLength, currentLength);

            System.out.println(maxLength);
      }
}
