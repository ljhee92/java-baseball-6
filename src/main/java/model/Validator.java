package model;

import util.OutputMessage;

import java.util.List;

import static controller.GameController.END_GAME;
import static controller.GameController.RESTART_GAME;
import static model.Computer.*;

public class Validator {
    public boolean checkValidNumbers(List<Integer> numbers) {
        if (isThreeDigits(numbers) && isInRange(numbers) && isDuplicate(numbers)) {
            return true;
        } else {
            throw new IllegalArgumentException(OutputMessage.INVALID_INPUT.message);
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

    public boolean checkValidReStartOrEnd(String input) {
        if (RESTART_GAME.equals(input) || END_GAME.equals(input)) {
            return true;
        } else {
            throw new IllegalArgumentException(OutputMessage.INVALID_INPUT.message);
        } // end else
    } // checkValidReStartOrEnd
} // class