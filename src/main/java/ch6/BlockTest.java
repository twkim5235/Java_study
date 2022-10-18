package ch6;

public class BlockTest {
  static {
    System.out.println("static 초기화 블럭");
  }

  {
    System.out.println("인스턴스 초기화 블럭");
  }

  public BlockTest() {
    System.out.println("생성자 테스트");
  }

  public static void main(String[] args) {
    System.out.println("BlockTest bt = new BlockTest();");
    BlockTest bt = new BlockTest();

    System.out.println("BlockTest bt2 = new BlockTest();");
    BlockTest bt2 = new BlockTest();
  }

}
