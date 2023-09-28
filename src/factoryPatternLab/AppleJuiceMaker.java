package factoryPatternLab;

public class AppleJuiceMaker implements AbstractJuiceMaker {
    @Override
    public AbstractJuiceMaker getJuiceMaker() {
        return new AppleJuiceMaker();
    }

    @Override
    public String toString() {
        return "Apple Juice Maker";
    }
}
