package racingcar;

import utils.Validate;
import view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingCars {
    private final List<Car> cars;
    public static final String CAR_NAME_SEPARATOR = ",";
    public static final int CAR_MIN_SIZE = 1;
    public static final int CAR_MAX_SIZE = 5;


    public RacingCars(String userInput){
        validate(userInput);
        cars = Stream.of(userInput.split(CAR_NAME_SEPARATOR))
                .map(s -> s.trim())
                .map(s -> new Car(s))
                .collect(Collectors.toList());
    }

    public void racing(){
        for(int i=0; i<cars.size(); i++) {
            cars.get(i).move();
            System.out.println(cars.get(i));
        }
        System.out.println();
    }

    public String getWinners(){
        return cars.stream()
                .filter(car -> car.getPosition()==getWinnersPosition())
                .map(car -> car.getName())
                .collect(Collectors.joining(CAR_NAME_SEPARATOR+" "));
    }

    private void validate(String userInput){
        String[] carNames = userInput.split(CAR_NAME_SEPARATOR);
        for(int i=0; i<carNames.length; i++)
            carNames[i] = carNames[i].trim();

        if (Validate.carHasWrongSize(carNames))
            throw new IllegalArgumentException(View.CAR_HAS_WRONG_SIZE);
        if (Validate.hasOverLap(carNames))
            throw new IllegalArgumentException(View.OVERLAP_NAME);
        if (Validate.hasWrongCharCount(userInput, carNames.length, CAR_NAME_SEPARATOR.charAt(0)))
            throw new IllegalArgumentException(View.WRONG_COMMAS_COUNT);
    }

    private int getWinnersPosition(){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<cars.size(); i++)
            list.add(cars.get(i).getPosition());
        Collections.sort(list);
        return list.get(cars.size()-1);
    }
}
