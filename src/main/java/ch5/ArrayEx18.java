package ch5;

public class ArrayEx18 {

  public static void main(String[] args) {
    int[][] score = new int[][]{
        {100, 100, 100},
        {20, 20, 20},
        {30, 30, 30},
        {40, 40, 40}
    };
    int sum = 0;

    for (int[] ints : score) {
      for (int anInt : ints) {
        sum += anInt;
      }
    }

    System.out.println(sum);
  }

}
