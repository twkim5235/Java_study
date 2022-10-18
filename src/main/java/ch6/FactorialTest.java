package ch6;

import java.util.function.IntBinaryOperator;

public class FactorialTest {

  static int[] memory;

  public static void main(String[] args) {
    int n = factorial(5);
    System.out.println(n);

    memory = new int[11];
    int f = fibonacci(10);
    System.out.println(f);
  }

  static int factorial(int n) {
    if (n == 1) {
      return n;
    }
    return n * factorial(n - 1);
  }

  static int fibonacci(int n) {
    if (memory[n] != 0) {
      return memory[n];
    }
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return n;
    }

    return memory[n] = fibonacci(n - 1) + fibonacci(n - 2);
  }

  public void add(int a, int b) {
    return;
  }

  public long add(long a, long b) {
    return a + b;
  }
}
