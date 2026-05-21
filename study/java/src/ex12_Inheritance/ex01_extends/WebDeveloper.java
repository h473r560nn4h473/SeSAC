package ex12_Inheritance.ex01_extends;

public class WebDeveloper extends Developer {
  public WebDeveloper(String name, String skill) {
    super(name, skill);
  }

  void webDevelop() {
    System.out.println("웹개발하기");
  }
}
