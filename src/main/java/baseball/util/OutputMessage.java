package baseball.util;

public enum OutputMessage {
    START("숫자 야구 게임을 시작합니다."),
    REQUEST_INPUT("숫자를 입력해주세요 : "),
    INVALID_INPUT("유효하지 않은 입력값입니다. 프로그램을 종료합니다."),
    END_GAME("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    RESTART_OR_END("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    public final String message;

    OutputMessage(String message) {
        this.message = message;
    } // OutputMessage
} // enum