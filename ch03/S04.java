package ch03;

public class S04 {
    public static void main(String[] args) {
        // System.out.println(3 > 2);

        // boolean check = 100 >= 100;

        boolean check1 = true && true;
        System.out.println(check1);

        boolean check2 = true && false;
        System.out.println(check2);

        boolean check3 = true || false;
        System.out.println(check3);

        // 계산을 6번함
        boolean check4 = true && true && true && true && true && false;
        System.out.println(check4);
        // 계산을 1번함
        // 로직을 짤 때 and 조건을 걸 때에는 false가 자주나오는 조건을 앞에 건다.
        boolean check5 = false && true && true && true && true && true;
        System.out.println(check5);

        // 계산을 4번
        boolean check6 = false || false || false || true;
        System.out.println(check6);
        // 계산을 1번
        // 로직을 짤 때 or 조건을 걸 때에는 true가 자주나오는 조건을 앞에 건다.
        boolean check7 = true || false || false || false;
        System.out.println(check7);

    }
}
