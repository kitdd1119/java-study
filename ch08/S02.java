// package ch08;




// public class S02 {
//     public static void main(String[] args) {
//         int[] intArray = {10, 20};
//         // 1
//         // try {
//         //     System.out.println(10 / 0); // 여기서 에러 발생하면 밑으로 내려가지 않음.
//         //     System.out.println(intArray[2]); // 이는 실행조차 되지 않음.
            
//         //     // ArithmeticException
//         //     // ArrayIndexOutOfBoundsException
//         // } catch (ArithmeticException e) {
//         //     System.out.println("계산 중 예외가 발생했습니다.");
//         // }

//         // 2
//         // try {
//         //     // 에러가 날 확률이 있는 것이 2개이기에
//         //     // catch문도 2개를 넣어줘야 된다.
//         //     System.out.println(intArray[2]); 
//         //     System.out.println(10 / 0); 
            
//         // 3
//         //     // 즉, 발생할 수 있는 모든 에러에 대한 처리를 각각 해주는 것이 좋다.
//         // } catch (ArithmeticException e) {
//         //     System.out.println("계산 중 예외가 발생했습니다.");
//         // } catch(ArrayIndexOutOfBoundsException e1) {
//         //     System.out.println("배열 검색 범위를 넘어섰습니다.");
//         // } 
//         // 실행 순서는 sout의 배열을 먼저 실행하고 밑의 계산과 첫 번째 catch는 실행조차 되지 않는다.


//         // 4 
//         try {
//             System.out.println(intArray[2]); 
//             System.out.println(10 / 0); 

//             // 중요한 코드가 아닐 경우에는 한꺼번에 처리할 수 있다.
//             // Exception은 catch문의 최상위 예외 클래스이다.
//         } catch (Exception e) {
//             System.out.println("예외가 발생했습니다.");
//         } 
//     }   
// }
