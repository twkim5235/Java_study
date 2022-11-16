package ch7;

public class SingletonTest {

  public static void main(String[] args) {
    Singleton instance = Singleton.getInstance();
  }
}

final class Singleton {

  private static Singleton s = new Singleton();

  private Singleton() {

  }

  public static Singleton getInstance() {
    if (s == null) {
     return s = new Singleton();
    }
    return s;
  }

}
