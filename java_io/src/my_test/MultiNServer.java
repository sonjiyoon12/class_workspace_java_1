package my_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;



public class MultiNServer {

    // 상수선언으로 포트 번호 지정하기
    private static final int PORT = 5000;
    // List 계열 자료구조인 백터 clientWriters에 출력 스트림 저장
    public static Vector<PrintWriter> clientWriters = new Vector<>();
    // 연결된 횟수 세기
    private static int connectedCount = 0;

    // 내부 클래스
    public static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;

        // 생성자 소켓에 소켓을 받아 저장
        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                // 입력과 출력 스트림 준비 완료
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(),true);

                // 자료 구조에 서버-클라이언트 연결된 출력 스트림 저장해 두고
                // 클라이언트 측과 연결된 출력 스트림을 자료구조에 저장
                clientWriters.add(out);


                // 클라이언트로 부터 메세지를 수신하고 방송할 예정
                // 받는 메세지 변수 선언
                String msg;
                // 메세지를 받아와서 null 이 아닐때 까지 읽기
                while((msg = in.readLine()) != null){
                    System.out.println("Recived: " + msg);
                    for(PrintWriter writer : clientWriters) {
                        writer.println("방송: " + msg);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("소켓 연결 중 오류 발생");
            } finally {
                try{
                    // 소켓이 null이 아니면 종료하고
                    if(socket != null) socket.close();
                    // 자료 구조에 저장된 출력 스트림을 제거해라
                    clientWriters.remove(out);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("소켓 자워 해제 중 오류 발생");
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Server started ...");

        // 서버 소켓을 포트에 연결하고
        try(ServerSocket serverSocket = new ServerSocket(PORT)) {
            // 메인 스레드는 무한 루프를 돌면서 클라이언트 연결 요청을 기다린다.
            while(true) {
                //서버소켓이 클라이언트 요청을 기다리는 중
                Socket clientsocket = serverSocket.accept();

                //  클라이언트소켓을 받아 ClientHandler 스레드 시작
                new ClientHandler(clientsocket).start();
                // 연결된 횟수 세기
                connectedCount++;
                System.out.println("클라이언트 연결 됨: " + connectedCount);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} // end of outer class
