class Temp {
  // 자기 자신을 호출하는 함수인 재귀 함수
  public static int myFunction(int b) {
    int a = 1;
    if (a + b < 10) {
      System.out.println("10보다 작습니다.");
      return myFunction(a + b);
    } else {
      return a + b;
    }
  }
}

// if 문에 a + b > 0 인 식을 넣고 실행을 시키면 터미널이 터진다.
// 그때 밑과 같이 while문으로 된 식을 넣고 실행을 시키면 터미널이 터지지 않는다.
public class S07 {
  public static void main(String[] args) {
    Temp.myFunction(0);

    // while(true){
    // System.out.println("10보다 작습니다.");
    // }
  }
}
