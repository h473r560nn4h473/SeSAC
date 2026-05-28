package ex10_Package.practice;

public class Student {
  private String name;
  private int math;
  private int english;
  private int science;

  public Student(String name, int math, int english, int science) {
    this.name = name;
    this.math = math;
    this.english = english;
    this.science = science;
  }

  public double getAverage() {
    return (math + english + science) / 3;
  }

  public char getGrade() {
    double avg = getAverage();
    if(avg >= 90) {
      return 'A';
    } else if(avg >= 80) {
      return 'B';
    } else if(avg >= 70) {
      return 'C';
    } else {
      return 'D';
    }
  }

  public void display() {
    System.out.println("----- 학생 정보 -----");
    System.out.println("이름: " + name);
    System.out.println("수학: " + math);
    System.out.println("영어: " + english);
    System.out.println("과학: " + science);
    System.out.println("평균: " + getAverage());
    System.out.println("성적: " + getGrade());
  }
}
