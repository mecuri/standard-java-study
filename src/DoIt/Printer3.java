package DoIt;

public class Printer3 {

    private int numOfPapers;
    private boolean duplex; // 양면 출력 여부

    public Printer3(int numOfPapers, boolean duplex) { // 생성자
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

    public void print(int amount) {

    }

    public boolean getDuplex() { // 접근자
        return duplex;
    }

    public void setDuplex(boolean duplex) { // 설정자

    }
}
