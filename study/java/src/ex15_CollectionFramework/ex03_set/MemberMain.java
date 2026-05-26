package ex15_CollectionFramework.ex03_set;

import java.util.HashSet;
import java.util.Set;

public class MemberMain {
  public static void main(String[] args) {
    // 확인할 사항
    // 1. 중복해서 저장해 보기 (중복 저장이 안 되어야 정상)
    // 2. 존재 여부 확인해 보기 (동작해야 정상)
    // 3. 객체 정보 출력해 보기

    Set<Member> members = new HashSet<>();
    members.add(new Member("이름1", 31));
    members.add(new Member("이름2", 31));
    members.add(new Member("이름3", 31));
    members.add(new Member("이름4", 31));
    members.add(new Member("이름4", 31));
    members.add(new Member("이름4", 31));
    members.add(new Member("이름4", 31));
    members.add(new Member("이름4", 31));

    Member target = new Member("이름4", 33);
    if (members.contains(target)) {
      System.out.println(target + " 있음");
    } else {
      System.out.println(target + " 없음");
    }

    for (Member m : members) {
      System.out.println(m);
    }
  }
}
