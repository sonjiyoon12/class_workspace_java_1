package ch03;

/**
 * 논리 연산자 복습
 */

public class Operation6 {

    // 코드의 진입점
    public static void main(String[] args) {
        // 쇼핑몰 회원 정보를 설정

        int userAge = 20;  // 사용자의 나이
        int cartTotal = 50_000; // 장바구니 총액(원) 정수에 숫자 단위에_ 언더바 사용가능
        // System.out.println(cartTotal);
        boolean isMember = true; // 회원 여부
        int couponCount = 2; // 보유 쿠폰 개수

        // 1. 무료 배송 조건 : 장바구니 총액이 3만원 이상이고 회원이어야 한다.
        boolean freeShipping = (cartTotal >= 30_000)  &&  isMember;
        System.out.println("무료 배송 가능 여부 : " + freeShipping);

        // 2. 할인 조건 : 나이가 19세 이상이거나 쿠폰이 1개 이상 있어야 함.
        boolean canDiscount = (userAge >= 19)  ||  (couponCount >= 1);
        System.out.println("할인 적용 가능 여부 : " + canDiscount);

        // 3. 구매 제한 조건 : 나이가 19세 미만이고 회원이 아닌 경우 -> &&
        boolean purchaseRestricted = (userAge < 19)  &&  !isMember;
        System.out.println("구매 제한 조건 : " + purchaseRestricted);

        // 4. 이벤트 참여 조건 : 장바구니 총액이 5만원 미만이거나 쿠폰이 3개 미만 참여 가능
        boolean canJoinEvent = (cartTotal < 50_000)  ||  (couponCount < 3);
        System.out.println("이벤트 가능 여부 : " + canJoinEvent);

        // 연습 문제
        // 1. 직접 문제를 만들 식을 세워서 출력하시오.
        // 성적이 60점보다 아래인 사람만 교수님의 1 대 1 추가 학습을 하려고 합니다. 단, 15학점 이상만 참여가능합니다.
        int score = 40; // 성적
        int lectureCount = 14; // 학점

        boolean againStudy = (score < 60)  &&  (lectureCount > 15);
        System.out.println("교수님과 단둘이 수업을 들을 수 있는가? : " + againStudy);




    } // end of main
} // end of class
