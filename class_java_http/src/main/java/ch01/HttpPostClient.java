package ch01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpPostClient {

    public static void main(String[] args) {

        String urlString = "https://jsonplaceholder.typicode.com/posts";
        HttpURLConnection connection = null;
        OutputStream os = null; // 서버로 데이터를 보내기 위한 스트림
        BufferedReader reader = null; // 서버의 응답을 받기 위한 리더 스트림

        try{
            // 1 단계: POST 요청을 보낼 URL 설정
            URL url = new URL(urlString);

            // 2 단계 : HTTP 연결 객체 생성
            connection = (HttpURLConnection) url.openConnection();

            // 3 단계: POST 요청을 위한 HTTP 요청 메시지 설정
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            // 추가 헤더 설정 
            connection.setRequestProperty("Content-type","application/json; charset=UTF-8");

            // 4 단계 : 서버 측에 보낼 데이터 준비 (형식 - JSON)
            String jsonData = "{\n" +
                    "  \"id\": 101,\n" +
                    "  \"title\": \"오늘 뭐 먹노\",\n" +
                    "  \"body\": \"난 다이어트 중\",\n" +
                    "  \"userId\": 100\n" +
                    "}";

            // 5 단계 : 서버로 JSON 형식에 문자열을 HTTP 요철 메시지 Body 에 감아서 보낼 예정
            // 5.1 아웃풋 스트림 준비
            os = connection.getOutputStream();
            // 5.2 바이트 단위로 전송
            os.write(jsonData.getBytes("UTF-8")); // UTF-8로 인코딩된 바이트 전송
            os.flush(); // 모든 데이터가 전송되도록 함

            // ----------------------------------------------------------//
            // 응답 처리

            int responseCode = connection.getResponseCode(); // HTTP 헤더의 상태코드 받기
            System.out.println("응답 코드 확인: " + responseCode);
            // 다른 헤더 속성을 현재 출력 안함

            // HTTP 200 -->GET 방식 요청 성공
            // HTTP 201 -->POST 방식 자원 요청 생성 성공

            if(responseCode == 201) {
                System.out.println("정상 요청 성공(자원 생성 요청)");
            } else {
                System.out.println("요청 실패 : " + responseCode);
            }

            // 7 단계 : HTTP 응답 메시지 본문에서 데이터 추출
            reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), "UTF-8"));

            String line;
            StringBuffer response = new StringBuffer();
            while ((line = reader.readLine()) != null){
                response.append(line).append("\n");
            }

            // 8단계 : 서버 응답 출력
            System.out.println("\n서버응답 내용: ");
            System.out.println(response.toString());

        } catch (Exception e) {
            System.out.println("서버에서 오류 발생");
            e.printStackTrace();
        }finally {
            //리소스 닫기
            // .. 생략
        }

    }
}
