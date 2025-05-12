package ch03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfTest5 {

    // 메인함수(코드의 진입점)

    public static void main(String[] args) {

        // 키보드에서 값을 받을 도구 준비
        Scanner sc = new Scanner(System.in);

        System.out.println("성적을 입력하세요 : ( 0 ~ 100 ) ");
        // 만약 저 범위 수가 잘못 입력 된다면 -> 잘못된 입력입니다. 출력
        int score = sc.nextInt(); // 키보드 정수 값을 받을 수 있는 명령문
        char grade = 'x';

        // 저 범위안에 grade 가 들어가야함. 그래서 표시가 되어야함.


        // 100 ~ 90점 --> A 학점 입니다.

        if ((score <= 100) && (score >= 90)) {
            grade = 'A';
        } else if ((score < 90) && (score >= 80)) {
            grade = 'B';
        } else if ((score < 80) && (score >= 70)) {
            grade = 'C';
        } else if ((score < 70) && (score >= 60)) {
            grade = 'D';
        } else if ((score < 60) && (score >= 0)) {
            grade = 'F';
        }

        // 만약 잘못된 값이 들어 왔다면 아래 구문 출력 안할 수 있도록 코드를 수정하시오.
        if ((score > 100) || (score < 0)) {
            // && (논리 곱) 이면 160 입력하면 160 > 100 높으니 T,  0보다는 크니깐 F 결론은 F로 else가 출력됨.
            // 그러니 || (논리 합) 이면 둘 중 하나라도 맞으면 수행.
        } else {
            System.out.println("당신에 학점은 " + grade + " 입니다.");
        }

        if(grade != 'x') {
        System.out.println("당신의 학점은 : " + grade + "입니다.");
        }
        // if는 수행될 수도! 안될 수도 있다는 것을 명심.
        // 해석하면 grade가 x와 같지않으면 "당신의 학점은 ~ 입니다"를 수행한다.
        // 아니라면 수행 하지 않는다.





    } // end of main

} // end of class
