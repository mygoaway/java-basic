package oop1;

public class MusicPlayerData {
    // 캡슐화 => 멤버 변수 + 메서드(기능)

    // 멤버 변수(필드)
    int volume = 0;
    boolean isOn = false;

    // 메서드(기능)
    public void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    public void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    public void volumeUp() {
        volume++;
        System.out.println("음악 플레이어의 볼륨을 증가시킵니다.");

    }

    public void volumeDown() {
        volume--;
        System.out.println("음악 플레이어의 볼륨을 낮춥니다.");
    }

    public void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if(isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
