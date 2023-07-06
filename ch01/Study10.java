// package ch01;

// import java.util.Optional;

// public class Study10 {
//     public static void main(String[] args) {

//         String str = null;

//         // null 값이 들어올 수 있는 변수는 null 처리를 해주는 것이 좋다.
//         if(str == null) {
//             System.out.println("데이터가 null 입니다.");
//         } else {
//             System.out.println(str.length());
//         }


//         // null 값이 들어올 수 있는 변수를 컨트롤할 때 사용한다.
//         // null 처리를 강제할 수 있다.
//         Optional<String> optionalStr = Optional.of("안녕하세요");

//         if(optionalStr.isEmpty()) {
//             System.out.println("데이터가 null 입니다.");
//         } else {
//             System.out.println(optionalStr.get().length());
//         }

//         System.out.println(optionalStr.orElse("값이 없습니다."));




//     }
// }
