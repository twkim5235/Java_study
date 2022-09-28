package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCaseEx02 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("당신의 주민번호를 입력하세요. (011231-1111222) > ");
    String regNo = br.readLine();

    char gender = regNo.charAt(7);

    switch (gender) {
      case '1':
      case '3':
        System.out.println("남자입니다.");
        break;
      case '2':
      case '4':
        System.out.println("여자입니다.");
        break;
      default:
        System.out.println("유효하지 않은 주민번호입니다.");
        break;
    }

  }

}
