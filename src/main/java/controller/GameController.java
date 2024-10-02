package controller;

import model.Comparator;
import model.Computer;
import model.Validator;
import view.InputView;
import view.OutputView;

import java.util.List;

public class GameController {

    private Computer computer = new Computer();
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private Validator validator = new Validator();

    public void playGame() {
        outputView.printStartGame();
        List<Integer> computerNumbers = computer.createRandomNumber();
        List<Integer> userNumbers = inputView.inputUserNumber();

        if (validator.checkValidNumbers(userNumbers)) {
            // 비교
        }
    } // playGame

} // class