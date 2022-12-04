public enum Capacity {
    VERYSMALL(0,10),
    SMALL(0,25),
    MIDDLE(40,60),
    BIG(60,80),
    VERYBIG(100,120);
    private final int to;
    private final int from;

    Capacity(int from, int to) {
        this.to = to;
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public int getFrom() {
        return from;
    }
}
