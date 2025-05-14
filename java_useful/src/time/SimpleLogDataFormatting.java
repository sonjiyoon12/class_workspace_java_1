package time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class SimpleLogDataFormatting {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("a hh시 mm분");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("지금 시간1 : " + now.format(formatter));
        System.out.println("지금 시간 시 분 초 : " + now.format(formatter1));
        System.out.println("지금 시간2 : " + now.format(formatter2));
        System.out.println("------------------------");

        // 현재 날짜
        LocalDate today = LocalDate.now();
        System.out.println("오늘 날짜는 " + today);

        // 현재 날짜와 시간
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("현재 날짜와 시간 : " + now1);
        System.out.println("--------------------------");

        // 50일 후
        LocalDate after50Days = today.plusDays(50);
        System.out.println("오늘로 부터 50일 후 " + after50Days);

        // 시간 차이 계산
        LocalTime start = LocalTime.of(15,0);
        LocalTime end = LocalTime.of(18,30);
        Duration duration = Duration.between(start, end);
        System.out.println("소요 시간 " + duration.toHours() + "시간");

        // 나이 계산
        LocalDate birth = LocalDate.of(1999,12,14);

        // 생일과 오늘 사이의 기간 계산
        Period age = Period.between(birth, today);

        // 나이를 연도 단위로 추출해 출력
        System.out.println("나이 : " + age.getYears() + "세");

        // 요일
        System.out.println("199년 12월 14일의 요일 : " + birth.getDayOfWeek());

    }
}
