package ch6;

class Car {

  String color;
  GearType gearType;
  int door;

  Car() {
    this("white", GearType.AUTO, 4);
    System.out.println("car의 1번째 생성자");
  }

  Car(String color) {
    this(color, GearType.AUTO, 4);
    System.out.println("car의 2번째 생성자");
  }

  Car(String color, GearType gearType, int door) {
    System.out.println("car의 최종 생성자");
    this.color = color;
    this.gearType = gearType;
    this.door = door;
  }

  @Override
  public String toString() {
    return "Car{" +
        "color='" + color + '\'' +
        ", gearType=" + gearType +
        ", door=" + door +
        '}';
  }
}

enum GearType {
  AUTO,
  MANUAL
}

public class CarTest {

  public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 = new Car("blue");

    System.out.println(c1);
    System.out.println(c2);
  }
}
