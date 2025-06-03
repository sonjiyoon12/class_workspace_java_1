package _client_socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 클라이언트 측 코드
 * 준비물
 * 1. 서버측 컴퓨터의 IP 주소와 포트 번호를 알고 있어야 한다.
 * 2. 소켓이 필요하다.(네트워크 통신의 표준 규약을 지켜야 하니깐)
 * 3. 서버측으로 데이터를 전달 하려면 출력 스트림이 필요 하다.
 */
public class ClientFile {

    public static void main(String[] args) {

        // 생성자 - 연결하고자 하는 컴퓨터 IP 주소, 포트번호 필요
        // 만약 내 컴퓨터에 접근 하고 싶다면 localhost 도 사용 가능하다.
        Socket socket = null;
        try {
            new Socket("localhost", 5000);

            // 서버로 데이터를 보내기 위한 준비물이 필요 하다.
            // 출력 스트림이 필요하다 (문자)

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("Hello, Server ~~~!!!!");
            writer.flush(); // 물을 내리다

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    } // end of main
}
