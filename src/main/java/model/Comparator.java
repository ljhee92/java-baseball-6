package model;

import java.util.List;
import java.util.Objects;

public class Comparator {
    public static final int ZERO = 0;

    public String compareNumber(List<Integer> computerNumbers, List<Integer> userNumbers) {
        int strike = ZERO;
        int ball = ZERO;

        for (int index = ZERO; index < userNumbers.size(); index++) {
            if (Objects.equals(userNumbers.get(index), computerNumbers.get(index))) {
                strike++;
                continue;
            } // end if

            if (computerNumbers.contains(userNumbers.get(index))) {
                ball++;
            } // end if
        } // end for

        return calculateResult(strike, ball);
    } // compareNumber

    private String calculateResult(int strike, int ball) {
        StringBuilder compareResult = new StringBuilder();

        if (strike == ZERO && ball == ZERO) {
            compareResult.append("낫싱");
        } else if (strike == ZERO && ball > ZERO) {
            compareResult.append(ball).append("볼");
        } else if (strike > ZERO && ball > ZERO) {
            compareResult.append(ball).append("볼 ").append(strike).append("스트라이크");
        } else {
            compareResult.append(strike).append("스트라이크");
        } // end else

        return compareResult.toString();
    } // judgeResult
} // class