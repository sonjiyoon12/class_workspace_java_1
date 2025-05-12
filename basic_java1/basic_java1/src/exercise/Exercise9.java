package exercise;

public class Exercise9 {

    public static void main(String[] args) {
        // 호출
        greet("길동");

        int sum1 = square(10);
        System.out.println("sum1 : " + sum1);

        String result = signOfNumber(-5);
        System.out.println("result : " + result);

        boolean isAdult = checkAdult(19);
        System.out.println(isAdult);


        int max = findMax(100, 1001);
        System.out.println("max : " + max);




    } // end of main

    // 1.
    // void --> 텅빈 ( 데이터값 모를 경우 설정 )
    static void greet(String greet) {
        System.out.println("안녕하세요 [" + greet + "] 님!");
    }

    static int square(int n1) {
        return n1 * n1;
    }


    static String signOfNumber(int value) {
        if (value == 0) {
            return "ZERO";
        } else if (value > 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    static boolean checkAdult(int age) {
        boolean result = ( age >= 18 );
                return result;
    }

    static int findMax (int n1, int n2) {
       int result = (n1 > n2) ? n1 : n2;
       return result;
    }


} // end of class
