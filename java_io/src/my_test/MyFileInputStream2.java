package my_test;

import java.io.FileInputStream;

public class MyFileInputStream2 {

    public static void main(String[] args) {

        try(FileInputStream in = new FileInputStream("a.txt")){
            int readData;

            while((readData = in.read()) != -1){
                System.out.print((char)readData);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
