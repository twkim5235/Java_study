package ch7;

public class SuperTest {

  public static void main(String[] args) {
    Child child = new Child();

    child.method();
    child.hello();
  }
}

class Parent {

  protected int x = 10;

  protected void hello() {
    System.out.println("hello");
  }

  public int getX() {
    return x;
  }
}

class Child extends Parent {

  int x = 20;

  void method() {
    x = 20;
    System.out.println("x = " + x);
    System.out.println("this.x = " + this.x);
    System.out.println("super.x = " + super.x);
  }

  @Override
  public void hello() {
    super.hello();
    System.out.println("hello world");
  }

  @Override
  public int getX() {
    return x;
  }
}
