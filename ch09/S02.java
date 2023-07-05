package ch09;

public class S02 {
    public static void main(String[] args) {
        // 0이상 1미만의 랜덤한 double
        System.out.println("Math.random() : " + Math.random());
        // 절댓값을 출력
        System.out.println("Math.abs(-10) : " + Math.abs(-10));
        // 소수 첫 째자리가 5 이상이면 반올림하여 정수로 리턴한다.
        System.out.println("Math.round(1.5) : " + Math.round(1.47));
        System.out.println("Math.round(1.5) : " + Math.round(1.5));
        // 내림값을 double로 리턴하여 소숫점을 아예 없애버림.
        System.out.println("Math.floor(1.5) : " + Math.floor(1.4));
        System.out.println("Math.floor(1.5) : " + Math.floor(1.7));
        // 올림값을 double로 리턴하여 소숫점이 무엇이든(0이 아니면) 값을 올려버림.
        System.out.println("Math.ceil(1.5) : " + Math.ceil(1.5));
        System.out.println("Math.ceil(1.5) : " + Math.ceil(1.05));
        // 제곱값을 double로 리턴한다. 
        System.out.println("Math.pow(2, 3) : " + Math.pow(2, 3));
        // 루트값을 double로 리턴한다.
        System.out.println("Math.sqrt(4) : " + Math.sqrt(4));
        // 원주율 값을 double로 리턴한다.
        System.out.println("Math.PI : " + Math.PI);
    }
}
