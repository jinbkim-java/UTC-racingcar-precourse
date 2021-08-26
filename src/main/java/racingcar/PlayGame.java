package racingcar;

import view.View;

public class PlayGame {
    private final View view;
    private int gameRound;
    private RacingCars racingCars;

    public PlayGame(View view) {
        this.view = view;
    }

    public void playGame() {
        setCarNames();
        setGameRound();
        racing();
        System.out.println(view.FINAL_WINNER + racingCars.getWinners());
    }

    private void setCarNames() {
        System.out.println(view.ASK_CAR_NAMES);
        racingCars = new RacingCars(view.getUserInput());
    }

    private void setGameRound() {
        System.out.println(view.ASK_GAME_ROUND);
        String gameRound = view.getUserInput();
        this.gameRound = Integer.parseInt(gameRound);
    }

    private void racing() {
        System.out.println(view.RACE_RESULT);
        for (int i = 0; i < gameRound; i++)
            racingCars.racing();
    }
}
