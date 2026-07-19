public class Loops {
  public static void main(String[] args) {
    int i = 1;
    while (i <= 5) {
      System.out.println(i);
      i++;
    }
    System.out.println("while loop executed");

    int j = 1;
    do {
      System.out.println(j);
      j++;
    } while (j <= 5);
    System.out.println("do while loop executed");

    for (int k = 1; k <= 5; k++) {
      System.out.println(k);
    }
    System.out.println("for loop executed");
  }
}
