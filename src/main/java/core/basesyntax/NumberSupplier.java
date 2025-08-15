package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private final int BOUND_NUMBER = 100;

    public int getRandomNumber() {
        return new Random().nextInt(BOUND_NUMBER);
    }
}
