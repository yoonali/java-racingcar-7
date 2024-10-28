package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.ArrayList;
import java.util.List;

public class Racingcar {
    public static final String INPUT_TEXT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final String carName;
    private int position = 0;

    Racingcar(String carName) {
        this.carName = carName;
    }

    public static void init() {
        System.out.println(INPUT_TEXT);
        List<Racingcar> cars = createCars();
    }

    public static List<Racingcar> createCars() {
        String inputText = readLine();
        String[] carNames = inputText.split(",");
        List<Racingcar> cars = new ArrayList<>();

        for (String name : carNames) {
            if (name.length() <= 5) {
                cars.add(new Racingcar(name.trim()));
            } else {
                throw new IllegalArgumentException("자동차 이름은 5글자 이하여야 합니다.");
            }
        }
        return cars;
    }

    public void move(int randomNum) {
        if (randomNum >= 4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}
