package my_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiNClient {

    private final String name; // 이름 저장 변수 선언
    private Socket socket; // 서버 연결 소켓 객체 선언
    private PrintWriter writerStream; // 서버로 메세지를 전송하는 스트림
    private BufferedReader readStream; // 서버에서 온 메세지 읽는 스트림
    private BufferedReader keyboardReader; // 키보드에서 입력한 메세지 읽는 스트림

    // 이름 저장 생성자
    public MultiNClient(String name) {
        this.name = name;
    }

    // 서버에 5000번 포트로 연결 처리하는 메서드
    private void connectToServer() throws IOException {
        socket = new Socket("localhost",5000);
        System.out.println("connected to the server");
    }

    // 입출력 스트림을 설정하는 처리하는 메서드
    private void setupStream() throws IOException {
        writerStream = new PrintWriter(socket.getOutputStream(),true);
        readStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        keyboardReader = new BufferedReader(new InputStreamReader(System.in));
    }

    // 서버로 부터 온 메세지를 실제로 읽는 행위
    private Thread createdReadThread() {
        return new Thread(() ->  {
            try{
                String serverMessage;
                while((serverMessage = readStream.readLine()) != null){
                    System.out.println("Server Message : " + serverMessage);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    // 키보드에서 입력 받아 서버로 메세지 전송하는 행위
    private Thread createWriteThread () {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    String keyboardMsg;
                    // 키보드 스트림으로 입력 받은 메세지 읽고
                    while((keyboardMsg = keyboardReader.readLine()) != null) {
                        // 출력 스트림으로 서버에 메세지 출력
                        writerStream.println("[" + name + "]" + keyboardMsg);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // 자원을 정리하고 소켓 닫는 행위
    private void cleanup() {
        try{
            // 소켓이 null 이면 닫을 것이 없기 때문
            if(socket != null) {
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 읽기, 쓰기 스레드 생성하고 시작 처리
    private void startThread() throws InterruptedException {
        Thread readThread = createdReadThread(); // 읽기 스레드
        Thread writeThread = createWriteThread(); // 쓰기 스레드

        // 시작 처리
        readThread.start();
        writeThread.start();

        // 스레드가 종료 될 때까지 메인 스레드 종료하지말고 대기해
         readThread.join();
         writeThread.join();
    }

    // 전체 채팅 메서드 동작 시키기
    public void chatRun() {
        try{
            connectToServer();
            setupStream();
            startThread();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }finally {
            cleanup();
        }
    }

    public static void main(String[] args) {
        System.out.println("클라이언트 프로그램 시작");
        MultiNClient nClient = new MultiNClient("***");
        nClient.chatRun();
    }
}
