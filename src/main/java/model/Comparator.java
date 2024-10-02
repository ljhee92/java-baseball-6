package model;

import java.util.List;
import java.util.Objects;

public class Comparator {

    public String compareNumber(List<Integer> computerNumbers, List<Integer> userNumbers) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < userNumbers.size(); i++) {
            if (computerNumbers.contains(userNumbers.get(i))) {
                ball++;
            } // end if

            if (Objects.equals(userNumbers.get(i), computerNumbers.get(i))) {
                strike++;
            } // end if
        } // end for

        if (strike == 0 && ball == 1) {
            return "1볼";
        } else if (strike == 0 && ball == 2) {
            return "2볼";
        } else if (strike == 0 && ball == 3) {
            return "3볼";
        } else if (strike == 1 && ball == 2) {
            return "1볼 1스트라이크";
        } else if (strike == 1 && ball == 3) {
            return "2볼 1스트라이크";
        } else if (strike == 1 && ball == 1) {
            return "1스트라이크";
        } else if (strike == 2 && ball == 2) {
            return "2스트라이크";
        } else if (strike == 3 && ball == 3) {
            return "3스트라이크";
        } // end if

        return "낫싱";
    } // compareNumber

} // class