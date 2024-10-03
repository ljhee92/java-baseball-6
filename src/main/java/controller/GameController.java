package controller;

import model.Comparator;
import model.Computer;
import model.Validator;
import view.InputView;
import view.OutputView;

import java.util.List;

public class GameController {

    private final Computer computer;
    private final InputView inputView;
    private final OutputView outputView;
    private final Validator validator;
    private final Comparator comparator;

    public GameController() {
        this.computer = new Computer();
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.validator = new Validator();
        this.comparator = new Comparator();
    } // GameController

    public void runGame() {
        outputView.printStartGame();
        playGame();
    } // runGame

    private void playGame() {
        List<Integer> computerNumbers = computer.createRandomNumber();

        while (true) {
            outputView.printGetInput();
            List<Integer> userNumbers = inputView.inputUserNumber();

            if (!validator.checkValidNumbers(userNumbers)) {
                outputView.printInvalidInput();
            } // end if

            String hint = comparator.compareNumber(computerNumbers, userNumbers);
            outputView.printHint(hint);

            if ("3스트라이크".equals(hint)) {
                outputView.printEndGame();
                askReStartOrEndGame();
                break;
            } // end if
        } // end while
    } // playGame

    private void askReStartOrEndGame() {
        outputView.printReStartOrEndGame();
        String inputReStartOrEndGame = inputView.inputReStartOrEnd();

        if (!validator.checkValidReStartOrEnd(inputReStartOrEndGame)) {
            outputView.printInvalidInput();
        } // end if

        switch (inputReStartOrEndGame) {
            case "재시작" : playGame(); break;
            case "종료" : break;
        } // end case
    } // askReStartOrEndGame

} // class