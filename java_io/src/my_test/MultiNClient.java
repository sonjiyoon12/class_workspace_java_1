package my_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiNClient {

    private final String name;
    private Socket socket;
    private PrintWriter writerStream; // 서버로 메세지를 전송하는 스트림
    private BufferedReader readStream;
    private BufferedReader keyboardReader;

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
}
