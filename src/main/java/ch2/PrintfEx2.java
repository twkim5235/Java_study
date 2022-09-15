package ch2;

import static java.lang.String.format;

public class PrintfEx2 {

  public static void main(String[] args) {
    String url = "www.codechobo.com";

    float f1 = .10f;
    float f2 = 1e1f;
    float f3 = 3.14e3f;
    double d = 1.23456789;

    System.out.println(format("f1 = %f, %e, %g", f1, f1, f1)); //0.10000, 1e-1, 0.100000
    System.out.println(format("f2 = %f, %e, %g", f2, f2, f2)); //10.0000, 1e1, 10.00000
    System.out.println(format("f2 = %f, %e, %g", f3, f3, f3)); // 3140.000, 3.14e+3, 3140.000

    System.out.println(format("d = %f", d));
    System.out.println(format("d = %14.10f", d)); // 전체 14자리중 소수점 10자리

    System.out.println(format("[%s]", url));
    System.out.println(format("[%20s]", url));
    System.out.println(format("[%-20s]", url));
    System.out.println(format("[%.8s]", url));
  }
}
