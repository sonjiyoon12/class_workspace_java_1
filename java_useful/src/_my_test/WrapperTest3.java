package _my_test;

public class WrapperTest3 {

    public static void main(String[] args) {
        String str1 = "45";
        String str2 = "34.1";
        String str3 = "false";
        String str4 = "d234";

        int num1 = Integer.parseInt(str1);
        double num2 = Double.parseDouble(str2);
        boolean num3 = Boolean.parseBoolean(str3);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        try{
            int num4 = Integer.parseInt(str4);
        } catch (NumberFormatException e) {
            System.out.println(str4 + "변환 할 수  없다");
        }

    }

}
