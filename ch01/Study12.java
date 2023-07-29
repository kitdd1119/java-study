// package ch01;

class Sun {

    // 생성자를 private으로 만들어 main에서 생성 가능한 new를 막는다.
    private Sun() {};

    private static Sun sun = null;

    // private Sun은 class 안에 있는 놈들이 다시 호출할 수 있다.
    public static Sun getSun() {
        // 객체를 한 번만 생성 (Singleton)
        if(sun == null) {
            sun = new Sun();
        }
        return sun;
    }
}


public class Study12 {
    public static void main(String[] args) {
        System.out.println(Sun.getSun());
        System.out.println(Sun.getSun());
        System.out.println(Sun.getSun());
        System.out.println(Sun.getSun());
        System.out.println(Sun.getSun());
        System.out.println(Sun.getSun());
    }
}
