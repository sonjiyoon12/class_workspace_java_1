package my_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyFileStream {

    public static void main(String[] args) {
        String data = "Hello, Java FileOutputSystem abc abc 안녕 반가워";

        try (FileInputStream in = new FileInputStream("my1.txt");
             FileOutputStream fos = new FileOutputStream("my2.txt")) {
            int readData;
            while ((readData = in.read()) != -1) {
                System.out.print((char) readData);
                fos.write(readData);
            }

            byte[] dataBytes = data.getBytes();
            fos.write(dataBytes);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
