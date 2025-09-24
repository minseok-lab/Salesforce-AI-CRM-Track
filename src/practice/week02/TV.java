package practice.week02;

public class TV {
    private int channel;
    private int volume;
    private boolean power;

    private int MIN_CHANNEL = 1;
    private int MAX_CHANNEL = 255;
    private int MIN_VOLUME = 0;
    private int MAX_VOLUME = 100;

    public TV() {
        this(7, 20, false); // 기본값
    }

    public TV(int channel, int volume, boolean power) {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public void channel(boolean up) {
        if (!power) {
            System.out.println("현재 상태 [ 전원이 꺼져있습니다. ]");
        };

        if (up) { // 채널 올리기
            if (this.channel == MAX_CHANNEL) {
                System.out.println("최대 채널입니다. 현재 채널을 유지합니다.");
            } else {
                this.channel++;
            }
        } else { // 채널 내리기
            if (this.channel == MIN_CHANNEL) {
                System.out.println("최소 채널입니다. 현재 채널을 유지합니다.");
            } else {
                this.channel--;
            }
        }
    }

    public void channel(int channel) {
        if (!power) {
            System.out.println("현재 상태 [ 전원이 꺼져있습니다. ]");
        };

        if (MIN_CHANNEL <= channel && channel <= MAX_CHANNEL) {
            this.channel = channel;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void volume(boolean up) {
        if (!power) {
            System.out.println("현재 상태 [ 전원이 꺼져있습니다. ]");
        };

        if (up) { // 볼륨 올리기
            if (this.volume == MAX_VOLUME) {
                System.out.println("최대 볼륨입니다. 현재 볼륨을 유지합니다.");
            } else {
                this.volume++;
            }
        } else { // 볼륨 내리기
            if (this.volume == MIN_VOLUME) {
                System.out.println("최소 볼륨입니다. 현재 볼륨을 유지합니다.");
            } else {
                this.volume--;
            }
        }
    }

    public void volume(int volume) {
        if (!power) {
            System.out.println("현재 상태 [ 전원이 꺼져있습니다. ]");
        }

        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
    }

    public boolean getPower() {
        return power;
    }

    public void power(boolean on) {
        if (!power && on) {
            System.out.println("전원을 켭니다.");
        } else if (power && !on) {
            System.out.println("전원을 끕니다.");
        }
        this.power = on;
    }

    public void status() {
        if (!power) {
            System.out.println("현재 상태 [ 전원이 꺼져있습니다. ]");
            return;
        }
        System.out.println("현재 상태 [ channel = " + channel + ", volume = " + volume + ", power = On ]");
        return;
    }
}
