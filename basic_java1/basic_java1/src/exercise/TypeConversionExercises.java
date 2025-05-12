package exercise;

// 코드의 진입점
public class TypeConversionExercises {

    public static void main(String[] args) {

        int a = 300;
        double b = a;
        // b를 콘솔에 출력한다면 예상 결과는 ??

        // 문제
        double c = 5.67;
        int d = (int) c;

        //문제
        float floatNUM = 4.5f;
        int intNum = (int)floatNUM;
        // intNum -> 4;
        System.out.println(intNum);

        //문제
        double largeValue = 150.75;
        byte byteValue = (byte)largeValue;
        System.out.println(byteValue);

        // 특정 제품 할인행사 - 원래 59.99 -> 30% 할인. 최종 가격을 계산 후 소수점이하버리고 정수부분만 표시
        // 제품 원래 가격과 할인율을 상ㅇ수로 선언
        // 할인된 가격을 계산하고, 그 결과를 정수로 형변환하여 최종가격 구하기
        // 최종 가격을 출력




    } // end of main
} // end of class
