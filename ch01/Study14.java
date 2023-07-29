// package ch01;

class 우유 {

}

class 물 {

}

class 얼음 {

}

class 커피콩 {

}

// DTO
class 커피 {
    String name;
    커피콩 bean;
    물 water;
    얼음 ice;
    우유 milk;
    public 커피(String name, 커피콩 bean, 물 water, 얼음 ice, 우유 milk) {
        this.name = name;
        this.bean = bean;
        this.water = water;
        this.ice = ice;
        this.milk = milk;
    }

    public static 커피 of(String name) {
        커피 coffee = null;

        if(name.equals("아메리카노")){
            coffee = new 커피(name, new 커피콩(), new 물(), new 얼음(), null);
        } else if(name.equals("카페라떼")){
            coffee = new 커피(name, new 커피콩(), new 물(), new 얼음(), new 우유());
        }
        return null;
    }
    
}

// Service
class 커피타는직원 {
    public 커피 getCoffee(String coffeeName) {
        return 커피.of(coffeeName);
    }
}

// Controller
class 주문받는직원 {

    public 커피 getCoffee(커피타는직원 emp, String coffeeName) {
        커피 coffee = emp.getCoffee(coffeeName);
        return coffee;
    }
}



public class Study14 {
    public static void main(String[] args) {
        주문받는직원 server = new 주문받는직원();

         커피타는직원 emp = new 커피타는직원();

         // 고객 - 주문받는 직원한테 아메리카노 주세요
        커피 coffee = server.getCoffee(emp, "아메리카노");
    }
}
