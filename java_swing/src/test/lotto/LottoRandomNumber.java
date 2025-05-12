package test.lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoRandomNumber {

    static final int LOTTO_NUMBER_COUNT = 6;

    public int[] createNumber() {
        int[] lottoWinNum = new int[LOTTO_NUMBER_COUNT];
        Random random = new Random();
        for (int i = 0; i < lottoWinNum.length; i++) {
            lottoWinNum[i] = random.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {

                if (lottoWinNum[j] == lottoWinNum[i]) {
                    i--;
                }
            }
        } //
        Arrays.sort(lottoWinNum);
        return lottoWinNum;
    }

    public static void main(String[] args) {
        LottoRandomNumber lottoRandomNumber = new LottoRandomNumber();
        int[] result = lottoRandomNumber.createNumber();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
