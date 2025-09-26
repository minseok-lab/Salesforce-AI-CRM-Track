package practice.week02.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str) {
        if ("앱".equals(str)) {
            openApp();
        } else {
            super.execute(str);
        }
    }
 
    protected void openApp() {
        System.out.println("앱 실행");
    }

    protected void call() {
        System.out.println("통화기능시작");
    }

    @Override
    protected void playMusic() {
        System.out.println("다운로드해서 음악재생");
    }
}
