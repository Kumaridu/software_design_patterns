package factoryPatternLab;

public class Apple implements AbstractFruit{

    @Override
    public AbstractFruit getFruit() {
        return new Apple();
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
