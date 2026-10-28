import java.util.Random;

public class MultifacedDie {
    private final int sides;
    private final Random random;
    private int value;

    public MultifacedDie(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    public int roll() {
        value = random.nextInt(sides) + 1;
        return value;
    }

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }
}
