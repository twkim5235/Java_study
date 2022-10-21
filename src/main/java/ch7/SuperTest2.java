package ch7;

public class SuperTest2 {

  public static void main(String[] args) {

    Child2 child2 = new Child2(1, 2, 3);
    System.out.println(child2);
  }
}

class Parent2 {
  int x, y;

  Parent2(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Child2 extends Parent2 {

  int z;

  public Child2(int x, int y, int z) {
    super(x, y);
    this.z = z;
  }

  @Override
  public String toString() {
    return "Child2{" +
        "x=" + x +
        ", y=" + y +
        ", z=" + z +
        '}';
  }
}