package ch04;

public class S11 {
    public static void main(String[] args) {
        // 1~100 숫자중 짝수만 더하기
        int result = 0;
        for(int i=2; i <= 100; i = i + 2){
            result = result + i;
        }
        System.out.println(result);

    }
}
