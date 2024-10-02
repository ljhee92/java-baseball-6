package model;

import java.util.List;

public class Validator {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 9;
    private static final int DIGIT = 3;

    public boolean checkValidNumbers(List<Integer> numbers) {
        if (isThreeDigits(numbers) && isInRange(numbers) && isDuplicate(numbers)) {
            return true;
        } else {
            throw new IllegalArgumentException("유효하지 않은 입력값입니다. 프로그램을 종료합니다.");
        } // end else
    } // checkValidNumbers

    public boolean isThreeDigits(List<Integer> numbers) {
        return numbers.size() == DIGIT;
    } // isThreeDigits

    public boolean isInRange(List<Integer> numbers) {
        for (int number : numbers) {
            if (number < MIN_RANGE || number > MAX_RANGE) {
                return false;
            } // end if
        } // end for
        return true;
    } // isInRange

    public boolean isDuplicate(List<Integer> numbers) {
        List<Integer> distinctNumbers = numbers.stream().distinct().toList();
        return distinctNumbers.size() == DIGIT;
    } // isDuplicate

} // class