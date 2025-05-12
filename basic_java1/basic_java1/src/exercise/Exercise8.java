package exercise;

import java.util.Scanner;

public class Exercise8 {

    //코드의 진입점
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        boolean flag = true;

        while (flag) {
            System.out.println(" ");
            System.out.println("메뉴 선택");
            System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
            System.out.print("선택: ");
            // 도구를 준비, 값을 활용하기 위해 변수가 필요해.
            int choice = sc.nextInt(); // 키보드에서 정수값을 받을 수 있는 명령어
            if (choice == 1) {
                System.out.println("등록을 선택했습니다.");
            } else if (choice == 2) {
                System.out.println("조회를 선택했습니다.");
            } else if (choice == 3) {
                System.out.println("수정을 선택했습니다.");
            } else if (choice == 4) {
                System.out.println("삭제를 선택했습니다.");
            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다 다시 선택해주세요.");
            }

        }


    } // end of main


} // end of class
