package view;

import util.OutputMessage;

public class OutputView {
    public void printStartGame() {
        System.out.println(OutputMessage.START.message);
    } // printStartGame

    public void printGetInput() {
        System.out.print(OutputMessage.REQUEST_INPUT.message);
    } // printGetInput

    public void printInvalidInput() {
        System.out.println(OutputMessage.INVALID_INPUT.message);
    } // printInvalidInput

    public void printHint(String hint) {
        System.out.println(hint);
    } // printHint

    public void printEndGame() {
        System.out.println(OutputMessage.END_GAME.message);
    } // printEndGame

    public void printReStartOrEndGame() {
        System.out.println(OutputMessage.RESTART_OR_END.message);
    } // printReStartOrEndGame
} // class