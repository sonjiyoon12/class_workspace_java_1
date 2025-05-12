package exercise;

import java.sql.SQLOutput;

public class TriangleAreaCalculator {

    // 코드의 진입점
    public static void main(String[] args) {

        // 삼각형의 면적을 구하는 코드를 작성해 보자.
        // 밑변 * 높이 / 2 = 삼각형 면적
        final double BASE = 10.0;
        final double HEIGHT = 5.0;
        double area = (BASE * HEIGHT) / 2;
        System.out.println("삼각형 면적 : " + area );


    } // end of main
} // end of class
