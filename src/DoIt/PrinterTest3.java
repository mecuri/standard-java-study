package DoIt;

public class PrinterTest3 {
    public static void main(String[] args) {

        Printer3 p = new Printer3(20, true);

        p.print(25);
        p.setDuplex(false);
        p.print(10);
    }
}
