package my_test;

import java.io.FileOutputStream;

public class MyFileOutputSystem {

    public static void main(String[] args) {
        String data = "Hello, Java FileOutputSystem abc 안녕 반가워";

        try(FileOutputStream fos = new FileOutputStream("out.txt",true)){

            // 문자열 data 값을 배열로 변환
            byte[] bytes = data.getBytes();

            // 바이트 단위로 파일에 데이터 쓰기
            fos.write(bytes);

            System.out.println("파일 출력 완료");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
