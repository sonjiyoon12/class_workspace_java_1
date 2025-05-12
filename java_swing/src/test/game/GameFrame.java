package test.game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameFrame extends JFrame implements KeyListener {

    private BufferedImage backgroundImage;
    private BufferedImage player1;
    private BufferedImage player2;

    private ImagePanel imagePanel;

    private int playerX = 200;
    private int playerY = 300;

    private int player2X = 300;
    private int player2Y = 400;

    private boolean flag = true;

    public GameFrame() {
        initData();
        setInitLayout();
        addEventListener();
        Thread thread = new Thread(imagePanel);
        thread.start();
    }

    private void initData() {
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            backgroundImage = ImageIO.read(new File("images/background1.png"));
            player1 = ImageIO.read(new File("images/player1.png"));
            player2 = ImageIO.read(new File("images/player2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imagePanel = new ImagePanel();
    }

    private void setInitLayout() {
        add(imagePanel);
        setVisible(true);
    }

    private void addEventListener() {
        addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP) {
            playerY -= 10;
        } else if (code == KeyEvent.VK_DOWN) {
            playerY += 10;
        } else if (code == KeyEvent.VK_LEFT) {
            playerX -= 10;
        } else if (code == KeyEvent.VK_RIGHT) {
            playerX += 10;
        }

        if (playerX == player2X) {
            System.out.println("X와 Y좌표 선상에서 같은 위치를 가리킨다.");
            player1 = null;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private class ImagePanel extends JPanel implements Runnable {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, 1000, 600, null);
            g.drawImage(player1, playerX, playerY, 100, 100, null);
            g.drawImage(player2, player2X, player2Y, 150, 150, null);
        }

        @Override
        public void run() {

            boolean dir = true;
            while (flag) {
                if (dir == true) {
                    player2X += 5;
                } else {
                    player2X -= 5;
                }
                if (player2X >= 800) {
                    dir = false;
                }
                if (player2X <= 100) {
                    dir = true;
                }

                try {
                    Thread.sleep(1000);
                    repaint();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}