package ch2;

public class SwitchCaseEx01 {

  public static void main(String[] args) {
    int a = 0;

    switch (a) {
      case 3:
        System.out.println("쓰기 권한");
      case 2:
        System.out.println("읽기 권한");
      default:
      case 1:
        System.out.println("실행 권한");
    }

    System.out.println("Math.random() = " + Math.random() * 3 + 1);
  }

}
