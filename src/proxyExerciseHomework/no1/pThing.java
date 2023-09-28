package proxyExerciseHomework.no1;

public class pThing {

    private Thing thing;

    public pThing(Thing thing) {
        this.thing = thing;
    }

    public void compute(String arg) {
        preAction();
        thing.compute(arg);
        postAction();
    }

    public void preAction() {
        System.out.println("before");
    }

    public void postAction() {
        System.out.println("after");
    }
}
