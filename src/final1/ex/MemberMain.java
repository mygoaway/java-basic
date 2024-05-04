package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member jay = new Member("mygoaway", "이광재");
        jay.print();
        jay.changeData("jay", "김다영");
        jay.print();
    }
}
