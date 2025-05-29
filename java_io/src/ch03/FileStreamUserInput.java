package ch03;

import java.io.*;

/**
 * 문자 기반 스트림을 사용하자.
 * 1. 키보드에서 값을 받아서 파일에 쓰기
 * 2. 다시 그 파일을 읽는 함수를 만들어서 실행하기
 */
public class FileStreamUserInput {

    public static void main(String[] args) {
        // 함수 호출
        // writeUserInputToFile("user_input.txt");

        readFile("user_input.txt");

    } // end of main

    // 키보드에서 입력을 받아 파일에 쓰는 함수를 만들어 보세요
    public static void writeUserInputToFile(String fileName) {
        /**
         * 문자 기반 키보드 입력 스트림 InputStreamReader(System.in) 필요
         * 파일에 텍스트를 쓰는 스트림
         * try-with-resource 로 자원 자동 닫기 처리
         */

        try (InputStreamReader reader = new InputStreamReader(System.in);
             // 두번째 인자값 true -> append 모드 활성화
             FileWriter writer = new FileWriter(fileName, true)) {

            System.out.println("콘솔에서 텍스트를 입력");
            // 한 문자씩 읽고 유니코드 정수값 반환 reader.read()
            int charCode;
            while ((charCode = reader.read()) != -1) {
                writer.write(charCode);
                writer.flush(); // 문자 하나 받고 물 내리기
            }
            System.out.println(fileName + ".txt 파일에 텍스트를 모두 씀.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    // 파일에서 텍스트를 읽는 함수 만들어 보기 - 문자 기반
    public static void readFile(String fileName) {
        /**
         * 문자 기반 입력 스트림
         * 콘솔창에 출력 System.out.println(); 사용
         */
        try (FileReader reader = new FileReader(fileName)) {
            // 한 문자 씩 읽어오기
//            int charCode = reader.read();
//            System.out.println(charCode);
//            System.out.println((char) charCode);
//
            int charCode;
            while ((charCode = reader.read()) != -1) {
                System.out.print((char) charCode);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
