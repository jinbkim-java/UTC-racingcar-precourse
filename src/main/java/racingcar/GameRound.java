package racingcar;

public class GameRound {
    private final int round;

    public GameRound(String userInput) {
        round = Integer.parseInt(userInput);
    }

    public int getRound() {
        return round;
    }
}
