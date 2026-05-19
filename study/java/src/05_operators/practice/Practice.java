public class Practice {
  public static void main(String[] args) {
    {
      int a = 10;
      int b = 5;

      int sum = a + b;
      int diff = a - b;

      System.out.println("sum:" + sum + ", diff:" + diff);
    }

    {
      double x = 10.3;
      double y = 5.5;

      double product = x * y;
      double quotient = x / y;

      System.out.println("product:" + product + ", quotient:" + quotient);
    }

    {
      int number = 98;
      int tens = number / 10;
      int units = number % 10;
      System.out.println("tens:" + tens + ", units:" + units);
    }

    {
      int number = 987;
      int hundreds = number / 100;
      int tens = (number % 100) / 10;
      int units = number % 10;
      System.out.println("hundreds:" + hundreds + ", tens:" + tens + ", units:" + units);
    }

    {
      int m = 3;
      int n = 4;

      System.out.println("m:" + m + ", n:" + n);

      int temp = m;
      m = n;
      n = temp;

      System.out.println("m:" + m + ", n:" + n);
    }

    {
      // 비트 끝자리 0이면 짝수, 1이면 홀수
      int num = 3;
      boolean isEven = false;
      if (num % 2 == 0) {
        isEven = true;
      }

      System.out.println(isEven);
    }

    {
      int a = 1;
      int b = 2;
      int c = 3;
      int max = (a > b) && (a > c) ? a : (b > a) && (b > c) ? b : c;
      System.out.println("max:" + max);
    }

    {
      int month = 3;
      int mod = month % 12;
      String season = mod <= 2 ? "winter" : mod <= 5 ? "spring" : mod <= 8 ? "summer" : "autumn";
      System.out.println(season);
    }

    {
      int data = 255;
      int mask = 0;
      int result = data & mask;
      System.out.println(result);
    }

    {
      int data = 255; // 1111 1111
      int mask = 15; // 0000 1111
      int result = data & mask;
      System.out.println(result); // 15 출력
    }
  }
}
