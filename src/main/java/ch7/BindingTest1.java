package ch7;

public class BindingTest1 {

  public static void main(String[] args) {
    Parent parent = new Child();
    Child child = new Child();

    System.out.println(parent.getX());
    System.out.println(child.getX());
  }

}
