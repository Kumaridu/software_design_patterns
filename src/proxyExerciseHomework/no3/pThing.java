package proxyExerciseHomework.no3;

public class pThing<T> {

    private Thing<T> thing;
    private BiFunctor biFunctor;

    public pThing(Thing thing, BiFunctor biFunctor) {
        this.thing = thing;
        this.biFunctor = biFunctor;
    }

    public void compute(T arg) {
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
