package wrapper;

public class WrapperTest1 {

    public static void main(String[] args) {

        // 박싱(Boxing)
        // 기본 데이터를 래퍼 클래스 객채로 변환하는 과정.
        int num = 10;
        Integer wrappedNum = Integer.valueOf(num); //박싱
        System.out.println(wrappedNum); // toString 재정의 되어 있음

        // 언박싱(Unboxing)
        // 래퍼 클래스 객체를 기본 타입 데이터로 변환하는 과정.
        Integer wrappedNum2 = Integer.valueOf(30);
        int num2 = wrappedNum2.intValue();
        System.out.println("num2 : "+ num2);

        // 편의성 제공 - Java 5부터 도입된 기능입니다.
        // 자동 박싱(Auto-Boxing), 자동 언박싱(Auto-Unboxing)

        Integer autoBoxed = 20; // 자동 박싱 (int(값) --> Integer(..))
        int autoUnboxed = autoBoxed; // 자동 언박싱 (Integer(값) --> int)

    } // end of main

} //end of class
