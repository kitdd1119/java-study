// package ch07;
// // 내부 클래스 중 인스턴스 클래스는 메모리 누수 등 
// // 문제가 발생할 수 있어서 특별한 경우가 아니면 잘 쓰지 않는다.

// // 삼성공장
// // 갤럭시 생산

// // 공장 설계도
// class 삼성공장 {
//     // 내부 클래스
//     // static이 없는 인스턴스 클래스
//     // 스마트폰 설계도
//     class 갤럭시{

//     }
//     class 냉장고 {

//     }
// }

// public class S09 {
//     public static void main(String[] args) {
//         // 공장 설계도에게 폰을 만들어 달라는 느낌
//         // 만들어지지 않음.
//         // new 삼성공장.갤럭시();

//         // 공장을 상상
//         삼성공장 factory;

//         // 공장을 짓는다.
//         factory = new 삼성공장();

//         // 공장에서 새 갤럭시 폰을 만듦.
//         삼성공장.갤럭시 phone = factory.new 갤럭시();
//         삼성공장.냉장고 njg = factory.new 냉장고();

//         factory = null;

//         삼성공장 factory1 = new 삼성공장();

//         factory1. new 갤럭시();
//     }
// }
