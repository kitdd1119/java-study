package ch02;


public class S01 {
    public static void main(String[] args) {
        System.out.println(65);
        // 형 변환
        // 리터럴 앞에 소괄호를 적고 그 안에 타입을 적는다.
        // 괄호를 직접 적어 형 변환을 하는 것을 명시적 형 변환이라 함.
        System.out.println((char) 65);

        // 범위가 적은 타입에서 큰 타입으로 변환할 때는 보통 문제가 없다.
        System.out.println((double) 65);

        // 범위가 큰 타입에서 적은 타입으로 변환할 때는 데이터 소실이 일어날 수 있다.
        System.out.println((int) 65.1);

        // 다른 타입을 계산하게 되면 범위가 큰 타입으로 자동으로 형 변환(캐스팅) 된다.
        // 반대로 괄호를 직접 적지 않고 형 변환이 되는 것을 묵시적 형 변환이라 한다.
        System.out.println(3.0 / 2);
        System.out.println(3.0 / 2.0);
        System.out.println(3.0 / (double) 2);
        
    }
}
