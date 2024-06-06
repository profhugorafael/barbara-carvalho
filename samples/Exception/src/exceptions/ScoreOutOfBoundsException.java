package exceptions;

public class ScoreOutOfBoundsException extends Exception {

    public ScoreOutOfBoundsException() {
        super("some score is out of bounds [0, 10]");
    }

    public ScoreOutOfBoundsException(String message) {
        super(message);
    }
}
