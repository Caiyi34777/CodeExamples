package Set2;

public class Target2 {
    // targetMethod
    public int crossLayer(OuterMost outerMost) {
        int value = outerMost.getValue();
        if (value > 10) {
            return 10;
        } else if (value > 0) {
            return 0;
        } else {
            return -1;
        }
    }

    // targetMethod
    public boolean checkEqual(OuterMost outerMost1, OuterMost outerMost2) {
        int value1 = outerMost1.getValue();
        int value2 = outerMost2.getValue();
        if (value1 == value2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Target2 target2_0 = new Target2();
        OuterMost outerMost0 = new OuterMost();
        Layer1 layer1_0 = new Layer1();
        Layer2 layer2_0 = new Layer2();
        layer1_0.setLayer2(layer2_0);
        Layer2 layer2_1 = layer1_0.getLayer2();
        InnerMost innerMost0 = new InnerMost();
        layer2_1.setInnerMost(innerMost0);
        InnerMost innerMost1 = layer2_1.getInnerMost();
        int int0 = 0;
        innerMost1.setValue(int0);
        outerMost0.setLayer1(layer1_0);
        int int1 = target2_0.crossLayer(outerMost0);
    }
}
