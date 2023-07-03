package ch03;

public class S01 {
    public static void main(String[] args) {
        int num = 10;

        int num2 = 30;
        // int num3 = num2++;
        int num4 = ++num2;
        // 증감 연산자 
        // 연산자가 함수 앞에 있을 때 계산이 다 끝난 다음에 값이 대입이 된다.
        // 연산자가 함수 뒤에 있을 때 대입이 된 후에 계산이 시작된다.
        // System.out.println(num++);
        System.out.println(++num);
        System.out.println(num);
        // System.out.println(num3);
        System.out.println(num4);
    }
}
