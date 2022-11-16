package ch7;

public class InstanceofTest {

  public static void main(String[] args) {
    FireEngine fe = new FireEngine();

    if (fe instanceof FireEngine) {
      System.out.println("this is a FireEngine instance.");
    }

    if (fe instanceof Car) {
      System.out.println("this is a Car instance");
    }

    System.out.println(fe.getClass().getName());
  }
}
