package controller;

import model.CompareNumber;
import model.CreateRandomNumber;
import view.InputGameRestartOrEnd;
import view.InputUserNumber;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 9;
    private static final int DIGIT = 3;

    private CreateRandomNumber createRandomNumber = new CreateRandomNumber();
    private InputUserNumber inputUserNumber = new InputUserNumber();
    private CompareNumber compareNumber = new CompareNumber();
    private InputGameRestartOrEnd inputGameRestartOrEnd = new InputGameRestartOrEnd();

    public void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        playGame();
    } // startGame

    public void playGame() {
        List<Integer> computerNumbers = createRandomNumber.createRandomNumber();
        List<Integer> userNumbers = inputUserNumber.inputUserNumber();

        if (checkValidNumbers(userNumbers)) {
            // 비교
        }
    } // playGame

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