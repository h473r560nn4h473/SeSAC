package ex07_Array.practice;

import java.util.Arrays;

public class practice {
  public static void main(String[] args) {
    {
      int[] numbers = { 4, 7, 9, 12, 17, 19, 24, 28, 30 };
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
      }
      System.out.println("합계 " + sum + ", 평균 " + (sum / numbers.length));
    }

    {
      int[] numbers = { 42, 17, 93, 120, 117, 59, 24, 28, 39 };
      int min = numbers[0];
      int max = numbers[0];
      for (int i = 0; i < numbers.length; i++) {
        if (min > numbers[i]) {
          min = numbers[i];
        } else if (max < numbers[i]) {
          max = numbers[i];
        }
      }
      System.out.println("최대 " + max + ", 최소 " + min);
    }

    {
      String[] seasons = { "spring", "summer" };
      String[] temp = new String[4];
      System.arraycopy(seasons, 0, temp, 0, seasons.length);
      seasons = temp;
      seasons[2] = "autumn";
      seasons[3] = "winter";

      System.out.println(Arrays.toString(seasons));
    }

    {
      int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
      for (int i = 0; i < numbers.length / 2; i++) {
        int temp = numbers[i];
        numbers[i] = numbers[numbers.length - 1 - i];
        numbers[numbers.length - 1 - i] = temp;
      }
      System.out.println(Arrays.toString(numbers));
    }

    {
      int[] numbers = { 1, 2, 3, 4, 5, 0 };
      boolean result = true;
      for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i] > numbers[i + 1]) {
          result = false;
        }
      }
      System.out.println(result);
    }

    {
      char[] uppers = new char[26];
      char[] lowers = new char[26];

      for (int i = 0; i < 26; i++) {
        uppers[i] = (char) ('A' + i);
        lowers[i] = (char) ('a' + i);
      }

      System.out.println(Arrays.toString(uppers));
      System.out.println(Arrays.toString(lowers));
    }

    {
    }

    {
      int[][] apt = {
          { 2, 5 },
          { 3, 4 },
          { 1, 4 },
          { 2, 3 },
          { 3, 3 }
      };
      for (int i = 0; i < apt.length; i++) {
        System.out.println((i + 1) + "층 : " + (apt[i][0] + apt[i][1]) + "명");
      }
    }

    {
    }

    {
    }
  }
}
