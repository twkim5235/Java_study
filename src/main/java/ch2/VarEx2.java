package ch2;

public class VarEx2 {

  public static void main(String[] args) {
    int x = 10, y = 20;
    int tmp = 0;

    System.out.println(String.format("x = %d, y = %d", x, y));

    tmp = x;
    x = y;
    y = tmp;

    System.out.println(String.format("x = %d, y = %d", x, y));
  }
}
