package final1;

import static final1.Constant.MAX_USERS;

public class ConstantMain2 {
    // 상수를 도입함으로써, 변경에 유연하게 적용하다.
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        if(currentUserCount > MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
