package my_test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1:N 소켓 통신을 이용한 파일 서버
 */

public class MultiNFileServer {
    private static final int PORT = 5000;
    private static final String UPLOAD_DIR = "Uploads/";
    private static int connectedCount = 0;

    // 내부 클래스
    public static class ClientHandler extends Thread {
        private Socket socket;
        private BufferedOutputStream out;
        private BufferedInputStream in;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                // 스트림 준비 완료
                in = new BufferedInputStream(socket.getInputStream());
                out = new BufferedOutputStream(socket.getOutputStream());

                byte[] nameBuffer = new byte[100];
                in.read(nameBuffer); // 한번에 100바이트씩 읽음

                String fileName = new String(nameBuffer).trim(); // 문자열 생성
                System.out.println("파일 이름 수신 : " + fileName);

                File file = new File(UPLOAD_DIR + fileName);
                FileOutputStream fos = new FileOutputStream(file);


                // 바이트로 계속 받아서 파일 읽기
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = in.read()) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }

                System.out.println("서버 컴퓨터에 파일 저장 완료 : " + fileName);

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("소켓 연결 중 오류 발생");
            }
        }
    }

    // 메인 함수
    public static void main(String[] args) {
        System.out.println("Server started ....");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            // 메인 쓰레드는 무한 루프를 돌면서 클라이언트 연결 요청을 기다린다.
            while (true) {
                // Socket socket = serverSocket.accept();
                // ClientHandler <-- 작업자 1이 자신에 동작을 진행시킬 수 있다.
                new MultiNFileServer.ClientHandler(serverSocket.accept()).start();
                connectedCount++;
                System.out.println("클라이언트 연결 됨 : " + connectedCount);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } //end of main

}// end of outer class
