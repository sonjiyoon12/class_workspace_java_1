package ch04;

public class ForMainTest3 {
    // 코드의 진입점
    public static void main(String[] args) {

        // 1 ~ 50 정수값 출력하시오. 만약 그 값이 짝수이면 출력하라
        // 반복문에 if 구문을 활용해서 실행에 흐름을 제어할 수 있다.
        for (int i = 1; i < 51; i++) {
            if (i % 2 != 0) {
                // 짝수로 판단할 수 있다. , 홀수로 판단할 수 있다.
                System.out.println(i); // 로깅
            } // if 문 안에 들어가야 if 조건으로 출력이 됨.
        } // end fo for
        // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        int sum = 0;
        for(int i = 1; i < 11; i++){
            sum += i;
        }

        System.out.println("sum 총 합 : " + sum);

    } // end of main
} // end of class
