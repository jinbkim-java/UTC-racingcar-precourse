package racingcar;

import view.InputView;
import view.OutputView;

public class PlayGame {
    private final InputView inputView;
    private RacingCars racingCars;
    private GameRound gameRound;

    public PlayGame(InputView inputView) {
        this.inputView = inputView;
    }

    public void playGame() {
        setCarNames();
        setGameRound();
        racing();
        System.out.println(OutputView.FINAL_WINNER + racingCars.getWinners());
    }

    private void setCarNames() {
        System.out.println(inputView.ASK_CAR_NAMES);
        racingCars = new RacingCars(inputView.getUserInput());
    }

    private void setGameRound() {
        System.out.println(inputView.ASK_GAME_ROUND);
        gameRound = new GameRound(inputView.getUserInput());
    }

    private void racing() {
        System.out.println(OutputView.RACE_RESULT);
        for (int i = 0; i < gameRound.getRound(); i++)
            racingCars.racing();
    }
}
