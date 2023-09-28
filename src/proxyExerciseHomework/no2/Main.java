package proxyExerciseHomework.no2;

public class Main {

    public static void main(String[] args) {
        Thing t = new Thing();
        t.compute("Hello");

        BiFunctor testFunctor = new ConcreteBiFunctor();

        pThing p = new pThing(t, testFunctor);
        p.compute("Hello");

    }
}
