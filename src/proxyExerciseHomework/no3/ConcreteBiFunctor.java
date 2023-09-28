package proxyExerciseHomework.no3;

public class ConcreteBiFunctor implements BiFunctor {

    @Override
    public void pre() {
        System.out.println("before");
    }

    @Override
    public void post() {
        System.out.println("after");
    }
}
