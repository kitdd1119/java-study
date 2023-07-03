package ch02;

import java.text.MessageFormat;

public class S02 {
    public static void main(String[] args) {
        String name = "지드래곤";
        int age = 34;

        // 문자열 사이에 변수를 넣고 싶을 때에는 문자열을 더해준다.
        // 보기에 깔끔하지 않고 사용하기 불편하다.
        String str2 = "롤체할 " + name + age + "구함";
        
        String str = "롤체할 누구 구함";
        String str1 = "롤체할 " + "누구 " + "구함";
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        // 형식화된 출력(printf) 
        System.out.printf("롤체할 %s이고 %d세 입니다.\n", name, age);
        System.out.printf("\"롤체할 %s이고 %d세 입니다.\"", "고양", 2);

        // 소수점 단위를 제한할 수 있다.
        System.out.printf("\n%.2f\n",10.0 / 3);
        // 잘린 소수점이 0.5 이상이면 자동으로 반올림 된다.
        System.out.printf("%.2f\n" ,3.6666666);

        // 문자열 포맷팅 / 문자열 보간법
        String str3 = String.format("롤체할 %s\n", "길동이");
        System.out.println(str3);

        String str4 = MessageFormat.format("롤체할 {0} {1}살 {2}\n", "다나카", 30, "입니다.");
        System.out.println(str4);
    }
}
