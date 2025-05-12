package _my_test;

public class StringTest1 {

    public static void main(String[] args) {

        String str1 ="Hello World";
        String str2 = str1.replace("Hello","Java");

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);

        String result1 = str1.substring(0,5);
        System.out.println("result1 : " + result1);

    }
}
