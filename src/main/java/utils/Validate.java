package utils;

import racingcar.RacingCars;
import view.View;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Validate {
    public static boolean carHasWrongSize(String[] carNames){
        for(int i=0; i<carNames.length; i++)
            if (hasWrongSize(carNames[i], RacingCars.CAR_MIN_SIZE, RacingCars.CAR_MAX_SIZE))
                return true;
        return false;
    }

    public static boolean hasWrongSize(String userInput, int minSize, int maxSize){
        if (userInput.length() < minSize || userInput.length() > maxSize)
            return true;
        return false;
    }

    public static boolean hasOverLap(String[] carNames){
        Set<String> setCarNames = Stream.of(carNames)
                .collect(Collectors.toSet());
        if (setCarNames.size() != carNames.length)
            return true;
        return false;
    }

    public static boolean hasWrongCharCount(String userInput, int carNameLength, char character){
        int charCount = 0;
        for(int i=0; i<userInput.length(); i++)
            if (userInput.charAt(i) == character)
                charCount++;
        if (charCount + 1 == carNameLength)
            return false;
        return true;
    }

    public static void validateNumber(String str){
        try {
            Integer.parseInt(str);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException(View.ONLY_NUMBER);
        }
    }
}
