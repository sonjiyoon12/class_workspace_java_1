package _my_test;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("철수");
        list.add("짱구");
        list.add("맹구");
        list.add("유리");
        for(String obj : list)
            System.out.println(obj + " ");
    }
}
