package ch06;

public class BusPrograming {
    //코드의 진입점( 메인 함수)
    public static void main(String[] args) {

        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Bus bus3 = new Bus();

        bus1.name = "세화";
        bus1.color = "파랑";

        System.out.println(bus1.color);
        System.out.println(bus1.name);

        bus2.name = "삼화";
        bus3.discount = 10;
        System.out.println(bus2.name);
        System.out.println(bus3.discount);


    }
}
