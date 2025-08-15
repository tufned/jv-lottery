package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Colors[] COLORS = Colors.values();

    public Colors getRandomColor() {
        int index = new Random().nextInt(COLORS.length);
        return COLORS[index];
    }
}
