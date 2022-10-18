package chap04;

public class Printer {
    int numOfPapers = 0;

    public void print(int amount) {
        numOfPapers -= amount;
        System.out.println(numOfPapers);

    }


}
