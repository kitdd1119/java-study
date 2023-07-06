package ch11;

import java.util.LinkedList;
import java.util.Queue;

public class S06 {
    public static void main(String[] args) {
        // Queue은 먼저 들어온 값이 먼저 나간다.
        // 선입선출
        // 음식점, 은행 번호표 등의 시스템에 적용되는 것.
        Queue<String> queue = new LinkedList<String>();

        queue.add("사과");
        queue.add("바나나");
        queue.add("멜론");

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);
    }

}
