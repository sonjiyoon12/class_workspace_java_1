package ch04;

import java.util.Scanner;

public class WhileTest2 {
    // 코드의 진입점
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("종료하고 싶은 정수값을 입력하시오 : ");

        // for 문 사용했을 때 1 ~ 10 까지의 총합 : 55
        // 위 내용을 while 구문으로 만들어서 총합을 출력하시오.
        // 1 ~ 77 총합?
        int i = 1;
        int sum = 0;
       final int END = sc.nextInt();
        while (i < END) {
            // 1, 2, 3, 4, 5, 6
            sum += i;
            // 초건식에 대한 처리를 잘 확인하자.
            i++;
        }
        System.out.println("sum 총 합 : " + sum);

    } // end of main
} // end of for
