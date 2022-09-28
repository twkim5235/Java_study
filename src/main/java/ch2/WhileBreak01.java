package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileBreak01 {

  public static void main(String[] args) throws IOException {
    int menu = 0; int num = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    outer:
    while (true) {
      System.out.println("(1) square");
      System.out.println("(2) square root");
      System.out.println("(3) log");
      System.out.println("원하는 메뉴 (1 ~ 3)을 선택하세요. (종료:0) > ");

      menu = Integer.parseInt(br.readLine());

      if (menu == 0) {
        break;
      } else if (!(menu >= 1 && menu <= 3)) {
        continue;
      }

      for (; ; ) {
        System.out.println("계산할 값을 입력해주세요. (계산 종료: 0, 전체 종료: 99) > ");
        num = Integer.parseInt(br.readLine());

        if (num == 0) {
          break;
        } else if (num == 99) {
          break outer;
        }

        switch (menu) {
          case 1:
            System.out.println("square: " + num * num);
            break;
          case 2:
            System.out.println("square root: " + Math.sqrt(num));
            break;
          case 3:
            System.out.println("log: " + Math.log(num));
            break;
        }
      }
    }
  }
}
