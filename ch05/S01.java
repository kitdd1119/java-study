package ch05;

public class S01 {
    public static void main(String[] args) {
        // 배열 선언 + 초기화
        int[] intArray = new int[5];
        
        // 배열의 요솟값 가져오기
        // int 배열은 초기화할 때 값을 넣지 않으면 모두 0으로 초기화된다.
        System.out.println(intArray[0]);

        // 배열의 값 바꾸기
        intArray[0] = 5;
        System.out.println(intArray[0]);

        // 범위를 넘어선 요소 가져오기
        // IndexOutOfBoundsException
        // index 5 out of bounds for length 5
        System.out.println(intArray[5]); // 에러 발생
    }
}
