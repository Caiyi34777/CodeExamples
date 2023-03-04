class OuterMost {
    private Layer1 layer1;

    Layer1 getLayer1() {
        return layer1;
    }

    int getValue() {
        return layer1.getValue();
    }

    boolean isValueGreaterThan(int x) {
        return getValue() > x;
    }

    boolean isValueGreaterThan100() {
        return getValue() > 100;
    }
}