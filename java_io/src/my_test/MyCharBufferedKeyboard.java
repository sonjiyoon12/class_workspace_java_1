package my_test;

import java.io.*;

public class MyCharBufferedKeyboard {

    public static void main(String[] args) {
        //문자 기반 스트림을 사용해서 키보드에서 입력한 값을 파일에다가 저장하시오(Append 모드 활성화)
        // 단, 버퍼를 사용해야 합니다.

        try(InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter("push.txt",true);
            BufferedWriter bw = new BufferedWriter(fw)){

            System.out.println("텍스트를 입력하세요");

            String line;
            while((line = br.readLine()) != null && !line.isEmpty()){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("스트림 사용중 오류발생: " + e.getMessage());
        }
    }
}
