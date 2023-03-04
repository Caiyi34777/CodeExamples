class Layer2 {
    private InnerMost innerMost;

    public void setInnerMost(InnerMost innerMost) {
        this.innerMost = innerMost;
    }

    public InnerMost getInnerMost() {
        return innerMost;
    }

    public int getValue() {
        return innerMost.getValue();
    }
}