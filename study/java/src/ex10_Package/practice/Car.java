package ex10_Package.practice;

public class Car {
  private String brand;
  private String model;
  private Engine engine;

  Car(String brand, String model, Engine engine) {
    this.brand = brand;
    this.model = model;
    this.engine = engine;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public Engine getEngine() {
    return engine;
  }

  public void startCar() {
    System.out.println("[" + brand + " " + model + "] 시동을 겁니다.");
    engine.start();
  }

  public void stopCar() {
    System.out.println("[" + brand + " " + model + "] 시동을 끕니다.");
    engine.stop();
  }
}
