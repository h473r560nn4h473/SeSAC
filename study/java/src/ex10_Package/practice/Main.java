package ex10_Package.practice;

public class Main {
  public static void main(String[] args) {
    {
      Student student = new Student("김실명", 95, 90, 85);
      student.display();
    }

    {
      Book[] books = new Book[3];

      books[0] = new Book("자바의 정석", "남궁성", 30000);
      books[1] = new Book("이펙티브 자바", "조슈아 블로크", 36000);
      books[2] = new Book("클린 코드", "로버트 C. 마틴", 32000);

      System.out.println("----- 도서 목록 -----");
      for(int i=0; i<books.length; i++) {
        books[i].display();
      }

      System.out.println("\n----- 대출/반납 시뮬레이션 -----");
      books[0].borrow();
      books[0].borrow();
      books[1].borrow();
      books[0].returnBook();
      books[2].returnBook();

      System.out.println("\n----- 최종 도서 목록 -----");
      for(int i=0; i<books.length; i++) {
        books[i].display();
      }
    }

    {
      Engine gasolineEngine = new Engine("가솔린", 200);
      Engine dieselEngine = new Engine("디젤", 180);

      Car car1 = new Car("현대", "소나타", gasolineEngine);
      Car car2 = new Car("기아", "K5", dieselEngine);

      System.out.println("----- 초기 자동차 정보 -----");
      car1.display();
      car2.display();

      System.out.println("\n----- 시동 걸기 시뮬레이션 -----");
      car1.startCar();
      car1.startCar();

      System.out.println();
      car2.startCar();

      System.out.println("\n----- 현재 자동차 상태 -----");
      car1.display();
      car2.display();

      System.out.println("\n----- 시동 끄기 시뮬레이션 -----");
      car1.stopCar();
      car1.stopCar();

      System.out.println();
      car2.stopCar();

      System.out.println("\n----- 최종 자동차 상태 -----");
      car1.display();
      car2.display();

      System.out.println("\n----- 엔진 성능 비교 -----");
      System.out.println(car1.getBrand() + " " + car1.getModel() + ": " + car1.getEngine().getHorsepower() + "마력");
      System.out.println(car2.getBrand() + " " + car2.getModel() + ": " + car2.getEngine().getHorsepower() + "마력");
    }
  }
}