package ch04;

public class S08 {
    public static void main(String[] args) {
        // 터미널에서 ctrl + c  로 강제 종료 가능
        int i = 1;
        while(true) {
            // if(i > 100){
                
            //     System.out.println("확인" +i);
            //     // while 문 내부에서 반복을 멈출 때 사용
            //     break;
            // }
            System.out.println(i);
            if(i > 100){
                
                System.out.println("확인" +i);
                // while 문 내부에서 반복을 멈출 때 사용
                break;
            }
            i++;
            // if(i > 100){
                
            //     System.out.println("확인" +i);
            //     // while 문 내부에서 반복을 멈출 때 사용
            //     break;
            // }

            // break 위치에 따라 결괏값이 달라지니 항상 주의할 필요가 있다.
            
        }
    }
}
