package ch11;

import java.util.HashMap;
import java.util.Map;

public class S04 {
    public static void main(String[] args) {
        // Map은 순서가 없고 key, value로 이루어져 있다.
        // key는 중복이 불가능하고 value는 중복이 가능하다.
        Map<String, String> map = new HashMap<String, String>();

        map.put("사과", "3개");
        map.put("바나나", "3송이");
        map.put("멜론", "2개");
        map.put("딸기", "3박스");

        System.out.println(map);

        // key값이 value값을 가져옴.
        System.out.println(map.get("사과"));

        // 멜론 삭제
        map.remove("멜론");
        // 이름과 값 둘다 중요할 때 사용한다.

        System.out.println(map);
    }
}
