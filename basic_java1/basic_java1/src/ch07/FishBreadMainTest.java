package ch07;

// 규칙 .. 모든 자바 코드는 클래스라는 영역
// 안에서 작성이 된다.
public class FishBreadMainTest {

    public static void main(String[] args) {
        // 지역 변수
        int a = 10;
        System.out.println("a : " + a);

        // new + 클래스이름 + ()
        FishBread f1 = new FishBread();
        // 메모리에 올리다 --> 인스턴스 화 했다. --> 인스턴스(객체)
        FishBread f2 = new FishBread();

        f1.price = 500;
        f2.price = 1000;

        System.out.println(f1.price);
        System.out.println(f2.price);
        //(주소.멤버변수)


    } // end of main
}
