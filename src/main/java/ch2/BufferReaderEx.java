package ch2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BufferReaderEx {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    bw.write("두개의 정수를 입력해주세요: ");
    bw.flush();

    String readLine = br.readLine();
    List<Integer> nums = new ArrayList<>();
    Arrays.stream(readLine.split(" ")).forEach(e -> nums.add(Integer.parseInt(e)));

    System.out.println("입력받은 내용 = " + readLine);
    System.out.println("nums = " + nums);
  }

}
