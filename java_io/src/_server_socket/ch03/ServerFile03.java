package _server_socket.ch03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 서버측 코드
 * 양방향 통신 구현 (1:1 채팅)
 * 키보드에서 값을 받아서 데이터 보내보기
 * 서버측 while 문을 통해서 계속 클라이언트 메시지를 읽을 수 있도록 코딩
 */
public class ServerFile03 {

    public static void main(String[] args) {

        // 준비물
        // 1. 서버 소켓이 필요하다. 포트 번호 5000번
        // 2. 입력 스트림 필요 함(클라리언트의 메세지 수신)
        // 3. 출력 스트림 필요 함(클라이언트의 데이터 전송)

        // 1. 서버 소켓 생성
        ServerSocket serverSocket = null;

        // 서버 소켓에서는 나의 IP 주소를 이미 알고 있다.
        try {
            serverSocket = new ServerSocket(5000);

            // 클라이언트 연결 대기
            Socket clientSocket = serverSocket.accept();
            System.out.println(">>> 클라이언트가 연결 했습니다 <<<");

            // 클라이언트로 부터 데이터를 입력 받을 스트림이 필요한데 --> Socket
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // reader <-- 데이터를 이제 마구 읽을 수 있다.

            // 클라이언트 측과 연결된 소켓에서 출력 스트림을 뽑고 + 문자 기반 스트림을 확장 해 둠
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            // writer <-- 데이터를 클라이언트로 마구 보낼 수 있다.

            // 데이터 송신해보기

            writer.println("난 서버야, client 반가워");
            writer.flush();

            // 데이터 수신해보기
            String message;

            while ((message = reader.readLine()) != null){
                if("exit".equalsIgnoreCase(message)){
                    System.out.println("클라이언트가 채팅을 종료했습니다.");
                    break;
                }
                System.out.println("클라이언트에게 온 메세지 : " + message);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.out.println("소켓 close() 시 오류 발생");
                    e.printStackTrace();
                }
            }
        }
    } // end of main
}
