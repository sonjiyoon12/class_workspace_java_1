package my_test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {

    private static final int PORT = 5000;
    private Socket socket;
    private OutputStream out;
    private InputStream in;
    private final Scanner scanner = new Scanner(System.in);

    // 서버측에 연걸 시키는 메서드
    private void connectToServer() throws IOException {
        socket = new Socket("localhost",PORT);
        System.out.println("서버와 연결되었어요");
    }

    // 바이트 기반 스트림 준비 메서드
    private void setupStreams() throws IOException {
        out = socket.getOutputStream();
        in = socket.getInputStream();
        System.out.println("소켓과 연결된 바이트 기반 스트림 준비 완료");
    }

    /**
     *  키보드에서 파일 경로 입력 받아서 서버로 파일 보내기
     */

    // 파일 업로드 하는 메서드
    private void uploadFile() {
        System.out.println("보내고 싶은 파일 경로 입력 (예: C:/test.txt)");
        // 스캐너로  문자열 입력을 받아 filePath에 저장
        String filePath = scanner.nextLine();

        // 방어적 코드 작성
        // 파일이 정말 있는지 확인
        File file = new File(filePath);
        if(!file.exists() && !file.isFile()) {
            System.out.println("그 파일은 없거나 잘못됐어요");
            return;
        }

        // 서버측과의 약속
        // 서버측에서 먼저 in.read(100byte), 클라이언트가 100 먼저 보내기로 함
        String fileName = file.getName();
        byte[] nameBytes = fileName.getBytes();
        // 100칸 고정(서버측과의 약속)
        byte[]nameBuffer = new byte[100];
    }


}
