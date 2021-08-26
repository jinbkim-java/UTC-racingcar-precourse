package view;

import java.util.Scanner;

public class View {
    public static final String ASK_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String ASK_GAME_ROUND = "시도할 회수는 몇회인가요?";
    public static final String RACE_RESULT = "실행 결과";
    public static final String FINAL_WINNER = "최종 우승자: ";

    private final Scanner scanner;

    public String getUserInput() {
        return scanner.nextLine();
    }

    public View(Scanner scanner) {
        this.scanner = scanner;
    }
}
