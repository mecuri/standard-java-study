package chap04.homework;

public class Line {

    int length;

    public Line(int length) {
        this.length = length;
    }

    public boolean isSameLine(Line line) {
        return this.length == line.length;
    }

}
