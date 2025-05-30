package my_test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamBasic {

    public static void main(String[] args) {

        // 쓰기 함수 호출
       // writeToFile("aa.txt");

        // 읽기 함수 호출
        readFormFile("aa.txt");
    }

    public static void writeToFile(String fileName) {
        //  1. FileWriter 는 한글자씩 파일에 쓰기
        // 1.1 생성자에 파일이름 명시해주기
        try(FileWriter writer = new FileWriter(fileName)){
            // string 으로 텍스트 선언 내용 입력
            String text = "자바 문자 기반 스트림예제\n";
            // 파일이 없다면 파일 생성해서 텍스트 쓰기
             writer.write(text);
             // 파일이 있다면 추가 내용 쓰기
             writer.write("추가 문자열을 기록합니다.");

             // 스트림을 비우기
             writer.flush();
             // 잘 입력했다면 출력
             System.out.println("파일에 텍스트를 잘 기록 하였습니다.");
         } catch (IOException e) {
            // 오류 발생 시 출력
             System.out.println("파일 쓰기 중 오류 발생: " + e.getMessage());
         }
    }

    public static void readFormFile(String fileName){
        // FileReader 는 한글자씩 텍스트를 읽음
        try(FileReader reader = new FileReader(fileName)){
//            // read()는 한 문자씩 읽어 유니코드 값으로 반환
//            int charCode = reader.read();
//            // 변수 출력
//            System.out.println(charCode);
//            // 문자로 형변환 출력
//            System.out.println((char)charCode);

            // 변수 선언
            int charCode;
            // 한 글자씩 읽어서 변수에 저장하고 -1이 아닐때 까지 반복(끝이 아닐때까지)
            while((charCode = reader.read()) != -1){
                // 문자 형변환으로 출력
                System.out.print((char)charCode);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
