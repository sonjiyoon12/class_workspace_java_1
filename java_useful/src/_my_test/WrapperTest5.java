package _my_test;

import java.util.ArrayList;

public class WrapperTest5 {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(Integer.valueOf(30));
        num.add(40);

        int sum = num.get(0) + num.get(1);
        System.out.println("합 : " + sum);
    }
}
