package _my_test;

public class Circle {

    public int radius;
    public String color;

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        Circle obj;
        obj = new Circle();
        obj.radius =100;
        obj.color = "blue";
        double area = obj.getArea();
        System.out.println("원의 면적:"  + area);

    }
}
