package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx01 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = 0, answer = 0;

    answer = (int) (Math.random() * 100) + 1;

    do {
      System.out.println("1과 100 사이의 정수중 하나를 입력하세요: ");
      input = Integer.parseInt(br.readLine());

      if (input > answer) {
        System.out.println("더 작은 수로 시도하십시오");
      } else if(input < answer){
        System.out.println("더 큰 수로 시도하십시오");
      }

    } while (input != answer);

    System.out.println("정답입니다.");

  }
}
