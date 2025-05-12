package _my_test;

public class PizzaTest {

    public static void main(String[] args) {
        Pizza obj1 = new Pizza(14);
        Pizza obj2 = new Pizza(18);

        Pizza largest = obj1.whosLargest(obj1, obj2);
        System.out.println(largest.radius + " 인치 피자가 더 큼");

        Pizza p1 = new Pizza("super supreme");
        Pizza p2 = new Pizza("cheese");
        Pizza p3 = new Pizza("pepperoni");
        int n = Pizza.count;
        System.out.println("지금까지 판매된 피자 개수 = " + n);
    }
}

