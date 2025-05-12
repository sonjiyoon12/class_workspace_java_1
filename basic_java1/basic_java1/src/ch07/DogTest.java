package ch07;

public class DogTest {

    public static void main(String[] args) {

        Dog num1 = new Dog();
        Dog num2 = new Dog();

        System.out.println(num1);
        System.out.println(num2);

        num1.name = "찰리";
        num2.name = "초코";

        System.out.println(num1.name);
        System.out.println(num2.name);

    } // end of main
} // end of class
