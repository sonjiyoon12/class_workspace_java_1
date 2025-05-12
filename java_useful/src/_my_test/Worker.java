package _my_test;

// 상속을 통해서 Thread 만드는 방법
public class Worker extends Thread {

    private String name;

    public Worker(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i =0; i<50; i++){
            System.out.println("Worker : " + name + " : " + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("외부에서 신호 받아 예외 발생");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("메인 쓰레드 시작");
        System.out.println(Thread.currentThread());

        Worker worker1 = new Worker("워커");
        worker1.start();

        System.out.println("메인 쓰레드 종료");
    }
}
