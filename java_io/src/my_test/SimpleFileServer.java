package my_test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1:1 소켓 통신을 활용한 파일 서버 만들기
 */
public class SimpleFileServer {

    // 서버 포트 번호
    private static final int PORT = 5000;
    // 파일 저장 디렉토리
    private static final String UPLOAD_DIR = "Uploads/";

    // 함수 만들어 보기
    private static void handleClient(Socket socket) {
        try(InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream()) {

            // 동작 흐름 생각해보기(클라이언트에서 파일이름 + 바이트 덩어리)
            byte[] nameBuffer = new byte[100];
            in.read(nameBuffer);

            // 실제 파일 읽어서 파일명 --> 바이트로 변환
            String fileName = new String(nameBuffer).trim();
            System.out.println("파일 이름 수신 : " + fileName);

            // 파일 만드는 방법 -> 메모리상에 new File(파일경로 + 파일이름)
            // 파일 객체를 메모리에 띄운다
            File file = new File(UPLOAD_DIR + fileName);
            FileOutputStream fos = new FileOutputStream(file);

            // 바이트로 파일 받아와서 계속 읽기
            byte[] buffer = new byte[4096];
            int byteRead;
            // 읽을 데이터가 없으면 종료 (-1)
            while((byteRead = in.read()) != -1){
                // 받아온 buffer 파일을 0 부터 byteRead 만큼 읽는다
                fos.write(buffer,0,byteRead);
            }
            System.out.println("서버 컴퓨터에 파일 저장 완료 : " +fileName);

            out.write("파일 업로드 완료:".getBytes()); // 문자열을 바이트 배열로 변환
            out.write(fileName.getBytes());
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("클라이언트의 연결 요청을 기다립니다...");

            // 클라이언트 연결 요청을 기다리고 수락
            try(Socket connectedClientSocket = serverSocket.accept()){
                System.out.println("클라이언트 연결 됨 ...");
                // 클라이언트 연결을 받아서 handleClient 동작을 실행
                handleClient(connectedClientSocket);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
