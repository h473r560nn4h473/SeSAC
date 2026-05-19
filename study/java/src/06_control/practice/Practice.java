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
        case '+': {
          System.out.println(num1 + num2);
        }
        case '-': {
          System.out.println(num1 + num2);
        }
        case '*': {
          System.out.println(num1 * num2);
        }
        case '/': {
          System.out.println(num1 / num2);
        }
        case '%': {
          System.out.println(num1 % num2);
        }
      }
    }

    {
      int score = 65;
      int grade = 2;

      if ((grade <= 2 && score >= 60) || (grade > 2 && score >= 70))
        System.out.println("합격");
    }

    {
      int spin = 1;
      int money = 70;
      while (money <= 100) {
        spin++;
        money += 70;
        System.out.println(spin + "회 모금액 " + money + "원");
      }
    }
  }
}
