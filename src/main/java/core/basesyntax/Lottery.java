package core.basesyntax;

public class Lottery {
    private ColorSupplier color = new ColorSupplier();
    private NumberSupplier number = new NumberSupplier();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), number.getRandomNumber());
    }
}
