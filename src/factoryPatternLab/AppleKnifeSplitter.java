package factoryPatternLab;

public class AppleKnifeSplitter implements AbstractKnifeSplitter {

    @Override
    public AbstractKnifeSplitter getKnifeSplitter() {
        return new AppleKnifeSplitter();
    }

    @Override
    public String toString() {
        return "Apple Knife Splitter";
    }
}
