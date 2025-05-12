package _my_test;

// 인터페이스를 사용해서 쓰레드 설계
public class Worker2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 테스트 코드
    public static void main(String[] args) {

        Worker2 worker2 = new Worker2();
        Thread subT1 = new Thread(worker2);
        subT1.start();

    }
}
