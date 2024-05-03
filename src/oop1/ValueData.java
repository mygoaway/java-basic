package oop1;

public class ValueData {
    int value;

    public void addValue() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }

    public void showValue() {
        System.out.println("최종 숫자 = " + value);
    }
}
