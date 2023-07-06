package ch07;

// interface는 '기능'을 의미한다.
// 여러 class에 적용될 수 있다.
interface 입 {
    void cry();
}

interface 눈 {
    void see();
}

interface 날개 {
    void fly();
}

// interface들이 모이면 종족의 특성이 될 수 있다.
abstract class 사람 implements 입, 눈{    
}

class 홍길동 extends 사람 {

    @Override
    public void cry() {
    }

    @Override
    public void see() {
    }

}

class 천사 extends 사람 implements 날개 {

    @Override
    public void cry() {
    }

    @Override
    public void see() {
    }

    @Override
    public void fly() {
    }

}

// interface는 class에서 여러가지를 구현할 수 있다.
class Monkey implements 입, 눈 {

    @Override
    public void cry() {
        System.out.println("우끼");
    }

    @Override
    public void see() {
        System.out.println("바나나 쳐다보기");
    }

}

class Dog implements 입, 눈 {

    @Override
    public void cry() {
        System.out.println("멍멍");
    }

    @Override
    public void see() {
        System.out.println("뼈다귀 쳐다보기");
    }
}

public class S08 {
    public static void main(String[] args) {

    }

}