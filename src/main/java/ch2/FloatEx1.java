package ch2;

public class FloatEx1 {

  public static void main(String[] args) {
    float f1 = 9.12345678901234567890f;
    float f2 = 1.2345678901234567890f;
    double d = 9.12345678901234567890d;

    System.out.printf("f: %f\n", f1);
    System.out.printf("f1: %24.20f\n", f1);
    System.out.printf("f2: %24.20f\n", f2);
    System.out.printf("d: %24.20f\n", d);
  }
}
