package proxyExerciseHomework.no2;

public class pThing {

    private Thing thing;
    private BiFunctor biFunctor;

    public pThing(Thing thing, BiFunctor biFunctor) {
        this.thing = thing;
        this.biFunctor = biFunctor;
    }

    public void compute(String arg) {
        preAction();
        thing.compute(arg);
        postAction();
    }

    public void preAction() {
//        System.out.println("before");
        biFunctor.pre();
    }

    public void postAction() {
//        System.out.println("after");
        biFunctor.post();
    }
}
