package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 생성자 장점
        // 1. 중복 호출 제거
        // 2. 데이터 반영관련 메서드를 별도로 생성 및 호출이 필요했음
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 20, 80);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct member : members) {
            System.out.println(member.name + ", " + member.age + ", " + member.grade);
        }
    }
}
