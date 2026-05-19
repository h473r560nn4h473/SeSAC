public class ControlEx {
  public static void main(String[] args) {
    {
      int age = 49;
      if (age >= 20) {
        System.out.println("성인");
      } else if (age >= 17) {
        System.out.println("고등학생");
      } else if (age >= 14) {
        System.out.println("중학생");
      } else if (age >= 8) {
        System.out.println("초등학생");
      } else {
        System.out.println("미취학");
      }
    }

    {
      // 월에 따른 계절 출력하기
      int month = 5;
      switch (month % 12 / 3) {
        case 1:
          System.out.println("봄");
          break;
        case 2:
          System.out.println("여름");
          break;
        case 3:
          System.out.println("가을");
          break;
        default:
          System.out.println("겨울");
      }
    }

    {
      // 1 ~ 10
      for(int i=1; i<=10; i++) {
        System.out.println(i);
      }

      // 10 ~ 1
      for(int i=10; i>0; i--) {
        System.out.println(i);
      }
    }
  }
}
