// // dog앞에서
// // 쉬프트 에프 6을 누르면 전체 코드를 바꿀 수 있음
// class Dog {
//     String name;
//     int position;

//     public Dog(String name, int position) {
//         this.name = name;
//         this.position = position;
//         System.out.println(this.name + "가 태어났습니다.");
//     }

//     public Dog(String name) {
//         this(name, 0);
//     }

//     public void moveRight() {
//         this.position++;
//         System.out.println(this.name + "가 오른쪽으로 이동");
//     }

//     public void moveLeft() {
//         this.position--;
//         System.out.println(this.name + "가 왼쪽으로 이동");
//     }

// }

// public class S02 {
//     public static void main(String[] args) {
//         Dog dog = new Dog("멍멍이");

//         // 유저가 캐릭터를 움직임
//         dog.moveRight();
//         dog.moveLeft();

//         // 고양이 위치 확인
//         System.out.println(dog.position);

//     }

// }