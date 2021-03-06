package study.spring.ch2_di;

public class MemberSummaryPrinter extends MemberPrinter {
    @Override
    public void print(Member member) {
        System.out.printf("회원 정보: 이메일=%s, 이름=%s\n", member.getEmail(), member.getName());
    }
}
