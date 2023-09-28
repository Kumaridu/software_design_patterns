package practice.compositePattern;

import java.util.List;

public class Composite implements Component {
    List<Component> children;

    @Override
    public void operation() {
        System.out.println("I am component");
    }

    public void addChild(Component c) {
        children.add(c);
    }

    public void removeChild(Component c) {
        children.remove(c);
    }
}
