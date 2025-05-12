//package _my_bubble.test07;
//
//import javax.swing.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//
//public class BubbleFrame extends JFrame {
//
//    private JLabel backgroundMap;
//    private Player player;
//
//    public BubbleFrame() {
//        initData();
//        setInitLayout();
//        addEventListener();
//    }
//
//    private void initData() {
//        setTitle("버블버블게임");
//        setSize(900, 640);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        backgroundMap = new JLabel(new ImageIcon("img/backgroundMap"));
//        setContentPane(backgroundMap);
//        player = new Player();
//
//    }
//
//    private void setInitLayout() {
//        setLayout(null);
//        setResizable(false);
//        setLocationRelativeTo(null);
//        add(player);
//        setVisible(true);
//    }
//
//    private void addEventListener() {
//        this.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                switch (e.getKeyCode()) {
//                    case KeyEvent.VK_LEFT:
//                        if(player.isLeft()==false && player.isLeftWallCrush() ==false){
//                            player.left();
//                        }
//                        break;
//                    case KeyEvent.VK_RIGHT:
//                        break;
//                    case KeyEvent.VK_UP:
//                        break;
//
//                }
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                switch (e.getKeyCode()) {
//                    case KeyEvent.VK_LEFT:
//                        break;
//                    case KeyEvent.VK_RIGHT:
//                        break;
//                    case KeyEvent.VK_UP:
//                        break;
//                    case KeyEvent.VK_SPACE:
//                        break;
//                }
//
//            });
//
//            public static void main(String[] args) {
//                new BubbleFrame();
//            }
//        }
//
//    }
