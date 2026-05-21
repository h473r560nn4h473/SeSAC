package ex12_Inheritance.ex01_extends;

public class Teacher extends Person {
  private String school;

  public Teacher(String name, String school) {
    super(name);
    this.school = school;
  }

  void teach() {
    System.out.println("가르치기");
  }
}
