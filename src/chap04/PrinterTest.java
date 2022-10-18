package chap04;

public class PrinterTest {
    public static void main(String[] args) {
        Printer paper = new Printer();

        paper.numOfPapers = 100;
        paper.print(70);
    }
}
