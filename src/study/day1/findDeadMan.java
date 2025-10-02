package study.day1;

import java.util.ArrayList;
import java.util.List;

public class findDeadMan { // 클래스 이름을 JosephusProblem 등으로 변경하는 것을 권장합니다.
    public static void main(String[] args) {
        // n명의 사람이 원형으로 앉아있을 때
        // 매번 m번째 사람을 제거하면 가장 늦게까지 살아남는 사람은? (조세푸스 문제)
        int n = 10;
        int m = 5;

        int survivor = solveJosephus(n, m);
        System.out.println("최종 생존자: " + survivor + "번");
    }

    /**
     * 조세푸스 문제를 해결하여 마지막 생존자의 번호를 반환합니다.
     * @param n 총 인원 수
     * @param m 제거되는 사람의 간격
     * @return 마지막 생존자의 번호
     */
    public static int solveJosephus(int n, int m) {
        // 1. 살아있는 사람들을 리스트에 추가합니다.
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        // 2. 제거될 사람의 인덱스를 추적합니다.
        int killIndex = 0;

        // 3. 리스트에 한 명만 남을 때까지 반복합니다.
        while (people.size() > 1) {
            // 현재 위치에서 (m-1)만큼 이동한 위치가 다음 제거 대상입니다.
            // 리스트의 크기로 나머지 연산을 하여 원형 구조를 구현합니다.
            killIndex = (killIndex + m - 1) % people.size();

            // 제거될 사람을 출력하고 리스트에서 삭제합니다.
            System.out.println(people.get(killIndex) + "번 사람이 제거되었습니다.");
            people.remove(killIndex);
        }

        // 4. 마지막으로 리스트에 남은 한 사람이 생존자입니다.
        return people.get(0);
    }
}
