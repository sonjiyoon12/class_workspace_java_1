package ch01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;

public class SimpleHttpClient {

    // 메인 메서드
    public static void main(String[] args) {
        // HTTP 통신 : 클라이언트 <--> 서버 (요청과 응답)

        String urlString = "https://www.naver.com/";

        HttpURLConnection connection = null;
        BufferedReader reader = null;

        try{
            // HTTP 통신을 하기 위한 준비물 및 순서

            // 1. URL 객체가 필요하다.
            URL url = new URL(urlString);
            // 2. URL 객체를 사용해서 HTTP 커넥션 객체를 오픈한다.
            connection = (HttpURLConnection) url.openConnection(); // 다운캐스팅

            // 요청 방식 설정 (HTTP 메세지 시작줄 기술이 됨_ --> 데이터 요청
            connection.setRequestMethod("GET");
            // 요청 메세지에 추가로(기본값 있음) 헤더 설정을 할 수 있다.
            connection.setRequestProperty("User-Agent2","Java-HttpClient/1.0");

            // 실제 서버에 통신 요청 처리
            int responseCode = connection.getResponseCode();
            System.out.println("HTTP 응답 코드 확인 : " + responseCode);

            // 방어적 코드 작성
            if(responseCode == 200) {
                System.out.println("요청 성공!");
            } else {
                System.out.println("요청 실패! 코드 : " + responseCode);
                return;
            }

            // 요청이 성공 했다면 --> 응답 HTTP 메세지에서 데이터를 추출할 예정

            // 응답 헤더 정보를 추출해보자.
            System.out.println("\n응답 헤더 정보:");
            System.out.println("Content-Type: " + connection.getContentType()); //어떤 타입으로 보내는지
            System.out.println("Content-Length: " + connection.getContentLength());

            // 응답 본문 읽기(바디에서 데이터 추출)
            reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(),"UTF-8"));

            String line;
            StringBuffer response = new StringBuffer();

            while ((line = reader.readLine()) != null) {
                response.append(line).append("\n");
            }

            // 결과 출력하기
            System.out.println("\n서버 응답 내용");
            System.out.println(response.toString());


        } catch (Exception e) {
            System.out.println("오류 발생 : " + e.getMessage());
            e.printStackTrace();
        } finally {
            // 리소스 닫기
            try{
                if(reader != null) reader.close();
                connection.disconnect();
            } catch (Exception e) {
                System.out.println("리소스를 닫는 도중 오류 발생");
                e.printStackTrace();
            }
        }
    } // end of main
}