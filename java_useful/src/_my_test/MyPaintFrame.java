package _my_test;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {

    private MyPanel myPanel;

    public MyPaintFrame(){
        initData();
        setInitLayout();
    }

    private void initData(){
        setTitle("집 만들기");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myPanel = new MyPanel();
    }

    private void setInitLayout(){
        super.add(myPanel);
    }

    static class MyPanel extends JPanel{
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawRect(200,200,200,200);
            g.drawLine(300,100,200,200);
            g.drawLine(300,100,400,200);
            g.drawRect(220,220,50,50);
            g.drawRect(330,220,50,50);
            g.drawRect(280,320,45,80);

        }
    } // end of static inner class

    public static void main(String[] args) {
        new MyPaintFrame();
    }
}
