package ch06.sec08.exam04;

public class Hello {
    String text = "";

    Hello(String s) {
        this.text = s;
    }

    void printText() {
        // System.out.println(this.text.length());
        // System.out.println(this.text.charAt(0));
        // "안녕하세요 세일즈포스 AI CRM"
        // 한문장씩 아래로 출력되게
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
