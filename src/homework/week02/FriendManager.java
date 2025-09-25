package homework.week02;

import java.util.Scanner;

public class FriendManager {
  private static Friend[] FriendArray = new Friend[10];
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    boolean run = true;
    while (run) {
      System.out.println("--------------------------");
      System.out.println("1.추가  2.목록  3.수정  4.종료");
      System.out.println("--------------------------");
      System.out.print("선택> ");
      int selectNo = Integer.parseInt(scanner.nextLine());
      if (selectNo == 1) {
        addFriend();
      } else if (selectNo == 2) {
        friendList();
      } else if (selectNo == 3) {
        editFriend();
      } else if (selectNo == 4) {
        run = false;
      }
    }
    System.out.println("프로그램 종료");
  }

  //친구 추가하기
  private static void addFriend() {
    System.out.print("이름: ");
    String name = scanner.nextLine();
    System.out.print("전화번호: ");
    String hp = scanner.nextLine();
    System.out.print("이메일: ");
    String email = scanner.nextLine();
    
    Friend f = new Friend(name, hp, email);
    for (int i = 0; i < FriendArray.length; i++) {
      if (FriendArray[i] == null) {
        FriendArray[i] = f;
        System.out.println("결과: 친구정보가 추가 되었습니다.");
        break;
      }
    }
  }

  // 친구목록보기
  private static void friendList() {
    for (int i = 0; i < FriendArray.length; i++) {
      Friend f = FriendArray[i];
      if (f != null) {
        f.showInfo();
      }else {
        break;
      }
    }
  }

  //친구 정보 수정
  private static void editFriend() {
    System.out.print("이름: ");
    String fiendName = scanner.nextLine(); // 수정 할 친구이름으로 검색하기 위한 변수
    Friend f = findFriend(fiendName);
    if (f == null) {
      System.out.println("그런 이름의 친구는 없습니다");
      return;
    }
    //친구 정보중 전화번호와 이메일을 수정
    System.out.print("전화번호: ");
    String hp = scanner.nextLine();
    
    System.out.print("이메일: ");
    String email = scanner.nextLine();
    
    f.setHp(hp);
    f.setEmail(email);
    
    System.out.println("결과: 친구정보 수정 완료되었습니다.");
  }

  private static Friend findFriend(String name) {
    Friend f = null;
    for (int i = 0; i < FriendArray.length; i++) {
      if (FriendArray[i] != null) {
        String fName = FriendArray[i].getName();
        if (name.equals(fName)) {
          f = FriendArray[i];
          break;
        }
      }
    }
    return f;
  }
}