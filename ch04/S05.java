package ch04;

public class S05 {
    public static void main(String[] args) {
        // Math.random()은 0보다 크거나 같고 1보다 작다.
        //  45를 곱하면 0 ~ 44.9999 나온다.
        double num = Math.random() * 45;
        // int로 캐스팅해서 0 ~ 44로 만든다.
        int inNum = (int) num;
        // +1 해주면 1~ 45가 된다.
        int result = inNum + 1;
        System.out.println(result);
    }
}
