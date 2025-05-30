package my_test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileStreamUserInput {

    public static void main(String[] args) {
        // 쓰기 함수 호출
        //writeInputToFile("aaa.txt");

        // 읽기 함수 호출
        readFile("aaa.txt");

    }

    // 키보드에서 입력 받아 파일에 쓰는 함수 만들기
    public static void writeInputToFile(String fileName){
        //  InputStreamReader 는 문자 기반 키보드 입력 스트림 System.in 필요
        try(InputStreamReader reader = new InputStreamReader(System.in);
            // FileWriter는 파일을 쓰는 스트림 생성자에 파일이름 넣기
            // append true 로 문자를 기존 내용 뒤에 추가 해준다
            FileWriter writer = new FileWriter(fileName, true)){

            System.out.println("콘솔에서 텍스트 입력");

            int code;
            // reader.read() 한 문자씩 읽고 정수값 반환
            while((code = reader.read())!= -1){
                // code 내용 쓰기
                writer.write(code);
                // 문자 받고 비우기
                writer.flush();
            }
            System.out.println(fileName + ".text 파일에 텍스트를 모두 씀.");
         } catch (Exception e) {
             throw new RuntimeException(e);
         }
    }

    public static void readFile(String fileName) {
        // FileReader 는 파일에서 문자 읽는 스트림
        try(FileReader reader = new FileReader(fileName)){

//            // reader.read() 한 문자씩 읽어 변수에 저장
//            int code = reader.read();
//            System.out.println(code); // 변수 출력
//            System.out.println((char) code); // 문자 형변환 출력

            int code;
            // 한 문자씩 읽어 code 에 저장하고 파일 끝(-1)이 아닐때 까지 반복해서
            // 문자 형 변환해서 출력
            while((code = reader.read()) != -1){
                System.out.print((char)code);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
