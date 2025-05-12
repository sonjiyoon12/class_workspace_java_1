package ch04;

public class ForMainTest1 {

    // 코드의 진입점
    public static void main(String[] args) {

        // 반복문 - 반복적인 패턴이 보인다면 반복문을 생각해 보자.

        // 0 부터 9까지 화면에 출력하시오.
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);

        System.out.println("===================");
        int i;
        //  초기화 식; 조건식 (true, false), 증감식(감소식)
        for (i = 0; i < 10; i++) {
            //수행 구문; 조건식 true 라면 이 부분이 실행이 된다.
            //숫자 0을 i 변수로 치환해 보자. ( 어떤규칙으로 반복되는지 확인하기 )
            // 1. i = 0
            // 2. i = 1
            // 3. i = 2
            // 5. i = 4
            // 6. i = 5
            // 7. i = 6
            // 8. i = 7
            // 9. i = 8
            // 10. i = 9
            System.out.println(i);
        } // end of for  (  '{}(스코프)'에서 반복. 첫 수행 후 증감식 먼저 적용, 그리고 조건식 체크
          //                  --> 9일떄 10으로 올리고 조건식에 10보다 작지않으니 반복문종료.     )

        System.out.println("최종 결과 i 값 + " + i);


    } // end of mian
} // end of class
