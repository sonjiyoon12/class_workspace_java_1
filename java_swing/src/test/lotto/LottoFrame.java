package test.lotto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LottoFrame extends JFrame implements ActionListener {

    private static final String INITIAL_MESSAGE = "로또 번호 클릭";
    private static final String FONT_NAME = "고딕";
    private static final int FONT_SIZE = 20;

    private JButton button;
    private LottoRandomNumber lottoRandomNumber;
    private boolean isInitialState = true;
    private int[] currentNumbers;

    public LottoFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("lotto game");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("game start");
        lottoRandomNumber = new LottoRandomNumber();
        currentNumbers = new int[LottoRandomNumber.LOTTO_NUMBER_COUNT];


    }

    private void setInitLayout() {
        setLayout(new BorderLayout());
        add(button, BorderLayout.NORTH);
        setVisible(true);
    }

    private void addEventListener() {
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        isInitialState = false;
        currentNumbers = lottoRandomNumber.createNumber();

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));
        if (isInitialState) {
            g.drawString(INITIAL_MESSAGE, 230, 200);
        } else {
            for (int i = 0; i < currentNumbers.length; i++) {
                g.drawString(currentNumbers[i] + "", 100 + (i * 50), 300);
            }
        }
    }

    public static void main(String[] args) {
        new LottoFrame();
    }
}