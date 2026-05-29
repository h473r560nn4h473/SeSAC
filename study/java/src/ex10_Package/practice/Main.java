package ex10_Package.practice;

public class Main {
  public static void main(String[] args) {
    {
      Student student = new Student("가명", 90, 90, 80);
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

      System.out.println("----- 대출/반납 시뮬레이션 -----");
      books[0].borrow();
      books[0].borrow();
      books[1].borrow();
      books[0].returnBook();
      books[2].returnBook();

      System.out.println("----- 최종 도서 목록 -----");
      for(int i=0; i<books.length; i++) {
        books[i].display();
      }
    }
  }
}
