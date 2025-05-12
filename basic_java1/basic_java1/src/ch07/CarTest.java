package ch07;

public class CarTest {

    public static void main(String[] args) {

        Car type1 = new Car();
        Car type2 = new Car();

        System.out.println(type1);
        System.out.println(type2);

        type1.name = "재규어";
        type1.color = "검정";
        type1.price = 300_000_000;
        type1.energy = "전기";
        type1.wheel = 4;


    } // end of main

} // end of class
