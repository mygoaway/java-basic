package access.a;

// 클래스 레벨에서 접근제어자 => public / default 두가지의 접근 제어자만 존재
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
