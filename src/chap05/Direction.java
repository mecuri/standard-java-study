package chap05;

public enum Direction {
    EAST("동"), WEST("서"), SOUTH("남"), NORTH("북");

    String s;

    Direction(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}
