package chap04;

public class PrinterTest3 {
    public static void main(String[] args) {
        Printer3 paper = new Printer3(20, true);

        paper.print(25);
        paper.setDuplex(false);
        paper.print(10);
    }
}
