package ch2;

public class ForEx01 {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 10; i > 0; i--) {
      for (int j = 10; j > 10 - i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 1; j < 5 - i; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < i * 2 + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 5; i > 0; i--) {
      for (int j = 0; j < 5 - i; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < (5 - i) * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
