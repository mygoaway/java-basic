package pack;


import pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        User user = new User();
        pack.b.User User = new pack.b.User(); // 같은 이름의 클래스로는 import 하나만 가능하기 때문에 다른 하나는 경로를 작성해야 함.
    }
}
