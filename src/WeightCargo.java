public enum WeightCargo {
    N1(0,3.5f), N2(3.5f,12f), N3(12f,18);
    private final float from;
    private final float to;

    WeightCargo(float from, float to) {
        this.from = from;
        this.to = to;
    }

    public float getFrom() {
        return from;
    }

    public float getTo() {
        return to;
    }

}
