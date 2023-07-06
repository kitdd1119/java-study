package ch01;

class Person {
    // 인스턴스의 사적인 속성은 private으로 숨긴다.
    private String name;
    private boolean male;


    public Person(String name, boolean male) {
        this.name = name;
        this.male = male;
    }

    // 인스턴스의 사적인 속성을 외부에서 요청할 때
    // 가공해서 전달할 수 있다. 
    // boolean을 제외한 나머지 타입은 get~을 사용한다.
    public String getName() {
            return this.name.substring(0, 1) + "씨 입니다.";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    // boolean은 get 대신에 is를 사용할 수 있다.
    public boolean isMale() {
        return this.male;
    }

    // @Override 와 같은 것들을 어노테이션이라 함. 
    // 주석은 사람이 보라고 만든 설명인데, 
    // 어노테이션은 컴파일러 또는 jvm 등이 읽을 수 있게 만든 설명
    // @Override 와 같이 적어도 되고 안적어도 되는 경우가 있다.
    // 상황에 따라 필수적으로 적어야 되는 어노테이션도 있다.
    // 프로그램(컴파일러, jvm)은 어노테이션은 참고해서 특수한 기능을 수행할 수 있다.
    // 예를 들어 @Override 부모의 메소드를 사용하지 않고 새로운 로직을 사용하겠다는
    public String toString() {
        return "저는 " + this.name + "이고 " + (this.male ? "남자" : "여자") + "입니다.";
    }

    // public boolean isfeMale() {
        // return this.female;
    // }
    

    
}

public class Study06 {
    public static void main(String[] args) {
        // 사람이 태어남.
        Person person = new Person("홍길동", true);

        // 겉으로 봐서는 사람의 이름을 알 수 없다. (private)
        // System.out.println(person.name);


        // 너 이름이 뭐야?
        System.out.println(person.getName());

        // 너 남자니?
        System.out.println(person.isMale());

        // 너에 대해 설명해줘.
        // 인스턴스를 print하면 toString 메소드가 실행된다.
        System.out.println(person);
        System.out.println(person.toString());

        Person person2 = new Person("김치", false);

        System.out.println(person2);

        // person2 별명
        Person nick = person2;

        System.out.println(nick);

        // 김치를 남자로 성전환
        person2.setMale(true);

        System.out.println(person2);

        // 김치를 임꺽정으로 이름 변견
        person2.setName("임꺽정");

        System.out.println(person2);
        
    }
}
