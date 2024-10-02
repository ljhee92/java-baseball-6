package view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    public List<Integer> inputUserNumber() {
        List<Integer> userNumber = new ArrayList<>();
        String inputNumber = Console.readLine();
        String[] inputNumbers = inputNumber.split("");

        for (String number : inputNumbers) {
            userNumber.add(Integer.parseInt(number));
        } // end for

        return userNumber;
    } // inputUserNumber

    public String inputReStartOrEnd() {
        String inputNumber = Console.readLine();
        return "1".equals(inputNumber) ? "재시작" : "종료";
    } // inputReStartOrEnd

} // class