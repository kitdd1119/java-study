package ch12;


// 제네릭
class Num <T extends Number>{
    // 필드가 정수일 수도 있고 실수일 수도 있을 경우
    T value;

    public Num(T value) {
        this.value = value;
    }
}


public class S01 {
    public static void main(String[] args) {

        Num num = new Num<Integer>(1);
        // // 1L만 써도 알아서 long타입으로 사용하는구나라고 인식함.
        // Num num = new Num<>(1L);
        // Num num = new Num<Long>(1L);
        // // 이렇게 앞 뒤로 타입을 적어주는 것이 좋다.
        // Num<Long> num = new Num<Long>(1L);
        // // String은 Number에게 상속받는 놈이 아니기에 오류가 발생한다.
        // Num num = new Num<String>("asdasd");

    }
}
