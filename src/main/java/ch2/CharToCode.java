package ch2;

import static java.lang.String.format;

public class CharToCode {

  public static void main(String[] args) {
    Character ch = 'A';
    int code = (int) ch;

    System.out.println(format("%c = %d (%#x)", ch, code, code));

    Character hch = '가';
    System.out.println(format("%c = %d (%#x)", hch, (int)hch, (int)hch));
  }
}
