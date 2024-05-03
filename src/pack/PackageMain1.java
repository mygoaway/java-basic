package pack;


import pack.a.User;
import pack.a.User2;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지인 경우, import 불필요

        User user = new User(); // import 사용으로 패키지 경로 삭제, new pack.a.User
        User2 user2 = new User2();
    }
}
