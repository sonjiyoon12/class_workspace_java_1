package exercise;

import java.util.Scanner;

public class Exercise7 {

    //코드의 진입점
    public static void main(String[] args) {

        // 1. for 구문 1부터 100까지 반복하는 반복문작성
        // 만약 i 값이 33이라면 반복문을 멈추는 코드를 작성하시오
        int i;
        for (i = 1; i <= 100; i++) {
            if (i == 33) {
                break;
            }
            System.out.println(i);
        }

        // 2. 1부터 10까지 숫자 중에 홀수면 건너뛰고 짝수만 출력하시오.
        // 출력 결과 예시
        // 1은 홀수, 패스!
        // 짝수 : 2
        // 3은 홀수, 패스!
        // 짝수 : 4
        // ...
        for (i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "는 홀수, 패스!");
                continue;
            }     System.out.println("짝수: " + i);
        }


    } // end of main


} // end of class
