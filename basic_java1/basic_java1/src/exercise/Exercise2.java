package exercise;

public class Exercise2 {


    // 코드의 진입점
    public static void main(String[] args) {

        // 1. 데이터 10, 100, 1000을 변수 선언과 동시에 초기화하고 화면에 출력

        int data = 10;
        System.out.println(data);
        data = 100;
        System.out.println(data);
        data = 1000;
        System.out.println(data);


        // 2. int ageBox 상자에 20을 담기

        int ageBox = 20;

        // 3. int a = 1; int b = 3; 선언하고 a와 b에 담겨 있는 값을 서로 스위칭
        // 힌트 - 임시 변수를 사용하여 값을 교환

        int a = 1;
        int b = 3;

        int c = b;
        b = a;
        a = c;

        System.out.println(" a : " + a);
        System.out.println(" b : " + b);

        System.out.println("===============================");



        // i, j, k 변수 선언 및 초기화하고 한단계씩 뒤로 스위칭해보시오.

        int i = 1;
        int j = 3;
        int k = 5;

        // 우선 i를 담을 상자를 준비한다.
        int l = i;
        // i 의 값은 다른 곳으로 옮겼으니 k의 값을 i로 옮긴다. ( 한단계 뒤로 )
        i = k;
        // j 의 값도 필요하므로 새로운 상자에 옮겨 둔다.
        int m = j;
        // 이제 옮겨둔 j의 값(= m) 을 k로 옮긴다. ( 한단계 뒤로 )
        k = m;
        // 이제 옮겨뒀던 i의 값( = l ) 을 j로 옮긴다.
        j = l;

        System.out.println(" i : " + i);
        System.out.println(" j : " + j);
        System.out.println(" k : " + k);








    } // end of main

} // end of class
