package ex15_CollectionFramework.ex02_list;

import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // 배열 리스트 (ArrayList) 다루기
    // 배열과 같은 원리로 동작
    
    // 1. 생성 (생성 시점에 타입 결정)
    List<String> members = new ArrayList<>();

    // 2. 요소 추가하기
    members.add("문자열1");
    members.add("문자열2");
    members.add("문자열3");
    members.add("문자열4");

    // 3. 요소 확인
    System.out.println(members);
    System.out.println(members.get(0));
    System.out.println(members.get(1));
    System.out.println(members.get(2));
    System.out.println(members.get(3));

    // 4. 길이 확인
    System.out.println(members.size());

    // 5. 요소 삭제하기
    String removed = members.remove(0);
    System.out.println("삭제된 요소:" + removed);
    boolean isRemoved = members.remove("문자열1");
    System.out.println(isRemoved ? "삭제 성공" : "삭제 실패");
    System.out.println(members);

    // 6. 요소 존재여부 확인
    String target = "문자열3";
    if (members.contains(target)) {
      System.out.println(target + " 있다.");
    } else {
      System.out.println(target + " 없다.");
    }

    // 7. for 문 순회하기 (같은 값을 반환하는 반복적인 메서드 호출 지양)
    for(int i=0, length = members.size(); i<length; i++) {
      System.out.println(members.get(i));
    }
  }
}
