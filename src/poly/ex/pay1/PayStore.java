package poly.ex.pay1;

public abstract class PayStore {
    public static Pay findPay(String option) {
        Pay pay;
        if(option.equals("kakao")) {
            pay = new KakaoPay();
        } else if(option.equals("naver")) {
            pay = new NaverPay();
        } else if(option.equals("google")) {
            pay = new GooglePay();
        } else {
            pay = new DefaultPay();
        }
        return pay;
    }
}
