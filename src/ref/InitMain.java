package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData initData = new InitData();
        System.out.println(initData.value1); // 멤버 변수는 초기화를 하지 않아도 자바에서 알아서 초기화해줌
        System.out.println(initData.value2);
    }
}
