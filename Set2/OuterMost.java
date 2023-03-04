class OuterMost {
    private Layer1 layer1;

    public void setLayer1(Layer1 layer1) {
        this.layer1 = layer1;
    }

    public Layer1 getLayer1() {
        return layer1;
    }

    // fast retrieval method
    public int getValue() {
        return layer1.getValue();
    }

    public boolean isValueGreaterThan(int x) {
        return getValue() > x;
    }

    public boolean isValueGreaterThan100() {
        return getValue() > 100;
    }
}