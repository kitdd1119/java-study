// package ch08;

// // 예외 처리

// public class S01 {
//     public static void main(String[] args) {

//         System.out.println("이전 코드");


//         //try를 쓰지 않고 System.out.println(10 / 0); 이 코드만 넣게되면 
//         // 뒤에 있는 다음 코드라는 메시지를 출력하지 못하게 된다.
//         try { // 이는 예외가 일어날 것 같은 코드를 담는 공간
//             // 예외가 일어날 수 있는 코드
//             System.out.println(10 / 0);
            
//             // catch 특정 예외가 발생했을 때
//             // 프로그램을 멈추지 않고 처리한 뒤 다음으로 넘긴다.
//         } catch(ArithmeticException e) {
//             System.out.println("계산 중 예외가 발생했습니다.");
//         }

//         System.out.println("다음 코드");
//     }
// }
