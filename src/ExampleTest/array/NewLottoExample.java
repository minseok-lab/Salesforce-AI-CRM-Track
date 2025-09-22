package exampletest.array;

public class NewLottoExample {
    public static void main(String[] args) {
        // int lotto 배열은 6개의 길이를 갖게 됨
        int[] lotto = new int[6];

        // 로또 번호 배열 길이만큼 반복
        for (int i = 0; i < lotto.length; i++) {
            // 로또 배열 i는 정수값 1부터 45까지의 범위에서 랜덤 생성
            lotto[i] = (int) (Math.random() * 45) + 1;

            // j는 0부터 i길이 까지 하나씩 늘어나며 검토
            for (int j = 0; j < i; j++) {
                // 만약 중복된 값이 존재하면
                if (lotto[i] == lotto[j]) {
                    // i를 감소(한번 더 실행)하고 탈출
                    i--;
                    break;
                }
            }
        }
        
        for (int num = 0; num < lotto.length; num++) {
            System.out.print(lotto[num] + "  ");
        }
    }
}
