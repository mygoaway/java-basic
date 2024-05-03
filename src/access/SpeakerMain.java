package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        // System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200; => private 접근 오류로 컴파일 오류(좋은 오류) 발생
        // speaker.showVolume();
        // 접근 제어자 목적 : 통제를 하기위한 목적
    }
}
