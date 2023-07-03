// 폴더 경로 알린거임
package test;

public class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10, 5));
    }
}
