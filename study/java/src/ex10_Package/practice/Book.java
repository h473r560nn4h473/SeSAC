package ex10_Package.practice;

public class Book {
  private String title;
  private String author;
  private int price;
  private boolean isBorrowed;

  public Book(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.isBorrowed = false;
  }

  public void borrow() {
    if (isBorrowed) {
      System.out.println("[" + title + "]" + "은(는) 이미 대출 중입니다.");
    } else {
      isBorrowed = true;
      System.out.println("[" + title + "]" + "을(를) 대출했습니다.");
    }
  }

  public void returnBook() {
    if (isBorrowed) {
      isBorrowed = false;
      System.out.println("[" + title + "]" + "을(를) 반납했습니다.");
    } else {
      System.out.println("[" + title + "]" + "은(는) 대출 중이 아닙니다.");
    }
  }

  public void display() {
    System.out.println("제목: " + title);
    System.out.println("저자: " + author);
    System.out.println("가격: " + price);
    System.out.println("대출 상태: " + (isBorrowed ? "대출 중" : "대출 가능"));
    System.out.println("------------------------------");
  }
}
