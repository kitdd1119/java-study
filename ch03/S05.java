package ch03;

public class S05 {
    public static void main(String[] args) {
        // 논리형 ? 사실이면 : 거짓이면

        int age = 19;
        String man = age > 65 ? "할아버지" : "아저씨";
        System.out.println(man);

        // 삼항 연산자를 겹쳐서 사용하는 경우는 적다. 
        String man1 = age > 65 ? "할어버지" 
        : (age > 20 ? "아저씨" : "학생"); // 괄호로 굳이 감싸지 않아도 됨.
        System.out.println(man1);
    }
}
