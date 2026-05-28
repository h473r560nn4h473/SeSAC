package ex12_Inheritance.practice;

public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(4, 5);
    System.out.println("넓이: " + rectangle.getArea());

    Square square = new Square(4);
    System.out.println("넓이: " + square.getArea());
  }
}
