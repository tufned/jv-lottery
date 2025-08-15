package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), new Random().nextInt(100));
    }
}
