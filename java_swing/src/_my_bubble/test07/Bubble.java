package _my_bubble.test07;

import javax.swing.*;

public class Bubble extends JLabel implements Moveable {

    private int x;
    private int y;

    private boolean left;
    private boolean right;
    private boolean up;

    private boolean isLeft;

    private ImageIcon bubble;
    private ImageIcon bomb;

    private Player player;

    private BackgroundBubbleService backgroundBubbleService;

    public Bubble(Player player) {
        this.player = player;
        this.backgroundBubbleService = new BackgroundBubbleService(this);

        initData();
        setInitLayout();

    }

    private void initData() {
        bubble = new ImageIcon("img/bubble.png");
        bomb = new ImageIcon("img/bomb.png");
        left = false;
        right = false;
        up = false;
    }

    private void setInitLayout() {
        x = player.getX();
        y = player.getY();
        setIcon(bubble);
        setSize(50, 50);
        setLocation(x, y);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public boolean isLeft() {
        return left;
    }

    public ImageIcon getBubble() {
        return bubble;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isUp() {
        return up;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setBubble(ImageIcon bubble) {
        this.bubble = bubble;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    @Override
    public void left() {
        left = true;
        for (int i = 0; i < 400; i++) {
            x--;
            setLocation(x, y);
            if (backgroundBubbleService.leftWall() == true) {
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        up();
    }

    @Override
    public void right() {
        right = true;
        for (int i = 0; i < 400; i++) {
            x++;
            setLocation(x, y);
            if (backgroundBubbleService.rightWall() == true){
                break;
            }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
        up();
    }

    @Override
    public void up() {
        up = true;
        for (int i = 0; i < 400; i++) {
            y--;
            setLocation(x, y);
            if (backgroundBubbleService.topWall()==true){
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
