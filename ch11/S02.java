package ch11;

import java.util.ArrayList;
import java.util.List;

public class S02 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        System.out.println(list.size());

        list.add("바나나");

        System.out.println(list.size());

        System.out.println(list);

        list.add("사과");
        list.add("바나나");

        // add 한 순서대로 정렬이 되어있다.
        System.out.println(list);

        // 0 1 2순의 배열 값 중 1을 출력하는 것이니 사과가 출력이 됨.
        System.out.println(list.get(1));

        // 배열 1의 자리에 '멜론'으로 교체
        list.set(1, "멜론");

        System.out.println(list);

        // 첫 번째 배열 삭제
        list.remove(0);

        System.out.println(list);

        // list.

    }
}
