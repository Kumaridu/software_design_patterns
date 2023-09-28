package factoryPatternLab;

public interface AbstractFactory {

    AbstractFruit getFruit();
    AbstractKnifeSplitter getKnifeSplitter();
    AbstractJuiceMaker getJuiceMaker();
}
