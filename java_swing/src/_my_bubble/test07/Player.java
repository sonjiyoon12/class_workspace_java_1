package _my_bubble.test07;

import javax.swing.*;
import javax.swing.plaf.PanelUI;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;

    private ImageIcon playerR;
    private ImageIcon playerL;

    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;

    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    private boolean leftWallCrush;
    private boolean rightWallCrush;

    private PlayerWay playerWay;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public ImageIcon getPlayerR() {
        return playerR;
    }

    public ImageIcon getPlayerL() {
        return playerL;
    }

    public int getSPEED() {
        return SPEED;
    }

    public int getJUMP_SPEED() {
        return JUMP_SPEED;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isLeftWallCrush() {
        return leftWallCrush;
    }

    public boolean isRightWallCrush() {
        return rightWallCrush;
    }

    public PlayerWay getPlayerWay() {
        return playerWay;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPlayerR(ImageIcon playerR) {
        this.playerR = playerR;
    }

    public void setPlayerL(ImageIcon playerL) {
        this.playerL = playerL;
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

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setLeftWallCrush(boolean leftWallCrush) {
        this.leftWallCrush = leftWallCrush;
    }

    public void setRightWallCrush(boolean rightWallCrush) {
        this.rightWallCrush = rightWallCrush;
    }

    public void setPlayerWay(PlayerWay playerWay) {
        this.playerWay = playerWay;
    }

    public Player(){
        inidata();
        setInitData();
    }

    private void inidata() {
        playerL = new ImageIcon("img /playerL.png");
        playerR = new ImageIcon("img/platerR.png");

        x=55;
        y=535;

        left = false;
        right = false;
        up = false;
        down = false;
    }

    private void setInitData() {
        setSize(50,50);
        setIcon(playerR);
        setLocation(x,y);
    }

    @Override
    public void left() {
        playerWay = PlayerWay.LEFT;
        left = true;
        setIcon(playerL);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(left){

                }
            }
        });
    }

    @Override
    public void right() {

    }

    @Override
    public void up() {

    }
}
