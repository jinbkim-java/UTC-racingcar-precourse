package view;

import java.util.Scanner;

public class View {
    public static final String ASK_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String ASK_GAME_ROUND = "시도할 횟수는 몇회인가요?";
    public static final String RACE_RESULT = "실행 결과";
    public static final String FINAL_WINNER = "최종 우승자: ";
    public static final String CAR_HAS_WRONG_SIZE = "자동차 이름은 1글자 이상 5글자 이하 입니다.";
    public static final String OVERLAP_NAME = "중복된 자동차 이름이 존재합니다.";
    public static final String WRONG_COMMAS_COUNT = "쉼표(,)의 객수가 적절하지 않습니다.";
    public static final String ONLY_NUMBER = "시도할 횟수는 자연수 이어야 합니다.";

    private final Scanner scanner;

    public String getUserInput() {
        return scanner.nextLine();
    }

    public View(Scanner scanner) {
        this.scanner = scanner;
    }
}
