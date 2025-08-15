package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public Ball(Colors color, int number) {
        setColor(color);
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number > 100) {
            System.out.println("number should not be more than 100");
        }
        this.number = number;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return new StringBuilder("Ball with number of ")
                .append(number)
                .append(" and ")
                .append(color)
                .append(" color")
                .toString();
    }
}
