package ch04;

public class S15 {
    public static void main(String[] args) {
        
        // 이중 for문 repeat없이 "*"

        // S13.java의 문제 

        // 2번 4번
        // 구구단 2단 ~ 9단까지

        // 2번 문제
        // *
        // **
        // ***
        // ****
        // *****
        // for (int i = 0; i < 5;i++){
        //     for (int j = 0; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 4번 문제
        // *****
        //  ***
        //   *
        for (int i = 0; i < 3; i++){
            for(int j = 5; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // 구구단
        // for (int i = 2; i <= 9; i++){
        //     for (int j = 1; j <= 9; j++){
        //         int repeat = i * j;
        //         System.out.println(i + "x" + j + "=" + repeat);
        //     }
        //     System.out.println();
        // }
    }
}
