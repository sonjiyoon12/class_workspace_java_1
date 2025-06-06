package ch04;

public class ContinueTest1 {
    // 코드의 진입점
    public static void main(String[] args) {

        // continue 구문은 보통 반복문 내부에서 조건(if)와 함께 사용하며,
        // 조건이 맞는 경우(true) 이후 반복문 블럭 내부의 다른 수행문들을 수행하지 않는다.
        // - 무시하고 진행하는 continue 이다.

        // 1부터 100 까지 숫자중에 3의 배수만을 출력
        int num;
        for(num = 1; num <= 100; num++) {
            // 만약 num 값이 3의 배수가 아니라면 ??
            // num = 3, 3/3 != 0 -> false라 출력 후 다시 for 반복진행 ->
            // 4/3 != 0 --> T라서 출력하지않고 for반복진행
            if ( num % 3 != 0) {
                continue;
            }
            System.out.println("num : " + num);
        }



    } // end of main
} // end of class
