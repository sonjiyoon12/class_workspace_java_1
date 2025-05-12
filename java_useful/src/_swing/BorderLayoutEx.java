package _swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {

    // 멤버 변수
    JButton[] buttons;
    String[] directions = {BorderLayout.WEST, BorderLayout.EAST,
            BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH};

    // 생성자
    public BorderLayoutEx() {
        setTitle("BorderLayoutEx 연습");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        setInitLayout();
    }

    // 메서드
    private void initData() {
        buttons = new JButton[5];
        // for 구문으로 수정하세요
        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("buttton" + (i + 1));
        }
//        buttons[0] = new JButton("button1");
//        buttons[1] = new JButton("button2");
//        buttons[2] = new JButton("button3");
//        buttons[3] = new JButton("button4");
//        buttons[4] = new JButton("button5");
    }

    private void setInitLayout() {
        //배치 관리자 (보더레이아웃)
        // BorderLayout 은 컴포넌트들을 동서남북 가운데로 배치 시켜주는 레이아웃
        setLayout(new BorderLayout());

        // 프레임(패널)
        // 우리가 생성한 JButton 객체를 프레임에 붙이다.
        // for 구문으로 수정
        for (int i = 0; i < 5; i++) {
            add(buttons[i], directions[i]);
        }
//        add(buttons[0], BorderLayout.WEST);
//        add(buttons[1], BorderLayout.EAST);
//        add(buttons[2], BorderLayout.CENTER);
//        add(buttons[3], BorderLayout.NORTH);
//        add(buttons[4], BorderLayout.SOUTH);
    }
}
