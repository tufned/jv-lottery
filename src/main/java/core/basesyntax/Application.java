package core.basesyntax;

public class Application {
    private final static byte BALL_NUMBER = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[BALL_NUMBER];
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls.length ; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
