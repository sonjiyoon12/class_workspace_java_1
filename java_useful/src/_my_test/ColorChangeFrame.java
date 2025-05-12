package _my_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame extends JFrame implements ActionListener {

    private JButton[] buttons = new JButton[7];

    private JPanel panel1;
    private JPanel panel2;

    private final Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW,
            Color.GREEN, Color.BLUE, Color.WHITE, Color.BLACK};

    public ColorChangeFrame() {
        iniData();
        setInitLayout();
        addEvenListener();
    }

    private void iniData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel2 = new JPanel();

        for (int i = 0; i < 7; i++) {
            buttons[i] = new JButton("click" + (i + 1));
        }
    }

    private void setInitLayout() {
        setLayout(new GridLayout(2, 1));
        panel1.setBackground(Color.WHITE);
        add(panel1);
        panel2.setBackground(Color.BLACK);
        add(panel2);

        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));

        for (int i = 0; i < 4; i++) {
            panel1.add(buttons[i]);
        }

        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        for (int i = 4; i < 7; i++) {
            panel2.add(buttons[i]);
        }

        setVisible(true);
    }

    private void addEvenListener() {

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selectedButton = (JButton) e.getSource();
        System.out.println(selectedButton);
        System.out.println(selectedButton.getText());

        for (int i = 0; i < buttons.length; i++) {
            if (selectedButton == buttons[i]) {
                if (i < 4) {
                    panel1.setBackground(colors[i]);
                } else {
                    panel2.setBackground(colors[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        new ColorChangeFrame();
    }
}
