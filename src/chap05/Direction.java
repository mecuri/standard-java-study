package chap05;

public enum Direction {
    EAST("λ"), WEST("μ"), SOUTH("λ¨"), NORTH("λΆ");

    String s;

    Direction(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}
