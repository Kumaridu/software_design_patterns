package proxyExerciseHomework.no2;

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
