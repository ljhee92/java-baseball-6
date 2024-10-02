package view;

public class OutputView {

    public void printStartGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    } // printStartGame

    public void printGetInput() {
        System.out.print("숫자를 입력해주세요 : ");
    } // printGetInput

    public void printInvalidInput() {
        System.out.println("유효하지 않은 입력값입니다. 프로그램을 종료합니다.");
    } // printInvalidInput

    public void printHint(String hint) {
        System.out.println(hint);
    } // printHint

    public void printEndGame() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    } // printEndGame

    public void printReStartOrEndGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    } // printReStartOrEndGame

} // class