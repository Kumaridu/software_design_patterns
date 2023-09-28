package proxyExercise;

public class LogProxy implements Thing {

    Thing thing;

    public LogProxy(Thing thing) {
        this.thing = thing;
    }

    @Override
    public void compute(String name) {
        System.out.println("before");
        thing.compute(name);
        System.out.println("after");
    }
}
