package model;

import java.util.List;
import java.util.Objects;

public class Comparator {

    public String compareNumber(List<Integer> computerNumbers, List<Integer> userNumbers) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < userNumbers.size(); i++) {
            if (Objects.equals(userNumbers.get(i), computerNumbers.get(i))) {
                strike++;
                continue;
            } // end if

            if (computerNumbers.contains(userNumbers.get(i))) {
                ball++;
            } // end if
        } // end for

        return calculateResult(strike, ball);
    } // compareNumber

    private String calculateResult(int strike, int ball) {
        StringBuilder compareResult = new StringBuilder();

        if (strike == 0 && ball == 0) {
            compareResult.append("낫싱");
        } else if (strike == 0 && ball > 0) {
            compareResult.append(ball).append("볼");
        } else if (strike > 0 && ball > 0) {
            compareResult.append(ball).append("볼 ").append(strike).append("스트라이크");
        } else {
            compareResult.append(strike).append("스트라이크");
        } // end else

        return compareResult.toString();
    } // judgeResult

} // class