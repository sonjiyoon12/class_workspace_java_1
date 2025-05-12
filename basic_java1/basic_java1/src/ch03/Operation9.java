package ch03;

public class Operation9 {

    // 코드의 진입점
    public static void main(String[] args) {

        int number = 7; // 테스트 할 숫자

        // 1. 삼상 연산자로 홀/짝수 판단
        // String --> 문자열 --> "안녕 반가워"
        String result = (number % 2) == 0 ? "짝수" : "홀수";
        System.out.println("result : " + result);

        String isOk = (5 > 3) ? "진짜" : "가짜";
        System.out.println("isOk : " + isOk);

        // 두 수중에 큰 수를 max 라면 변수에 담고 출력하시오.
        int max = (10 > 1) ? 10 : 1;
        System.out.println(max);


    } // end of main
} // end of class
