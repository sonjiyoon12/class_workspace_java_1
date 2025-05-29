package ch04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

/**
 * 보조 기반 스트림에 대해서 알아보자.
 * 기반 스트림이 있어야 사용할 수 있다.
 * (InputStream, InputStreamReader, OutputStream, OutputStreamWriter)
 */
public class ByteBufferedKeyboardConsole {

    public static void main(String[] args) {
        // 바이트 기반 스트림 + 버퍼드 스트림
        // System.in.read()
//        BufferedInputStream bis = new BufferedInputStream(System.in);
//        BufferedOutputStream bos = new BufferedOutputStream(System.out);

        try(BufferedInputStream bis = new BufferedInputStream(System.in);
            BufferedOutputStream bos = new BufferedOutputStream(System.out);) {

            /**
             * 보조 스트림을 활용해서 한번에 1024바이트 크기의 버퍼 배열로
             * 데이터를 읽자
             */
            // 버퍼 도구 준비
            byte[] buffer = new byte[1024];
            int byteRead;

            // bis.read(); // 1 바이트 씩 읽음
            // bis.read(buffer); // 1024 바이트 씩 읽음

            while((byteRead = bis.read(buffer)) != -1){
                // System.out.println() 와 같음
                bos.write(buffer, 0, byteRead);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
