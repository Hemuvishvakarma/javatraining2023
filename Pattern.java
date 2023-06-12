/*public class Pattern {
  public static void main(String[] args) {
    int n = 7; // number of lines
    for (int i = 0; i < n; i++) { // loop for each line
      for (int j = 0; j < n - i - 1; j++) { // loop for spaces
        System.out.print("#");
      }
      for (int k = 0; k < 2 * i + 1; k++) { // loop for stars
        System.out.print("*");
      }
      System.out.println(); // new line
    }
  }
}*/
public class Pattern {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}