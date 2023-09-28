package practice.compositePattern;

public class Demo {

    public static void main(String[] args) {
        Component a = new Leaf();
        Leaf a2 = new Leaf();
        Composite c = new Composite();
        Component c2 = new Composite();

        
        c.addChild(a);
        c.addChild(a2);
        c.addChild(c2);

    }
}
