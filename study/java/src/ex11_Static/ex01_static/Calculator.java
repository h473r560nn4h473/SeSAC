package ex11_Static.ex01_static;

public class Calculator {
  // static
  // 정적 멤버, 클래스 멤버라고 한다.
  // 클래스로 호출하기 때문이다.

  public static final double PI = 3.14159;

  public static int add(int a, int b) {
    return a + b;
  }
}
