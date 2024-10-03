package baseball.controller;

import baseball.model.Comparator;
import baseball.model.Computer;
import baseball.model.Validator;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class GameController {
    private final Computer computer;
    private final InputView inputView;
    private final OutputView outputView;
    private final Validator validator;
    private final Comparator comparator;

    public static final String THREE_STRIKES = "3스트라이크";
    public static final String RESTART_GAME = "1";
    public static final String END_GAME = "2";
    public static final boolean CONTINUE_GAME = true;

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

        while (CONTINUE_GAME) {
            outputView.printGetInput();
            List<Integer> userNumbers = inputView.inputUserNumber();

            if (!validator.checkValidNumbers(userNumbers)) {
                outputView.printInvalidInput();
            } // end if

            String hint = comparator.compareNumber(computerNumbers, userNumbers);
            outputView.printHint(hint);

            if (THREE_STRIKES.equals(hint)) {
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
            case RESTART_GAME : playGame(); break;
            case END_GAME : break;
        } // end case
    } // askReStartOrEndGame
} // class