package my_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiThreadClient {

    public static void main(String[] args) {

        System.out.println("클라이언트 측 실행");

        Socket socket = null;

        try{
            // 소켓 선언해서 IP 주소 와 포트 번호 연결
            socket = new Socket("localhost",5000);
            System.out.println("서버 연결 준비완료");

            // 서버측에 문자열 기반으로 데이터 보내기 위한 출력 스트림 준비
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            // 데이터 읽어오는 스트림
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 키보드에서 값을 입력하는 스트림
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 동작 나누기
            // 쓰레드 활용해서 서버로 데이터 읽는 동작 / 람다 표현식
            Thread readThread = new Thread(() -> {
                try{
                    // 서버에서 온 메세지 변수 선언
                    String serverMsg;
                    while((serverMsg = reader.readLine()) != null){
                        if("exit".equalsIgnoreCase(serverMsg)){
                            System.out.println("서버가 채팅을 종료함");
                            break;
                        }
                        System.out.println("서버에서 온 msg : " + serverMsg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("서버측에서 채팅이 종료 되었습니다.");
                }
            });

            // 쓰레드 활용한 서버에게 데이터를 보내는 입력 스트림 / 람다 표현식
            Thread writeThread = new Thread(() -> {
                try{
                    String clientMsg;
                    while((clientMsg = keyboardReader.readLine()) != null) {
                        writer.println(clientMsg);
                        writer.flush();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("메세지 전송 중 오류 발생");
                }
            });

            // 쓰레드 동작 시작
            readThread.start();
            writeThread.start();

            //각 쓰레드 종료 전까지 메인 쓰레드 대기
            readThread.join();
            writeThread.join();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("오류 발생");
        } finally {
            try{
                if(socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("자원 해제 중 오류 발생");
            }
        }
    }
}
