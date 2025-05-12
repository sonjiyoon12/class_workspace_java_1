package ch02;

/**
 * 문자 데이터 타입
 * char 자료형에 크기는 2byte; - 16bit [][]....[][]
 */

public class DataType2 {

    //코드의 진입점
    public static void main(String[] args) {

        // 단 하나의 문자를 저장하기 위해 사용할 수 있다.

        char charBox;
        charBox = 'A'; // '가' -> 문자타입, "가나다" -> 문자열
        System.out.println(charBox);

        char alhpabetA = 'A';
        char alphabetB = 'B';
        char alphabetBox = alhpabetA;
        System.out.println(alphabetBox);

        // 더 많은 글자를 담고 싶으면
        String temp = "안녕반가워";
        System.out.println(temp);


    } // end of main

} // end of class
