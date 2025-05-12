package ch10;

public class GoingToSchool2 {

    public static void main(String[] args) {

        // 버스 객체를 3개 생성해 보시오
        Bus bus1 = new Bus(111);
        Bus bus2 = new Bus(88);
        Bus bus3 = new Bus(54);
        // 학생 객체를 2명 생성해 보시오
        Student m1 = new Student("난피곤", 20_000);
        Student g1 = new Student("김가뿐", 6000);

        // 학생이 버스를 타는 행위를 만들어보세요
        m1.takeBus(bus1);
        m1.takeBus(bus1);
        g1.takeBus(bus3);

        // 버스에 상태 창을 출력해서 결과를 확인해 보자.

        bus1.showInfo();
        bus3.showInfo();

        m1.showInfo();


    } // end of main


}

