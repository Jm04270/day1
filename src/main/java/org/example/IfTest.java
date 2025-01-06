package org.example;

public class IfTest {

    public static void main(String[] args) {

        // 랜덤 int 값 0.0 - 0.999 * 6 = 5.999
        int value = (int)(Math.random() * 6) + 1; // 0,1,2

        System.out.println(value);

        int oddEven = value % 2; // 2로 나눈 나머지 0,1

        /*// 만일 oddEven값이 0이면 짝수 출력 > boolean(참/거짓)
        if (oddEven == 0) {
            System.out.println("짝수");
            return;
        }
        System.out.println("홀수");
        // 만일 oddEven값이 1이면 홀수 출력*/

        // 삼항연산자 조건식(결과) ? 참인 경우 결과 : 거짓인 경우 결과
        String result = oddEven == 1 ? "홀수" : "짝수";

        System.out.println(result);

    }
}
