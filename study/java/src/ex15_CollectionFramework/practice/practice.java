package ex15_CollectionFramework.practice;

import java.util.Arrays;
import java.util.List;

public class practice {
  public static void main(String[] args) {
    {
      List<Integer> answer = Arrays.asList(85, 92, 78, 100, 95);
      System.out.println(answer);
      int sum = 0;
      for (int i = 0; i < answer.size(); i++) {
        sum += answer.get(i);
      }
      System.out.println("총점: " + sum);
      System.out.println("평균 점수: " + (double) (sum / answer.size()));
    }
  }
}
