package racingcar;

import utils.RandomUtils;

public class Car {
    private static final int RANDOM_MIN_VAL = 0;
    private static final int RANDOM_MAX_VAL = 9;
    private static final int RANDOM_MOVE_PERCENTAGE = 3;

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        if (moveDecision())
            position++;
    }

    @Override
    public String toString() {
        return name + " : " + getPositionGraphic();
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public boolean isMaxPosition(int maxPosition) {
        if (maxPosition == getPosition())
            return true;
        return false;
    }

    private String getPositionGraphic() {
        String positionGraphic = "";
        for (int i = 0; i < position; i++)
            positionGraphic += "-";
        return positionGraphic;
    }

    private boolean moveDecision() {
        if (RANDOM_MOVE_PERCENTAGE < RandomUtils.nextInt(RANDOM_MIN_VAL, RANDOM_MAX_VAL))
            return true;
        return false;
    }
}
