package ch6;

public class PrimitiveParamEx {

  public static void main(String[] args) {
    ExampleClass ec = new ExampleClass();

    ec.printAB();

    printEC(ec);

    ec.printAB();
  }

  public static void printEC(ExampleClass ec) {
    ec.changeAB(3, 4);
  }

  static class ExampleClass {

    int a = 1;
    int b = 2;

    public int getA() {
      return a;
    }

    public int getB() {
      return b;
    }

    public void printAB() {
      System.out.println("a, b: " + a + ", " + b);
    }

    public void changeAB(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }

}
