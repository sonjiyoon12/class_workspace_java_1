package my_test;

public class MyTest1 {

    // 코드의 진입점
    public static void main(String[] args) {

        // 이전 배웠던 내용 + 복합 대입연산자 활용해서 직접 문제를 만들고 결과를 확인해 봅시다.
        // 문제 - 현재 잔액이 10만원이고 매일 아침 커피로 2천 500원씩 사용한다.
        // 그런데 매일 저녁에 잔액을 8로 나눴을 때 나머지가 2또는 4로 끝나면 8원씩 이자가 지급되는 이벤트를 한다고 한다.
        // 5일 뒤에 총 얼마의 이자가 지급되는지 알아보시오

        int myMoney = 100000;
        int allIncome = 0;

        for (int allDay = 1; allDay <= 5; allDay++) {

            myMoney -= 2500;

            int income = myMoney % 8;
            if (income == 2) {
                allIncome += 8;
            } else if (income == 4) {
                allIncome += 8;
            }
        } // end of for

        System.out.println("총 이자는 " + allIncome + " 원 입니다");


        System.out.println("===============");
        System.out.println(97500 % 8);
        System.out.println(95000 % 8);
        System.out.println(92500 % 8);
        System.out.println(90000 % 8);
        System.out.println(87500 % 8);


    } // end of main
} // end of class
