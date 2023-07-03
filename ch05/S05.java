package ch05;

public class S05 {
    public static void main(String[] args) {
//         // 기본형은 값을 대입한다.
//         int a = 1;
//         int b = a;

//         b = 5;

//         System.out.println(b);
//         System.out.println(a);

// //-----------------------------------------------------
//         // 참조형은 주소를 대입한다. 

//         int[] intArray = {10, 20};
//         int[] intArray1 = intArray;
//         intArray1[0] = 30;

//         System.out.println(intArray[0]);
//         System.out.println(intArray1[0]);

        // 배열 복사
        int[] intArray = {10, 20};
        int[] intArray1 = new int[intArray.length]; // intArray.length는 2와 같다.
        for(int i = 0; i < intArray.length; i++){
            intArray1[i] = intArray[i];
        }
        System.out.println(intArray1[1]);

    }
}
