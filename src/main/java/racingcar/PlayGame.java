package racingcar;

import utils.Validate;
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
        try {
            System.out.println(view.ASK_CAR_NAMES);
            racingCars = new RacingCars(view.getUserInput());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            setCarNames();
        }
    }

    private void setGameRound() {
        try {
            System.out.println(view.ASK_GAME_ROUND);
            String gameRound = view.getUserInput();
            validate(gameRound);
            this.gameRound = Integer.parseInt(gameRound);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            setGameRound();
        }
    }

    private void validate(String gameRound){
        Validate.validateNumber(gameRound);
        if (Integer.parseInt(gameRound) < 1)
            throw new IllegalArgumentException(View.ONLY_NUMBER);
    }

    private void racing() {
        System.out.println(view.RACE_RESULT);
        for (int i = 0; i < gameRound; i++)
            racingCars.racing();
    }
}
