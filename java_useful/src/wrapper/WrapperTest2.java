package wrapper;

public class WrapperTest2 {

    public static void main(String[] args) {
        // 도전 문제
        // double 데이터 타입을 래퍼 클래스로 변환

        //  박싱 예제코드를 작성하시오
        double num = 2.5;
        Double wrappedNum = Double.valueOf(num);
        System.out.println(wrappedNum);

        // 언박싱
        Double wrappedNum2 = Double.valueOf(5.5);
        double num2 = wrappedNum2.doubleValue();
        System.out.println(wrappedNum2);

        // 자동 박싱과, 자동 언박싱 코드를 작성하시오.
        Double autoBoxed = 6.7;
        double autoUnBoxed = autoBoxed;


        char alphabet = 'A';
        Character wrappedAlphabet = Character.valueOf(alphabet);
        System.out.println(wrappedAlphabet);

        Character wrappedAlphabet2 = Character.valueOf('B');
        char alphabet2 = wrappedAlphabet2.charValue();
        System.out.println(alphabet2);

        Character autoBoxed2 = 'C';
        char autoUnBoxed2 = autoBoxed2;
        System.out.println(autoBoxed2);

    } // end of main
} // end of class
