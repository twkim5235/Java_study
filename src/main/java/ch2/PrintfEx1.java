package ch2;

import static java.lang.String.format;

public class PrintfEx1 {

  public static void main(String[] args) {
    byte b = 1;
    short s = 2;
    char c = 'A';

    int finger = 10;
    long big = 100_000_000_000L;
    long hex = 0xFFFF_FFFF_FFFF_FFFFL;

    int octNum = 010;
    int octNum2 = 01; // 1?
    int hexNum = 0x10;
    int binNum = 0b10;

    System.out.println(format("b = %d", b));
    System.out.println(format("s = %d", s));
    System.out.println(format("c = %c, %d", c, Integer.valueOf(c)));
    System.out.println(format("finger = [%5d]", finger));
    System.out.println(format("finger = [%-5d]", finger));
    System.out.println(format("finger = [%05d]", finger));
    System.out.println(format("big = %d", big));
    System.out.println(format("hex = %#x", hex));
    System.out.println(format("octNum = %o, %d", octNum, octNum));
    System.out.println(format("octNum2 = %o, %d", octNum2, octNum2));
    System.out.println(format("hexNum = %x, %d", hexNum, hexNum));
    System.out.println(format("binNum = %s, %d", Integer.toBinaryString(binNum), binNum));
  }
}
