package factoryPatternLab;

import java.util.ArrayList;
import java.util.List;

public class AppleJuiceFactory implements AbstractFactory {


    @Override
    public AbstractFruit getFruit() {
        return new Apple().getFruit();
    }

    @Override
    public AbstractKnifeSplitter getKnifeSplitter() {
        return new AppleKnifeSplitter().getKnifeSplitter();
    }

    @Override
    public AbstractJuiceMaker getJuiceMaker() {
        return new AppleJuiceMaker().getJuiceMaker();
    }
}
