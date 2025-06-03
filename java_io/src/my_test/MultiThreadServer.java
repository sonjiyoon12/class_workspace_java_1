package my_test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer {

    public static void main(String[] args) {
        System.out.println("=====서버 실행=====");

        // 소켓 초기화 선언하기
        ServerSocket serverSocket = null;
        Socket clientSocket = null;

        try {
            serverSocket = new ServerSocket(5000);
            // 클라이언트 연결 대기
            clientSocket = serverSocket.accept();
            System.out.println("클라이언트 연결");

            // 키보드 입력 받는  스트림
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 클라이언트 측과 연결된 출력 스트림 클라이언트 소켓에서 출력
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            // 클라이언트 측과 연결된 입력 스트림 클라이언트 소켓에서 입력
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // 동작 나누기
            // 쓰레드 활용해서 서버 키보드 입력 메세지 받는 동작 / 람다 표현식 사용
            Thread keyboardThread = new Thread(() -> {
                try {
                    // 키보드 입력 변수 선언
                    String serverMsg;
                    // 입력 스트림으로 메세지 읽고 출력 스트림으로 메세지 출력
                    while ((serverMsg = keyboardReader.readLine()) != null) {
                        writer.println(serverMsg);
                        writer.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("메세지 전송 오류");
                }
            });

            // 쓰레드를 활용해 클라이언트 측에서 보낸 메세지 읽는 동작 / 람다 표현식 사용
            Thread readThread = new Thread(() -> {
                try {
                    // 클라리언트 메세지 변수 선언
                    String clientMsg;
                    // 입력 스트림으로 메세지 읽고 exit 들어오면 종료 아니면 메세지 출력
                    while ((clientMsg = reader.readLine()) != null) {
                        if ("exit".equalsIgnoreCase(clientMsg)) {
                            System.out.println("클라이언트 채팅 종료");
                            break;
                        }
                        System.out.println("클라이언트로 부터 온 msg : " + clientMsg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("데이터 읽는 도중 종료됨");
                }
            });

            // 쓰레드 동작 시작
            keyboardThread.start();
            readThread.start();

            // 각 쓰레드가 종료될 때 까지 메인 쓰레드 종료 하지마
            keyboardThread.join();
            readThread.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("서버 실행 중 오류 발생 : 포트 이미 사용중인지 확인");
        } finally {
            try {
                if (clientSocket != null) {
                    clientSocket.close();
                }
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("자원 해제 중 오류 발생");
            }
        }
    }
}
