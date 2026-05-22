package ex13_Abstract.ex01_Polymorphism;

public class Americano extends Espresso {
  public Americano(String coffeeBean) {
    super(coffeeBean);
  }

  @Override
  public void taste() {
    System.out.println("덜쓴맛");
  }

  @Override
  public void info() {
    System.out.println("아메리카노");
    super.info();
  }

  @Override
  public void drink() {
    System.out.println("아메리카노 마신다.");
  }
}
