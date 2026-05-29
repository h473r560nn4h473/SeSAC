package ex10_Package.practice;

public class Engine {
  private String engineType;
  private int horsepower;
  private boolean isRunning;

  Engine(String engineType, int horsepower) {
    this.engineType = engineType;
    this.horsepower = horsepower;
    this.isRunning = false;
  }

  public String getEngineType() {
    return engineType;
  }

  public int getHorsepower() {
    return horsepower;
  }

  public boolean isRunning() {
    return isRunning;
  }

  public void start() {
    if(isRunning) {
      System.out.println("[" + engineType + " 엔진] 이미 작동 중입니다.");
    } else {
      isRunning = true;
      System.out.println("[" + engineType + " 엔진] 시동이 걸렸습니다.");
    }
  }

  public void stop() {
    if(!isRunning) {
      System.out.println("[" + engineType + " 엔진] 이미 정지 상태입니다.");
    } else {
      isRunning = false;
      System.out.println("[" + engineType + " 엔진] 시동이 꺼졌습니다.");
    }
  }

  public void display() {
    System.out.println("엔진 타입: " + engineType);
    System.out.println("마력: " + horsepower);
    System.out.println("엔진 상태: " + (isRunning ? "작동 중" : "정지"));
  }
}
