package _my_bubble.test05;

public interface Moveable {
    // 추상메서드 public abstract 생략 가능
    void left();
    void right();
    void up();
    default void down(){};
}
