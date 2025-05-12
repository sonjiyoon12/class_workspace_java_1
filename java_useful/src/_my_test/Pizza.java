package _my_test;

public class Pizza {
    int radius;

    private String topping;
    private int radius2;
    static final double PI = 3.141592;
    static int count = 0;

    Pizza(int r) {
        radius = r;
    }

    Pizza whosLargest(Pizza p1, Pizza p2) {
        if (p1.radius > p2.radius)
            return p1;
        else
            return p2;
    }

    public Pizza(String topping) {
        this.topping = topping;
        count++;
    }
}


