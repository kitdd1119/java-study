package ch05;

public class S06 {
    public static void main(String[] args) {
        // 이중 배열
        int [][] intArray = new int[][]{ // new int[][]를 생략할 수 있다.
            {10,20,30}, 
            {40,50,60}
        };
        // int[][] intArray1 = new int[2][3];
        // intArray1[0] = new int[]{10,20,30};
        // intArray1[1] = new int[]{40,50,60};

        for(int i = 0; i < intArray.length; i++){
            for (int j = 0; j < intArray[i].length; i++){
                System.out.println(intArray[i][j]);
            }
            // System.out.println(intArray[i][0]);
            // System.out.println(intArray[i][1]);
            // System.out.println(intArray[i][2]);
        }
    }
}
