package view;

import java.util.Scanner;

public class InputView {
    public static final String ASK_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String ASK_GAME_ROUND = "시도할 회수는 몇회인가요?";

    private final Scanner scanner;

    public String getUserInput() {
        return scanner.nextLine();
    }

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }
}
