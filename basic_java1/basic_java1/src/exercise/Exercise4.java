package exercise;

public class Exercise4 {

    //코드의 진입점
    public static void main(String[] args) {

        // 특정 제품 할인행사 - 원래 59.99 -> 30% 할인. 최종 가격을 계산 후 소수점이하버리고 정수부분만 표시
        // 제품 원래 가격과 할인율을 상수로 선언
        // 할인된 가격을 계산하고, 그 결과를 정수로 형변환하여 최종가격 구하기 (할인율 : 원가 *(1 - 할인율))
        // 최종 가격을 출력

        final double COST = 59.99;
        final double DISCOUNT = 0.3;

        int lastCost = (int)(COST * ( 1 - DISCOUNT ));
        System.out.println("  ");
        System.out.println("할인된 가격에 제공하는 이 상품은 단돈 " + lastCost + "$!");

    } // end of main


} // end of class
