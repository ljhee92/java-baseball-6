package model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    public static final int MIN_RANGE = 1;
    public static final int MAX_RANGE = 9;
    public static final int DIGIT = 3;

    public List<Integer> createRandomNumber() {
        List<Integer> computerRandomNumber = new ArrayList<>();

        while (computerRandomNumber.size() < DIGIT) {
            int randomNumber = Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE);
            if (!computerRandomNumber.contains(randomNumber)) {
                computerRandomNumber.add(randomNumber);
            } // end if
        } // end while

        return computerRandomNumber;
    } // createRandomNumber
} // class