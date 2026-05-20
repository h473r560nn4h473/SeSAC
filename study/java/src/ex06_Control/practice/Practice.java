package ex06_Control.practice;

public class Practice {
  public static void main(String[] args) {
    {
      int a = 5;
      int b = 3;
      int sum = a + b;
      int sub = 0;
      if (a > b) {
        sub = a - b;
      } else if (a < b) {
        sub = b - a;
      }

      System.out.println("sum:" + sum + ", sub:" + sub);
    }

    {
      int num1 = 10;
      int num2 = 21;
      char op = '+';

      switch (op) {
        case '+':
          System.out.println(num1 + num2);
          break;
        case '-':
          System.out.println(num1 - num2);
          break;
        case '*':
          System.out.println(num1 * num2);
          break;
        case '/':
          System.out.println(num1 / num2);
          break;
        case '%':
          System.out.println(num1 % num2);
          break;
      }
    }

    {
      int score = 65;
      int grade = 2;

      if ((grade <= 2 && score >= 60) || (grade > 2 && score >= 70)) {
        System.out.println("합격");
      }
    }

    {
      int spin = 1;
      int money = 70;
      while (money <= 100000) {
        spin++;
        money += 70;
        System.out.println(spin + "회 모금액 " + money + "원");
      }
    }
    
    {
      for (int i = 100; i > 0; i -= 10) {
        for (int j = 0; j < 10; j++) {
          System.out.print((i - j) + " ");
        }
        System.out.println();
      }
    }
    
    {
      int n = 5;
      int factorial = 1;
      for (int i = 1; i <= n; i++) {
        factorial *= i;
      }
      System.out.println(factorial);
    }
    
    {
      for (int i = 2; i < 10; i++) {
        for (int j = 1; j < 10; j++) {
          System.out.println(i + "x" + j + "=" + (i * j));
        }
      }
    }
    
    {
      for (int i = 1; i < 10; i++) {
        for (int j = 2; j < 10; j++) {
          System.out.print(j + "x" + i + "=" + (j * i) + " ");
        }
        System.out.println();
      }
    }
    
    {
      for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
    
    {
      for (int i = 5; i >= 1; i--) {
        for (int j = i; j >= 1; j--) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}