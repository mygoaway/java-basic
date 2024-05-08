package poly.ex.pay1;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // kakao 결제
        payService.processPay("kakao", 5000);
        
        // naver 결제
        payService.processPay("naver", 10000);

        // google 결제(결제 수단 추가)
        payService.processPay("google", 100000);

        // 잘못된 결제 수단 선택
        payService.processPay("bad", 10000);
    }
}
