package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(Color color, int number) {
        setColor(color);
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number > 100) {
            System.out.println("number should not be more than 100");
            return;
        }
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return new StringBuilder("Ball with number of ")
                .append(number)
                .append(" and ")
                .append(color.name())
                .append(" color")
                .toString();
    }
}
