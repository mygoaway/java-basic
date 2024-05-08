package poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // kakao 결제
        payService.processPay("kakao", 5000);

        // naver 결제
        payService.processPay("naver", 10000);

        // 잘못된 결제 수단 선택
        payService.processPay("bad", 10000);
    }
}
