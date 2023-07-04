// package ch07;

// class Skill {
//     String name; // 스킬 이름
//     int damage; // 공격력
//     // alt + insert --> construct
//     public Skill(String name, int damage) {
//         this.name = name;
//         this.damage = damage;
//     }

    
// }

// class Skill_0 extends Skill {
//     public Skill_0() {
//         super("달팽이세마리", 1);
//     }

//     //public Skill_0() 괄호 안에 String name, int damage 이렇게 경로를 알려줘야 함. 
//     public Skill_0(String name, int damage) {
//         // 부모의 생성자를 호출함.
//         // Skill은 name, damage 둘 다 받아야 생성이 되기 때문에
//         // 무조건 부모 생성자를 호출해서 값을 넣어줘야 한다.
//         super(name, damage);
//     }
// }

// // Skill_1 클래스 생성(Skill 상속) / 모든 매개변수를 받는 생성자로 만들기
// class Skill_1 extends Skill {
//     public Skill_1() {
//         super("매직클로 콤포지트", 10);
//     }

//     public Skill_1(String name, int damage) {
//         super(name, damage);
//     }
// }

// class 초보자 {
//     Skill skill_0;

//     // public 초보자() {
//     //     this.skill_0 = new Skill("달팽이세마리", 1);
//     // }

//     public 초보자() {
//         this.skill_0 = new Skill_0();
//     }

//     // 마법사로 전직했을 때 달팽이 스킬이 3으로 변한다.
//     public 초보자(Skill_0 skill_0) {
//         this.skill_0 = skill_0;
//     }
// }

// class 마법사 extends 초보자{
//     Skill skill_1;

//     // public 마법사() {
//     //     this.skill_1 = new Skill("매직클로 콤포지트", 10);
//     // }

//     public 마법사() {
//         super(new Skill_0("달팽이세마리", 3));
//         this.skill_1 = new Skill_1();
//     }
// }

// public class S03 {
//     public static void main(String[] args) {
        
//     }
// }

