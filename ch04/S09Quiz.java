package ch04;

public class S09Quiz {
    public static void main(String[] args) {
        // 숫자 1000~1 숫자 중 5의 배수를 제외한 수를 출력하고, 101 미만이 되면 작동을 멈추는 코드 
        int i = 1001;
        while(i > 101) {
            i--;

            if(i % 5 == 0){
                
                continue;
            }
            
            System.out.println(i);
            
        }

    }
}
