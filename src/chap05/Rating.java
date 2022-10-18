package chap05;

public enum Rating {
    A("최우수"), B("우수"), C("보통"), D("미흡"), F("탈락");

    String rating;
     Rating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return rating;
    }
}
