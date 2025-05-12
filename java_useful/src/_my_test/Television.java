package _my_test;

/**
 * 객체 생성코드와 생성자 만들기 코드
 */
public class Television {

//    int channel;
//    int volume;
//    boolean onOff;

    private int chanel;
    private int volume;
    private boolean onOff;

    Television(int c, int v, boolean o) {
        chanel = c;
        volume = v;
        onOff = o;
    }

    void print(){
        System.out.println("채널은 " + chanel + "이고 볼륨은 " + volume + " 입니다.");
    }
     public class TelevisionTest{
         public static void main(String[] args) {
             Television myTv = new Television(7,10,true);
             myTv.print();
//             myTv.channel = 7;
//             myTv.volume =10;
//             myTv.onOff = true;

             Television yourTv = new Television(5,20,true);
             yourTv.print();
//             yourTv.channel =5;
//             yourTv.volume =20;
//             yourTv.onOff = true;

//             System.out.println("나의 텔레비전 채널은 " + myTv.channel + " 이고 볼륨은 " + myTv.volume + " 입니다.");
//             System.out.println("너의 텔레비전 채널은 " + yourTv.channel + " 이고 볼륨은 " + yourTv.volume + " 입니다.");

         }
     }
}
