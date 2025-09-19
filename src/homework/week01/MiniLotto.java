package homework.week01;

public class MiniLotto {
    public static void main(String[] args) {
        // int lotto 배열은 6개의 길이를 갖게 됨
        int[] lotto = new int[6];

        // 로또 번호 배열 길이만큼 반복
        for (int i = 0; i < lotto.length; i++) {
            // 로또 배열 i는 정수값 1부터 45까지의 범위에서 랜덤 생성
            lotto[i] = (int) (Math.random() * 45) + 1;
            // 로또 번호 6개를 출력합니다.
            System.out.print(lotto[i] + " ");
        }
    }
}
