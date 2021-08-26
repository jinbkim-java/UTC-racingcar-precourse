package racingcar;

import view.View;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        View view = new View(scanner);
        PlayGame racingCarGame = new PlayGame(view);

        racingCarGame.playGame();
    }
}
