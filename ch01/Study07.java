// package ch01;

// import lombok.AllArgsConstructor;
// import lombok.Getter;
// // 매개변수 : parameter / argument
// // 이 NoArg는 argument가 없다.
// // AllArg
// import lombok.NoArgsConstructor;
// import lombok.Setter;
// import lombok.ToString;

// // lomdok 라이브러리

// // 어노테이션을 읽어서 생성자를 만들어 준다.
// @AllArgsConstructor
// @NoArgsConstructor
// // getName, steName 등 필드의 데이터를 읽거나 수정하는 메소드를 자동으로 만들어준다.
// @Getter
// @Setter
// // 인스턴스의 정보를 정리해서 보여주도록 toString을 오버라이딩 한다.
// @ToString
// class Cat {
//     private String name;
//     private boolean male;

//     // lombok 사용 중에도 변경하고 싶은 메소드만 작성하면
//     // 나머지는 기본적으로 작성이 되고 직접 작성한 것은 덮어 씌워진다.
//     public String getName() {
//         return this.name + "입니다.";
//     }

    
// }








// public class Study07 {
//     public static void main(String[] args) {
//         // 고양이 태어남
//         Cat cat = new Cat("야옹이", true);

//         // 넌 이름이 뭐니
//         System.out.println(cat.getName());

//         // 넌 수컷이니
//         System.out.println(cat.isMale());

//         // 이름 바꾸기
//         cat.setName("냐옹이");

//         // 너에 대해 알려줘
//         // cat 또는 cat.toString()
//         System.out.println(cat);
//     }
// }
