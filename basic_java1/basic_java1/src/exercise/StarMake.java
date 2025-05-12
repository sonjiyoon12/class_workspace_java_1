package exercise;

public class StarMake {

    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {
            //공백이 4,3,2,1,0 1씩 줄어든다. 그사이에 i는 1 ,2, 3 , 4, 5 늘어난다. j도 1,3,5,7,9
            for (int k = 1; k < 6 - i; k++) { //1부터 4까지 4번반복 < 5 1부터 3까지 < 4
             // i = 1일때 첫줄, k는 4   공백번반복, j는 별표 (2*1)-1 / 3개
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) { //1일때, 1 <= 1, 2일때, 3일때 3 <=5
                System.out.print("*");
            }
            System.out.println("");
        }
//          for (int i = 1; i <= 5; i++) {
//              for (int j = 1; j <= (2*i - 1); j++){
//                  System.out.print("*");
//              }
//              System.out.println("");
//          }


        for(int a = 1; a < 5; a++){
            System.out.println(a);
        }


    }

}
