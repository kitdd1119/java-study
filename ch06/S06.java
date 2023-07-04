// class 아이템 {
//     String name;
//     int reinforce;

//     public 아이템(String name) {
//         this.name = name;
//         this.reinforce = reinforce;
//         this.reinforce = 0;
//     }

//     public void reinforceItem() {
//         this.reinforce++;
//     }

// }

// class 강화재료 {
//     String name;

//     public 강화재료(String name) {
//         this.name = name;
//     }
// }

// class 강화유틸 {
//     public static 아이템 강화하기(아이템 item, 강화재료 source) {
//         item.reinforceItem();
//         return item;
//     }
// }

// public class S06 {
//     public static void main(String[] args) {
//         아이템 item = new 아이템("목장갑");
//         강화재료 source = new 강화재료("숫돌");

//         아이템 결과아이템 = 강화유틸.강화하기(item, source);

//         System.out.println(결과아이템.reinforce);
//     }
// }
