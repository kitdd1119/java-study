public class Study02 {
    // 한 프로그램 내에 여러 main함수가 있을 수 없다.
    public static void main(String[] args) {
        // 변수
        // 데이터를 자바 프로그램이 실행되는 동안 유지할 때 사용

        // 앞 철자가 소문자인 변수들은 기본형 타입의 변수이다.
        // 기본형 타입 변수( 예약어 첫 글자가 소문자인 타입 )

        // 정수형 데이터를 저장할 때 int를 사용한다. 
        // 소수를 제외한 0을 포함한 양수 음수 
        // int는 +-21억 정도까지 저장됨.
        int num = 1; 

        // 정수형 데이터 int보다 큰 숫자를 저장할 때 사용
        // long은 +- 까지 저장됨.
        // L을 붙여도 되고 안 붙여도 됨.
        long longnum = 2L;

        // 실수형 데이터(무조건 F를 붙여야 함.)
        float floatNum = 1.2F;

        // 실수형 데이터 더 큰 것
        double doubleNum = 1.2;

        // 논리형 데이터
        //boolean타입에 저장할 수 있는 값은 true 와 false  딱 두가지 뿐
        boolean bool = true; // 또는 false

        // 문자형 데이터(캐릭터의 줄임말 char)
        // 작은 따옴표로 감싼다.
        char ch = 'a';

        // 참조형 타입 변수( 예약어 첫 글자가 대문자인 타입 )

        // 문자열 데이터
        // 큰 따옴표로 감싼다.
        String str = "hello world";
    }
}
