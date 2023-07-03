package ch04;

public class S09 {
    public static void main(String[] args) {
        // continue
        // 코드를 이동시킬 때 ctrl + shift + 위, 아래 방향키
        int i = 0;
        while(i < 100) {
            i++;
            if(i % 2 != 0){ // 이 조건에서는 sout 작동 안하겠다.
                // continue를 사용한 위치에서 현재 반복 회차를 중지한다.
                // 즉, if문 안의 continue 밑에 있는 코드는 실행되지 않는다.
                continue; // 배치 위치를 잘 지정해야 함.
            }
            System.out.println(i);
        }
    }
}
