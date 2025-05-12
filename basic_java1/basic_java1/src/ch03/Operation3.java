package ch03;

public class Operation3 {

    // 코드의 진입점
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 5;

        // 비교 연산자를 생각할 때. 비교 연산자 자체를 주어로 바라보자.
        //               10 < 5
        boolean result = n1 < n2;

        System.out.println(result);

        System.out.println(n1 >  n2);
        System.out.println(n1 >= n2);
        System.out.println(n1 <= n2);
        System.out.println(100 <= 100);
        System.out.println(100 == 100);
        System.out.println(n1 == n2); // false
        System.out.println(n1 != n2); // true(2개 같지않으니 사실)
        System.out.println(5 != 1); // true(2개 같지않으니 사실)
        System.out.println(20 != 20); // false

        // 연산자 자체를 주어로 바라 보자.






    } // end of main
} // end of class
