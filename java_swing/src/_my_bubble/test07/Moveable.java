package _my_bubble.test07;

public interface Moveable {

    void left();
    void right();
    void up();
    default  void down(){};
}
