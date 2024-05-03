package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // this를 강제로 사용해서, 지역 변수(매개변수)와 멤버 변수를 눈에 보이도록 구분
        // 최근 IDE 발전으로 구분해주기 때문에 변수명이 다른 경우에는 this 를 넣을 필요는 없다.
        nameField = nameParameter;
    }
}
