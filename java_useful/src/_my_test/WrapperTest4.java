package _my_test;

public class WrapperTest4 {

    public static void main(String[] args) {

        int value = 3000;
        String str1 = String.valueOf(value);
        System.out.println("정수를 문자열로 : " + str1);

        double dValue = 300.4;
        String str2 = String.valueOf(dValue);
        System.out.println("실수를 문자로 : " + str2);

        Float value2 = 300.23F;
        Long value3 = 100L;

        String str3 = String.valueOf(value2);
        System.out.println("str3 : " + str3);

        String str4 = String.valueOf(value3);
        System.out.println("str4 : " + str4);
    }
}
