package ch03;

public class Operation10 {

    // 코드의 진입점
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 500;

        int max;

        //  n1이 n2보다 큰가 ? 맞으면 n1(true) : 틀리면 n2(flase); --> 100 > 500 ? 틀리다 : 500출력
        max = (n1 > n2) ? n1 : n2;
        System.out.println("max : " + max);

    } // end of main
} // end of class
