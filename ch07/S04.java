// package ch07;

// // 모든 스킬들의 콩통적인 부분을 세팅한다.
// // MAX_POINT 모든 스킬들이 공통적으로 사용하는 변하지 않는 값을 세팅(static final)
// // 스킬마다 바뀔 수 있는 부분 name, point, champ는 필드(멤버변수)로 작성한다.
// class Skill {
//     static final int MAX_POINT = 5;
//     String name;
//     int point;
//     Champ champ;

//     public Skill(String name, Champ champ) {
//         this.name = name;
//         this.champ = champ; // this와 붙어있는 champ는 int point 밑에 있는 champ를 가리킴.
//         // 
//         this.point = 0;
//     }

//     // override할 때 이 부모와 같아야 함.
//     public int getDamage() {
//         return 0;
//     }

//     public void plusPoint() {
//         if(this.point >= MAX_POINT){
//             this.point = MAX_POINT;
//             System.out.println("포인트를 더 이상 올릴 수 없습니다.");
//             return;
//         }
//         point++;
//     }
// }

// // 부모가 필요로하는 정보는 넘겨주고 내가 부모와 다르게 커스텀을 할 부분을 세팅한다. 
// class Volly extends Skill {
//     public Volly(Champ champ){
//         super("일제사격", champ);
//     }

//     // override를 사용하려면 부모가 가지고 있는 메소드 형태와 똑같이 해야한다.
//     // 그 상태에서 내용만 바꿔 세팅한다.
//     @Override
//     public int getDamage() {
//         // 고정 데미지 20 / 35 / 50 / 65 / 80
//         // + 캐릭터 공격력 * 1.0

//         // 스킬을 찍지 않았을 때
//         if(point < 1) {
//             System.out.println("스킬을 사용할 수 없습니다.");
//             return super.getDamage();
//         }

//         int damage = (int)(20 + (15 * (point - 1)) + (this.champ.ad * 1.0));

//         return damage;
//     }

    

    

// }
// // 챔피언의 공통적인 부분들을 만들어준다.
// class Champ {
//     // 물리 공격력
//     int ad;
//     Skill skill;

//     public Champ(int ad, Skill skill) {
//         this.ad = ad;
//         this.skill = skill;
//     }

    
//     // public Champ(int ad) {
//     //     this.ad = ad;
//     // }
    
// }

// // 챔피언의 공통적인 부분을 이어 받되
// // 개별 캐릭터의 특징을 다시 세팅해 준다.
// class 애쉬 extends Champ {
//     public 애쉬() {
//         // 1. 상속받는 객체가 생성됨.
//         // 2. super를 통해서 객체 안의 필드에 값을 초기화해줌.
//         super(100, null);

//         // 3. 현재 class의 객체가 생성됨.
//         // 4. 현재 객체 안의 필드에 값을 넣어줌.
//         this.skill = new Volly(this);
//     }
// }

// // 스킬 이름 : 필트오버 피스메이커
// // 고정 공격력 : 50 90 130 170 210
// // + 캐릭터 공격력 * 1.25 / 1.45 / 1.65 / 1.85 / 2.05
// class Peace extends Skill {
//     public Peace(Champ champ) {
//         super("필트오버 피스메이커", champ);
        
//     }

//     @Override
//     public int getDamage() {
//         // int damage = 0;
//         if(point < 1) {
//             System.out.println("스킬을 사용할 수 없습니다.");
//             return super.getDamage();
//         }
//         // } else if(point == 1){
//         //     damage = (int)(50 + (40 * (point - 1)) + (this.champ.ad * 1.25));
//         // } else if(point == 2){
//         //     damage = (int)(50 + (40 * (point - 1)) + (this.champ.ad * 1.45));
//         // } else if(point == 3){
//         //     damage = (int)(50 + (40 * (point - 1)) + (this.champ.ad * 1.65));
//         // } else if(point == 4){
//         //     damage = (int)(50 + (40 * (point - 1)) + (this.champ.ad * 1.85));
//         // } else if(point == 5){
//         //     damage = (int)(50 + (40 * (point - 1)) + (this.champ.ad * 2.05));
//         // } else{
//         //     ;
//         // }

//         int damage = (int) (50 + (40 * (point - 1)) + (this.champ.ad * (1.25 + (0.2 * (point - 1)))));        

//         return damage;
//     }
// }

// class 케이틀린 extends Champ{
//     public 케이틀린() {
//         // 필요한 스킬 Peace
//         super(100, null);

//         this.skill = new Peace(this);
        
//     }
// }

// public class S04 {
//     public static void main(String[] args) {
//         // // 참조형 변수에 주솟값을 아직 모르는 상태에서
//         // // 초기화를 해주려고 하는 경우 null을 사용한다.
//         // String str = null;
//         // System.out.println(str);
//         // str = new String("홍길동이");
//         // System.out.println(str);
//         // // 더 이상 쓸모없는 객체에 null을 입력한다.
//         // str = null;

//         // 애쉬 champ1 = new 애쉬();

//         // System.out.println(champ1.skill.getDamage());

//         // champ1.skill.plusPoint();

//         // System.out.println(champ1.skill.getDamage());

//         // champ1.skill.plusPoint();

//         // System.out.println(champ1.skill.getDamage());

//         // // 케이틀린 생성
//         // 케이틀린 chapm2 = new 케이틀린();
//         // // 케이틀린의 Peace의 데미지 가져오기
//         // System.out.println(chapm2.skill.getDamage());
//         // // 스킬 포인트 가져오기
//         // chapm2.skill.plusPoint();

//         // System.out.println(chapm2.skill.getDamage());
//         // chapm2.skill.plusPoint();
//         // System.out.println(chapm2.skill.getDamage());
//         // chapm2.skill.plusPoint();
//         // System.out.println(chapm2.skill.getDamage());
//         // chapm2.skill.plusPoint();
//         // System.out.println(chapm2.skill.getDamage());
//         // chapm2.skill.plusPoint();
//         // System.out.println(chapm2.skill.getDamage());
//         // chapm2.skill.plusPoint();

//         // 상속을 받으면 부모의 타입으로 공통화하여 사용할 수 있다.
//         Champ[] champArray = new Champ[2];

//         champArray[0] = new 애쉬();
//         champArray[1] = new 케이틀린();

//         for (int i = 0; i < champArray.length; i++){
//             champArray[i].skill.plusPoint();

//             // 항상 같은 메소드를 사용하기에 
//             // 메소드 이름에 대한 고민을 할 필요가 없어서 신뢰성이 높아진다.
//             System.out.println(champArray[i].skill.getDamage());
//         }

//     }
// }
