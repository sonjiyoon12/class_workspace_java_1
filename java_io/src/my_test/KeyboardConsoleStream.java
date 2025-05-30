package my_test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardConsoleStream {

    public static void main(String[] args) {
        // 키보드로 문자 읽어오는 스트림
        try(InputStreamReader reader = new InputStreamReader(System.in);
            //PrintWriter 는 문자 기반 출력 스트림
            PrintWriter writer = new PrintWriter(System.out,true)){
            System.out.println("텍스트를 입력");

            int code;
            while((code = reader.read()) != -1){
                // 출력 스트림으로 텍스트 출력
                writer.print((char)code);
            }
            writer.flush(); // 출력하고 즉시 비우기
        } catch (IOException e) {
            System.out.println("입출력 중 오류 발생"); // 입출력 예외처리
        }
    }
}
